
package mesa_regalos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pantallas.Registro_Anfitrion;
import mesa_regalos.ConexionBD;

public class ConexionBD {
    
    private static Connection conn = null;
    
    private static final String driver = "org.sqlite.JDBC";
    private static final String url = "jdbc:sqlite:MesaRegalos.db";
    //private static final String user = "root";
    //private static final String password = "Ipn2506Upiicsa.";
        private static final String TablaAnfitrion="create table IF NOT EXISTS tbAnfitrion(\n" +
                                                "id_anfitrion INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                                                "nom_anfitrion char(30) not null,\n" +
                                                "apeP_anfitrion char(30) not null,\n" +
                                                "apeM_anfitrion char(30) not null,\n" +
                                                "dir_anfitrion char(80) not null,\n" +
                                                "correo_anfitrion char(80) not null,\n" +
                                                "tel_anfitrion char(10) not null,\n" +
                                                "contrasena char(30) not null\n" +
                                                ");";
    private static final String TablaInvitado="create table IF NOT EXISTS tbInvitado(\n" +
                                                "id_invitado INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                                                "nom_invitado char(30) not null,\n" +
                                                "apeP_invitado char(30) not null,\n" +
                                                "apeM_invitado char(30) not null,\n" +
                                                "dir_invitado char(80) not null,\n" +
                                                "correo_invitado char(80) not null,\n" +
                                                "tel_invitado char(10) not null,\n" +
                                                "contrasena char(30) not null\n" +
                                                ");";
    private static final String Tabla="create table IF NOT EXISTS tbEventoAnfitrion(\n" +
                                                "id_evento INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                                                "id_anfitrion Integer not null,\n" +
                                                "tipo_evento char(15) not null,\n" +
                                                "hora_evento char(5) not null,\n" +
                                                "fecha_evento char(10) not null,\n" +                     
                                                "foreign key(id_anfitrion) references tbAnfitrion(id_anfitrion)\n" +
                                                ");";
    
    public ConexionBD() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión establecida..");
            Statement stmt= conn.createStatement();
             stmt.execute(TablaAnfitrion);
             stmt.execute(TablaInvitado);
             stmt.execute(Tabla);
            System.out.println("Tablas creadas..");
    
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión.."+e);
        }
    }
    
    public Connection Con(){
        
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if (conn == null)
        {
            System.out.println("Conexión terminada..");
        }
    }
       
 
    /*

    public Statement Con(){
        
        
        Statement st = null;
        Connection con = null;
        
        try
            {
                String url = "jdbc:mysql://localhost:3306/dbMesaRegalo";
                String usuario = "root";
                String password = "12345678";
                //String password = "";
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(url,usuario,password);
                if(con != null)
                {
                    System.out.println("CONEXION A LA BASE DE DATOS" +
                            "\n" + url );
                    st = con.createStatement();
                   
                    
                    
                }
            } 
            catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) 
            {
                Logger.getLogger(Registro_Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                if(con != null)
                {
                    try
                    {
                        con.close();
                        st.close();
                    } 
                    catch(Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                } 
            }
            // javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        return st;
        } 
        */
     
}
