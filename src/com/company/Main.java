package com.company;

//Prints the sum of first 8 perfect integer numbers.
//Number is called perfect if it's equal to the sum of its divisors excluding itself.
//All currently known perfect numbers are even, including the first 8 to be summed here.
//Euclid-Euler theorem: all even perfect numbers have the form p*2^k, where p=2^(k+1) - 1 is a prime.

public class Main {
    public static void main(String[] args) {
        //System.out.println(6l + 28l + 496l + 8128l + 33550336l + 8589869056l + 137438691328l + 2305843008139952128l);
        System.out.println(perfectSum());
    }

    public static boolean isPrime(long n) {
        if (n == 1 || n%2 == 0) return false;
        long i = 3;
        double p = Math.sqrt(n);
        while (i <= p) {
            if (n%i == 0) return false;
            i += 2;
        }
        return true;
    }

    public static long perfectSum() {
        long p, n = 2, sum = 0;
        int k = 0;
        while(k < 8) {
            p = 2*n - 1;
            if(isPrime(p)) {
                sum += n*p;
                k++;
            }
            n *= 2;
        }
        return sum;
    }
}