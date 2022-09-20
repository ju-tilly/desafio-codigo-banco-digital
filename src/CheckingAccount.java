public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    //ContaCorrente extend classe Conta
    @Override
    public void printExtract() {
        System.out.println("\n== Checking Account Statement: ==\n");
        super.imprimirInfos();     
    }    
}
