package annotations;

import jdk.jfr.Name;


public class Task3 {

    @Name("super main")
    public static void main(String[] args){
        Task3.A a = new Task3.A();
        Task3.B b = new Task3.B();
        Task3.C c = new Task3.C();
        a.getAnnotation();
        b.getAnnotation();
        c.getAnnotation();

    }

    @CalcAnnotations(number1 = 11, number2 = 22)
    static class A extends Task3 implements IMain{

        @Override
        @Name("first")
        public void getAnnotation() {
            System.out.println(new A().getClass().getAnnotation(CalcAnnotations.class));
        }

    }

    static class B extends A {

        @Override
        @Name("second")
        public void getAnnotation() {
            System.out.println(new B().getClass().getAnnotation(CalcAnnotations.class));
        }
    }

    static class C extends B {

        @Override
        @Name("third")
        public void getAnnotation() {
            System.out.println(new C().getClass().getAnnotation(CalcAnnotations.class));
        }
    }

}

interface IMain{
    void getAnnotation();
}