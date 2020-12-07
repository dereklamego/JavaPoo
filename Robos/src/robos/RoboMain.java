package robos;
public class RoboMain {

    public static void main(String[] args) {
        RoboMedico rbm1 = new RoboMedico();
        System.out.println(rbm1.iniciar());
        System.out.println(rbm1.recarregar());
        System.out.println(rbm1.cortar("figado"));
        System.out.println(rbm1.costurar("figado"));
        System.out.println(rbm1.desligar());
        
        System.out.println("");
        
        RoboArqueologo rba = new RoboArqueologo();
        System.out.println(rba.iniciar());
        System.out.println(rba.recarregar());
        System.out.println(rba.cavar("Uranus"));
        System.out.println(rba.desligar());
        
    }
    
}
