import javafx.util.Pair;

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

        String[] nums = customSplitter(numbers);


        int sum = 0;

        for(String number: nums){
            int num = Integer.parseInt(number);
            sum += num;
        }

        return sum;
    }

    private String[] customSplitter(String numbers){

        if(numbers.startsWith("//")){
            String regex = "//(.)\n(.*)";
            Matcher matcher = Pattern.compile(regex).matcher(numbers);
            if(matcher.matches()){
                return matcher
                        .group(2)
                        .split(
                                matcher.group(1),
                                0
                        );
            }else{
                return null;
            }

        }else{
            return numbers.split(",", 0);
        }
    }

}