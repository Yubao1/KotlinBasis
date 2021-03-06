package com.xe.myapplication6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 86188 on 2021/3/2.
 */

public class Test {
    private void test() {
//        List<String> strs = new ArrayList<>();
//// 这里将导致编译错误，Java语言不允许这样做
//        List<Object> objs = strs;
    }
    private void test2() {
//        List<String> strs = new ArrayList<>();
//        List<Object> objs = strs;
//        objs.add(1);
//
//        String s = strs.get(0);
    }

    interface List<T> {
        void addAll(List<? extends T> t);
    }

    public void copy(List<String> from, List<Object> to) {
        to.addAll(from);
    }
    public void test3() {
        Test2<B> test2 = new Test2<B>();
        A a = test2.list.get(0);
        Test2<B> test3 = new Test2<B>();
        test3.list2.add(new C());

        Test2<? extends A> test21 = new Test2<B>();
//        test21.list4.add(new B());
//        test21.list4.add(new A());
    }

}
class Test2<T> {
    public List<? extends T> list = new ArrayList<>();
    public List<? super T> list2 = new ArrayList<>();
    public List<? extends A> list3 = new ArrayList<>();
    public List<T> list4 = new ArrayList<>();

}
class A {

}
class B extends A {

}
class C extends B {

}

class gent<T> {
    public void test() {
        System.out.println("gent");
    }
}

class supC {
    public String toString() {
        return "supA";
    }
}

class Bc extends supC {
    String b;

    public Bc( String b ) {
        this.b = b;
    }

    public String toString() {
        return "subB";
    }

    // 指明泛型参数必须是supC或其子类
    public void test( gent<? extends supC> o ) {
        System.out.println("Bc");
    }

    public static void main( String[] args ) {
        Bc bc = new Bc("test");
        gent<Bc> oGent = new gent<Bc>();
        bc.test(oGent);    // oGent 是supC的子类对象
    }
}
