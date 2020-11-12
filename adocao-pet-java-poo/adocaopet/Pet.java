package adocaopet;

public class Pet {
    private String nome;
    private String raca;
    private int idade;
    private double peso;
    private char sexo;
    
    public static final String[] racas = new String[]{"Vira-Lata","Labrador"," Pastor Alemão", "São Bernardo"};

    public Pet(String nome, String raca, int idade, double peso, char sexo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }
    
    public String getInfoPet(){
       return "Nome do pet: " +  this.getNome() +
              " || Raça do pet: " + this.getRaca() +
              " || Idade do pet: " + this.getIdade() +
              " || Peso do pet: " + this.getPeso() +
              " || Sexo do pet: " + this.getSexo() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public char getSexo() {
        return sexo;
    }

   
    
    
    
    
}
