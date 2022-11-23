package work.oscarramos.animales.caninos;

public class Perro extends Canino{
    protected int mordida;

    public Perro() {
        super();
    }

    public Perro(int mordida) {
        this.mordida = mordida;
    }

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
    }

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, int mordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.mordida = mordida;
    }

    @Override
    public String comer() {
        return "El perro " + this.nombreCientifico + " quema calorias en su persecusion de presas las cuales mata con su mordia " +mordida+ "Kg y sostiene un peso de " + this.peso+ "Kg";
    }

    @Override
    public String dormir() {

        return "EL perro " + this.nombreCientifico + " duerme en " +this.habitat;
    }

    @Override
    public String correr() {

        return "El perro con un largo de  " + this.largo + "metros peude correr grandes distancias";
    }

    @Override
    public String comunicarse() {

        return "El perro " +this.nombreCientifico + " se comunica mostrando sus dientes del asombroso tamaño " + this.tamanoColmillos + " cm";
    }
}
