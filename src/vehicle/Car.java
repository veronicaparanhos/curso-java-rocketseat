package vehicle;

public class Car implements Vehicle {

  @Override
  public void acelerar() {
    System.out.println("Acelerando o carro!");
  }

  @Override
  public void frear() {
    System.out.println("Freiando o carro!");
  }
}
