package Actividades;

import categorias.Categoria;

public class Actividad {
    private String nombre;
    private String descripcionHorarios;
    private Categoria categoria; //cardio / deportiva / pileta
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDescripcionHorarios(String descripcionHorarios) {
        this.descripcionHorarios = descripcionHorarios;
    }
    public String getDescripcionHorarios() {
        return descripcionHorarios;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Categoria getCategoria() {
        return categoria;
    }
}
