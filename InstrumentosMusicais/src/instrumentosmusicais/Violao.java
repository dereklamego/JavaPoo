package instrumentosmusicais;

public class Violao extends InstrumentoMusical {

    
    public Violao(){
        super("violão",TipoInstrumento.valueOf("CORDA"));
    }
    
    
    @Override
    public String tocar(String cancao) {
        return "Tocando " + cancao;
    }

    @Override
    public String afinar() {
        return "Afinando as cordas do violão";
    }

   
    
}
