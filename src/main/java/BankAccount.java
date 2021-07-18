public class BankAccount {
    public int accountBalance;

    //Konstruktor bezparametrowy//

    public BankAccount(){
        this.accountBalance = 0;
    }

    //Konstruktor z jednym parametrem,
    // będziemy przypisywać wartość wprowadzanej  zmiennej i ustalać jej wartość jako globalną//

    public BankAccount(int accountBalance){
        this.accountBalance = accountBalance;
    }

    //Metoda pierwsza -publiczna, zwracająca wartość logiczną przyjmująca
    // jedną zmienną typu liczbowego „amount”, nazwa metody „withdraw”

    public boolean withdraw(int amount){
        if (amount > this.accountBalance){
            return false;
        } this.accountBalance -= amount;
        return true;
    }
    //Metoda druga -publiczna, która nie zwraca żadnej wartości
    // przyjmująca jedną zmienną typu liczbowego „amount”, nazwa metody „transfer”

    public void transfer(int amount){
        this.accountBalance += amount;
    }

    //Metoda trzecia - publiczna zwracająca wartość liczbową,
    // nie przyjmująca żadnej zmiennej,nazwa metody „getAccountBalance”

    public int getAccountBalance(){
        return this.accountBalance;
    }
}
