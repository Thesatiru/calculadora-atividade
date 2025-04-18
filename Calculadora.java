import java.util.Scanner;
//Nome: Rafael Lana dos Santos
public class Calculadora {
    public static void main(String[] args) {
        Operadores conta = new Operadores(); // Cria um objeto pra usar os métodos

        // Testes com operadores aritméticos
        System.out.println("O resultado é: "+conta.adicao(5,10)); // Soma
        System.out.println("O resultado é: "+ conta.subtracao(5,10)); // Subtração
        System.out.println("O resultado é: "+conta.multiplicacao(5,10)); // Multiplicação
        System.out.println("O resultado é: "+conta.divisao(5,10)); // Divisão

        // Testes com operadores de atribuição
        System.out.println("O resultado da atribuição é: "+ conta.operadorAtribuicaoAdi(5,20)); // +=
        System.out.println("O resultado da atribuição é: "+ conta.operadorAtribuicaoSub(5,20)); // -=
        System.out.println("O resultado da atribuição é: "+ conta.operadorAtribuicaoMult(5,20)); // *=
        System.out.println("O resultado da atribuição é: "+ conta.operadorAtribuicaoDiv(5,20)); // /=

        // Testes com operadores lógicos
        System.out.println("O resultado lógico é: "+ conta.operadorLogicoE(true,false)); // E lógico
        System.out.println("O resultado lógico é: "+ conta.operadorLogicoOr(true,true)); // OU lógico
        System.out.println("O resultado lógico é: "+ conta.operadorLogicoNotV1(false)); // NOT lógico

        // Testes com operadores de comparação
        System.out.println("O resultado da comparação é: "+conta.operadorComparacaoMaior(20,30)); // >
        System.out.println("O resultado da comparação é: "+conta.operadorComparacaoMenor(20,30)); // <
        System.out.println("O resultado da comparação é: "+conta.operadorComparacaoIgual(20,20)); // ==
        System.out.println("O resultado da comparação é: "+conta.operadorComparacaoDiferente(20,30)); // !=
    }
}
