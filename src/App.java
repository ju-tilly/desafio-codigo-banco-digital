public class App {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setName("Juce Duarte");

        Account ca = new CheckingAccount(client1);
        ca.deposit(90);
        
        Account sa = new SavingsAccount(client1);
        ca.transfer(50, sa);

        ca.printExtract();
        sa.printExtract();
    }
}
