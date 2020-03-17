import java.util.ArrayList;

public class SearchAlgorithmic {

   static ArrayList<Integer> numberArray = new ArrayList<>();

    public static void main(String[] args) {

        numberArray.add(4);
        numberArray.add(8);
        numberArray.add(90);
        numberArray.add(55);
        numberArray.add(40);
        numberArray.add(950);
        numberArray.add(33);
        numberArray.add(40);
        numberArray.add(11);
        numberArray.add(6);

        searchNumber(6);



    }

    public static boolean searchNumber(int n) { // assignment 1.A
        boolean found = numberArray.contains(n);
            if (found) {
                return true;
                //System.out.println(n + " is found/true");
            } else {
                //System.out.println("The list does not contain" + n);
            return false;
            } }

    public static int searchAllNumber(int n ) { // assigment 1.B
        int x=0;
        for (Integer integer : numberArray) {
            if (integer == n) {
                x = +1;
            }
        }
        return x;
    }

    public static int searchMaxNumber() { // assigment 1.C
        int max, n;
        max = numberArray.get(0);
        for (int i =0; i< numberArray.size(); i++){
            if (max < numberArray.get(i)) {
                max = numberArray.get(i);
            }
        }
        return max;
    }


}


