package fifth_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ReplayingAndCaching {
    public static void main(String[] args) throws InterruptedException {
        //Observable<Long>observable=Observable.interval(1, TimeUnit.SECONDS).replay().autoConnect();
        /*Observable<Long>observable=Observable.interval(1, TimeUnit.SECONDS).replay(1).autoConnect();
        observable.subscribe(p-> System.out.println("ob1: "+ p));
        Thread.sleep(2000);
        observable.subscribe(p-> System.out.println("ob2: " +p));
        Thread.sleep(2000);*/

        /*Observable<String>observable=Observable.just("Alpha","Beta")
                .replay().autoConnect();
        observable.subscribe(p-> System.out.println("sub1: "+p));
        observable.subscribe(p-> System.out.println("sub2: "+p));*/

       /* Observable<Long>observable=Observable.interval(300,TimeUnit.MILLISECONDS).map(m->(m+1)*300)
                .replay(1,1,TimeUnit.SECONDS).autoConnect();

        observable.subscribe(p-> System.out.println("sub1: "+p));
        Thread.sleep(2000);
        observable.subscribe(p-> System.out.println("sub2: "+p));
        Thread.sleep(2000);*/

        Observable<Integer> observable = Observable.just(1, 2, 3)
                .scan(0, (total, next) -> total + next)
                //.cache();
        .cacheWithInitialCapacity(5);
        observable.subscribe(p -> System.out.println("ob1: "+p));
        observable.subscribe(p -> System.out.println("ob2: "+p));


    }
}
