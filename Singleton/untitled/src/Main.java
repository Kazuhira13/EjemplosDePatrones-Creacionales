import Singleton.UsuarioServicio;
import Singleton.Version;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Version version = Version.getInstance();
        System.out.println("version actual"+version);

        //otra forma de llamarla         Version version = Version.getInstance();
        //        System.out.println("version actual"+version);
    }
}