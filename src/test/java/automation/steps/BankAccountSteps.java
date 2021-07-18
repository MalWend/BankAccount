package automation.steps;

import automation.BankAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BankAccountSteps {

    private BankAccount bankAccount;
    private boolean isWithdrawPossible;


    @Given("BankAccount has {int} pln")
    public void bankAccountHasPln(int accountBalance) {
        bankAccount = new BankAccount(accountBalance);

    }

    @When("User withdraws {int} pln")
    public void userWithdrawsPln(int withdrawMoney) {
        isWithdrawPossible = bankAccount.withdraw(withdrawMoney);

    }

    @Then("Transaction should be done")
    public void transactionShouldBeDone() {
        Assert.assertTrue(isWithdrawPossible);
    }

    @And("Account balance should be {int} pln")
    public void accountBalanceShouldBePln(int accountBalance) {
        Assert.assertEquals(accountBalance, bankAccount.getAccountBalance() );
    }

    @Then("Transaction should not be done")
    public void transactionShouldNotBeDone() {
        Assert.assertFalse(isWithdrawPossible);
    }

    @And("User transfer {int} pln")
    public void userTransferPln(int transferAmount) {
        bankAccount.transfer(transferAmount);

    }
}
