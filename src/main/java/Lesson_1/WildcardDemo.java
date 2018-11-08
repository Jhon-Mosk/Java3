package Lesson_1;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[]= {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.avg();
        System.out.println("Среднее значение для iob равно " + v);
        Double dnums [] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.avg();
        System.out.println("Среднее значение для dob равно " + w);
        Float fnums[] = { 1.0f , 2.0f , 3.0f , 4.0f , 5.0f };
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.avg();
        System.out.println( "Среднее для fob равно " + x);
        System.out.print( "Средние iob и dob " );
        if (iob.sameAvg(dob)){
            System.out.println( "равны" );
        } else {
            System.out.println( "отличаются" );
        }
        System.out.print( "Средние iob и fob " );
        if (iob.sameAvg(fob)) {
            System.out.println( "равны" );
        } else {
            System.out.println( "отличаются" );
        }
    }
}
