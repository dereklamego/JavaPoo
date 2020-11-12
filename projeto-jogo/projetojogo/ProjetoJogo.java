package projetojogo;
import java.util.ArrayList;

public class ProjetoJogo {

    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();
        cartas.add("Às de Copas");
        cartas.add("Dama de Copas");
        cartas.add("Rei de Copas");
        cartas.add("Valete de Copas");
        JogoCartas jc = new JogoCartas("Baralho", 20.0f, 7, cartas, 4);
        System.out.println(jc.toString());
        System.out.println(jc.getDeck());
        
        ArrayList<String> plataformas = new ArrayList<>();
        plataformas.add("Xbox");
        plataformas.add("Windows");
        plataformas.add("PlayStation");
        JogoEletronico je = new JogoEletronico("GTA V", 150.0f, 18, plataformas,0);
        System.out.println(je.toString());
        System.out.println(je.getPlataformas());
    }

}