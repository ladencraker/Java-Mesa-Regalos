package modelo;

public class eventoAnfitrion {
    private int idEvento;
    private String tipo_evento;
    private String fechaEvento;
    private String horaEvento;
    
    public eventoAnfitrion(int idEvento, String tipo_evento, String fechaEvento,String horaEvento ){
        this.idEvento = idEvento;
        this.tipo_evento = tipo_evento;
        this.fechaEvento = fechaEvento;
        this.horaEvento = horaEvento;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }
    
    
}
