package Q3;

public class Q3 {

    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);  // Resultado final: 77
    }
}

