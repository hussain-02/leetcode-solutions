class MyCircularQueue {
    int front = 0;
    int rear = -1;
    int size = 0;
    int k ;
    int[] queue ;
    public MyCircularQueue(int k) {
        this.k = k;
        queue = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(size == k) return false;

        rear = (rear+1) % k;
        queue[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size == 0) return false;

        front = (front + 1) % k;
        size--;
        return true;
    }
    
    public int Front() {
        return size == 0 ? -1 : queue[front];
    }
    
    public int Rear() {
        return size == 0 ? -1 : queue[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */