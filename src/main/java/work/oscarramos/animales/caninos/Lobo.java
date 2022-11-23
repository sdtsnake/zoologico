package work.oscarramos.animales.caninos;

public class Lobo extends Canino{
    protected int camada;
    protected String espcieLobo;

    public Lobo() {
        super();
    }

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
    }

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, int camada, String espcieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.camada = camada;
        this.espcieLobo = espcieLobo;
    }

    public void setCamada(int camada) {
        this.camada = camada;
    }

    public void setEspcieLobo(String espcieLobo) {
        this.espcieLobo = espcieLobo;
    }

    @Override
    public String comer() {
        return "El lobo tiene una camada " + camada + " cachorros de la especie " + espcieLobo + " en el habitad " + this.habitat;
    }

    @Override
    public String dormir() {
        return "EL lobo de color" + this.color + "duerme en el invierno y tiene un peso promedio" + this.peso;
    }

    @Override
    public String correr() {

        return "El lobo " + nombreCientifico + " corre libre en el habitat " +this.habitat +" libre porque es un reserva natural";
    }

    @Override
    public String comunicarse() {

        return "En "+ this.habitat +" el lobo" + espcieLobo + " se comunica mediante aullidos";
    }
}
