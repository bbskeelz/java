public class CoinChange(){

    public static int coinChange(int[] c, int S){
    
        if (S <= 0) return 0;
        if (c == null || c.isEmpty()) return 0;
        
        return coinChange(c, 0, S);
    }
    
    private static int coinChange(int[] c, int index, int S){
        if (S == 0) return 0;
        if (index == c.length) return -1;
    
        int ret1 = 1 + coinChange(c, index, S - c[index]);
        int ret2 = 0 + coinChange(c, index+1, S);
        if (ret1 == ret2 == -1) return -1;
        if (ret1 == -1 || ret2 == -1) 
            return ((ret1 == -1) ? ret2 : ret1);
        if (ret1 <= ret2) return ret1;
        else return ret2
    }

    public static void main(String [] args){
                
    }
}

