public class StringCalculator {

    //Default empty constructor
    public StringCalculator(){

    }

    public int add(String numbers){


        if(numbers == null || numbers.isEmpty()){
            return 0;
        }

        String[] nums = numbers.split("[,\n]", 0);

        int sum = 0;

        for(String number: nums){
            int num = Integer.parseInt(number);
            sum += num;
        }

        return sum;
    }

}