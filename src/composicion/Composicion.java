package composicion;
import ico.fes.composicion.Muro;
import ico.fes.composicion.Puerta;
import java.awt.Color;


public class Composicion {

   
    public static void main(String[] args) {
    
        Muro ml=new Muro(2.5f,4.5f,3.5f,Color.GRAY,null, 
                new Puerta("Madera", Color.WHITE, false));
        
         System.out.println(ml.getAlto()+"mts. de alto");
         System.out.println(ml.getPuerta().getMaterial());
     
    }
    
}
