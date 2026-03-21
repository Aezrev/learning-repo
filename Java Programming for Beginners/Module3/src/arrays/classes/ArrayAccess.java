package arrays.classes;

public class ArrayAccess {
    public static void main(String[] s) {
        //int years[] = new int[6];
        int[] years = {2020,2021,2022,2023,2024,2025};
        years[1] = 2021;
        years[3] = 2023;
        String myStr = "The quick brown fox";
        char[] charArr = myStr.toCharArray();
        for (int i=0;i<charArr.length;i++) {
            System.out.println(charArr[i]);
        }
//        System.out.println(years[0]);
//        System.out.println(years[1]);
//        System.out.println(years[2]);
//        System.out.println(years[3]);
//        System.out.println(years[4]);
//        System.out.println(years[5]);
        int count_years = years.length;
        System.out.println("the length of the array is " + count_years);
        for (int i=0; i<count_years; i++) {
            System.out.println(years[i]);
        }
    }
}
