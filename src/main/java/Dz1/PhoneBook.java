package Dz1;

import java.util.HashMap;
import java.util.HashSet;
/*
при добавлении новой записи в телефонный справочник, должно быть
оповещение (на консоль "Новая зпись добавлена " + name)
 */

class CallingBack implements PhoneBox.Callback{

    @Override
    public void callingBack(String name) {
        System.out.println("Новая зпись добавлена " + name);
    }
}

class PhoneBox {
    HashMap<String, HashSet<String>> hm;

    public PhoneBox() {
        this.hm = new HashMap<>();
        CallingBack callingBack = new CallingBack();
        this.callback=callingBack;
    }

    interface Callback {
        void callingBack(String name);
    }

    Callback callback;

    void add(String name, String phone) {
        HashSet<String> hs = hm.getOrDefault(name, new HashSet<>());
        hs.add(phone);
        hm.put(name, hs);
        callback.callingBack(name);
    }

    void findString(String name) {
        if (hm.containsKey(name)) {
            System.out.println(hm.get(name));
        } else {
            System.out.println("такой фамилии нет");
        }
    }
}
class Action{
    public static void main(String[] args) {

        PhoneBox book = new PhoneBox();
        book.add("Ivanov", "12-35-34");
        book.add("Ivanov", "12-45-34");
        book.add("Ivanov", "12-55-34");
        book.add("Petrov", "44-45-34");
        book.add("Petrov", "44-55-34");
        book.add("Petrov", "44-65-34");

        book.findString("Ivanov");
        book.findString("Petrov");
        book.findString("Petrasdovjhk");

    }

}
