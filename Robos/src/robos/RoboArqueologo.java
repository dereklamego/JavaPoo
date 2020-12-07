package robos;

public class RoboArqueologo implements RoboInterface {

    @Override
    public String iniciar() {
        return "Iniciando os sensores arqueológicos de luz e detecção do material!";
    }

    @Override
    public String desligar() {
        return "Sistema desligado.";
    }

    @Override
    public String recarregar() {
        return "Carregando...";
    }
    
    public String cavar(String local){
        return "Cavando em: " + local;
    }
   
}
