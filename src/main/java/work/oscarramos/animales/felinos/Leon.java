package work.oscarramos.animales.felinos;

public class Leon extends Felino{
    protected Integer numManada;
    protected Float potenciaRugido;

    public Leon() {
        super();
    }

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public void setPotenciaRugido(Float potenciaRugido) {
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {

        return "El leon caza con su manada de " + this.numManada +" integrantes";
    }

    @Override
    public String dormir() {

        return "El leon duerme para crecer unos " + this.largo + "cm por dia hasta su edad adulta";
    }

    @Override
    public String correr() {

        return "El leon corre grande distancias a" + this.velocidad + "Km/h";
    }

    @Override
    public String comunicarse() {
        return "La potencia del rugido del leon que son " + this.potenciaRugido + " decibeles alcanza grandes distancias";
    }
}
