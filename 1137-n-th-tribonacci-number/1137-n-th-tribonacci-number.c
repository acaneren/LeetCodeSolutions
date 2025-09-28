int tribonacci(int n) {

    static int F[38] = {0};
    static int initialized = 0;

    if (!initialized) {
        for (int i = 0; i <= 37; i++) {
            F[i] = -1;
            initialized = 1;
        }
    }

    if (F[n] != -1) {
        return F[n];
    }

    if (n == 0)
        return 0;
    if (n == 1 || n == 2)
        return 1;

    if (F[n - 3] == -1) {
        F[n - 3] = tribonacci(n - 3);
    }
    if (F[n - 2] == -1) {
        F[n - 2] = tribonacci(n - 2);
    }
    if (F[n - 1] == -1) {
        F[n - 1] = tribonacci(n - 1);
    }

    F[n] = F[n - 3] + F[n - 2] + F[n - 1];
    return F[n];
}