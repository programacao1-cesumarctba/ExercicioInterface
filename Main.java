public class Main {
  public static void main(String[] args) {
    Maquinas novoMaq = new MaqSolda();
    novoMaq.id = 123;
    novoMaq.preco = 45.5;
    novoMaq.tipo = "Leve";

    novoMaq.GerarManual();
    System.out.printf("R$ %.2f\n", novoMaq.CalcularPreco(novoMaq.preco));
    System.out.println("A máquina está ligada ? = " + novoMaq.ligado);
    novoMaq.ligarMaq();
    System.out.println("A máquina está ligada ? = " + novoMaq.ligado);
  }
}