package revisaorefresco;

import java.util.ArrayList;

public class Venda {
    private double precoFinal;
    private ArrayList<Refresco> itens;
    
    public Venda(){
        this.setPrecoFinal(0.0);
        this.itens = new ArrayList<>();
    }
    

    public void adicionarItem(Refresco refresco){
        this.itens.add(refresco);
        this.setPrecoFinal(refresco.getPrecoUnitario()+this.getPrecoFinal());
    }
    
    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

   public String getItens(){
       String it="";
       
       for(Refresco refrescos: itens){
           it+= refrescos.getInfoRefresco();
       }
       return it;
   }

    

    
    
}
