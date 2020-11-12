package projetojogo;

import java.util.ArrayList;
import java.util.Collections;

public class JogoEletronico extends Jogo{
    private ArrayList<String> plataforma;
    private String categoria;
    private String[] categorias = new String[]{"Ação","Esporte","Estratégia"};
    
    public JogoEletronico(String nome, float precoUnit, int clasEtaria, ArrayList<String> plataforma,int numCateg){
        super(nome,precoUnit,clasEtaria);
        this.plataforma = plataforma;
        this.categoria = categorias[numCateg];
    }
    
    public String getPlataformas(){
       System.out.print("Plataformas: ");
       String plat="";
       Collections.sort(plataforma); //metodo para ordernar o arraylist antes de concatenar na string vazia, pertence a classe Collections
       for(String pl: plataforma){
           plat+= pl+";";
       }
       return plat;
    }
     
    @Override
    public String toString(){
        return "Nome: "+this.nome+" | Preço untario: "+ this.precoUnitario+" | Clas. Etaria: "+this.clasEtaria+
                " | Categoria: "+ this.categoria;
        
    }
    //super.toString()
}
