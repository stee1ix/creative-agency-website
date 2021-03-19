import java.util.*;

class A {
    public int i;
    public int j;
}

class B extends A {
    void display() {
        super.j = super.i + 1;
        System.out.println(super.i + " " + super.j);
    }
}

class method_overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.i = 1;
        obj.j = 2;
        obj.display();
    }
}