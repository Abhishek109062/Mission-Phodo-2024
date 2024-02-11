import java.math.BigInteger;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        BigInteger sum = ((BigInteger.valueOf(A.length)).multiply(BigInteger.valueOf(A.length+1))).divide(BigInteger.valueOf(2));
        BigInteger sqsum = (sum.multiply(BigInteger.valueOf(  2*A.length+1))).divide(BigInteger.valueOf(3));
        BigInteger csum=BigInteger.valueOf(0);
        BigInteger csqsum=BigInteger.valueOf(0);
        for(int i : A){
            long z=i;
            csum = csum.add(BigInteger.valueOf(i));
            csqsum = csqsum.add(BigInteger.valueOf(z*z));
            // BigInteger are immutables
        }
        //sum-csum = x-y;
        //sqSum-csqsum =x^2-y^2
        // sqSum-csqsum = (sum-csun)(x+y)
        
        // 2x =   (sqSum-csqsum)/(sum-csum) + sum-csum;
        
        BigInteger x = ( ( (sqsum.subtract(csqsum)).divide(sum.subtract(csum)) ).add(sum.subtract(csum))  ).divide(BigInteger.valueOf(2));
        BigInteger y = (x.subtract(sum)).add(csum);
        
        int arr[] = new int[]{y.intValue(),x.intValue()};
        return arr;
    } 
}
