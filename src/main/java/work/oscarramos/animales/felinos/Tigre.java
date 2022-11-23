package work.oscarramos.animales.felinos;

public class Tigre extends Felino{
    protected String tipoTigre;

    public Tigre() {
    }

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, String tipoTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.tipoTigre = tipoTigre;
    }

    public Tigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }

    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }

    @Override
    public String comer() {
        return "El tigre come para sostener su peso corporal en " + this.peso +" Kg";
    }

    @Override
    public String dormir() {
        return "El tigre duerme en " + this.habitat;
    }

    @Override
    public String correr() {
        return "El tigre " + this.tipoTigre + " puede alczar unos " + this.velocidad + " Km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre se cominica mendian te marcas con su garras " + this.tamanoGarras + " cm de largo";
    }
}
