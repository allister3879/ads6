import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkingLab = true;
        while (checkingLab) {
            System.out.print("\n"+"Please enter task: ");
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
                case 5 -> {
                    System.out.println("Enter inputs: ");
                    int n5 = sc.nextInt();
                    System.out.println(findFibonacci(n5));
                }
                case 6 -> {
                    System.out.println("Enter inputs: ");
                    int n6 = sc.nextInt();
                    int power = sc.nextInt();
                    System.out.println(countPower(n6, power));
                }
                case 7 ->{
                    System.out.println("Enter inputs:");
                    int n7 = sc.nextInt();
                    int[] arr7 = new int[n7];
                    for (int i = 0; i < n7; i++) {
                        arr7[i] = sc.nextInt();
                    }
                    System.out.print(reverseArr(n7, arr7)+" ");
                }
                case 8 -> {
                    System.out.println("Enter inputs:");
                    String line = sc.next();
                    System.out.println(checkOnlyDigits(line));
                }
                case 9 -> {
                    System.out.println("Enter inputs: ");
                    int n9 = sc.nextInt();
                    int k = sc.nextInt();
                    System.out.println(getBinomElement(n9)/(getBinomElement(k)*getBinomElement(n9-k)));
                }
                case 10 -> {
                    System.out.println("Enter inputs: ");
                    int a10 = sc.nextInt();
                    int b10 = sc.nextInt();
                    System.out.println((findGCD(a10, b10)));
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
    public static int findFibonacci(int n){
        if(n==0 | n==1){
            return n;
        }else {
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
    public static double countPower(int a, int n){
        return Math.pow(a, n);
    }

    public static int reverseArr(int n, int[] arr) {
       if((n-1)==0){
           return arr[n-1];
       }else {
           System.out.print(arr[n-1]+" ");
           return reverseArr(n-1, arr);
       }
    }
    public static String checkOnlyDigits(String s){
        boolean onlyDidits = true;
        try{
            int digits = Integer.parseInt(s);
            System.out.println(digits+": not only numbers");
        }catch (NumberFormatException numberFormatException){
            onlyDidits = false;
        }

        if(onlyDidits){
            return "Yes";
        }else{
            return "No";
        }
    }
    public static int getBinomElement(int x){
        if(x==1){
            return x;
        }else{
            return x*getBinomElement(x-1);
        }
    }
    public static double findGCD(double a, double b){
        double q = a/b;
        double r = a%b;
        if(r == 0){
            return b;
        }else{
            return findGCD(b, r);
        }
    }

}
