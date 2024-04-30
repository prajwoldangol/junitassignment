import com.prajwol.test.Biography;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiographyTest {
    @Test
    public void testSetBio() {
        Biography biography = new Biography();
        String bioText = "This is a biography.";
        biography.setBio(bioText);

        assertEquals(bioText, biography.getBio());
    }
}
