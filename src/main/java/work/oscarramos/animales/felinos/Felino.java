package work.oscarramos.animales.felinos;

import work.oscarramos.animales.mamiferos.Mamifero;

abstract public class Felino extends Mamifero {
    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felino() {
    }

    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
