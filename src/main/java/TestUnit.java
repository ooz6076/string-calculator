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

    @Test
    public void testFour(){
        // test for two numbers
        assertEquals(
                "Two numbers test",
                8,
                stringCalculator.add("3,5")
        );
    }

    @Test
    public void testFive(){
        // multiple numbers test
        assertEquals(
                "Multiple numbers test",
                55,
                stringCalculator.add("1,2,3,4,5,6,7,8,9,10")
        );
    }

    @Test
    public void testSix(){
        // test for allowing new line characters
        assertEquals(
                "New line character test",
                10,
                stringCalculator.add("1\n4,5")
        );
    }

    @Test
    public void testSeven(){
        //test for different delimiter
        assertEquals(
                "Different delimiter test",
                10,
                stringCalculator.add("//:\n1:2:3:4")
        );
    }

    @Test
    public void testEight(){
        // test for different delimiter 2
        assertEquals(
                "Different delimiter test 2",
                10,
                stringCalculator.add("//;\n1;2;3;4")
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
