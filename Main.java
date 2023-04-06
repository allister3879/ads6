import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkingLab = true;
        while (checkingLab) {
            System.out.print("---Please enter task--- ");
            int task = sc.nextInt();
            switch (task) {
                case 0 ->{
                    System.out.println("--- end ---");
                    checkingLab = false;
                }
                case 1 -> {
                    System.out.println("Enter inputs:");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Minimum from array: " + findMin(n, arr));
                }
                case 2 -> {
                    System.out.println("Enter inputs:");
                    int n2 = sc.nextInt();
                    int[] arr2 = new int[n2];
                    for (int i = 0; i < n2; i++) {
                        arr2[i] = sc.nextInt();
                    }
                    System.out.println("Average from array: " + findAverage(n2, arr2));
                }
                case 3 -> {
                    System.out.println("Enter inputs: ");
                    String n3 = sc.next();
                    double limit = Math.pow(10, n3.length());
                    System.out.println("Number is " + checkIfPrime(Integer.parseInt(n3), limit));
                }
                case 4 -> {
                    System.out.println("Enter inputs: ");
                    int n4 = sc.nextInt();
                    System.out.println("Factorial of "+n4+" - "+findFactorial(n4));
                }
            }
        }
    }

    public static int findMin(int n, int[] arr){
        if(n==1){
            return arr[0];
        }else {
            int min = findMin(n-1, arr);
            return Math.min(min, arr[n-1]);
        }
    }
    public static double findAverage(int n, int[] arr){
        double average = 0;
        for(int i = 0; i < n; i++){
            average += arr[i];
        }
        return average/n;
    }
    public static String checkIfPrime(int n, double limit){
        int counter = 0;
        for(int i = 1; i < limit; i++){
            if(n%i==0){
                counter += 1;
            }
        }
        if(counter <= 2){
            return "Prime";
        }else {
            return "Composite";
        }
    }
    public static int findFactorial(int n){
        if(n==1){
            return 1;
        }else{
            return n * findFactorial(n-1);
        }
    }
}
