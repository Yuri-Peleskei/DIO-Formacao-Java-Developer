import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (Exception e) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Erro: Primeiro parametro não pode ser maior que o segundo parametro");
            System.out.println("Programa reiniciando...");
            main(args);
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
        // realizar o for para imprimir os números com base na variável contagem
    }
}
