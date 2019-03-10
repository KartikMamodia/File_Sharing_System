import java.sql.*;
public class UserDB {

	
	public static int save(String name,String password,String email,String contact){
		int status=0;
		try{
			Connection con=DB.getConnection();
			Statement ps=con.createStatement();
		
			status=ps.executeUpdate("insert into users(username,password,email_id,contactNo) values('"+name+"','"+password+"','"+email+"','"+contact+"')");
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	/*public static int delete(int id,String password){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from users where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();

			
		}catch(Exception e){System.out.println(e);}
		return status;
	}
*/
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

}
