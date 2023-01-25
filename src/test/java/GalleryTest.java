
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class GalleryTest {

   Gallery gallery;
   Artwork artwork;
   Artist artist;

   @BeforeEach
   public void setUp(){
      gallery = new Gallery("Worm Gallery");
      artwork = new Artwork("Starry Night", artist, 54);
   }

   @Test
   public void canCountTill(){
      assertThat(gallery.countTill()).isEqualTo(0);
  
   }

   @Test
   public void canAddToTill(){
      gallery.addToTill(artwork);
      assertThat(gallery.countTill()).isEqualTo(54);
   }

}
