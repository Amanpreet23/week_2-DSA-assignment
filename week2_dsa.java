public class MinStack {
class Node {
int value;
int min;
Node next;
public Node(int value, int min) {
this.value = value;
this.min. min;
next = null;
}
}

Node head;
public void push(int x) {
if (head == null) {
Node n= new Node(x, x);
head n;
} else {
Node n= new Node(x, Math.min(x, head.min));
n.next = head;
head = n;
}
}