import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("------------------Exercise 1-------------------------------");
        ////-----------------------------Exercise 1 ----------------------------
        /*1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to 2*/
        int [] integer=  {50, -20, 0, 30, 40, 60, 10};

        for (int each:integer){System.out.print("The numbers are :"+each+"\t"+"\n");}

        System.out.println("\n"+(integer[0]==integer[integer.length -1]));
        System.out.println("------------------Exercise 2-------------------------------");
        ////-----------------------------Exercise 2 ----------------------------
    /*2.Write a Java program to find the numbers greater than the average of the
    numbers of a given array.
    Original Array:
    [1, 4, 17, 7, 25, 3, 100]*/
        int ouaver=0,greatO=0;
        ArrayList<Integer> numGreat = new ArrayList<Integer>(); // Create an ArrayList object
     int[]  original=   {1, 4, 17, 7, 25, 3, 100};
        for(int averg:original){
            ouaver+=averg;}
        int big=ouaver/original.length;
        for(int great:original){
            if(great>big){
                numGreat.add(great);}}
        System.out.print("The average of the said array is "+(ouaver/original.length)+"\n");
        System.out.print(" The numbers in the said array that are\n" + "greater than the average are:" + numGreat+ "\n");


        System.out.println("------------------Exercise 3-------------------------------");
        ////-----------------------------Exercise 3 ----------------------------

            /*3.Write a Java program to get the larger value between first and last
            element of an array of integers.
            Original Array:
            [20, 30, 40]*/
        int lar=0;
                int []largest ={20, 30, 40,50,70,40};
                for (int bignum:largest){if(bignum>lar){lar=bignum;}}
                System.out.println("Larger value between first and last element :"+lar);


                System.out.println("------------------Exercise 4-------------------------------");
        ////-----------------------------Exercise 4 ----------------------------
                    /*4.Write a Java program to swap the first and last elements of an array and
                     create a new array.
                     Original Array:
                      [20, 30, 40]*/
                        int soop=0;
                int []swap ={20, 30, 40};
                    soop=swap[0];
                    swap[0]=swap[swap.length-1];
                    swap[swap.length-1]=soop;
        System.out.println("New array after swapping the first and last elements:");
                    for(int s:swap){
                        System.out.println("\t"+s);
                    }

        System.out.println("------------------Exercise 5-------------------------------");
        ////-----------------------------Exercise 5 ----------------------------
                    /*5. Write a program that places the odd elements of an array before the
                    even elements.
                    Original Array:
                    [2,3,40,1,5,9,4,10,7]
                    */
        int[] oddfirst={2,3,40,1,5,9,4,10,7};
         ArrayList<Integer> odd = new ArrayList<Integer>();

        for(int od=0;od<oddfirst.length;od++){
            if(oddfirst[od]%2==1){
                odd.add(oddfirst[od]);}}
        for(int od=0;od<oddfirst.length;od++){
            if(oddfirst[od]%2==0){
                odd.add(oddfirst[od]);}}
        System.out.println(""+odd);



        System.out.println("------------------Exercise 6-------------------------------");
        ////-----------------------------Exercise 6 ----------------------------
/*6. Write a program that test the equality of two arrays.
        [2,3,6,6,4] [2,3,6,6,4]
        Sample Output:
        true*/
        int []qua1 ={2,3,6,6,4};
        int []qua2 ={2,3,6,6,4};
        boolean valure=true;
        if(qua2.length==qua1.length){
            for(int q=0;q<qua1.length;q++){
                if(qua1[q]==qua2[q]){
                }
                else{ valure=false;}

        }
            System.out.println("");
            System.out.println(valure);
        }
        else      System.out.print("Not equals size");


    }}