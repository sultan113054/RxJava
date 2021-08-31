package fifth_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class AutomaticConnection {
    public static void main(String[] args) throws InterruptedException {
   /*     Observable<Integer> observable=Observable.range(1,3)
                .map(i-> ThreadLocalRandom.current().nextInt(100)).publish().autoConnect(2);
        observable.subscribe(p-> System.out.println(p));
        observable.reduce(0,(t,n)->t+n).subscribe(p-> System.out.println(p));
        observable.subscribe(p-> System.out.println(p));*/

        /*Observable<Long>observable=Observable.interval(1, TimeUnit.SECONDS).publish().autoConnect();

        observable.subscribe(p-> System.out.println("ob1: "+p));
        Thread.sleep(2000);

        observable.subscribe(p-> System.out.println("ob2: "+p));
        Thread.sleep(2000);*/


       // Observable<Long> ob = Observable.interval(1, TimeUnit.SECONDS).publish().refCount();
        Observable<Long> ob = Observable.interval(1, TimeUnit.SECONDS).share();
        ob.take(5).subscribe(p-> System.out.println("s1: "+p));
        Thread.sleep(3000);

        ob.take(2).subscribe(p-> System.out.println("s2: "+p));
        Thread.sleep(3000);

        ob.take(3).subscribe(p-> System.out.println("s3: "+p));
        Thread.sleep(3000);


    }
}
