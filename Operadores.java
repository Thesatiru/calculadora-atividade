public class Operadores {
    // Faz a adição de dois números
    public float adicao (float n1, float n2){
        return n1+n2;
    }

    // Faz a subtração entre dois números
    public float subtracao(float n1, float n2){
        return n1-n2;
    }

    // Faz a multiplicação entre dois números
    public float multiplicacao(float n1, float n2){
        return n1*n2;
    }

    // Faz a divisão de dois números
    public float divisao(float n1, float n2){
        return n1/n2;
    }

    // Atribui a soma (n1 recebe ele mesmo + n2)
    public float operadorAtribuicaoAdi(float n1, float n2){
        return n1+=n2;
    }

    // Atribui a subtração (n1 recebe ele mesmo - n2)
    public float operadorAtribuicaoSub(float n1, float n2){
        return n1-=n2;
    }

    // Atribui a multiplicação (n1 recebe ele mesmo * n2)
    public float operadorAtribuicaoMult(float n1, float n2){
        return n1*=n2;
    }

    // Atribui a divisão (n1 recebe ele mesmo / n2)
    public float operadorAtribuicaoDiv(float n1, float n2){
        return n1/=n2;
    }

    // Retorna se os dois valores booleanos são verdadeiros (E lógico)
    public boolean operadorLogicoE(boolean v1, boolean v2){
        return v1 && v2;
    }

    // Retorna se pelo menos um dos valores é verdadeiro (OU lógico)
    public boolean operadorLogicoOr(boolean v1, boolean v2){
        return v1 || v2;
    }

    // Inverte o valor (se for true vira false, e vice-versa)
    public boolean operadorLogicoNotV1(boolean v1){
        return !v1;
    }

    // Verifica se o primeiro número é maior que o segundo
    public boolean operadorComparacaoMaior(float n1, float n2){
        return n1 > n2;
    }

    // Verifica se o primeiro número é menor que o segundo
    public boolean operadorComparacaoMenor(float n1, float n2){
        return n1 < n2;
    }

    // Verifica se os dois números são iguais
    public boolean operadorComparacaoIgual(float n1, float n2){
        return n1 == n2;
    }

    // Verifica se os dois números são diferentes
    public boolean operadorComparacaoDiferente(float n1, float n2){
        return n1 != n2;
    }
}
