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
        assertEquals("Null String test",0,res);
    }

    @Test
    public void testTwo(){
        //test for empty String
        int res = stringCalculator.add("");
        assertEquals("Empty String test = ",0,res);
    }

    @After
    public void destroy(){
        stringCalculator = null;
    }

    private void assertEquals(String testCase, int actual, int result){
        // prints result for each test case
        System.out.println(testCase + " = " + result);

        // checks if test case passed
        if(actual == result){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed!");
        }
    }
}
