class Solution {
    public int countPrimes(int n) {
        if(n <= 0) {
            return 0; 
        }
        // mark all num as  primes. 
        boolean[] primes = new boolean[n]; 
        for(int i = 0; i < primes.length; i++) {
            primes[i] = true; 
        }
        
        // exclude the no primes. 
        for(int i = 2; i * i < primes.length; i++) {
            if(primes[i]) {
                for(int j  = i; j * i < primes.length; j++) {
                    primes[i * j ] = false; 
                }
            }
        }
        int primeCount = 0; 
        for(int i = 2; i < primes.length; i++) {
            if(primes[i]) {
                primeCount++; 
            }
        }
        return primeCount; 
    }
}