package revisaorefresco;
public class Fabricante {
    private String nome;
    private String CEO;
    private int anoFundacao;

    public Fabricante(String nome, String CEO, int anoFundacao) {
        this.nome = nome;
        this.CEO = CEO;
        this.anoFundacao = anoFundacao;
    }
    
    public String getInfoFabricante(){
        return "Fabricante: " + this.getNome() +
               "\nCEO: " + this.getCEO() +
               "\nAno de fundação: " + this.getAnoFundacao()+"\n";
    }

    public String getNome() {
        return this.nome;
    }

    public String getCEO() {
        return this.CEO;
    }

    public int getAnoFundacao() {
        return this.anoFundacao;
    }
 
    
}
