package hotel.modelo;

public class TipoHabitacion {

    private int tipoHabitacionId;

    private String tipoHabitacionNombre;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int tipoHabitacionId, String tipoHabitacionNombre) {
        this.tipoHabitacionId = tipoHabitacionId;
        this.tipoHabitacionNombre = tipoHabitacionNombre;
    }

    public TipoHabitacion(String tipoHabitacionNombre) {
        this.tipoHabitacionNombre = tipoHabitacionNombre;
    }

    public int getTipoHabitacionId() {
        return tipoHabitacionId;
    }

    public void setTipoHabitacionId(int tipoHabitacionId) {
        this.tipoHabitacionId = tipoHabitacionId;
    }

    public String getTipoHabitacionNombre() {
        return tipoHabitacionNombre;
    }

    public void setTipoHabitacionNombre(String tipoHabitacionNombre) {
        this.tipoHabitacionNombre = tipoHabitacionNombre;
    }
    
}
