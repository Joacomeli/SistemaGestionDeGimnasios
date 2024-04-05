package membresias;
import Actividades.Actividad;
import categorias.Categoria;

public class SocioPorCategoria {
    private String nombre;
    private Categoria categoria; //cardio / deportiva / pileta
    private Actividad actividad;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria.getNombre();
    }
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    public String getActividad() {
        String habilitado;
        if (actividad.getCategoria().getNombre() == categoria.getNombre()) {
            habilitado = "La Actividad " + actividad.getNombre() + " esta habilitada para realizarse por " + nombre;
        } else {
            habilitado = "La Actividad " + actividad.getNombre() + " NO esta habilitada para realizarse por " + nombre;
        }
        return (habilitado);
    }

}
