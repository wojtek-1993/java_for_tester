public class Homework1 {


    public static void main(String[] args) {

        int numberOne = 19;
        int numberTwo = 67;
        int numberThree = 130;
        int numberFour = 170;

        int sum1 = (numberOne + numberTwo);
        int sum2 = (numberThree + numberFour);


        if (sum1 % 2 == 0) {
            System.out.println("The sum of the first two numbers is even");
        } else {
            System.out.println("The sum of the first two numbers isn't even");
        }

        if (sum2 % 2 == 0) {
            System.out.println("The sum of the other two numbers is even");
        } else {
            System.out.println("The sum of the other two numbers isn't even");
        }


        if (sum1 % 2 == 0 && sum2 % 2 == 0) {
            System.out.println("The numbers are even");
        } else {
            System.out.println("The numbers aren't even");
        }
    }
}
