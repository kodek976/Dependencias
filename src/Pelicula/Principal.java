
package Pelicula;
public class Principal {
    public static void main(String[] args) {
        //Queremos un contador en de cada película
        System.out.println("El número de películas es: "+ Pelicula.getContador());
        Pelicula p1 = new Pelicula("La milla verde",189);
        Pelicula p2 = new Pelicula("El resplandor",167);
        Pelicula p3 = new Pelicula("Depredador 2",98);
        Pelicula p4 = new Pelicula("Airbag",189);
        System.out.println("El número de películas es: "+ Pelicula.getContador());
        System.out.println("Vas por el minuto: "+p1.getMinutoActual());
        p1.avanzarMinuto();
        p1.avanzarMinuto();
        p1.avanzarMinuto();
        System.out.println("Vas por el minuto: "+p1.getMinutoActual());
        p1.avanzarMinuto();
        p1.avanzarMinuto();
        p1.avanzarMinuto();
        p1.avanzarMinuto();
        p1.avanzarMinuto();
        p1.avanzarMinuto();
        System.out.println("Vas por el minuto: "+p1.getMinutoActual());
        p1.avanzarCapitulo();
        System.out.println("Vas por el minuto: "+p1.getMinutoActual());
        

    }
}
