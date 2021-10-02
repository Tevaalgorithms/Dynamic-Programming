// Approach 1
//============
class Solution {
    public int fib(int n) {
        
        if(n <= 1) {
            return n;
        }
        
        int[] result = new int[n + 1];
        
        result[0] = 0;
        
        result[1] = 1;        
       
        result[n] = fib(n-2) + fib(n-1); 
        
        return result[n];
    }
}

// Apprach 2
/ ===========
class Solution {
    public int fib(int n) {
        
        if(n <= 1) {
            return n;
        }
        
        int[] result = new int[n + 1];
        
        result[0] = 0;
        
        result[1] = 1;        
       
        for(int i=2; i <= n; i++) {
           result[i] = result[i - 1] + result[i - 2];
        }
        
        return result[n];
    }
}
