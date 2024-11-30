import java.util.LinkedList;
import java.util.Queue;

public class TournamentTree {
    static class Node{
        int value;
        Node left,right;
        public Node(int value){
            this.value=value;
            left=right=null;
        }
    }
    static Node buildTree(int []players){
        Queue<Node>q=new LinkedList<>();
        for(int player:players){
            q.add(new Node(player));
        }
        while(q.size()>1){
            Node left=q.poll();
            Node right=q.poll();
            Node parent=new Node(Math.max(left.value, right.value));
            parent.left=left;
            parent.right=right;
            q.add(parent);
        }
        return q.poll();
    }
    static int findSecondBest(Node root){
        int secondBest=Integer.MIN_VALUE;
        Node currNode=root;

        while (currNode.left!=null && currNode.right!=null) {
            if(currNode.left.value>currNode.right.value){
                secondBest=Math.max(secondBest, currNode.right.value);
                currNode=currNode.left;
            }else{
                secondBest=Math.max(secondBest, currNode.left.value);
                currNode=currNode.right;
            }
        }
        return secondBest;
    }
    public static void main(String[] args) {
        int[] players = {5, 3, 8, 7};
        Node root = buildTree(players);
        System.out.println("Second Best Player: " + findSecondBest(root));
    }
}
