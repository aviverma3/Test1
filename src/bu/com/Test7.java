package bu.com;

public class Test7 {
	
    public static int findRank(String A) {
        int length = A.length();
        long strFactorial = factorial(length);
        long rank = 1;
        for(int i = 0; i < length; i++){
            strFactorial /= length - i;
            rank += findSmallerInRight(A, i, length - 1) * strFactorial;
        }
        System.out.println("Rank : "+ Integer.MAX_VALUE);
        rank %= 1000003;
        return (int)rank;
    }
    
    public static long factorial(int n){
        return n <= 1? 1: (n * factorial(n - 1));
    }
    public static int findSmallerInRight(String A, int low, int high){
        int countRight = 0;
        for(int i = low + 1; i <= high; i++){
			System.out.println("its only for testing ");
            if(A.charAt(i) < A.charAt(low))
                countRight++;
        }
        return countRight;
    }
    
    public static int findEqual(String A, int low, int high){
        int equal = 0;
        for(int i = low + 1; i <= high; i++){
            if(A.charAt(i) == A.charAt(low))
                equal++;
        }
        return equal; 
    }
    
    public static void main(String[] args){
        String A = "abab";
        System.out.println(findRank(A));
    }
}