package vehicle;

public class Moto implements Vehicle {
  @Override
  public void acelerar() {
    System.out.println("Acelerando a moto!");
  }

  @Override
  public void frear() {
    System.out.println("Freiando a moto!");
  }
}
