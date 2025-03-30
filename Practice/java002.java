package Practice;

class Node {
    int data;
    Node left,right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class java002 {
    Node root;
    public Node insert(Node root,int value){
        if(root==null) return new Node(value);
        if(value< root.data){
            root.left=insert(root.left,value);
        }else{
            root.right=insert(root.right, value);
        }
        return root;
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
    }
    public boolean search(Node root,int value){
        if(root==null) return false;
        if(root.data==value) return true;
        return value<root.data ? search(root.left, value) : search(root.right, value);
    }
    public static void main(String[] args) {
        java002 tree = new java002();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Inorder Traversal (Sorted BST):");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));
        System.out.println("Search 100: " + tree.search(tree.root, 100));
    }
}
