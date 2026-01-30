class MyCircularQueue {
    int[] queue_arr;
    int front = 0;
    int rear = 0;
    public MyCircularQueue(int k) {
        queue_arr = new int[k+1];
    }

    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        rear = (rear + 1) % queue_arr.length;
        queue_arr[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        front = (front + 1) % queue_arr.length;
        return true;
    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return queue_arr[(front + 1) % queue_arr.length];
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return queue_arr[rear];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % queue_arr.length == front;
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