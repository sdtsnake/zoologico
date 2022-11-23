package work.oscarramos.animales.caninos;

import work.oscarramos.animales.mamiferos.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;
    protected Float tamanoColmillos;
    public Canino() {

    }

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
