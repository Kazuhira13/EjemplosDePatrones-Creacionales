import Clases.Bus;
import Factory.BusFactory;
import Factory.BusetaFactory;
import Interfaz.VehiculoFactory;
import Interfaz.Vehiculos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTransporte {

    // Esta es una abstracción, posiblemente una interfaz o una clase abstracta, que representa un vehículo genérico.
    // Esto permite que MainTransporte funcione con diferentes tipos de vehículos sin necesidad de conocer su implementación concreta.
    private Vehiculos vehiculo;
    // El constructor recibe una fábrica y usa la fábrica para crear el vehículo
    public MainTransporte(VehiculoFactory factory){
        vehiculo = factory.crearVehiculo();
    }

    public void iniciarTransporte(){
        vehiculo.transportar();
    }
    public static void main(String[] args) {
        VehiculoFactory busFactory = new BusFactory();
        MainTransporte transporte = new MainTransporte(busFactory);
        VehiculoFactory busetaFactory = new BusetaFactory();
        MainTransporte transporte2 = new MainTransporte(busetaFactory);

        transporte2.iniciarTransporte();
        transporte.iniciarTransporte();
    }
}