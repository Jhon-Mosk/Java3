package Lesson_1.CallBack;

class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyClass myClass = new MyClass();

        someClass.regCallback(myClass);
        someClass.doSomething();
    }

}
