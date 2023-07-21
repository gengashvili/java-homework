// task 1
public class Main {
    // task 2
    public static int add (int x, int y) {
        return x + y;
    }
    public static int subtract (int x, int y) {
        return x - y;
    }

    // task 3
    public static void main (String[] args) {

        // task 4
        int addResult1 = add(23,32);
        int addResult2 = add(10,86);
        int addResult3 = add(34,9);

        int subtract1 = subtract(90,40);
        int subtract2 = subtract(14,9);
        int subtract3 = subtract(54,12);

        // task 5
        int[] additionResults = {addResult1,addResult2,addResult3};
        int[] subtractionResults = {subtract1,subtract2,subtract3};

        // task 6
        for(int result : additionResults){
            System.out.println(result);
        }
        for(int result : subtractionResults){
            System.out.println(result);
        }

        System.out.println();

        // task 7
        int i = 0;

        while (i < additionResults.length) {
            System.out.print(additionResults[i] + " ");
            i++;
        }
        i = 0;
        while (i < subtractionResults.length) {
            System.out.print(subtractionResults[i] + " ");
            i++;
        }

        System.out.println("\n");

        // task 8 with for loops
        for(int result : additionResults){
            if (result % 2 == 0) {
                System.out.println("even - " + result);
            }else{
                System.out.println("odd - " + result);
            }
        }
        for(int result : subtractionResults){
            if (result % 2 == 0) {
                System.out.println("even - " + result);
            }else{
                System.out.println("odd - " + result);
            }
        }

        System.out.println();

        // task 8 with while loops
        int j = 0;

        while (j < additionResults.length) {
            if (additionResults[j] % 2 == 0) {
                System.out.print("even - " + additionResults[j] + " ");
            }else{
                System.out.print("odd - " + additionResults[j] + " ");
            }
            j++;
        }

        j = 0;
        while (j < subtractionResults.length) {
            if (subtractionResults[j] % 2 == 0) {
                System.out.print("even - " + subtractionResults[j] + " ");
            }else{
                System.out.print("odd - " + subtractionResults[j] + " ");
            }
            j++;
        }


    }


}
