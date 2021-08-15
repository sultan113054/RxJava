package second_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Four {
    public static int start = 1;
    public static int count = 2;

    public static void main(String[] args) throws InterruptedException {
        // Observable.range(5, 5).subscribe(p -> System.out.println(p));
        // Observable.interval(1, TimeUnit.SECONDS)
        //     .subscribe(p-> System.out.println(p));
        // Thread.sleep(2000);

        Observable<String> observable = Observable.empty();
        //observable.subscribe(p-> System.out.println(p),Throwable::printStackTrace,()-> System.out.println("done"));

        Observable<String> empty = Observable.never();
        //observable.subscribe(p-> System.out.println("1"),Throwable::printStackTrace,()-> System.out.println("done"));
        // Thread.sleep(3000);
      /*  Observable.error(new Exception("Errors"))
                .subscribe(c -> System.out.println(c), e -> System.out.println(e), () -> System.out.println("done"));

        Observable.error(() -> new Exception("Errors"))
                .subscribe(c -> System.out.println(c), e -> System.out.println(e), () -> System.out.println("done"));

*/
        Observable<Integer> integerObservable = Observable.defer(()->Observable.range(start, count));
      //  integerObservable.subscribe(i -> System.out.println(i));
        count=3;

       // integerObservable.subscribe(i -> System.out.println(i));

        Observable.fromCallable(()->1/0).subscribe(s-> System.out.println(s),e-> System.out.println(e));

    }
}
