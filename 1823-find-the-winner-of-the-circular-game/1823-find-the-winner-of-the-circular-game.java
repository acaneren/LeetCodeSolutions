class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int counter = 1;
        while (queue.size() > 1) {
            if (counter == k) {
                queue.poll();
                counter = 1;
            } 
            else {
                queue.add(queue.poll());
                counter++;
            }
        }
        return queue.poll();
    }
}