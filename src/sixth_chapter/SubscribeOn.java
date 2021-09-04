package sixth_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.ThreadLocalRandom;

public class SubscribeOn {
    private static <T> T calculation(T value) throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }

    public static void main(String[] args) throws InterruptedException {
     /*   Observable.just("a","b","c")
               .subscribeOn(Schedulers.computation())
                .map(s->calculation(s)).subscribe(s-> System.out.println(s));

        Observable.just(1,2,3)
               .subscribeOn(Schedulers.computation())
                .map(s->calculation(s)).subscribe(s-> System.out.println(s));
        Thread.sleep(30000);*/
    /*    Observable<String> src1 = Observable.just("a", "b", "c")
                .subscribeOn(Schedulers.computation())
                .map(s -> calculation(s));

        Observable<Integer> src2 =
                Observable.just(1, 2, 3)
                        .subscribeOn(Schedulers.computation())
                        .map(s -> calculation(s));

        Observable.zip(src2, src1, (s, r) -> s + "-" + r).subscribe(s -> System.out.println(s));
        Thread.sleep(30000);*/

        Observable.just(1,2,3)
                .subscribeOn(Schedulers.computation())
                .blockingSubscribe(s-> System.out.println(s));

    }

}
