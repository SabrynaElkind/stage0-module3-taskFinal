package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
     int sum = 0;
     char nums [] = new char[Integer.toString(number).length()];
     for (int i =0;i<Integer.toString(number).length();i++){
         nums[i] = Integer.toString(number).charAt(i);
         sum = sum + (nums[i] - '0');
     }
        System.out.println(sum);

    }
}
