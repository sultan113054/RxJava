package third_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class SuppressingOperators {
    public static void main(String[] args) throws InterruptedException {
       /* Observable.just("1", "2", "11")
                .filter(i -> i.startsWith("1"))
                .subscribe(p -> System.out.print(p), t -> System.out.printf(""), () -> System.out.printf("done"));*/

       /* Observable.just("1","2","3")
                .take(2)
                .subscribe(p-> System.out.print(p));
        Observable.interval(300, TimeUnit.MILLISECONDS)
                .take(2,TimeUnit.SECONDS)
                .subscribe(p-> System.out.println(p));*/

/*        Observable.range(1,300)
                .takeLast(2)
                .subscribe(p-> System.out.println(p));


        Observable.range(1,10)
                .skip(1)
                .subscribe(p-> System.out.println(p)); */

      /*  Observable.range(1,10)
                .skipLast(9)
                .subscribe(p-> System.out.println(p));*/


        /*Observable.just("abc", "def", "ghrk")
                .map(String::length)
                .distinct()
                .subscribe(p -> System.out.println(p));


        Observable.just("abc", "def", "ghrk")
                .distinct(String::length)
                .subscribe(p -> System.out.println(p));*/

     /*   Observable.just(1, 2, 3, 3, 4, 3)
                .distinctUntilChanged()
                .subscribe(p -> System.out.println(p));

        Observable.just("a", "abb", "bbb", "cqq")
                .distinctUntilChanged(String::length)
                .subscribe(p -> System.out.println(p));*/

        /*Observable.just("a", "abb", "bbb", "cqq")
                .elementAtOrError(5)
                .subscribe(p -> System.out.println(p),e-> System.out.println(e));*/

        Observable.just("a", "abb", "bbb", "cqq")
                .elementAt(5)
                .subscribe(p -> System.out.println(p));
    }
}
