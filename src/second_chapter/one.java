package second_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class one {
    public static void main(String[] args) {
        Observable<String> first = Observable.create(emitter -> {
            try {
                emitter.onNext("one");
                emitter.onNext("two");
                emitter.onNext("three");
                emitter.onComplete();
            } catch (Throwable e) {
                emitter.onError(e);
            }

        });
        first.map(String::length).filter(len -> len >= 4).subscribe(s -> {
            System.out.println(s);
        }, Throwable::printStackTrace);

        List<String>list=Arrays.asList("a","");
        Observable<String>second=Observable.fromIterable(list);
        second.map(String::length).filter(len -> len >= 1).subscribe(s -> {
            System.out.println(s);
        }, Throwable::printStackTrace);
    }
}
