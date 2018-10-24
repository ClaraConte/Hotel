/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.vistas;

import hotel.modelo.CamasHabitacion;
import hotel.modelo.CamasHabitacionData;
import hotel.modelo.Conexion;
import hotel.modelo.Habitacion;
import hotel.modelo.HabitacionData;
import hotel.modelo.Huesped;
import hotel.modelo.HuespedData;
import hotel.modelo.TipoCama;
import hotel.modelo.TipoCamaData;
import hotel.modelo.TipoHabitacion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clara
 */
public class TestCase {

    private Connection connection = null;
    Conexion conexion;

    public TestCase(Conexion conexion) {
        try {
            this.conexion = conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir la conexion");
        }

    }

    public void testHuespedEditar() {
        Huesped huesped;
        Huesped huespedEditar;
        HuespedData huespedData;
        huespedData = new HuespedData(conexion);
        int DNI = 3017871;
        System.out.println("// Editar huéspedes --");
        huesped = new Huesped(DNI, "Claraconte", "Lapunta", "clara@clara.com", "2616266910");
        huespedData.editarHuesped(huesped);
        System.out.println("***********************************");
    }

    public void testHuespedesListar() {
        HuespedData huespedData;
        huespedData = new HuespedData(conexion);
        System.out.println("// Listar huéspedes --");
        huespedData.obtenerHuespedes().forEach(huespedes -> {
            System.out.println("Nombre : " + huespedes.getHuespedNombre() + "  DNI : " + huespedes.getHuespedDni());
        });
        System.out.println("***********************************");
    }

    public void testIsHuespedDni() {
        HuespedData huespedData;
        huespedData = new HuespedData(conexion);
        System.out.println("// Existe el DNI de Huésped --");
        int dni = 30178;
        System.out.println("Existe el huesped : " + huespedData.isHuespedDni(dni));
        System.out.println("***********************************");
    }

    public void testHabitacionesListar() {
        HabitacionData habitacionData;
        habitacionData = new HabitacionData(conexion);
        Habitacion habitacion;
        habitacion = new Habitacion();

        System.out.println("// Listar habitaciones --");
        habitacionData.obtenerHabitaciones().forEach(habitaciones -> {
            System.out.println("id habitacion: " + habitaciones.getHabitacionId()
                    + " Cantidad de camas: " + habitaciones.getHabitacionCantidadDeCamas());
        });
        System.out.println("***********************************");
    }

    public void testHabitacionesListarPorId() {
        HabitacionData habitacionData;
        habitacionData = new HabitacionData(conexion);
        Habitacion habitacion;
        habitacion = new Habitacion();
        int habitacionId = 5;

        System.out.println("// Listar por ID --");
        habitacion = habitacionData.buscarHabitacion(habitacionId);
        System.out.println("Habitación Número: " + habitacion.getHabitacionId()
                + "  Habitación Tipo Id : " + habitacion.getTipoHabitacionId().getTipoHabitacionId()
        );
        System.out.println("***********************************");
    }

    public void testHabitacionesListarPorTipo() {
        HabitacionData habitacionData;
        habitacionData = new HabitacionData(conexion);
        Habitacion habitacion;
        habitacion = new Habitacion();
        int tipoHabitacionId = 2;
        System.out.println("// Listar por TIPO --");
        habitacionData.obtenerHabitacionesPorTipo(tipoHabitacionId).forEach(habitacionPorTipo -> {
            System.out.println("Habitación Número: " + habitacionPorTipo.getHabitacionId()
                    + "  Habitación precio : " + habitacionPorTipo.getTipoHabitacionId().getTipoHabitacionNombre()
                    + "  Habitación Tipo Id : " + habitacionPorTipo.getTipoHabitacionId().getTipoHabitacionId()
            );
        });
        System.out.println("***********************************");

    }

