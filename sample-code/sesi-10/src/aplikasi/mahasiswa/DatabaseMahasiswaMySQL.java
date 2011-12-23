package aplikasi.mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseMahasiswaMySQL implements DatabaseMahasiswa {
	private Connection connection;
	private String sql = "insert into mahasiswa (npm, nama) values (?, ?)";
	private PreparedStatement ps;

	public DatabaseMahasiswaMySQL(String dbHost, String dbPort, String dbName, String dbUser, String dbPass){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;
			connection = DriverManager.getConnection(url, dbUser, dbPass);
			ps = connection.prepareStatement(sql);
		} catch (Exception err){
			err.printStackTrace();
		}
	}

    public void simpan(Mahasiswa m){
		try {
			ps.setString(1, m.getNpm());
			ps.setString(2, m.getNama());
			ps.executeUpdate();
		} catch (Exception err){
			err.printStackTrace();
		}
    }
}
