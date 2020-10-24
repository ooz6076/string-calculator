import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    //Default empty constructor
    public StringCalculator(){

    }

    public int add(String numbers){


        if(numbers == null || numbers.isEmpty()){
            return 0;
        }
        String delimiter = null;
        String[] nums = null;
        if(numbers.startsWith("//")){
            String regex = "//(.)\n(.*)";
            Matcher matcher = Pattern.compile(regex).matcher(numbers);
            if(matcher.matches()){
                delimiter = matcher.group(1);
                nums = matcher.group(2).split(delimiter,0);
            }else{
                return 0;
            }

        }else{
            nums = numbers.split(",", 0);
        }

        int sum = 0;

        for(String number: nums){
            int num = Integer.parseInt(number);
            sum += num;
        }

        return sum;
    }

}