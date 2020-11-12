
package garagem;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Garagem {

    public static void main(String[] args) {
        int opcao =0;
        HashSet<String> cars = new HashSet();
        LinkedList<String> carsAlugados = new LinkedList();

        cars.add("Honda - NSX(1991)");
        cars.add("BMW - M3(2015)");
        cars.add("Volkswagen - Fusca(1982)");
        cars.add("Ford - Mustang(1969)");
        cars.add("Porsche - 911(2020)");
      
        Scanner sc = new Scanner(System.in);
       
       
        while(opcao!=4){
            System.out.println("---------GARAGEM--------");
            System.out.println("Escolha umas das operações a seguir:\n1-Alugar carro\n2-Listar carros alugados\n3-Devolver carro\n4-Sair");
            opcao = sc.nextInt();
      
            if(opcao==1){
                System.out.println("Escolha o numero do carro ou aperte 0 para voltar: ");
                listarCarros(cars);
                int numCar = sc.nextInt();
                
                if(numCar!=0){
                    alugarCarro(cars,carsAlugados,numCar);
                }   
                
            }else if(opcao == 2){
                
                listarAlugados(carsAlugados);
                if(carsAlugados.isEmpty()){
                    System.out.println("Nenhum carro foi alugado ainda.");
                }
            }else if(opcao==3){
                
                if(carsAlugados.isEmpty()){
                    System.out.println("Nenhum carro foi alugado ainda.");
                }else{
                    System.out.println("Escolha o numero do carro ou aperte 0 para voltar: ");
                    listarAlugados(carsAlugados);
                    int numCar = sc.nextInt();
                    
                    if(numCar!=0){
                       devolverCarro(cars,carsAlugados,numCar);
                    }
                } 
            }
        }
    }
    
    private static void listarCarros(HashSet<String> cars){
        int i=1;
        Iterator<String> it = cars.iterator();             //iterator é uma interface(?) que permite percorrer coleções
        while(it.hasNext()) {                              //hasNext é um boolean q verifica se ainda há elementos no iterator
            System.out.println(i++ + " - " + it.next());   //it.next vai retornar o proximo elemento do iterator
        }
    } 
    
    private static void listarAlugados(LinkedList<String> carsAlugados){
        System.out.println("Carros alugados:");
        int i=1;
        Iterator<String> it = carsAlugados.iterator();    
        while(it.hasNext()){   
            System.out.println(i++ + " - " + it.next());
        }
    }
    
    private static void alugarCarro(HashSet<String> cars,LinkedList<String> carsAlugados, int numCar){
        Object [] carray = cars.toArray();            // instanciando carr e recebendo o hashset cars convertido para string
        String alugado =  (String) carray[numCar-1];  //casting de objeto para string (?)
        System.out.println("O carro "+ alugado + " foi alugado!");
        cars.remove(alugado);                      
        carsAlugados.add(alugado);
    }
    
    private static void devolverCarro(HashSet<String> cars,LinkedList<String> carsAlugados, int numCar){
        Object carray [] = carsAlugados.toArray();
        String devolvido =  (String) carray[numCar-1]; 
        cars.add(devolvido);
        carsAlugados.remove(devolvido); 
        System.out.println("Carro "+ devolvido + " devolvido com sucesso!");
    }
    
}
