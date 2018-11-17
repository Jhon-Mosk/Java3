package Lesson_1.CallBack;

import javax.swing.*;

public class SomeClass {
    interface Callback {
        void callingBack();
    }

    Callback callback;

    public void regCallback (Callback callback) {
        this.callback=callback;
    }

    void doSomething(){
        JOptionPane.showMessageDialog(null,"Work");
        callback.callingBack();
    }
}