    public void testHabitacionesGuardar() {
        HabitacionData habitacionData;
        habitacionData = new HabitacionData(conexion);
        TipoHabitacion tipoHabitacion;
        tipoHabitacion = new TipoHabitacion();
        tipoHabitacion.setTipoHabitacionId(2);
        Habitacion habitacionAGuardar;
        System.out.println("// Guardar habitación --");
        habitacionAGuardar = new Habitacion(8, true, tipoHabitacion);
        habitacionData.guardarHabitacion(habitacionAGuardar);
        System.out.println("***********************************");
    }

    public void testHabitacionesEditar() {
        int idEditar = 8;
        HabitacionData habitacionData;
        habitacionData = new HabitacionData(conexion);
        TipoHabitacion tipoHabitacion;
        tipoHabitacion = new TipoHabitacion();
        tipoHabitacion.setTipoHabitacionId(3);

        Habitacion habitacionAEditar;
        System.out.println("// Editar habitación --");
        habitacionAEditar = new Habitacion(idEditar, 5, true, tipoHabitacion);
        habitacionData.editarHabitacion(habitacionAEditar);
        System.out.println("***********************************");
    }

    public void testCamasHabitacionGuardar() {
        CamasHabitacion camasHabitacion;
        CamasHabitacionData camasHabitacionData;
        camasHabitacionData = new CamasHabitacionData(conexion);
        TipoHabitacion tipoHabitacion;
        tipoHabitacion = new TipoHabitacion();
        tipoHabitacion.setTipoHabitacionId(3);
        Habitacion habitacion;
        habitacion = new Habitacion(5, false, tipoHabitacion);
        TipoCama tipoCama;
        tipoCama = new TipoCama(2, "simple");
        System.out.println("// Guardar Cama habitación --");
        camasHabitacionData.guardarCamasHabitacion(habitacion, tipoCama);
        System.out.println("La habitacion " + habitacion.getHabitacionId() + " tiene una cama tipo " + tipoCama.getTipoCamaNombre());
        System.out.println("***********************************");
    }

    public void testCamasHabitacionListarPorTipo() {
        CamasHabitacionData camasHabitacionData;
        camasHabitacionData = new CamasHabitacionData(conexion);

        int tipoCamaId = 3;
        System.out.println("// Listar Camas de habitación --");
        camasHabitacionData.obtenerCamasporHabitacion(tipoCamaId).forEach(camasPorHabitacion -> {
            System.out.println("Habitación Número: " + camasPorHabitacion.getCamasHabitacionId()
                    + "  Habitación Tipo Cama : " + camasPorHabitacion.getTipoCamaId().getTipoCamaId()
                    + " Habitacion id " + camasPorHabitacion.getHabitacionId().getHabitacionId());
        });
        System.out.println("***********************************");
    }

    public void testObtenerCamasPorHabitacionId() {
        CamasHabitacionData camasHabitacionData;
        camasHabitacionData = new CamasHabitacionData(conexion);
        int habitacionId = 3;
        System.out.println("// Listar Camas de habitación por ID de habitación --");

        camasHabitacionData.obtenerCamasPorHabitacionId(habitacionId).forEach(camasPorHabitacion -> {
            System.out.println("Habitación Número: " + camasPorHabitacion.getCamasHabitacionId()
                    + " Habitacion id " + camasPorHabitacion.getHabitacionId().getHabitacionId()
                    + "  Habitación Tipo Cama : " + camasPorHabitacion.getTipoCamaId().getTipoCamaId());
        });

        System.out.println("***********************************");

    }

    public void testBuscarTipoCamaPorId() {
        int tipoCamaId = 2;
        TipoCamaData tipoCamaData;
        tipoCamaData = new TipoCamaData(conexion);
        TipoCama tipoCama;
        tipoCama = new TipoCama();
        tipoCama = tipoCamaData.buscarTipoCamaPorId(tipoCamaId);
        System.out.println("// Listar tipos Camas de habitación por tipoCamaId --");
        System.out.println("id: " + tipoCama.getTipoCamaId() + " Nombre: " + tipoCama.getTipoCamaNombre());
        System.out.println("***********************************");

    }
}
