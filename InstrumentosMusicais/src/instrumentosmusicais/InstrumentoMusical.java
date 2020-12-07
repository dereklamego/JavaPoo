package instrumentosmusicais;



public abstract class InstrumentoMusical {
    private String nome;
    private TipoInstrumento tipo;
    
    public enum TipoInstrumento{
        SOPRO,
        CORDA,
        PERCUSSAO
    }

    public InstrumentoMusical(String nome, TipoInstrumento tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }
    
    public TipoInstrumento getTipo(){
        return this.tipo;
    }
    
    public abstract String tocar(String cancao);
    public abstract String afinar();
    
}
