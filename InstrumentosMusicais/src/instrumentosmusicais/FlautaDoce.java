package instrumentosmusicais;
public class FlautaDoce  extends InstrumentoMusical {
    
    public FlautaDoce(){
        super("Flauta doce",TipoInstrumento.valueOf("SOPRO"));
    }

    @Override
    public String tocar(String cancao) {
        return "Esta tocando " + cancao;
    }

    @Override
    public String afinar() {
        return "Reencaixando a flauta para a afinação!";
    }
    
}
