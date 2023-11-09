import java.util.Scanner;
public class CaixaEletronico {
    private static double saldo = 0;
    private static int password= 5562;

    public static boolean validar(int code){
        if (password == code){
            return true;
        }else{
            return false;
        }
    }
    public static void versaldo(){
        System.out.println("\nSeu saldo é: "+ saldo);
    }
    public static void retirar(double valor){
        if(saldo<valor){
            System.out.println("\nValor insuficiente!!");
        }else{
            saldo-=valor;
        }
    }
    public static void depositar(double valor){
        try{
            saldo+=valor;
            System.out.println("\nValor Depositado na conta");
        }catch (Exception e){
            System.out.println("\nSaldo Não depositado. Tente novamente!!");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        double valor;
        int code;

        do{
            System.out.println("\n|    Bem Vindo ao Caixa Eletronico   | \n");
            System.out.println(" 1- Verificar Saldo");
            System.out.println(" 2- Deposito");
            System.out.println(" 3- Saque");
            System.out.println(" 0- Sair \n");
            System.out.print("Digite: ");
            opcao= scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite a senha: ");
                    code=scan.nextInt();
                    if(validar(code)== true){
                        versaldo();
                    }else{
                        System.out.println("\nSenha Errada");
                    }                    
                    break;
                case 2:
                    System.out.print("\nDigite a senha: ");
                    code=scan.nextInt();
                    if(validar(code)== true){
                        System.out.print("\nDigite a quantia a ser depositada: ");
                        valor= scan.nextDouble();
                        depositar(valor);
                    }else{
                        System.out.println("\nSenha Errada");
                    }                    
                    break;
                case 3:
                    System.out.print("\nDigite a senha: ");
                    code=scan.nextInt();
                    if(validar(code)== true){
                        System.out.print("\nDigite a quantida a ser retirada: ");
                        valor= scan.nextDouble();
                        retirar(valor);
                    }else{
                        System.out.println("\nSenha Errada");
                    }                     
                    break;
                case 0:
                    System.out.println("Volte Sempre!!");
                    break;
                default:
                    System.out.println("\nOpção invalida");
                    break;
            }
        }while(opcao!=0);
        scan.close();
  }
}