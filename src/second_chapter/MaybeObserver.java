package second_chapter;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

public class MaybeObserver {
    public static void main(String[] args) {
        //Maybe<String>maybe=Maybe.just("test");
        // maybe.subscribe(p-> System.out.printf(p),e-> System.out.printf("error"),()-> System.out.printf("done"));

        // Maybe.empty().subscribe(p-> System.out.printf(""),e-> System.out.printf("error"),()-> System.out.printf("done"));
        // Observable.empty().subscribe(p-> System.out.printf(""), e-> System.out.printf("error"),()-> System.out.printf("done"));
        Observable.just("test").firstElement().subscribe(p -> System.out.printf(p),e-> System.out.printf("error"),()-> System.out.printf("done"));
    }
}
