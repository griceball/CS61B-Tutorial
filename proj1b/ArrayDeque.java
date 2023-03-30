public class ArrayDeque <T>implements Deque<T>{
    //size of deque
    int size;
    //size of array
    int len;
    private T[] arr;
    //first index
    int front;
    //last index
    int last;
    public ArrayDeque(){
        arr=(T[]) new Object[8];
        size=0;
        len=8;
        front=4;
        last=4;
    }
    //expand the arr
    public T[] grow(){
        T[] tem=(T[])new Object[len*2];
        System.arraycopy(arr,front,tem,size/2,size);
        front=size/2;
        last=front+size-1;//
        len*=2;
        return tem;
    }
    //shrink the arr
    public T[] shrink(){
        T[] tem=(T[])new Object[len/2];
        System.arraycopy(arr,front,tem,size/2,size);
        front=size/2;
        last=front+size-1;
        len/=2;
        return tem;
    }
    //Adds an item of type T to the front of the deque.
    //NOT USE Iteration or Recursion. Linear time
    @Override
    public void addFirst(T item){
        if(front==0 ||size==len-1){
            arr=this.grow();
        }
        if(size!=0){
            front--;
        }
        arr[front]=item;
        size++;
    }
    @Override
    //Adds an item of type T to the back of the deque.
    public void addLast(T item){
        if(last==len-1 || size==len-1){
            arr=this.grow();
        }
        if(size!=0){
            last++;
        }
        arr[last]=item;
        size++;
    }
    @Override
    //Returns true if deque is empty, false otherwise.
    public boolean isEmpty(){
        return size==0;
    }
    //Returns the number of items in the deque.
    //Linear time
    @Override
    public int size(){
        return size;
    }
    //Prints the items in the deque from first to last, separated by a space.
    @Override
    public void printDeque(){
        for(int i=front;i<=last;i++){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
    //Removes and returns the item at the front of the deque.
    // If no such item exists, returns null.
    @Override
    public T removeFirst(){
        if(len>=16&&len/size>=4){
            arr=this.shrink();
        }
        if(size==0){
            return null;
        }
        T x=arr[front];
        arr[front]=null;
        front++;
        size--;
        return x;
    }
    //Removes and returns the item at the back of the deque.
    // If no such item exists, returns null.
    @Override
    public T removeLast(){
        if(len>=16&&len/size>=4){
            arr=this.shrink();
        }
        if(size==0){
            return null;
        }
        T x=arr[last];
        arr[last]=null;
        last--;
        size--;
        return x;
    }
    //Gets the item at the given index,
    // where 0 is the front, 1 is the next item, and so forth.
    // If no such item exists, returns null. Must not alter the deque!
    //USE iteration
    @Override
    public T get(int index){
        if(index>size-1){
            return null;
        }
        return arr[front+index];
    }
}
