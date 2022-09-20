public class SavingsAccount extends Account{
    
    public SavingsAccount(Client client) {
        super(client);
    }

    //ContaPoupanca extends classe Conta
    @Override
    public void printExtract() {
        System.out.println("\n=== Savings Account Extract: ===\n"); 
        super.imprimirInfos(); 
    }   
}
