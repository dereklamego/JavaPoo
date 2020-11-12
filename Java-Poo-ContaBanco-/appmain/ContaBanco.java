package appmain;
import java.util.Scanner;
public class ContaBanco {
    Scanner sc = new Scanner(System.in);
    private String nomeBanco;
    private int numAgnc;
    private int numCont;
    private String nomeTit;
    private char tipoCont;
    private float saldo;
    private float limiteSaque;
    
    /*Construtor não está recebendo parametros, porque os atributos estão sendo definidos dentro dele pelo scanner, ao instanciar o objeto*/
    public ContaBanco(){
        this.limiteSaque = 500f;
        this.saldo = 0f;
        
        System.out.println("Digite o nome do banco: ");
        this.nomeBanco = sc.next();

        System.out.println("Digite o numero da agencia: ");
        this.numAgnc = sc.nextInt();
        
        System.out.println("Digite o numero da conta: ");
        this.numCont = sc.nextInt();
        sc.nextLine(); // metodo que encontrei para limpar o buffer
        
        System.out.println("Digite o nome do titular: ");
        this.nomeTit = sc.nextLine();
        
        while(this.tipoCont != 'p' && this.tipoCont != 'c' ){
            System.out.println("Informe o tipo da conta: P (para poupança) / C (para conta corrente) ");
            this.tipoCont = sc.next().charAt(0);
            this.tipoCont = Character.toLowerCase(this.tipoCont);
            
            if(this.tipoCont != 'p' && this.tipoCont != 'c'){  //this.tipoCont != 'p' && this.tipoCont != 'c'
                System.out.println("Por favor! Informe um tipo de conta válida");
            }   
        }
    }
    
    /* GETTERS DOS ATRIBUTOS */
    public float getSaldo(){
        return this.saldo;
    }
    public String getNomeBanco(){
        return this.nomeBanco;
    }
    public int getNumAgnc(){
        return numAgnc;
    }
    public int getNumCont(){
        return numCont;
    }
    public String getNomeTit(){
        return nomeTit;
    }
    public char getTipoCont(){
        return tipoCont;
    }

    public float getLimiteSaque() {
        return limiteSaque;
    }

    /* SETTERS DOS ATRIBUTOS */
    public void setTipoCont(char tipoConta){
        tipoConta = Character.toLowerCase(tipoConta);
        if(tipoConta == 'p' || tipoConta == 'c'){
            this.tipoCont = tipoConta;
        }else{
            System.out.println("Tipo de conta indisponivel!");
        }
    }
    
    public void setLimiteSaque(){
        if(this.getSaldo() >= 4500f){
            this.limiteSaque = 1000f;
            System.out.println("Limite aumentado! Total de: " + this.getLimiteSaque());
        }else{
            System.out.println("Não foi possível aumentar o limite do saque. :( "); 
        }
    }
    
    public double sacar(){
        /*IMPORTANTE! Caso tirar a nota de 1 real, fazer com que so desconte do saldo o valor das cedulas sacadas.*/
        int nota100 = 0, nota50=0, nota20=0, nota10=0, nota5=0, nota2=0, nota1=0;     
        System.out.println("---------SAQUE--------\nInforme o valor para saque: ");   
        float saque= sc.nextFloat();
        
        if(this.getSaldo() <=0 || saque > this.getSaldo()){
            System.out.println("Saldo insuficiente :( \n");
        }else if( saque<=0 || saque > this.getLimiteSaque() ){ //
            System.out.println("Valor indisponivel para saque!\n");
        }else{ 
            this.saldo -= saque;
            /*Separando as cedulas*/
            System.out.println("Total de cédulas: ");
            while(saque > 0){
                if(saque >=100){
                    saque -= 100;
                    nota100++;                  
                }else if(saque >=50){
                    saque -= 50;
                    nota50++;                   
                }else if(saque >=20){
                    saque -= 20;
                    nota20++;                  
                }else if(saque >= 10){
                    saque -= 10;
                    nota10++;   
                }else if(saque>=5){
                    saque -= 5;
                    nota5++;
                }else if(saque >=2){
                    saque -= 2;
                    nota2++;
                }else{
                    saque -=1;
                    nota1++;  
                }  
            }
            /* para nao escrever no console as cedulas q não foram sacadas*/
            if(nota100>0){
                System.out.println(nota100 + " cedulas de R$100,00");
            }
            if(nota50>0){
                System.out.println(nota50 + " cedulas de R$50,00");
            }
            if(nota20>0){
                System.out.println(nota20 + " cedulas de R$20,00");
            }
            if(nota10>0){
                System.out.println(nota10 + " cedulas de R$10,00");
            }
            if(nota5>0){
                System.out.println(nota5 + " cedulas de R$5,00");
            }
            if(nota2>0){
                System.out.println(nota2 + " cedulas de R$2,00");
            }
            if(nota1>0){
                System.out.println(nota1 + " cedulas de R$1,00");
            }
            if(this.getSaldo() < 4500f ){ //a cada saque realizado, verifica o saldo para definir o limite de saque
                this.limiteSaque = 500f ; //não usei o metodo setLimiteSaque() aqui, porque irá fazer a solicitação automatica do aumento do limite."
           }
        }
        return this.saldo;
    }
    
    public double depositar(){
        System.out.println("-------DEPOSITO------\nInforme o valor do deposito: ");
        float deposito= sc.nextFloat();
        if(deposito <= 0){
            System.out.println("Não foi possível realizar o deposito!");
        }else{
            this.saldo += deposito;
            System.out.println("Deposito de R$"+ deposito+" realizado com sucesso!\n");
            System.out.println("Saldo atual: R$"+ this.saldo);
        }
        return this.saldo;
    }
  
    public void imprimir(){ //nao consegui usar aquele metodo de retornar como string
        System.out.println("------DADOS BANCARIOS------");
        System.out.println("TITULAR: "+ this.getNomeTit());
        System.out.println("BANCO: "+ this.getNomeBanco());
        System.out.println("AGENCIA: "+ this.getNumAgnc());
        System.out.println("CONTA: "+ this.getNumCont());
        
        if(this.getTipoCont() == 'p'){
            System.out.println("TIPO: Poupança");
        }else{
            System.out.println("TIPO: Corrente");
        }
        System.out.println("SALDO: R$"+this.getSaldo()+"\n");
    } 
}