
package manipulacaofiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ManipulacaoMain {
    
    public static void main(String[] args) throws FileNotFoundException {
        int opcao=0;
        Scanner sc = new Scanner (System.in);
        
        FilesOperations file1 = new FilesOperations(); //criei um objeto para poder usar os metodos na main
    
        while(opcao!=3){
            System.out.println("----MENU----\nEscolha uma opçao a seguir\n1-Cadastrar dados\n2-Obter dados\n3-Sair");
            opcao = sc.nextInt();
            
            if(opcao==1){
                file1.criarArquivo(); //fora do try catch por não gerar uma exceção(eu acho)
                
                try{
                    file1.escreverArquivo(file1.arquivoCriado);
                }catch(FileNotFoundException ex){
                    System.out.println("Nao foi possivel cadastrar os dados, o arquivo fonte nao foi criado :(");
                }catch (IOException ex){
                    System.out.println("Houve um erro na entrada de dados.");
                }catch(InputMismatchException ex){
                    System.out.println("Caracteres digitados são invalidos");
                }
            }else if(opcao==2){
                
                try{
                    file1.lerArquivo(file1.arquivoCriado);
                }catch(FileNotFoundException ex){
                    System.out.println("Nao foi possivel obter dados, arquivo nao existe");
                }
                   
            }
        } 
    }    
}
       