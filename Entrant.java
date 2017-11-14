class Node {
	public Entrant value;
	public Node next;
	public Node(Node n, Entrant v){
		this.value = v;
		this.next = n;
	}
}
public class Entrant {
		private String name;
		private int Number;
		private double time;
		private static int ID = 1;

 public Entrant (String name) {
	 	this(name, 0);
	 	this.Number = ID++;
 }
 
 public Entrant( String name, double time){
	 	this.name = name;
	 	this.time = time;
 }
 public String getName(){
	 	return name;
 }
 public int getnum(){
	 	return Number;
 }
 public double gettime(){
	 	return time;
 }
 public void setname(String n){
	 	name = n;
 }
 public void setnum(int number){
	 	Number = number;
 }
 public void settime(double t){
	 	time = t;
 }
 public String toString(){
	 	return name + " " + Number + " " + time + " ";
 }
  
 

public static void printout(Node n){
	 	if(n == null){
		 return;
	 } 		else {
		 		System.out.println(n.value.toString());
		 		printout(n.next);
	 			}
	}
 private static void develop(Node n, Node cur, int f) {
	
	 if(n != null) {
		 if(n.value.getnum()== f) {
			 if(cur.value != null) {
				 cur.next = new Node(null,null);
				 	cur = cur.next;
			}
			 			cur.value = n.value;
		 							} else {
		 								System.out.println(n.value);
		}
		develop(n.next,cur,f);
	}
}
public static Node withdraw(Node n,int f) {
	Node newList = new Node(null,null);
		develop(n, newList, f);
			return newList;
}

public static void update(Node n, int c, int j) {
	 if(n == null){
		 return;
	 } else {
		 if(n.value.getnum() == c){
			 j += n.value.gettime();
			 n.value.settime(j);
			 System.out.println(" Entrant number : " + c +" \n" +" Updated time: " +  n.value.toString());
		 
		 }
		 update(n.next,c, j);
	 }
}  
public static void main(String[] args ){
	Node start = new Node(null,new Entrant("John,"));
	Node last = new Node(null,new Entrant( "Sam,"));
	start.next=last;
	last = last.next = new Node(null,new Entrant( "Tom,"));
	last = last.next = new Node(null,new Entrant( "Fred,"));
	
	System.out.println();
	System.out.println("All Entrants ");
	    printout(start);
        System.out.println();
    	System.out.println("Time taken to complete race: ");
    	update(start, 3, 9);
    	update(start, 2, 12);
    	update(start, 1, 15);
    	update(start, 4, 17);
    	System.out.println();
        System.out.println("Entrants after withdraw: ");
	    start = withdraw(start, 2);
	   	System.out.println();
		System.out.println("Entrant(s) withdrawn: ");
		    printout(start);
		
}
}
