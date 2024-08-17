import Clases.*;
import Factory.CaballeroFactory;
import Factory.EnemigoFactory;
import Factory.GolemFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EnemigoFactory golemfactory = new GolemFactory();
        EnemigoFactory caballero = new CaballeroFactory();


        caballero.SpawnEnemigo();


        golemfactory.SpawnEnemigo();

    }
}