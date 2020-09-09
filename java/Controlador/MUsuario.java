
package Controlador;

import java.sql.*;

public class MUsuario {
    
    private int id_usu, priv_usu;
    private String nom_usu, appat_usu, user_usu, pass_usu;
    
    //crear el constructor
    
    public MUsuario(){
    
    }
    
    //metodo para agregar un nuevo usuario
    
    //metodo para eliminar un usuario
    
    //metodo para actualizar un usuario
    
    //metodo para consultar todos los usuarios
    
    //metodo para buscar un usuario por id
   
    
    //metodo para verificar al usuario
    
    public MUsuario verificarUsuario(String user, String pass) throws ClassNotFoundException{
        MUsuario u = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = Conexion.getConexion();
            String q = "select * from MUsuario where user_usu = ? and pass_usu = ?";
            ps = con.prepareStatement(q);

            ps.setString(1, user);
            ps.setString(2, pass);

            rs = ps.executeQuery();

            while(rs.next()){
                u = new MUsuario();
                u.setId_usu(rs.getInt("id_usu"));
                u.setNom_usu(rs.getString("nom_usu"));
                u.setAppat_usu(rs.getString("appat_usu"));
                u.setUser_usu(rs.getString("user_usu"));
                u.setPass_usu(rs.getString("pass_usu"));
                u.setPriv_usu(rs.getInt("priv_usu"));
                break;
            }
        }catch(SQLException e){
            System.out.println("No conecto con la tabla");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            u = null;
        
        }finally{

            try{
                rs.close();
                ps.close();
                con.close();
            
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        } 
        return u;
    }
    
    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public int getPriv_usu() {
        return priv_usu;
    }

    public void setPriv_usu(int priv_usu) {
        this.priv_usu = priv_usu;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getAppat_usu() {
        return appat_usu;
    }

    public void setAppat_usu(String appat_usu) {
        this.appat_usu = appat_usu;
    }

    public String getUser_usu() {
        return user_usu;
    }

    public void setUser_usu(String user_usu) {
        this.user_usu = user_usu;
    }

    public String getPass_usu() {
        return pass_usu;
    }

    public void setPass_usu(String pass_usu) {
        this.pass_usu = pass_usu;
    }
}