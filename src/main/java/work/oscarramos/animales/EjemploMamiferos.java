package work.oscarramos.animales;

import work.oscarramos.animales.caninos.Lobo;
import work.oscarramos.animales.caninos.Perro;
import work.oscarramos.animales.felinos.Guepardo;
import work.oscarramos.animales.felinos.Leon;
import work.oscarramos.animales.felinos.Tigre;
import work.oscarramos.animales.mamiferos.Mamifero;

public class EjemploMamiferos{
    public static void main(String[] args) {

        Mamifero [] mamiferos = new Mamifero[6];

        mamiferos[0] = new Lobo("las rocayosas",1.5F,3.5F,90F,"Lobuscaninos","negro",2F,5,"de las montañas");
        mamiferos[1] = new Perro("Sabana Africana",10F,15F,25F,"can de la pradera","cafe",5F,50);
        mamiferos[2] = new Guepardo("Planicies africanas",2.5F,4F,50F,"felino pecoso",3F,80);
        mamiferos[3] = new Leon("Africa",3F,5F,90F,"rey felinus",5F,60,5,60F);
        mamiferos[4] = new Tigre("",);


    }
}
