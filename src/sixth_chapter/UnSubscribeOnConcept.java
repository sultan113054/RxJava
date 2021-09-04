package sixth_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class UnSubscribeOnConcept {
    public static void main(String[] args) throws InterruptedException {
        Disposable d = Observable.interval(1, TimeUnit.SECONDS)
                .doOnDispose(() -> System.out.println(Thread.currentThread().getName()))
                .unsubscribeOn(Schedulers.computation())
                .subscribe(p -> System.out.println(p));
        Thread.sleep(3000);
        d.dispose();
        Thread.sleep(1000);

    }
}
