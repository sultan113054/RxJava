package second_chapter;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSerialized;
import io.reactivex.rxjava3.observers.ResourceObserver;

import java.util.concurrent.TimeUnit;

public class Dispose {
    public static void main(String[] args) throws Exception {
        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
       /* Disposable disposable=observable.subscribe(p-> System.out.println("done"));
        Thread.sleep(3000);
        disposable.dispose();
        Thread.sleep(2000);*/

        Observer<Long> longObserver = new Observer<Long>() {
            private Disposable disposable;

            @Override
            public void onSubscribe(@NonNull Disposable d) {
                this.disposable = d;
            }

            @Override
            public void onNext(@NonNull Long aLong) {
                System.out.println(aLong);
                disposable.dispose();
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println("error");

            }

            @Override
            public void onComplete() {
                System.out.println("done");

            }
        };

        // observable.subscribe(longObserver);
        // Thread.sleep(3000);

        ResourceObserver<Long> longResourceObserver = new ResourceObserver<Long>() {
            @Override
            public void onNext(@NonNull Long aLong) {
                System.out.println(aLong);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        //  observable.subscribe(longResourceObserver);
        // Thread.sleep(2000);

     /*   CompositeDisposable compositeDisposable=new CompositeDisposable();
        Disposable disposable=observable.subscribe(i-> System.out.println(i));
        Disposable disposable1=observable.subscribe(i-> System.out.println(i));
        Thread.sleep(3000);
        compositeDisposable.addAll(disposable,disposable1);
        compositeDisposable.dispose();
        Thread.sleep(2000);*/

        Observable<Long> longObservable = Observable.create(e -> {
            try {
                for (long i = 0; i < 1000; i++) {
                    while (!e.isDisposed())
                        e.onNext(i);
                    if (e.isDisposed())
                        return;
                }

                e.onComplete();
            } catch (Exception ex) {
                e.onError(ex);
            }
        });

        observable.subscribe(i-> System.out.print(i));
        Thread.sleep(10000);



    }
}
