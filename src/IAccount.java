public interface IAccount {
//Interface Conta
    void withdraw(double value);   
    void deposit(double value);
    void transfer(double value, Account targetAccount); //conta destino
    void printExtract(); //imprimir extrato
}
