import org.junit.*;

public class TestUnit {

    public StringCalculator stringCalculator;

    @Before
    public void initialize(){
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testOne(){
        // test for null String
        int res = stringCalculator.add("0");
        assert res == 0;
        System.out.println("Null String test = " + res);
        System.out.println("Test passed");
    }

    @Test
    public void testTwo(){
        //test for empty String
        int res = stringCalculator.add("");
        assert res == 0;
        System.out.println("Empty String test = " + res);
        System.out.println("Test passed");
    }

    @After
    public void destroy(){
        stringCalculator = null;
    }
}
