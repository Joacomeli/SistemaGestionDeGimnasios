package membresias;

import Actividades.Actividad;

public class SocioPrueba {
    private String nombre;
    private boolean prueba = true;
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
        if (prueba) {
            prueba = false;
            return (nombre + " tiene prueba habilida, puede realizar " + actividad.getNombre());
        } else {
            return (nombre + " ya utilizo la prueba, NO puede realizar " + actividad.getNombre());
        }
    }
}
