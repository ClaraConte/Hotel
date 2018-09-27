package hotel.modelo;

public class HuespedAlojado {

    private int huespedAlojadoId;

    private Huesped huespedId;

    private Reservas reservasId;

    public HuespedAlojado() {
    }

    public HuespedAlojado(int huespedAlojadoId, Huesped huespedId, Reservas reservasId) {
        this.huespedAlojadoId = huespedAlojadoId;
        this.huespedId = huespedId;
        this.reservasId = reservasId;
    }

    public HuespedAlojado(Huesped huespedId, Reservas reservasId) {
        this.huespedId = huespedId;
        this.reservasId = reservasId;
    }

    public int getHuespedAlojadoId() {
        return huespedAlojadoId;
    }

    public void setHuespedAlojadoId(int huespedAlojadoId) {
        this.huespedAlojadoId = huespedAlojadoId;
    }

    public Huesped getHuespedId() {
        return huespedId;
    }

    public void setHuespedId(Huesped huespedId) {
        this.huespedId = huespedId;
    }

    public Reservas getReservasId() {
        return reservasId;
    }

    public void setReservasId(Reservas reservasId) {
        this.reservasId = reservasId;
    }
    
}
