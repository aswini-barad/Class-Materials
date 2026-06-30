class Test<T> {

    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj);
    }
}

public class Demo {
    public static void main(String[] args) {

        Test<String> t1 = new Test<>("Java");
        t1.display();

        Test<Integer> t2 = new Test<>(100);
        t2.display();
    }
}