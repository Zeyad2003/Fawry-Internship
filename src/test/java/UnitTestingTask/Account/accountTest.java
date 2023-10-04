package UnitTestingTask.Account;

import org.fawry.Week4.UnitTesting.Task.Account.AccountManagerImpl;
import org.fawry.Week4.UnitTesting.Task.Account.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class accountTest {
    private AccountManagerImpl accountManager;
    private Customer customer;

    @BeforeEach
    void setUp(){
        accountManager = new AccountManagerImpl();
        customer = new Customer();
    }

    @Test
    void testDeposit() {
        accountManager.deposit(customer, 100);
        assertThat(customer.getBalance()).isEqualTo(100);
    }

    @Test
    void testWithdraw_whenSufficientBalance_thenSucceed() {
        customer.setBalance(100);
        String result = accountManager.withdraw(customer, 50);
        assertThat(result).isEqualTo("success");
        assertThat(customer.getBalance()).isEqualTo(50);
    }

    @Test
    void testWithdraw_whenInsufficientBalance_thenFail() {
        customer.setBalance(100);
        String result = accountManager.withdraw(customer, 150);
        assertThat(result).isEqualTo("insufficient account balance");
    }

    @Test
    void testWithdraw_whenCreditAllowedAndNotExceededMax_thenSucceed() {
        customer.setBalance(100);
        customer.setCreditAllowed(true);
        String result = accountManager.withdraw(customer, 150);
        assertThat(result).isEqualTo("success");
        assertThat(customer.getBalance()).isEqualTo(-50);
    }

    @Test
    void testWithdraw_whenCreditAllowedAndExceededMaxAndNotVIP_thenFail() {
        customer.setBalance(100);
        customer.setCreditAllowed(true);
        customer.setVip(false);
        String result = accountManager.withdraw(customer, 3000);
        assertThat(result).isEqualTo("maximum credit exceeded");
    }

    @Test
    void testWithdraw_whenCreditAllowedAndExceededMaxAndVIP_thenSucceed() {
        customer.setBalance(100);
        customer.setCreditAllowed(true);
        customer.setVip(true);
        String result = accountManager.withdraw(customer, 3000);
        assertThat(result).isEqualTo("success");
        assertThat(customer.getBalance()).isEqualTo(-2900);
    }

    @Test
    void testWithdraw_whenCreditNotAllowed_thenFail() {
        customer.setBalance(100);
        customer.setCreditAllowed(false);
        String result = accountManager.withdraw(customer, 150);
        assertThat(result).isEqualTo("insufficient account balance and credit not allowed");
    }
}
