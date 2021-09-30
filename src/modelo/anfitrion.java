package modelo;

/**
 *
 * @author yosah
 */
public class anfitrion {
    private int idAnfitrion;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String direccion;
    private String telefono;
    private String correo;
    private String password;
    
    public anfitrion(int idAnfitrion, String nombre, String apePaterno,String apeMaterno, String direccion,
            String telefono,String correo, String password){
        this.idAnfitrion = idAnfitrion;
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.password = password;
    }

    public int getIdAnfitrion() {
        return idAnfitrion;
    }

    public void setIdAnfitrion(int idAnfitrion) {
        this.idAnfitrion = idAnfitrion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
