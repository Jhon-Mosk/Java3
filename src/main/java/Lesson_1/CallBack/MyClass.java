package Lesson_1.CallBack;

class MyClass implements SomeClass.Callback {


    public void callingBack() {
        System.out.println("Вызов метода обратного вызова!");
    }
}
