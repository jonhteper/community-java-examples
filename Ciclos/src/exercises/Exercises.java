package exercises;

public class Exercises {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7,8,9,10
        System.out.println("Serie con for: ");
        for (int i = 1; i <=10 ; i++) {
            if (i < 10){
                System.out.printf("%d, ", i);
            } else{
                System.out.print(i);
            }
        } //for

        System.out.println("\n Serie con while: ");
        int i = 1;
        while (i <= 10) {
            if (i < 10){
                System.out.printf("%d, ", i);
            } else{
                System.out.print(i);
            }
            i++;
        }// while


        System.out.println("\n Serie con do-while: ");
        i = 1;
        do {
            if (i < 10){
                System.out.printf("%d, ", i);
            } else{
                System.out.print(i);
            }
            i++;
        } while (i <= 10);// do-while

    } // main
} // class
