package arrays.test;

public class practiceEx {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println(array[8]);
        System.out.println(array[9]);
//        Enhanced for:
//        for (int j : array) {
//            System.out.println(j);
//        }
        for(int i =0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
