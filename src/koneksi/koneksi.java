/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;  

public class koneksi {
    
    public koneksi(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/rekapnilai","root","");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from guru");  
                while(rs.next())  
                System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3));  
            con.close();  
        }catch(Exception e){ System.out.println(e);}  
    }  
    
    public void addSiswa(String nama, String nis, String jurusan, String kelas){
        try{  
            String query = "INSERT INTO `siswa` (nama, nis, jurusan,kelas) VALUES (?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/rekapnilai","root","");
            PreparedStatement statement = con.prepareStatement(query);  
            statement.setString(1,nama);
            statement.setString(2,nis);
            statement.setString(3, jurusan);
            statement.setString(4, kelas);
            statement.executeUpdate();
            con.close();  
        }catch(Exception e){ System.out.println(e);}
    }
    
    public boolean login_guru(String nama, String kode, String mapel){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/rekapnilai","root","");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from guru");
            while(rs.next()){
                String nama_db = rs.getString(1); 
                String kode_db = rs.getString(2);
                String mapel_db = rs.getString(3);
                if (nama_db.equals(nama) && kode_db.equals(kode) && mapel_db.equals(mapel)){
                    System.out.println("berhasil");
                    return true;
                }else{
                    System.out.println("gagal");
                }
            }
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return false;
    }
    
    public static void main(String[] args) {
        koneksi kon = new koneksi();
        kon.addSiswa("Rian", "5", "RPL", "11");
        System.out.println(kon.login_guru("arif", "2", "kelautan"));
    }
}
