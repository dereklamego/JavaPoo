package adocaopet;

import static adocaopet.Pet.racas;
import java.util.ArrayList;
import java.util.Scanner;

public class AdocaoMain {
   
    public static void main(String[] args) {
        int opcao =0;
        Pet p1 = new Pet("Caramelo",racas[0],6,10.0,'M');
        Pet p2 = new Pet("Amora",racas[1],3,15.0,'F'); 
        Pet p3 = new Pet("Rex",racas[2],5,24.0,'M');
        Pet p4 = new Pet("Belinha",racas[3],9,13.0,'F');
        
        ArrayList<Pet> petsParaAdocao = new ArrayList<>();
        petsParaAdocao.add(p1);
        petsParaAdocao.add(p2);
        petsParaAdocao.add(p3);
        petsParaAdocao.add(p4);
     
        Responsavel resp = new Responsavel("999.999.999-99","Derek",21);
        
        Scanner sc = new Scanner(System.in);
        
        
        while(opcao!=6){
            System.out.println("---------MENU--------");
             System.out.println("Escolha umas das operações a seguir:\n1-Adotar Pet\n2-Listar Pets adotados\n3-Listar pets restantes\n4-Sair");
            opcao = sc.nextInt();
       
            switch (opcao) {
                case 1 -> realizarAdocao(resp,petsParaAdocao,sc);
                case 2 -> listarPetsAdotados(resp);
                case 3 -> listarPetsRestantes(petsParaAdocao);
                case 4 -> System.out.println("Operação finalizada. Volte Sempre!");
                default -> System.out.println("Por favor, escolha uma operação válida");
            }
        }
    }

    private static void realizarAdocao(Responsavel r, ArrayList<Pet> petsParaAdocao, Scanner sc) {
        System.out.println("Informe qual pet deseja adotar ou pressione 0 para voltar: ");
        for (int i = 1; i <= petsParaAdocao.size(); i++) {
            System.out.println(i + " - " + petsParaAdocao.get(i-1).getInfoPet());
        }
        int numeroPet = sc.nextInt();
        if (numeroPet == 0) {
            return;
        }
        Pet candidato = petsParaAdocao.get(numeroPet-1);
        if (r.adotarPet(candidato)) {
            petsParaAdocao.remove(candidato);
            System.out.println("Pet " + numeroPet + " adotado com sucesso por:\n" + r.getInfoResponsavel());
        }
    }
    
    private static void listarPetsAdotados(Responsavel r) {
        System.out.println("\nPets adotados até o momento: ");
        System.out.println(r.listarPets());
    }
    
    private static void listarPetsRestantes(ArrayList<Pet> petsParaAdocao) {
        System.out.println("\nPets restantes para adoção: ");
        for (Pet p : petsParaAdocao) {
            System.out.println(p.getInfoPet());
        }
    }
}
