package projetojogo;
public class Jogo {
    protected String nome;
    protected float precoUnitario;
    protected int clasEtaria;

    public Jogo(String nome, float precoUnit, int clasEtaria){
       this.nome = nome;
       this.precoUnitario = precoUnit;
       this.clasEtaria = clasEtaria;
    }
    
   @Override
    public String toString(){
       return "Nome: "+this.nome+"| Preço Unitario: "+this.precoUnitario+"| Clas. Etaria: "+this.clasEtaria;
    }
    
}
