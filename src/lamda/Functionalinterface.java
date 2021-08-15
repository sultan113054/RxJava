package lamda;

import io.reactivex.rxjava3.functions.Function;

public class Functionalinterface {
    //functional Interface is simply an interface that has exactly one abstract method
    public static void main(String[] args) throws Throwable {
        Functions<String,String>function=t-> {System.out.println(t); return t; };
        System.out.println(function.apply("test"));
    }
}
