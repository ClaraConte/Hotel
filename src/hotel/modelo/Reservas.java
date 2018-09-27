package hotel.modelo;


import java.util.Date;

public class Reservas {

    private int reservasId;

    private Date reservasFechaCheckin;

    private Date reservasfechaCheckout;

    private Date reservasFechaCreacion;

    private int reservasDias;

    private double reservasMonto;

    private boolean reservasEstado;

    private Huesped huespedId;

    private Habitacion habitacionId;

    public Reservas() {
    }

    public Reservas(int reservasId, Date reservasFechaCheckin, Date reservasfechaCheckout, Date reservasFechaCreacion, int reservasDias, double reservasMonto, boolean reservasEstado, Huesped huespedId, Habitacion habitacionId) {
        this.reservasId = reservasId;
        this.reservasFechaCheckin = reservasFechaCheckin;
        this.reservasfechaCheckout = reservasfechaCheckout;
        this.reservasFechaCreacion = reservasFechaCreacion;
        this.reservasDias = reservasDias;
        this.reservasMonto = reservasMonto;
        this.reservasEstado = reservasEstado;
        this.huespedId = huespedId;
        this.habitacionId = habitacionId;
    }

    public Reservas(Date reservasFechaCheckin, Date reservasfechaCheckout, Date reservasFechaCreacion, int reservasDias, double reservasMonto, boolean reservasEstado, Huesped huespedId, Habitacion habitacionId) {
        this.reservasFechaCheckin = reservasFechaCheckin;
        this.reservasfechaCheckout = reservasfechaCheckout;
        this.reservasFechaCreacion = reservasFechaCreacion;
        this.reservasDias = reservasDias;
        this.reservasMonto = reservasMonto;
        this.reservasEstado = reservasEstado;
        this.huespedId = huespedId;
        this.habitacionId = habitacionId;
    }

    public int getReservasId() {
        return reservasId;
    }

    public void setReservasId(int reservasId) {
        this.reservasId = reservasId;
    }

    public Date getReservasFechaCheckin() {
        return reservasFechaCheckin;
    }

    public void setReservasFechaCheckin(Date reservasFechaCheckin) {
        this.reservasFechaCheckin = reservasFechaCheckin;
    }

    public Date getReservasfechaCheckout() {
        return reservasfechaCheckout;
    }

    public void setReservasfechaCheckout(Date reservasfechaCheckout) {
        this.reservasfechaCheckout = reservasfechaCheckout;
    }

    public Date getReservasFechaCreacion() {
        return reservasFechaCreacion;
    }

    public void setReservasFechaCreacion(Date reservasFechaCreacion) {
        this.reservasFechaCreacion = reservasFechaCreacion;
    }

    public int getReservasDias() {
        return reservasDias;
    }

    public void setReservasDias(int reservasDias) {
        this.reservasDias = reservasDias;
    }

    public double getReservasMonto() {
        return reservasMonto;
    }

    public void setReservasMonto(double reservasMonto) {
        this.reservasMonto = reservasMonto;
    }

    public boolean isReservasEstado() {
        return reservasEstado;
    }

    public void setReservasEstado(boolean reservasEstado) {
        this.reservasEstado = reservasEstado;
    }

    public Huesped getHuespedId() {
        return huespedId;
    }

    public void setHuespedId(Huesped huespedId) {
        this.huespedId = huespedId;
    }

    public Habitacion getHabitacionId() {
        return habitacionId;
    }

    public void setHabitacionId(Habitacion habitacionId) {
        this.habitacionId = habitacionId;
    }
    
    
}
