package third_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TransformingOperators {
    public static void main(String[] args) {
       /* Observable.just("abd", "def")
                .map(String::length)
                .subscribe(p -> System.out.println(p));*/

    /*    Observable<Object> items = Observable.just("1ww", "ewfew")
                .map(s -> (Object) s);

        Observable<Object> item = Observable.just("1ww", "ewfew")
                .cast(Object.class);*/

/*        Observable<String> menu = Observable.just("1", "2", "3");
        menu.startWithItem("test");
        menu.subscribe(System.out::println);*/

       /* Observable.just("1", "2", "3")
                .startWithArray("-1", "0").subscribe(s -> System.out.println(s));*/

      /*  List<String >strings= Arrays.asList("1","2","3");
        Observable.just("100")
                .startWithIterable(strings)
                .subscribe(s-> System.out.println(s));*/

       /* Observable.just(1,2,4,1,5,2)
                .sorted()
                .subscribe(s-> System.out.println(s));*/

       /* Observable.just(1,2,4,1,5,2)
                .sorted(Comparator.reverseOrder())
                .subscribe(s-> System.out.println(s));*/

/*        Observable.just("a23213","12","qwd")
                .sorted(Comparator.comparingInt(String::length))
                .subscribe(s-> System.out.println(s));*/

        /*Observable.just("a23213","12","qwd")
                .map(String::length)
                .sorted()
                .subscribe(s-> System.out.println(s)); */

        /*Observable.just(1,2,3)
                .scan((accumulator,j)->accumulator+j)
                .subscribe(s-> System.out.println(s));

        Observable.just(1,2,3)
                .reduce((accumulator,j)->accumulator+j)
                .subscribe(s-> System.out.println(s));*/

       /* Observable.just("a23213", "12", "qwd")
                .scan(0, (total, i) -> total + 1).subscribe(s -> System.out.println(s));
        Observable.just("a23213", "12", "qwd")
                .scan(0, (total, i) -> total + 1).skip(1).subscribe(s -> System.out.println(s));*/

        Observable.just("12","126")
                .scan(0,(total,i) -> total + i.length()).subscribe(s -> System.out.println(s));
    }
}
