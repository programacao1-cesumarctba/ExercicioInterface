
public class MaqSolda extends Maquinas{

  public void ligarMaq(){
      if(this.ligado == false){
      this.ligado = true;
    }else{
      this.ligado = false;
    }
  }

  public void GerarManual(){
    System.out.println("Não ligue na tomada de 220V");
  }

  public double CalcularPreco(double preco){
    preco = preco * Math.random() * 50;
    return  preco;
  }
}