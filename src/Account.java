import javax.crypto.SealedObject;

public abstract class Account implements IAccount{
    //Conta implementa interface Conta    
    private static final int DEFAULT_AGENCY = 1; //AGENCIA_PADRAO
    private static int SEQUENTIAL = 1;
    protected int agency; //agência
    protected int number; //número
    protected double balance; //saldo
    protected Client client; //a conta tem um cliente

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }    
    
    @Override
    public void withdraw(double value) {    //método de saque
        balance -= value;
    }

    @Override
    public void deposit(double value) { //método de déposito       
        balance += value;
    }

    @Override
    public void transfer(double value, Account targetAccount) { //método de transferência
        this.withdraw(value);
        targetAccount.deposit(value);
    }

    public int getAgency() {
        return this.agency;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public double getBalance() {
        return this.balance;
    }

    protected void imprimirInfos() {
        System.out.println(String.format("Holder: %s", client.getName()));
        System.out.println(String.format("Agency: %d", agency));
        System.out.println(String.format("Number: %d", number));
        System.out.println(String.format("Balance: %.2f \n", balance));
    }
}
