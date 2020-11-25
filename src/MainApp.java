public class MainApp {

    public static void main(String[] args) {


        int[] numbers = {21,44,10,91,57,20,4,0,5,8,10,50,120,350,400,670};
        // 0 1 2 3 4 5 6 7 8 9

        int max;

        for(int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for (int j = i + 1; j < numbers.length; j++){
                if(numbers[j] > max){
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }




}
