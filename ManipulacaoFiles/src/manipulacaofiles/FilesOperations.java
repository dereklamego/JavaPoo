package manipulacaofiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FilesOperations {

   File arquivoCriado = new File("info.txt"); //um atributo do tipo file para armazenar o arquivo criado, para poder chamar por paramentros nos metodos na main
    
   public File criarArquivo() {
        
        try{
        arquivoCriado.createNewFile();
        
        }catch(IOException ex){
            System.out.println("erro ao criar arquivo");
        }
       return arquivoCriado;
    }
    
     public void escreverArquivo(File arquivo) throws FileNotFoundException, IOException, InputMismatchException { 
        Scanner sc = new Scanner(System.in);
        FileWriter escrita = new FileWriter(arquivo.getName(),true);
        
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Idade: ");
        int idade = sc.nextInt();
       // sc.nextLine();
        
        System.out.println("Altura:");
        float altura = sc.nextFloat();
        
        escrita.write(nome+";"+idade+";"+altura+"\n");
        
        System.out.println("Dados cadastrados no arquivo: " + arquivo.getName() + " no local: " + arquivo.getAbsolutePath());
        escrita.close();
    }
    
    public void lerArquivo(File arquivo) throws FileNotFoundException{
        Scanner leitura = new Scanner(arquivo);
        
        if(arquivo.length() != 0){
            while (leitura.hasNextLine()) {
                String linhaAtual = leitura.nextLine();
                String[] textoSeparado = linhaAtual.split(";");
                System.out.println("Nome: "+textoSeparado[0]+"; Idade: "+textoSeparado[1]+"; Altura: "+textoSeparado[2]);
            }
        }else{
            System.out.println("O arquivo está vazio");
        }
        
        leitura.close();
    }
}
