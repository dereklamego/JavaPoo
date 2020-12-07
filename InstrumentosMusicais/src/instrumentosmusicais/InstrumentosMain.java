package instrumentosmusicais;

public class InstrumentosMain {

    public static void main(String[] args) {
      
        Violao v1 = new Violao();
        System.out.println(v1.afinar());
        System.out.println(v1.tocar("Barões da pisadinha - Basta voce me ligar\n"));
        
        
        FlautaDoce fd1 = new FlautaDoce();
        System.out.println(fd1.afinar());
        System.out.println(fd1.tocar("Artista desconhecido - Sem titulo"));
        
    }
    
}
