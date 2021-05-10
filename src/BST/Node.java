package BST;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
    int key;
    Node left;
    Node right;

    public Node(int value) {
        key = value;
    }

    public void printLevelByLevel(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
            Node curr = q.poll();
            if (curr == null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }
        public void printKDistance(Node root,int k)
        {
            if(root == null)
                return;
            if(k==0)
                System.out.print(root.key+ " ");
            else {
                printKDistance(root.left, k-1);
                printKDistance(root.right, k-1);
            }
        }
    }

