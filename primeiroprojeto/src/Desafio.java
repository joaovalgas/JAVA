import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "José da Silva";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int acao = 0;
        double valor = 0.0;
        System.out.println("********************\n");
        System.out.println("Dados inciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta:");
        System.out.println("Saldo: " + saldo);
        System.out.println("\n********************");

        Scanner leitura = new Scanner(System.in);
        leitura.useLocale(Locale.US);

        String opcoes =  """
                \nDigite o número correspondente ao que deseja fazer:
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                Digite a opção desejada: 
                """;




        while (acao != 4){

            System.out.print(opcoes);
            try {
                acao = leitura.nextInt();

                if(acao == 1){
                    System.out.println("\nO saldo atual é de " + saldo );
                }
                else if(acao == 2){
                    System.out.println("\nQual valor voce deseja depositar: ");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Saldo atual e de " + saldo );
                }
                else if(acao == 3){
                    System.out.println("\nQual valor voce deseja transferir: ");
                    valor = leitura.nextDouble();

                    if(saldo < valor){
                        System.out.println("Saldo insuficiente");
                    }
                    else{
                        saldo -= valor;
                        System.out.println("Saldo atual " + saldo);
                    }

                }
                else{
                    System.out.println("Comando nao reconhecido");
                }
            }
            catch (Exception e) {
                System.out.println("\nInsira um valor valido");
                leitura.next();
            }


        }

    }
}
