package sixth_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ObserveOnOperator {
    public static void main(String[] args) throws InterruptedException {
        Observable.just("abc/def/123/456/7","abc/def/123/456/7")
                .subscribeOn(Schedulers.io())
                .flatMap(observer ->Observable.fromArray(observer.split("/")))
                .doOnNext(p-> System.out.println(Thread.currentThread().getName()+"-"+p))
                .observeOn(Schedulers.computation())
                .filter(f->f.matches("[0-9]+"))
                .reduce((total,next)->total+next)
                .doOnSuccess(p-> System.out.println(Thread.currentThread().getName()+"-"+p))
                .observeOn(Schedulers.io())
                .doOnSuccess(p-> System.out.println(p +" -"+Thread.currentThread().getName())).subscribe(s-> System.out.println(s));
        Thread.sleep(2000);
    }
}
