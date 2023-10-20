package exception;

public class Exception {
  public static void main(String[] args)  {
    try {
      validarNumero();
    } catch (java.lang.Exception e) {
      System.out.println("Deu ruim!");
      e.printStackTrace();
    }

  }

  public static void validarNumero() throws java.lang.Exception {
    int number = 10;
    if(number < 100) {
      throw new java.lang.Exception("O número é menor que 100");
    }
  }
}
