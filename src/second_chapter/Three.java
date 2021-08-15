package second_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCache;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class Three {
    public static void main(String[] args) {
        ConnectableObservable<String>observable=Observable.just("a","b","c").publish();

        observable.subscribe(s-> System.out.println(s));
        observable.subscribe(s -> System.out.println(s+" 11"));
        observable.connect();
    }
}
