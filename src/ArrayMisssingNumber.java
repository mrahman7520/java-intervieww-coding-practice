public class ArrayMisssingNumber {

  public static  int findMissingNumber(int[] nums) {
      int n = nums.length +1;
      int expectedSum = (n * (n+1)) / 2;
       int actualSum = 0;

       for(int num : nums){
            actualSum += num;
       }


        return expectedSum - actualSum;
     }


    public static void main(String[] args) {
        System.out.println("Hello world!");

    int[] nums = {1, 2, 3, 5, 6};
    int misssingNumber = findMissingNumber(nums);
  //  System.out.println("Missing number : " + misssingNumber);

//        for(int num : nums ){    forechloop
//            System.out.println(num);
//        }

      // FizzBuzz find

        int n = 20;

        for(int i = 1; i<=n; i++){
            if(i % 3 ==0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3==0) {
                System.out.println("Fizz");
            }
            else if (i % 5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }





    }







}