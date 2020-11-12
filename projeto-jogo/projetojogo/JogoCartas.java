package projetojogo;

import java.util.ArrayList;
import java.util.Collections;

public class JogoCartas extends Jogo {
    private int qtdJogadores;
    private ArrayList<String> deck;
    
    public JogoCartas(String nome, float precoUnit, int clasEtaria, ArrayList<String> deck, int qtdJogador){
        super(nome,precoUnit,clasEtaria);
        this.deck = deck;
        this.qtdJogadores = qtdJogador;
    }

    public String getDeck(){
        System.out.print("Deck: ");
        String dcard="";
        Collections.shuffle(deck); //metodo para embaralhar o arraylist antes de concatenar na string vazia, pertence a classe Collections 
        
        for(String card: deck){
            dcard+= card+"; ";
        }
        return dcard;
    }
    
    @Override
    public String toString(){
        return "Nome: "+this.nome+" | Preço untario: "+ this.precoUnitario+" | Clas. Etaria: "+this.clasEtaria+ " |Qtd jogadores: | "+this.qtdJogadores;
    } 
}
