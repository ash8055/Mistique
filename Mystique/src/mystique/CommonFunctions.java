package mystique;

public class CommonFunctions {

    public static int getBit(int n, int loc)
    {
        int v =n&(int)Math.round(Math.pow(2,loc));
        return v==0?0:1; 
    }
    public static int setBit(int n, int loc, int bit)
    {
        int toggle=(int)Math.pow(2,loc), bv=getBit(n,loc);
        if(bv==bit)
            return n;
        if(bv==0&&bit==1)
            n|=toggle;
        else if(bv==1&&bit==0)
            n^=toggle;
        return n;
    }
}
