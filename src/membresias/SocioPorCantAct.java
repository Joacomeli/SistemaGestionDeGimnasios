package membresias;

import Actividades.Actividad;
import categorias.Categoria;

public class SocioPorCantAct {
    private String nombre;
    private int cantActividades;
    private Actividad actividad;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCantActividades(int cantActividades) {
        this.cantActividades = cantActividades;
    }
    public int getCantActividades() {
        return cantActividades;
    }
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    public String getActividad() {
        if (cantActividades > 0){
            cantActividades--;
            return (nombre + " posee " + (cantActividades + 1) + " actividades disponibles y puede realizar la actividad " + actividad.getNombre());
        } else {
            return (nombre + " no posee mas actividades disponibles y no puede realizar la actividad " + actividad.getNombre());
        }
    }
}
