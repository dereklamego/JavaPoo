package robos;

public class RoboMedico implements RoboInterface {

    @Override
    public String iniciar() {
        return "Iniciando os sensores médicos de toque e visão raio-x!";
    }

    @Override
    public String desligar() {
        return "Sistema desligado.";
    }

    @Override
    public String recarregar() {
       return "Carregando...";
    }
    
    public String cortar(String orgao){
       return "Realizando um corte no(a) " + orgao;
    }
    
    public String costurar(String orgao){
        return "Costurando o(a) " + orgao;
    }
    
}
