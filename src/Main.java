import Actividades.Actividad;
import categorias.Categoria;
import membresias.SocioFull;
import membresias.SocioPorCantAct;
import membresias.SocioPorCategoria;
import membresias.SocioPrueba;

public class Main {
    public static void main(String[] args) {

        //Crear Actividades
        Actividad karate = new Actividad();
        karate.setNombre("Karate");
        karate.setDescripcionHorarios("lunes 16:00");
        Actividad natacion = new Actividad();
        natacion.setNombre("Natacion");
        natacion.setDescripcionHorarios("martes 12:00");
        Actividad musculacion = new Actividad();
        musculacion.setNombre("Musculacion");
        musculacion.setDescripcionHorarios("miercoles 13:00");

        //Crear Categorias
        Categoria cardio = new Categoria();
        cardio.setNombre("Cardio");
        Categoria deportiva = new Categoria();
        deportiva.setNombre("Deportiva");
        Categoria pileta = new Categoria();
        pileta.setNombre("Pileta");

        //Relacionar Actividades con Categorias
        karate.setCategoria(cardio);
        natacion.setCategoria(pileta);
        musculacion.setCategoria(deportiva);

        //Crear Socio Full
        SocioFull hernan = new SocioFull();
        hernan.setNombre("Hernan Perez");
        hernan.setActividad(karate);
        System.out.println("-> Socio Full <-");
        System.out.println(hernan.getActividad());

        //Crear Socio por Categoria
        SocioPorCategoria tomas = new SocioPorCategoria();
        tomas.setNombre("Tomas Garnacho");
        tomas.setCategoria(cardio);
        tomas.setActividad(natacion);
        System.out.println("-> Socio por Categoria <-");
        System.out.println("La categoria que puede realizar es " + tomas.getCategoria());
        System.out.println(tomas.getActividad());
        tomas.setActividad(karate);
        System.out.println(tomas.getActividad());

        //Crear Socio por Cantidad de Actividades e ir agotando la cant actividades
        System.out.println("-> Socio por Cantidad de Actividades <-");
        SocioPorCantAct marcos = new SocioPorCantAct();
        marcos.setNombre("Marcos Menendez");
        marcos.setCantActividades(3);
        marcos.setActividad(karate);
        System.out.println(marcos.getActividad());
        marcos.setActividad(natacion);
        System.out.println(marcos.getActividad());
        marcos.setActividad(karate);
        System.out.println(marcos.getActividad());
        marcos.setActividad(musculacion);
        System.out.println(marcos.getActividad());
        marcos.setCantActividades(2);
        System.out.println("La nueva cant de Actividades es de " + marcos.getCantActividades());

        //Crear Socio de Prueba
        SocioPrueba mora = new SocioPrueba();
        mora.setNombre("Mora Fernandez");
        mora.setActividad(musculacion);
        System.out.println("-> Socio de Prueba <-");
        System.out.println(mora.getActividad());
        mora.setActividad(natacion);
        System.out.println(mora.getActividad());

    }
}