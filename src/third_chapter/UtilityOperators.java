package third_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRange;

import java.util.concurrent.TimeUnit;

public class UtilityOperators {
    public static void main(String[] args) throws InterruptedException {
    /*    Observable.just(1,2)
                .delay(1, TimeUnit.SECONDS)
                .subscribe(p-> System.out.println(p));
        Thread.sleep(2000); */

        /*Observable.just(1,2)
                .repeat(2)
                .subscribe(p-> System.out.println(p));
        Thread.sleep(2000);*/

       /* Observable.just("1")
                .single("single")
                .subscribe(s -> System.out.println(s));*/

      /*  Observable.just("10","2")
                .filter(f -> f.contains("e") )
                .single("single")
                .subscribe(s -> System.out.println(s));*/

  /*      Observable.just(1,2)
                .timestamp(TimeUnit.SECONDS)
                .subscribe(p-> System.out.println(p));*/
/*
        Observable.just(1,2)
                .timestamp(TimeUnit.SECONDS)
                .subscribe(p-> System.out.println(p.time()+","+p.unit()+","+p.value()));*/

        Observable.just(1,2,3,4)
                .timeInterval(TimeUnit.MILLISECONDS)
                .take(3)
                .subscribe(s-> System.out.println(s.time()+","+s.unit()+","+s.value()));


    }
}
