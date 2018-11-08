package Lesson_1;

public class B {
    public static void main(String[] args) {
        big_loop:
        for (int i = 0; i < 3; i++) {
            try {
                for (int j = 0; j < 3; j++) { // continue пропускает всё что ниже него
                    if (i == j) continue;  // пропускает одну иттерацию в этом цикле
                    else if (i > j) continue big_loop; // пропускает одну иттерацию в цикле с i
                    System.out.println("A");
                }
            } finally {
                System.out.println("B"); // отрабатывает в любом случае
            }
            System.out.println("C");
        }
    }
}
