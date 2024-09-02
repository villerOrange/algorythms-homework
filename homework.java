
// Задача #1
// Временная сложность: O(n)
public class Tasks {
    public static void task1() {
        int n = 10; // Входное значение n
        if (n == 1) return;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
                break;
            }
        }
    }

    // Задача #2
    // Временная сложность: O(n * log n)
    public static void task2() {
        int n = 10; // Входное значение n
        int a = 0;

        for (int i = n / 2; i <= n; i++) {
            for (int j = 2; j <= n; j *= 2) {
                a += n / 2;
            }
        }
    }

    // Задача #3
    // Временная сложность: O(n^2)
    public static void task3() {
        int n = 10; // Входное значение n
        int a = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                a += i + j;
            }
        }
    }

    // Задача #4
    // Временная сложность: O(log n)
    public static void task4() {
        int n = 10; // Входное значение n
        int a = 0;
        int i = n;

        while (i > 0) {
            a += i;
            i /= 2;
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}
