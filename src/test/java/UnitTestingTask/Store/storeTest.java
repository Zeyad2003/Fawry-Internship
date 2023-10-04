package UnitTestingTask.Store;

import org.fawry.Week4.UnitTesting.Task.Account.AccountManager;
import org.fawry.Week4.UnitTesting.Task.Account.Customer;
import org.fawry.Week4.UnitTesting.Task.Store.MyStore;
import org.fawry.Week4.UnitTesting.Task.Store.Product;
import org.fawry.Week4.UnitTesting.Task.Store.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class storeTest {
    AccountManager accountManager;
    Store store;
    Customer customer;
    Product product;

    @BeforeEach
    void setUp(){
        accountManager = mock(AccountManager.class);
        store = new MyStore(accountManager);
        customer = new Customer();
        product = new Product();
    }

    @Test
    void testBuy_whenOutOfStock_thenThrowException() {
        product.setQuantity(0);
        assertThatThrownBy(() -> store.buy(product, customer))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Product out of stock");
    }

    @Test
    void testBuy_whenPaymentFailure_thenThrowException() {
        product.setQuantity(10);
        when(accountManager.withdraw(customer, product.getPrice()))
                .thenReturn("Fail");
        assertThatThrownBy(() -> store.buy(product, customer))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Payment failure: Fail");
    }

    @Test
    void testBuy_whenPaymentSuccess_thenDecreaseQuantity() {
        product.setQuantity(10);
        when(accountManager.withdraw(customer, product.getPrice()))
                .thenReturn("success");
        store.buy(product, customer);
        assertThat(product.getQuantity()).isEqualTo(9);
    }


}
