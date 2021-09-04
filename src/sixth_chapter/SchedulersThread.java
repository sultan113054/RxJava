package sixth_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SchedulersThread {
    public static void main(String[] args) throws InterruptedException {
       /* Observable.just(1,2,3)
                .subscribeOn(Schedulers.computation())
                .subscribe(s-> System.out.println(s));*/

        /*ExecutorService executorService= Executors.newFixedThreadPool(10);
        Observable.just(1,2,3)
                .subscribeOn(Schedulers.from(executorService))
                .doFinally(executorService::shutdown)
                .subscribe(s-> System.out.println(s));*/

      /*Observable<Integer>src1=  Observable.just(1,2,3)
                .subscribeOn(Schedulers.computation());
      src1.subscribe(s-> System.out.println(Thread.currentThread().getName()+"-"+s));
      src1.subscribe(s-> System.out.println(Thread.currentThread().getName()+"-"+s));

      Thread.sleep(2000);*/

      Observable<Integer>src1=  Observable.just(1,2,3)
                .subscribeOn(Schedulers.computation()).publish().autoConnect(2);

      src1.subscribe(s-> System.out.println(Thread.currentThread().getName()+"-"+s));
      src1.subscribe(s-> System.out.println(Thread.currentThread().getName()+"-"+s));

      Thread.sleep(2000);

    }
}
