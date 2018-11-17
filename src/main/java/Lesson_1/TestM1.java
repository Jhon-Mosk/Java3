public class TestM1 {
}


/////// task 1

class TT {
    private static int count = 0;
    private final int id = ++count;

    private void methodA() {
        System.out.println("TT.methodA " + id);
    }

    public void methodTT(TT t) {
        t.methodA();
    }
}


class Test1 {
    public static void main(String[] args) {
        TT t1 = new TT();
        TT t2 = new TT();
        t2.methodTT(t1);
    }
}

// 1)       TT.methodA 2
// 2)       TT.methodA 0
// 3)       TT.methodA 1
// 4)       Ошибка компиляции


// task 2. Укажите все утверждения,
// которые верны относительно следующего фрагмента кода:

class TestClazz {
//    public static void main(String[] args) {
//        final long Byte = 0;            // 1
//        if ( Byte.equals(0) ) {        // 2
//            System.out.print("==");
//        } else {
//            System.out.print("!=");
//        }
//    }
}

//        Возникнет ошибка компиляции в строке 1
//        Возникнет ошибка компиляции в строке 2
//        Код напечатает "=="
//        Код напечатает "!="
//        Код успешно скомпилируется


// task 3 Какой результат выполнения программы?

class B {
    public static void main(String[] args) {
        big_loop:
        for (int i = 0; i < 3; i++) {
            try {
                for (int j = 0; j < 3; j++) {
                    if (i == j) continue;
                    else if (i > j) continue big_loop;
                    System.out.print("A");
                }
            } finally {
                System.out.print("B");
            }
            System.out.print("C");
        }
    }
}


//        1. AABCAABCBC
//        2. AAABCAAABCAAABC
//        3. AABCBB
//        4. ABCABCABC
//        5. AABBCACA





// task 4 Какой будет результат выполнения кода:

class Main123 {
    public static void main(String[] args) {
        double d = Math.sqrt(-1);
        System.out.println(Double.NaN == d);
        d = d / 0;
        System.out.println(Double.isNaN(d));
    }
}

//        1 true false
//        2 false true
//        3 true true
//        4 false false











// task 5 Какой результат выполнения данного кода:
class Main5 {
    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = 128;

        Double d1 = 10d;
        Double d2 = 10d;

        System.out.println(i1 == i2);
        System.out.println(d1 == d2);
    }
}

//        1. false true
//        2. false false
//        3. true true
//        4. true false






//6 Что произойдет в результате выполнения следующего кода?

class Main6 {
    public static void main(String args[]) {
        byte b = 0;
        while (++b > 0) ;
        System.out.println(b);
    }
}

//        1 На экран выведется число 255
//        2 Произойдет зацикливание программы
//        3 На экран выведется число -128
//        4 На экран выведется число 0
//        5 На экран выведется число 127










// 7 Каким будет результат?

class Main7 {
//        public static void main(String[] args) {
//        byte b=12;
//        byte k=b+1;
//        System.out.println(k);
//        }
}


//        1 12
//        2 13
//        3 Код не откомпилируется
//        4 null
