
public class recursive {
	public static String toLetter(int b){
		if( b < 10 ) {
			return Integer.toString(b);
		} else {
			/** use of ascii table **/
			b -= 10;
			int s = (int)('A');
			char x = (char)(s + b);
			return Character.toString(x);
		}
	}
	public static String convert(int num, int base)
	{
		 int b = num % base;
		int a = num / base;
        
    	
	    if (a == 0)
	    {
	        return toLetter(b);      
	    }
	    else
	    {
	    	String x = convert(a,base)+ toLetter(b);
	        return x;
	    }            
	}
	public static int findme(int[]b, int i){
		if(i > 0) {
			return Math.max(b[i], findme(b,i-1));
		}else{
			return b[0];
	}
		}
	
	public static void main(String[] args){
        int[]a = {2,6,7,8,12,7,11,76,85};
		String ray = convert(78753, 16);
        System.out.println(ray);
	    System.out.println(findme(a,12));
	}

}
