// Program uses the Fibonacci Sequence to calculate values inputted by user using command line arguements//


public class Assignment9_FibonacciNumbers {
    public static void main(String[] args) {
        int value1;
        if (args.length>0){
            try{
                value1=Integer.parseInt(args[0]);
                System.out.print("The value calculated using the command line arg and Fibonacci Sequence is: ");
                System.out.println(fibonacciSequence(value1)+ " ");
            } catch (NumberFormatException e){
                System.err.println("Argument" + args[0]+ " must be an integer");
            }
        }
    }
    

    public static int fibonacciSequence(int number){
        if (number<=1){
            return number;
        }
        else{
            return fibonacciSequence(number-1) + fibonacciSequence(number-2);
        }
        
            

    }
}
