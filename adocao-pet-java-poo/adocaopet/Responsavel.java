package adocaopet;

import java.util.ArrayList;

public class Responsavel {
    private String CPF;
    private String nome;
    private int idade;
    private ArrayList<Pet> petsAdotados;

    public Responsavel(String CPF, String nome, int idade) {
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
        this.petsAdotados = new ArrayList<>();
    }
    
    public boolean adotarPet(Pet pet){
        boolean adotado;
        
        if(this.getIdade()>=18){
            this.petsAdotados.add(pet);
            adotado = true;
        }else{
            adotado = false;
        }
        return adotado;
    }
    
    public String listarPets(){
        System.out.println("Dados dos pets");
        String dados="";
        
        for(Pet pt : petsAdotados){
            dados += pt.getInfoPet();
        }
        return dados;  
    }
    
    public String getInfoResponsavel(){
        return "Nome do responsavel: " +  this.getNome() +
              "\nCPF: " + this.getCPF() +
              "\nIdade: " + this.getIdade();
              
    }
    
    public int getIdade() {
        return idade;
    } 

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }
    
    
}
