package person;

public class Person {
    private String name;
    private int age;
    private String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    String printDatePerson() {
        return "O nome é " + name + ", a idade é " + age + ", o CPF é: " + cpf;
    }
}

