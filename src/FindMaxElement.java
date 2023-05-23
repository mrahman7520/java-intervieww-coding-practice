public class FindMaxElement {

    public static void main(String[] args) {
        int[] array = {10, 5, 7, 15, 3, 9};
        int max = findMaximum(array);
        System.out.println("Maximum element: "+ max );
    }

    public static int findMaximum(int[] array){
        if(array == null || array.length ==0){
            throw new IllegalArgumentException("Array is empty");
        }

        int max = array[0];
        for(int i =1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
         return max;
    }


}
