package appmain;
import java.util.Scanner;

public class AppMain { //Nao consegui compilar ao muda o nome para AppMain
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //conta1.saldo = 2000f; está privado, nao funciona
        int opcao = 0;
        
        System.out.println("-------Seja bem vindo!-------");
        //Instanciando objetos(sem paramentros)
        ContaBanco conta1 = new ContaBanco();
        
        System.out.println("----------------------------");
        System.out.println("Bem vindo "+ conta1.getNomeTit() + "\nSeu saldo é de: R$" + conta1.getSaldo()); 
        System.out.println("----------------------------\n");
        
        while(opcao!=6){
        System.out.println("---------MENU--------");
        System.out.println("Escolha umas das operações a seguir:\n1-Sacar\n2-Depositar\n3-Extrato\n4-Mudar tipo de conta\n5-Solicitar aumento limite do saque\n6-Sair");
        opcao = sc.nextInt();
        
            switch(opcao){
                case 1 -> conta1.sacar();
                case 2 -> conta1.depositar();
                case 3 -> conta1.imprimir();
                case 4 -> {
                    System.out.println("Por favor, escolha o novo tipo da conta! [Poupança(p) ou Corrente(c)]"); 
                    conta1.setTipoCont(sc.next().charAt(0));
                }
                case 5 -> conta1.setLimiteSaque(); //só libera o aumento do limete do saque, se estiver com mais de 4500 de saldo
                case 6 -> System.out.println("Operação finalizada. Volte Sempre!");
                default -> System.out.println("Por favor, escolha uma operação válida");
            }
        }
    }
}
