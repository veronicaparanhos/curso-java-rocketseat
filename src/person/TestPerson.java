package person;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Verônica");
        person.setAge(43);
        person.setCpf("11122233344");

        Professor professor = new Professor();
        professor.setName("Ana");
        professor.setAge(20);
        professor.setCpf("11122238569");
        professor.setSalary(5000);

        Student student = new Student();
        student.setName("Luan");
        student.setAge(27);
        student.setCpf("52879614566");
        student.setRegistration("25687");

        System.out.println(person.printDatePerson());
        System.out.println(professor.printDatePerson());
        System.out.println(student.printDatePerson());
    }
}


