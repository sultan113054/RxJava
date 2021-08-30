package fourth_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Ambiguous {
    public static void main(String[] args) throws InterruptedException {
        Observable<String> observable = Observable.interval(1, TimeUnit.SECONDS)
                .take(2)
                .map(s -> "Source1 " + s);
        Observable<String> observable1 = Observable.interval(1, TimeUnit.MILLISECONDS)
                .take(2)
                .map(s -> "2 " + s);
        /*Observable.amb(Arrays.asList(observable, observable1))
                .subscribe(p -> System.out.println(p));
        Thread.sleep(3000);*/
        observable.ambWith(observable1).subscribe(p -> System.out.println(p));
        Thread.sleep(5000);


    }
}
