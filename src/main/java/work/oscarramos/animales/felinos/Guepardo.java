package work.oscarramos.animales.felinos;

public class Guepardo extends Felino {
    public Guepardo() {
        super();
    }
    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El gepardo corre y atrapa su presa con sus garras de " + this.tamanoGarras + "cm";
    }

    @Override
    public String dormir() {

        return "El gepardo mejor conocido por su nombre cientifico " + this.nombreCientifico +"duerme placidamente en los arboles junto a su presa" ;
    }

    @Override
    public String correr() {

        return "Por la planicies el geparto corre a una velocidad de "+velocidad+ "Km/h";
    }

    @Override
    public String comunicarse() {

        return "El gepardo "+this.nombreCientifico+ " deja marcas con sus garras de " + this.tamanoGarras + " cm en los arboles para cominicar que ese es su territorio";
    }
}
