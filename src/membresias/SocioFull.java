package membresias;

import Actividades.Actividad;

public class SocioFull {
    private String nombre;
    private Actividad actividad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    public String getActividad() {
        return (nombre + "Puede hacer actividad: " +  actividad.getNombre());
    }
}
