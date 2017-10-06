public class FizzBuzz {

    int number;

    public static String fizzBuzz(int number){
        String fizzBuzz = "FizzBuzz";
        String buzz = "Buzz";
        String fizz = "Fizz";
        String result = "";

        if(number % 15 == 0){
            result = fizzBuzz;
        } else if(number % 5 == 0){
            result = buzz;
        } else if(number % 3 == 0){
            result = fizz;
        } else {
            result = Integer.toString(number);
        }
        return result;
    };
}
