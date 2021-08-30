package fourth_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Zip {
    public static void main(String[] args) throws InterruptedException {
      /*  Observable<Integer>observable=Observable.just(1,2,3);
        Observable<String>observable1=Observable.just("a","b");
        Observable.zip(observable1,observable,(s,r)->s+"-"+r).subscribe(p-> System.out.println(p));
        observable.zipWith(observable1,(s,r)->s+"-"+r).subscribe(p-> System.out.println(p));
        Observable<Long>observable2=Observable.interval(1, TimeUnit.SECONDS);
        observable.zipWith(observable2,(s,r)->s+"-"+r).subscribe(p-> System.out.println(p));

        Thread.sleep(3000);*/

        Observable<Long> observable = Observable.interval(300, TimeUnit.MILLISECONDS);
        Observable<Long> observable1 = Observable.interval(1, TimeUnit.SECONDS);
        /*Observable.combineLatest(observable, observable1, (s, r) -> "ob1 " + s + " ob2 " + r)
                .subscribe(p -> System.out.println(p));*/

        observable.withLatestFrom(observable1, (s, r) -> "source 1 " + s + " sour2 " + r)
                .subscribe(p -> System.out.println(p));

        Thread.sleep(3000);


    }
}
