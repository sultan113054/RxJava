package third_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.TestScheduler;

import java.util.concurrent.TimeUnit;

public class ConditionalOperator {
    public static void main(String[] args) throws InterruptedException {
// stop emissions while return false
      /* Observable.range(1,100)
                .takeWhile(integer -> integer<5)
                .subscribe(System.out::println);*/
// start emissions while get false
        /*Observable.range(1, 100)
                .skipWhile(integer -> integer < 90)
                .subscribe(System.out::print);*/
      /*  Observable.just("a","b")
                .filter(i->i.startsWith("1"))
                .defaultIfEmpty("nope")
                .subscribe(i-> System.out.print(i));

        Observable.just("a","b")
                .filter(i->i.startsWith("1"))
                .switchIfEmpty(Observable.just("1"))
                .subscribe(i-> System.out.print(i));*/

        //


        TestScheduler testScheduler=new TestScheduler();
        Observable<String>observable=Observable.just("a","b")
                .delay(1, TimeUnit.MILLISECONDS);

       /* Observable.range(1,10000)
                .takeUntil(observable)
                .subscribe(integer -> System.out.print(integer)); */

        Observable.range(2,10000)
                .skipUntil(observable)
                .subscribe(integer -> System.out.println(integer));
    }

}
