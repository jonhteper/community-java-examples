package exercises2;

public class Exercises2 {
    public static void main(String[] args) {

        //1,99,2,98,3,97,4,96,5,95
        int total = 100;
        for (int i = 1; i <= 5; i++) {
            if (i < 5) {
                System.out.printf("%d,", i);
                System.out.printf("%d,", total-i);
            }else  {
                System.out.printf("%d,", i);
                System.out.printf("%d\n", total-i);
            }
        }
        System.out.println("");


        // 0,1,1,2,3,5,8,13,21,34
        int right = 0;
        int left = 1;
        System.out.printf("%d,", right);
        for (int i = 1; i <= 5; i++) {
            if (i != 5) {
                System.out.printf("%d,", left);
            } else {
                System.out.printf("%d", left);
                return;
            }
            right += left;

            System.out.printf("%d,", right);
            left += right;
        }


    }// main
}//class
