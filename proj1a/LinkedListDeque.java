public class LinkedListDeque<T> {
    Node sentiprev;
    Node sentiend;
    int size;
    public class Node<T>{
        T first;
        Node next;
        Node pre;
        public Node(T f,Node n,Node p){
            first=f;
            next=n;
            pre=p;
        }
    }
    public LinkedListDeque(){
        sentiprev=new Node(null,null,null);
        sentiend=new Node(null,null,null);
        sentiprev.next=sentiend;
        sentiend.pre=sentiprev;
        size=0;
    }
    //Adds an item of type T to the front of the deque.
    //NOT USE Iteration or Recursion. Linear time
    public void addFirst(T item){
        Node n=new Node(item,null,null);
        n.next=sentiprev.next;
        n.pre=sentiprev;
        sentiprev.next=n;
        size++;
    }
    //Adds an item of type T to the back of the deque.
    public void addLast(T item){
        Node n=new Node(null,null,null);
        n.pre=sentiend.pre;
        n.next=sentiend;
        sentiend.pre=n;
        size++;
    }
    //Returns true if deque is empty, false otherwise.
    public boolean isEmpty(){
        return size==0;
    }
    //Returns the number of items in the deque.
    //Linear time
    public int size(){
        return size;
    }
    //Prints the items in the deque from first to last, separated by a space.
    public void printDeque(){
        Node p=sentiprev.next;
        while(p !=sentiend){
            System.out.print(p.first);
            System.out.print(' ');
            p=p.next;
        }
    }
    //Removes and returns the item at the front of the deque.
    // If no such item exists, returns null.
    public T removeFirst(){
        if(sentiprev.next==sentiend){
            return null;
        }
        T x= (T) sentiprev.next.first;
        sentiprev.next=sentiprev.next.next;
        sentiprev.next.pre=sentiprev;
        size--;
        return x;
    }
    //Removes and returns the item at the back of the deque.
    // If no such item exists, returns null.
    public T removeLast(){
        if(sentiprev.next==sentiend){
            return null;
        }
        T x = (T) sentiend.pre.first;
        sentiend.pre=sentiend.pre.pre;
        sentiend.pre.next=sentiend;
        size--;
        return x;
    }
    //Gets the item at the given index,
    // where 0 is the front, 1 is the next item, and so forth.
    // If no such item exists, returns null. Must not alter the deque!
    //USE iteration
    public T get(int index){
        if(index>size-1){
            return null;
        }
        Node p=sentiprev.next;
        while(index>0){
            p=p.next;
            index--;
        }
        return (T) p.first;
    }
    public T getRecursive(int index) {
        if (index > size - 1) {
            return null;
        }
        return (T) helper(index,sentiprev.next);
    }
    public T helper(int index,Node p){
        if(index==0){
            return (T) p.first;
        }
        return (T) helper(index-1,p.next);
    }
}
