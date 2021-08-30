package fourth_chapter;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Concat {
    public static void main(String[] args) throws InterruptedException {
        /*Observable<Integer>observable=Observable.just(1,2,3);
       Observable<Integer>observable1= Observable.just(4,5,6);
       Observable.concat(observable,observable1)
               .subscribe(p-> System.out.println(p));

       observable.concatWith(observable1).subscribe(p-> System.out.println(p));*/

     /* Observable<String> observable=Observable.interval(1, TimeUnit.SECONDS)
                .take(2)
              .map(i->i+1)
              .map(s->"source1 "+s);
      Observable<String> observable1=Observable.interval(1, TimeUnit.SECONDS)
              .map(i->i+1)
              .map(s->"source2 "+s);

      Observable.concat(observable,observable1).subscribe(p-> System.out.println(p));
      Thread.sleep(5000);*/

        Observable.just("abc", "def")
                .concatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(p -> System.out.println(p));


    }
}
