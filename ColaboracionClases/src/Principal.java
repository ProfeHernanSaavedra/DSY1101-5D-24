
import java.util.Date;


/**
 *
 * @author Profe Hernán
 * @version 04-09-2024
 */
public class Principal {
    public static void main(String[] args) {
        
        Director dir1 = new Director("George Lucas","Direccion", new Date(), 20, 'm');
        Pelicula peli1 = new Pelicula("SCI-FI", "STAR WARS", 200, 1989, dir1);
        
        System.out.println(peli1.toString());
        
        
        
        
        
    }
    
}
