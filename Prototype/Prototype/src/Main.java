import Prototype.Enemigo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Enemigo enemigoOri = new Enemigo("Diablo", 100, 50);
        Enemigo enemigo2 = (Enemigo) enemigoOri.clone();

        System.out.println("enemigoOri = " + enemigoOri);
        System.out.println("enemigo2 = " + enemigo2);

        enemigo2.setTipo("angel");
        enemigo2.setDaño(45);



        System.out.println("enemigoOri = " + enemigoOri);
        System.out.println("enemigo2 = " + enemigo2);


    }
}