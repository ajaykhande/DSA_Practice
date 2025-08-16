class  fibonacci  {
   
   // Recursive method to get nth Fibonacci number
     static int fibonacciNums(int n) {
        if (n <= 1) return n; // Base case
        return fibonacciNums(n - 1) + fibonacciNums(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int num = 10; // Number of terms to print
        System.out.println("fibonacciNums Series:");

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciNums(i) + " "); // Print each term
        }
    }
}