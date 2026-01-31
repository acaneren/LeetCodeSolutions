class MyCircularDeque {
    int[] queue_arr;
    int front = 0;
    int rear = 0;
    public MyCircularDeque(int k) {
        queue_arr = new int[k+1];
    }

    public boolean insertFront(int value) {
        if (isFull()){
            return false;
        }
        queue_arr[front] = value;
        front = (front - 1 + queue_arr.length) % queue_arr.length;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()){
            return false;
        }
        rear = (rear + 1) % queue_arr.length;
        queue_arr[rear] = value;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()){
            return false;
        }
        front = (front + 1) % queue_arr.length;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()){
            return false;
        }
        rear = (rear - 1 + queue_arr.length) % queue_arr.length;
        return true;
    }

    public int getFront() {
        if (isEmpty()){
            return -1;
        }
        return queue_arr[(front + 1) % queue_arr.length];
    }

    public int getRear() {
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
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */