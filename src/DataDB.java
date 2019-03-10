import java.sql.*;
public class DataDB {

	
	public static int save(String email,String data, String value){
		int status=0;
		try{
			Connection con=DB.getConnection();
			Statement ps=con.createStatement();
			status=ps.executeUpdate("insert into data(email_id,datapath,File_Name) values('"+email+"','"+data+"','"+value+"')");
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(int id,String email,String password){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from data where ID=? AND email_id=?");
			ps.setInt(1,id);
			ps.setString(2,email);

			status=ps.executeUpdate();
			con.close();

			
		}catch(Exception e){System.out.println(e);}
		return status;
	}
/*
	public static boolean validate(String email,String password){
		boolean status=false;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from users where email_id=? and password=?");
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
*/
}
