package vehicle;

public class TestVehicle {
  public static void main(String[] args) {
    Vehicle car = new Car();
    Vehicle moto = new Moto();

    car.acelerar();
    car.frear();

    moto.acelerar();
    moto.frear();
  }
}
