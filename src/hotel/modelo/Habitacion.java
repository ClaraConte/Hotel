package hotel.modelo;

public class Habitacion {

    private int habitacionId;

    private int habitacioCapacidadMax;

    private int habitacionCantidadCamas;

    private boolean habitacionEstado;

    private double habitacionPrecio;

    private TipoHabitacion tipoHabitacionId;

    public Habitacion() {
    }

    public Habitacion(int habitacionId, int habitacioCapacidadMax, int habitacionCantidadCamas, boolean habitacionEstado, double habitacionPrecio, TipoHabitacion tipoHabitacionId) {
        this.habitacionId = habitacionId;
        this.habitacioCapacidadMax = habitacioCapacidadMax;
        this.habitacionCantidadCamas = habitacionCantidadCamas;
        this.habitacionEstado = habitacionEstado;
        this.habitacionPrecio = habitacionPrecio;
        this.tipoHabitacionId = tipoHabitacionId;
    }

    public Habitacion(int habitacioCapacidadMax, int habitacionCantidadCamas, boolean habitacionEstado, double habitacionPrecio, TipoHabitacion tipoHabitacionId) {
        this.habitacioCapacidadMax = habitacioCapacidadMax;
        this.habitacionCantidadCamas = habitacionCantidadCamas;
        this.habitacionEstado = habitacionEstado;
        this.habitacionPrecio = habitacionPrecio;
        this.tipoHabitacionId = tipoHabitacionId;
    }

    public int getHabitacionId() {
        return habitacionId;
    }

    public void setHabitacionId(int habitacionId) {
        this.habitacionId = habitacionId;
    }

    public int getHabitacioCapacidadMax() {
        return habitacioCapacidadMax;
    }

    public void setHabitacioCapacidadMax(int habitacioCapacidadMax) {
        this.habitacioCapacidadMax = habitacioCapacidadMax;
    }

    public int getHabitacionCantidadCamas() {
        return habitacionCantidadCamas;
    }

    public void setHabitacionCantidadCamas(int habitacionCantidadCamas) {
        this.habitacionCantidadCamas = habitacionCantidadCamas;
    }

    public boolean isHabitacionEstado() {
        return habitacionEstado;
    }

    public void setHabitacionEstado(boolean habitacionEstado) {
        this.habitacionEstado = habitacionEstado;
    }

    public double getHabitacionPrecio() {
        return habitacionPrecio;
    }

    public void setHabitacionPrecio(double habitacionPrecio) {
        this.habitacionPrecio = habitacionPrecio;
    }

    public TipoHabitacion getTipoHabitacionId() {
        return tipoHabitacionId;
    }

    public void setTipoHabitacionId(TipoHabitacion tipoHabitacionId) {
        this.tipoHabitacionId = tipoHabitacionId;
    }
    
}
