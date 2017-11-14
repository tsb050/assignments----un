
public class Node {

  Node left, right;
  int value;
  
  public Node(int n){
	  right = null;
	  left = null;
	  value = n;
	  
  }
  public String toString(){
	  return value + " ";
  }
}
