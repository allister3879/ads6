## Task1

__Definition__ - implementation of func to find minimum from array

__Explanation:__  func will repeat until n-length of array eqyals to 1. Assign min and return lesser, on every repeat length of array decrease.

__Solution__ ->

```java
    public static int findMin(int n, int[] arr){
        if(n==1){
            return arr[0]; // return only left element
        }else {
            int min = findMin(n-1, arr); //assign min
            return Math.min(min, arr[n-1]); // return lesser
        }
    }
```

---
## Task2

__Definition__ - implementation of func to find average from array

__Explanation:__ func create double variable, using the for loop assign as addition of all elements from array. Return the division of variable to the number of elements.

__Solution__ ->

```java
    public static double findAverage(int n, int[] arr){
        double average = 0; // assign variable to zero
        for(int i = 0; i < n; i++){
            average += arr[i]; // addition of  all elements from array
        }
        return average/n; // return the division to number of elements
    }
```

---
## Task 3

__Definition__ - implementation of func to check if number prime

__Explanation:__ Func create counter and use for loop to check division to number. If modulus equals to 0 counter increase to 1. Prime number "n" divisible only to 1 and "n", so counter must be 2. Otherwise   "n" divisible to some other number. If counter equals to 2, func returns "Yes", else "No".

__Solution__ ->

```java
    public static String checkIfPrime(int n, double limit){
        int counter = 0;
        for(int i = 1; i < limit; i++){ // loop to check division
            if(n%i==0){
                counter += 1; // if modulus equals to 0, counter add +1
            }
        }
        if(counter <= 2){ // prime number n can be divided by 1 or n, counter can't be more than 2
            return "Prime";
        }else { // if counter >2, n can be divided another number
            return "Composite";
        }
    }
```

---
## Task4

__Definition__ - implementation of func to find factorial

__Explanation:__ funcl will repeat until n=1. Else return the multiplication of n and n-1.

__Solution__ ->

```java
    public static int findFactorial(int n){
        if(n==1){
            return 1; // return the 1
        }else{
            return n * findFactorial(n-1); // return the multiplication of n and n-1 until n==1
        }
    }
```

---
## Task5

__Definition__ - implementation of func to find fibonacci sequence

__Explanation:__ If n equals to 0 or 1 func will return n. Else return the addition of two elements before the n.

__Solution__ ->

```java
    public static int findFibonacci(int n){
        if(n==0 | n==1){
            return n; // return n, because they are equals themselves
        }else {
            return findFibonacci(n-1) + findFibonacci(n-2); // return the addition of two elements before the n
        }
    }
```

---
## Task6

__Definition__ - implementation of func to  count power of a at the degree n

__Explanation:__ func use Math.pow(a, n) to count power.

__Solution__ ->

```java
    public static double countPower(int a, int n){
        return Math.pow(a, n); // func to count power of a at the degree n
    }

```

---
## Task7

__Definition__ - implementation of func to reverse array

__Explanation:__ Func will print last element of array until the 0'th element. In the block else func prints last element of array and returns the length of array as n-1.

__Solution__ ->

```java
    public static int reverseArr(int n, int[] arr) { // n - length of array
       if((n-1)==0){
           return arr[n-1]; // return first element of array as the last
       }else {
           System.out.print(arr[n-1]+" "); // prints last element of array
           return reverseArr(n-1, arr); // return the length as n-1
       }
    }
```

---
## Task8

__Definition__ - implementation of func to check str to all digits

__Explanation:__ func assign boolean as true. Then try to parse str into int, if parsed succesfully string consist all digits. Otherwise, if error  str consist not only digits, so boolean onlyDiigits reassign as false. Function return "Yes" if true, else "No".

__Solution__ ->

```java
    public static String checkOnlyDigits(String s){
        boolean onlyDidits = true; // assign boolean as true
        try{
            int digits = Integer.parseInt(s); // if parsed succesfully string all digits
            System.out.println(digits+": not only numbers");
        }catch (NumberFormatException numberFormatException){ // else string consist not only numbers
            onlyDidits = false; // so assign boolean as false
        }

        if(onlyDidits){
            return "Yes"; // return yes if consist only digits
        }else{
            return "No"; // return no if not only digits
        }
    }
```

---
## Task9

__Definition__ - implementation of func to count binomal coefficient

__Explanation:__ Func getbinomElement only counts factorial of number n. The formula to count binomal coefficient needs factorials of three elements: n, k and n-k. So according to formula func counts factorial of them. Formula: n!/(k!*(n-k)!)

__Solution__ ->

```java
    case 9 -> {
                    System.out.println("Enter inputs: ");
                    int n9 = sc.nextInt();
                    int k = sc.nextInt();
                    // in next line to get elements of formula used factorial func three times
                    // formula: n!/(k!*(n-k)!)
                    System.out.println(getBinomElement(n9)/(getBinomElement(k)*getBinomElement(n9-k)));
                }
    public static int getBinomElement(int x){ // functon to get factorial of num
        if(x==1){
            return x;
        }else{
            return x*getBinomElement(x-1); // return the multiplication of n and n-1
        }
    }
```

---
## Task10

__Definition__ - implementation of func to find GCD

__Explanation:__ func take two variables as a and b. Then calculate q and r. Recursion will repeat untill modulud equals to 0. If modulus equals to 0, GCD will be variable assigned b. Else func take b and r as new variables a and b.

__Solution__ ->

```java
    public static double findGCD(double a, double b){ // getting two variables
        double q = a/b;
        double r = a%b; // get modulus
        if(r == 0){
            return b; // if modulus equals to 0 then b is gcd
        }else{
            return findGCD(b, r); // else return b and r as new two variables
        }
    }
```

---
