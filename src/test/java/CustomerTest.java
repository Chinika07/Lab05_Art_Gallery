import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
       Artwork artwork;
       Artist artist;

       @BeforeEach
       void setUp(){
       customer = new Customer("John", 500);
       artwork = new Artwork("Sunflower", artist,100);
       }

   @Test
   public void canCountWallet(){
      assertThat(customer.countWallet()).isEqualTo(500);

   }
       @Test
       public void canRemoveMoneyFromWallet(){
           customer.removeMoneyFromWallet(artwork);
           assertThat(customer.countWallet()).isEqualTo(400);
       }






}
