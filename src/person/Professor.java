package person;

public class Professor extends Person {

  private double salary;

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  String printDatePerson() {
    return "O nome da professora é " + getName() + ", a idade é " + getAge() + " e o salário é: R$ " + getSalary();
  }
}
