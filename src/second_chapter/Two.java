package second_chapter;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class Two {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("a", "b", "c");
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {
                System.out.println(s);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("done");
            }
        };
       // observable.subscribe(observer);
        observable.subscribe(next-> System.out.println("test"),Throwable::printStackTrace,()-> System.out.println("done"));
    }
}
