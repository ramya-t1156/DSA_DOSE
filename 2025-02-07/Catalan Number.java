// class Main {
 
//     static int findCatalan(int n) {
      
//         // Base case
//         if (n <= 1) {
//             return 1;
//         }

//         // catalan(n) is the sum of catalan(i) *
//         // catalan(n-i-1)
//         int res = 0;
//         for (int i = 0; i < n; i++) {
//             res += findCatalan(i) * findCatalan(n - i - 1);
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         int n = 6;
//         int res = findCatalan(n);
//          System.out.println(res);
//     }
// }


class Main {
    // Function to find nth Catalan number using DP
    static long catalanDP(int n) {
        // Table to store results of subproblems
        long dp[] = new long[n + 1];

        // Base case
        dp[0] = dp[1] = 1;

        // Fill the dp table using the recurrence relation
        for (int i = 2; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }

    // Driver method
    public static void main(String[] args) {
        int n = 10; // Find the 10th Catalan number
        System.out.println("Catalan Number C(" + n + ") = " + catalanDP(n));
    }
}
