package second_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class SingleObserver {
    public static void main(String[] args) {
        Single.just("hello")
                .map(String::length)
                .subscribe(o-> System.out.println(o));

    }
}
