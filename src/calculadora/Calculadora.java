package calculadora;
import java.util.Scanner;

class Calculadora {
  
  public static void main (String[] a){
    
    Scanner ler = new Scanner(System.in);
    
    Divisao divisao = new Divisao();
    Multiplicacao multiplicacao = new Multiplicacao();
    Soma soma = new Soma();
    Subtracao subtracao = new Subtracao();

    String operacao;
    double x , y;

    System.out.println("Calculadora");
    System.out.println("Digite o primeiro valor:");
    x = ler.nextDouble();
    System.out.println("Digite a operacao:");
    operacao = ler.next();
    System.out.println("Digite o segundo valor:");
    y = ler.nextDouble();
    
    

    switch(operacao){
      case "*" :
        System.out.println("Resultado: " + multiplicacao.multiplicar(x, y));
        break;
        
      case "/":
        System.out.println("Resultado: " + divisao.dividir(x, y));
        break;
        
      case "+":
        System.out.println("Resultado: " + soma.somar(x, y));
        break;
        
      case "-":
        System.out.println("Resultado: " + subtracao.subtrair(x, y));
        break;
        
    }
    ler.close();
  }
}