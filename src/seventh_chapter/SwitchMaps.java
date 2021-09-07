package seventh_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.sql.Time;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class SwitchMaps {
    public static void main(String[] args) throws InterruptedException {
/*        Observable<String> ob1 = Observable.just("1", "2", "3", "4", "5", "6", "7", "8", "9");
        Observable<String> ob2 = ob1.concatMap(s -> Observable.just(s)
                .delay(500, TimeUnit.MILLISECONDS));
        Observable.interval(5, TimeUnit.SECONDS)
                .switchMap(s -> ob2.doOnDispose(() -> System.out.println("dispose")))
                .subscribe(p -> System.out.println(p));
        Thread.sleep(3000);*/

        Observable<String> items = Observable.just("Alpha", "Beta",
                "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta", "Iota");
        Observable<String> processStrings =
                items.concatMap(s -> Observable.just(s)
                        .delay(500, TimeUnit.MILLISECONDS));
        Observable.interval(5, TimeUnit.SECONDS)
                .switchMap(i -> processStrings.doFinally(() ->
                        System.out.println("Disposing! Starting next")))
                .subscribe(System.out::println);
        Thread.sleep(20000);
    }
}
