public abstract class Account implements IAccount{
    //Conta implementa interface Conta    
    private static final int DEFAULT_AGENCY = 1; //AGENCIA_PADRAO
    private static int SEQUENTIAL = 1;
    protected int agency; //agência
    protected int number; //número
    protected double balance; //saldo

    public Account() {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
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

    @Override
    public void withdraw(double value) {    
        
    }

    @Override
    public void deposit(double value) {        
        
    }

    @Override
    public void transfer(double value, Account targetAccount) {    
        
    }
}
