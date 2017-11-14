
public class BinaryTree {
  
	private Node root;
	
	public BinaryTree(){
		root = null;
	}
   private Node insert(Node cur, int data){
	   if(cur == null){
		   cur = new Node(data);
	   }else {
		   if (data <= cur.value){
			   cur.left = insert(cur.left, data);
		   }else 
			   cur.right = insert(cur.right, data);
		   
	   }
	   return cur;
   }

   public void insert(int n){
	   root = insert(root, n);
       
   }
   
   public int count(Node cur){
	   int c= 0;
	   if(cur != null){
		   c++;
		   c = c + count(cur.left);
		   c = c + count(cur.right);
	   }
	   return c;
   }
   
   private int height(Node node){
	  if(node== null){
		  return 0;
	  }else 
	  {
	    int height1 = height(node.left);
	    int height2 = height(node.right);
	  if(height1 > height2){
		  return (height1 + 1);
	  } else 
		  return (height2 + 1);		  
	  }
	  }
   public int height(){
	   return height(root);
   }
   
   private void inorder(Node till){
	   if(till != null){
		   inorder(till.left);
		   System.out.print(till.value + " ");
		   inorder(till.right);
	   }
   }

   public void inorder(){
	   inorder(root);
   }
   private void postorder(Node till){
	   if(till != null){
		   postorder(till.left);
		   postorder(till.right);
		   System.out.print(till.value + " ");
	   }
   }
   public void postorder(){
	   postorder(root);
   }
  

   public 	Node searh(Node head, int x)
   {
       Node current = head; 
       while (current != null)
       {
           if (current.value == x){
               return current;  
         }else {
        	 if(x < current.value){
           current = searh(current.left, x);
         }
         
           else
           current = searh(current.right, x);
   } 
       }
       return current; 
   }
   
   public Node search(int nu){
	   return searh(root,nu);
   }
   
  
public int sum(Node head){
   if(head == null){
	   return 0;
   }
    int op = head.value;
    head.value = sum(head.left) + sum(head.right);
    
      return head.value + op;
}

 
    public static void main(String[]args){
    	BinaryTree tree = new BinaryTree();
    	 tree.insert(4);
    	 tree.insert(3);
    	 tree.insert(11);
    	 tree.insert(9);
    	 tree.insert(17);
         System.out.println("Number of nodes : " + tree.count(tree.root));
    	 System.out.println("Height : " + tree.height());
    	 System.out.print("In order : ");
         tree.inorder();
       System.out.println();
       System.out.print("postorder : ");
       tree.postorder();
       System.out.println();
       System.out.print("Search value : " + tree.search(9));
       System.out.println();
       System.out.println("Sum of values : " + tree.sum(tree.root));


    }
}
