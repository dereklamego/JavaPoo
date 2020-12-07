package revisaorefresco;
public class Refresco {
    private double precoUnitario = 2.5;
    private String sabor;
    private char tamanho;
    private boolean contemAcucar;
    private Fabricante fabricante;
    public static final String[] sabores = new  String[] {"tamarindo","limao", "groselha"};

    public Refresco(String sabor, char tamanho, boolean contemAcucar, Fabricante fabricante) {
        
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.contemAcucar = contemAcucar;
        this.fabricante = fabricante;
        this.setPrecoUnitario(2.5);
    }

    private void setPrecoUnitario(double precounit){
        switch (this.getTamanho()) {
            case 'G' -> this.precoUnitario += 1.0;
            case 'M' -> this.precoUnitario += 0.50;
            default -> System.out.println("Tamanho indisponivel!");
        }
   
        if(this.getContemAcucar()){
            this.precoUnitario += 0.50;
        }   
    }

    public char getTamanho() {
         return this.tamanho;
    }
    
    public boolean getContemAcucar(){
         return this.contemAcucar;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }
    
    public String getInfoRefresco(){
        return "-------SUCOS------\n"+
                "Sabor: "+ this.getSabor() +
                "\nTamanho: "+ this.getTamanho()+
                "\nNível de açucar: " + this.getContemAcucar() +
                "\nPreço: " + this.getPrecoUnitario()+
                "\n" + fabricante.getInfoFabricante();  
    }
}

//        if(this.getContemAcucar()){
//            switch (this.getTamanho()) {
//                case 'G' -> this.precoUnitario += 1.0 + 0.50;
//                case 'M' -> this.precoUnitario += 0.50 + 0.50;
//                default -> System.out.println("Tamanho indisponivel!");
//            }
//        }else{
//            switch (this.getTamanho()) {
//                case 'G' -> this.precoUnitario += 1.0;
//                case 'M' -> this.precoUnitario += 0.50;
//                default -> System.out.println("Tamanho indisponivel!");
//            }
//        }