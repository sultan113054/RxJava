package third_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class ActionOperators {
    public static void main(String[] args) throws InterruptedException {
/*        Observable.just("123","456")
                .doOnNext(c-> System.out.println(c))
                .map(String::length)
                .subscribe(p-> System.out.println(p));*/

       /* Observable.just("123","456")
                .doAfterNext(c-> System.out.println(c))
                .map(String::length)
                .subscribe(p-> System.out.println(p));*/
/*
        Observable.just("123","456")
                .doOnComplete(()-> System.out.println("End"))
                .map(String::length)
                .subscribe(p-> System.out.println(p));*/


    /*    Observable.just(123,45)
                .doOnError(e-> System.out.println(e))
                .map(i->i/0)
                .doOnError(e-> System.out.println(e))
                .subscribe(p-> System.out.println(p),e-> System.out.println(e));*/
/*
        Observable.just(1,2)
                .map(i->i>0)
                .doOnTerminate(()-> System.out.println("ter"))
                .doOnComplete(()-> System.out.println("end"))
                .doAfterTerminate(()-> System.out.println("ter1"))
                .subscribe(p-> System.out.println(p));*/

    /*    Observable.just(1,2,3)
                .doOnEach(p-> System.out.println(p))
                .subscribe(p-> System.out.println(p));*/

       /* Observable.just(1,2,3)
                .doOnEach(p-> System.out.println(p.isOnNext()+","+p.isOnComplete()+","+p.isOnError()+""))
                .subscribe(p-> System.out.println(p));*/

       /* Observable.just(1,2,3)
                .doOnEach(p-> System.out.println(p.getError()+","+p.getValue()))
                .subscribe(p-> System.out.println(p));*/

       /* Disposable disposable = Observable.interval(1, TimeUnit.SECONDS)
                .doOnSubscribe(s-> System.out.println("subscribing"))
                .doOnDispose(() -> System.out.println("dispose"))
                .subscribe(s -> System.out.println(s));

        Thread.sleep(4000);
        disposable.dispose();
        Thread.sleep(2000);*/

   /*     Observable.just(1,2,3)
                .reduce((a,b)->a+b)
                .doOnSuccess(s-> System.out.println("success"))
                .subscribe(p-> System.out.println(p));*/

        Disposable disposable = Observable.interval(1,TimeUnit.SECONDS)
                .doAfterTerminate(() -> System.out.println("ter"))
                .doFinally(() -> System.out.println("finally"))
                .doOnDispose(() -> System.out.println("dispose"))
                .subscribe(s -> System.out.println(s));

        Thread.sleep(2000);
        disposable.dispose();
        Thread.sleep(1000);


    }
}
