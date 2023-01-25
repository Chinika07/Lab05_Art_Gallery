import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class ArtworkTest {

    Artwork artwork;
    Artist artist1;

    @BeforeEach
    public void setUp(){
        artist1 = new Artist("Van Gogh");
        artwork = new Artwork("Starry Night", artist1, 200);
    }

    @Test
    public void hasTitle(){
       assertThat(artwork.getTitle()).isEqualTo("Starry Night");
    }

    //getter
    @Test
    public void hasPrice(){
       assertThat(artwork.getPrice()).isEqualTo(200);
    }

    //setter
    @Test
    public void setNft(){
        artwork.setNft(123);
        assertThat(artwork.getNft()).isEqualTo(123);
    }


}
