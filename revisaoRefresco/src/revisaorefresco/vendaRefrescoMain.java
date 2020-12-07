package revisaorefresco;
public class vendaRefrescoMain {
    public static void main(String[] args) {
        
        Fabricante f = new Fabricante("Florinda's Drinks","D. Florinda" , 1970);
        Refresco tamar = new Refresco(Refresco.sabores[0], 'G', true, f);
        Refresco limao = new Refresco(Refresco.sabores[1], 'P', false, f);
        Refresco grose = new Refresco(Refresco.sabores[2], 'M', true, f);
        Venda v = new Venda();
        v.adicionarItem(tamar);
        v.adicionarItem(limao);
        v.adicionarItem(grose);
        System.out.println(v.getItens());
        System.out.println("Total: R$ " + v.getPrecoFinal());
    }
    
}
