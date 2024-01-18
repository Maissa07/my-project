import com.exemple.App;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testApp() {
        App myApp = new App ();

        String result = my App.getStatus();
        assertEquals("OK",result);
    }
}