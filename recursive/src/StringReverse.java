public class StringReverse 
{
/** 1a **/
	public String reverse(String word){
		
		if ((word==null)||(word.length() <= 1) ){
	        return word;
		
		}else{
			return reverse(word.substring(1)) + word.charAt(0);
		}
	}
	public String remove(String s){
		   return s.substring(1);
		}
	/** 1b **/
	public String iteration(String n){
		String view = "";
		char l = n.charAt(0);
		String vale = n.substring(0);;
		for(int i = vale.length()-1 ; i >=1; i--){
			view += n.charAt(i);
		}
		return view + l;
	}
		
	
	/** 1d **/
    /** Based on each character **/
public static boolean isStringReversed(String x, String y) {
	return isReversed(x.toLowerCase(), y.toLowerCase());
}
public static boolean isReversed(String x, String y){
	if(x == null || y == null) {
		return true;
	} else if(x.length() != y.length()){
		return false;
	}else {
	}
		int l = x.length();
		char a = x.charAt(0);
		char b = y.charAt(l-1);
		if(a == b) {
			try {
				return true && isReversed(x.substring(1), y.substring(0,l-1));
			} catch(Exception e) {
				return isReversed(null,null);
			}
		} else {
			return false;
		}
	}


public static void main(String[] args) 
{
    StringReverse obj=new StringReverse();
    System.out.println("The comparison is " + isStringReversed("Piano","Onaip"));
    System.out.println(obj.reverse("Hello!"));
    System.out.println(obj.iteration("Hello!"));
}   
}