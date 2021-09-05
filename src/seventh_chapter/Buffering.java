package seventh_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class Buffering {
    public static void main(String[] args) throws InterruptedException {
       /* Observable.range(1,10)
                .buffer(3,2, HashSet::new)
                .filter(f->f.size()==3)
                .subscribe(p-> System.out.println(p));*/

  /*      Observable.interval(300, TimeUnit.MILLISECONDS)
                .map(i->(i+1)*300)
                .buffer(1,TimeUnit.SECONDS,3)
                .subscribe(s-> System.out.println(s));
        Thread.sleep(3000);*/

        Observable.interval(300, TimeUnit.MILLISECONDS)
                .map(i -> (i + 1) * 300)
                .buffer(Observable.interval(2, TimeUnit.SECONDS))
                .subscribe(s -> System.out.println(s));

        Thread.sleep(3000);

    }
}
