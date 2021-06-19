
package ico.fes.composicion;

import java.awt.Color;


public class Muro {
    private float alto;
    private float ancho;
    private float largo;
    private Color color;
    private Ventana [] ventana;
    private Puerta puerta;

    public Muro() {
    }

    public Muro(float alto, float ancho, float largo, Color color, Ventana[] ventana, Puerta puerta) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
        this.ventana = ventana;
        this.puerta = puerta;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ventana[] getVentana() {
        return ventana;
    }

    public void setVentana(Ventana[] ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "Muro{" + "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + ", color=" + color + ", ventana=" + ventana + ", puerta=" + puerta + '}';
    }
     public void tirar (){
         System.out.println("Tirando muro");
     }
}
