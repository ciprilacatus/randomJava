import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        int expectedSum = 0;
        int actualSum = 0;

        for(int i = 1; i <= 10; ++i) {
            numberList.add(i);
            expectedSum += i;
        }
        System.out.println(numberList);


        Random random = new Random();
        int x = random.nextInt(10);
        numberList.remove(x);
        System.out.println(numberList);

        for(int i = 0; i < numberList.size(); ++i) {
            actualSum += (Integer)numberList.get(i);
        }

        System.out.println("Expected sum: " + expectedSum);
        System.out.println("Actual sum: " + actualSum);
        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}