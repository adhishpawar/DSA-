/* You are Given n pairs of numbers. 
In every pair, the first number is Always smaller than the second number.
A pair(c,d) can come after pair(a,b) if b < c.
Find the longest chain which can be formed from a given set of pairs*/
import java.util.*;

public class maxLengthChainofPairs
{
    public static void main(String args[])
    {

        int pairs[][] = {{5,24}, {29,60} , {5,28}, {27,40}, {50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1]; 

        for(int i=0; i<pairs.length; i++)
        {
            if(pairs[i][0] > chainEnd)
            {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max Length of Chain: " + chainLength);
    } 

}