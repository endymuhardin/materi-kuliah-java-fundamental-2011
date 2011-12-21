package aplikasi.mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseMahasiswaAccess implements DatabaseMahasiswa {
	private Connection connection;
	private String url;
	private String sql = "insert into mahasiswa (npm, nama) values (?, ?)";
			

	public DatabaseMahasiswaAccess(String dsn){
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url = "jdbc:odbc:"+dsn;						
		} catch (Exception err){
			err.printStackTrace();
		}
	}
	
    public void simpan(Mahasiswa m){
		try {
			// harusnya connection diinstankan sekali saja
			// dan direuse berkali2
			// tapi untuk ODBC harus open close tiap statement
			connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, m.getNpm());
			ps.setString(2, m.getNama());
			ps.executeUpdate();
			connection.close();
		} catch (Exception err){
			err.printStackTrace();
		}
    }
}
