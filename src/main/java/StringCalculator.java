import customExceptions.NegativeNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    //Default empty constructor
    public StringCalculator(){

    }

    public int add(String numbers) {


        if(numbers == null || numbers.isEmpty()){
            return 0;
        }

        String[] nums = customSplitter(numbers);


        int sum = 0;
        boolean exceptionFound = false;

        for(String number: nums){
            try{
                int num = Integer.parseInt(number);

                if(num < 0){
                    exceptionFound = true;
                    throw new NegativeNumberException(num);
                }

                if(num <= 1000)
                    sum += num;

            }catch (NegativeNumberException ex){
                System.out.println(ex.toString());
            }
        }


        return exceptionFound?0:sum;
    }

    private String[] customSplitter(String numbers){

        if(numbers.startsWith("//")){
            String regex = "//(.*)\n(.*)";
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