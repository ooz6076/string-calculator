import org.junit.*;

public class TestUnit {

    public StringCalculator stringCalculator;

    @Before
    public void initialize(){
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testOne(){
        
    }

    @After
    public void destroy(){
        stringCalculator = null;
    }
}
