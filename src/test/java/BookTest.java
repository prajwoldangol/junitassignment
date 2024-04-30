import com.prajwol.test.Book;
import com.prajwol.test.Publisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {
    @Test
    public void testAddPublisher() {
        Book book = new Book();
        Publisher publisher = new Publisher("PublisherName");
        book.addPublisher(publisher);

        assertTrue(book.getPublishers().contains(publisher));
    }

    @Test
    public void testRemovePublisher() {
        Book book = new Book();
        Publisher publisher = new Publisher("PublisherName");
        book.addPublisher(publisher);
        book.removePublisher(publisher);

        assertFalse(book.getPublishers().contains(publisher));
    }
}
