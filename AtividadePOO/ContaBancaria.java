public class ContaBancaria{ //criando a classe principal
    private String titular; //listando atributos
    private String numeroConta;
    private Double saldo;

    public ContaBancaria(){}//método

    public ContaBancaria(String titular, String numeroConta){ //construtor
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    //Métodos get e set:

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //depositar

    public void depositar(double valor) throws exception {
        if(valor<=0){
            throw newException();
        }

        saldo=saldo+valor;
    }

    //sacar

    public void sacar(double valor) throws Exception{
        if(valor>saldo){
            throw newException();
        }

        saldo=valor || saldo=saldo-valor;
    }

    }

}