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
        assertEquals(
                "Null String test",
                0,
                stringCalculator.add("0")
        );
    }

    @Test
    public void testTwo(){
        //test for empty String
        assertEquals(
                "Empty String test",
                0,
                stringCalculator.add("")
        );
    }

    @Test
    public void testThree(){
        // test for one number
        assertEquals(
                "One number test",
                1,
                stringCalculator.add("1")
        );
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
