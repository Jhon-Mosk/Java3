package Lesson_1;

import javax.swing.*;

public class SomeClass {

    interface Callback {
        void callingBack();
    }

    Callback callback;

    public void regCallBack(Callback callback) {
        this.callback = callback;
    }

    void doSomeThing() {
        JOptionPane.showMessageDialog(null, "Work!");
        callback.callingBack();
    }

}

class MyClass implements SomeClass.Callback {

    public void callingBack() {
        System.out.println("Вызов метода обратного вызова!");
    }

}


class MainCall {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyClass myClass = new MyClass();

        someClass.regCallBack(myClass);

        someClass.doSomeThing();
    }
}
