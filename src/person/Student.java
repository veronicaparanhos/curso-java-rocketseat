package person;

public class Student extends Person{
  private String registration;

  public String getRegistration() {

    return registration;
  }

  public void setRegistration(String registration) {

    this.registration = registration;
  }

  String printDatePerson() {
    System.out.println(super.printDatePerson());
    return "A matrícula do aluno " + getName() + " é: " + getRegistration();
  }
}
