package operators.test;

import java.util.Arrays;

public class practiceEx {
    public static void main(String[] args) {
        int[] myArray = {0,1,2,3,4,5,6,7,8,9};
        myArray[0]++;
        myArray[1]+=2;
        myArray[2]--;
        myArray[3]-=3;
        myArray[4]*=3;
        myArray[5]*=0;
        myArray[6]/=myArray[7];
        myArray[7]/=1;
        myArray[8]%=2;
        myArray[9]%=3;
        System.out.println(Arrays.toString(myArray));
        for(int i=0;i<myArray.length-1;i++){
            System.out.println(
                    (myArray[i+1] < myArray[i])? "Greater" : "Less"
            );
        }
    }
}
