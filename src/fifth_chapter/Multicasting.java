package fifth_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.ThreadLocalRandom;

public class Multicasting {
    public static void main(String[] args) {
       /* Observable<Integer>observable=Observable.just(1,2,3);
        observable.subscribe(p-> System.out.println(p));
        observable.subscribe(p-> System.out.println(p));

        ConnectableObservable<Integer> observable=Observable.range(1,3).publish();
        observable.subscribe(p-> System.out.println(p));
        observable.subscribe(p-> System.out.println(p));
        observable.connect();

        Observable<Integer>observable=Observable.range(1,3)
                .map(i-> ThreadLocalRandom.current().nextInt(1000));

        observable.subscribe(p-> System.out.println(p));
        observable.subscribe(p-> System.out.println(p));*/

       /* ConnectableObservable<Integer>observable=Observable.range(1,3).publish();
        Observable<Integer>observable1=observable.map(i->ThreadLocalRandom.current().nextInt(1000));
        observable1.subscribe(p-> System.out.println(p));
        observable1.subscribe(p-> System.out.println(p));
        observable.connect();*/

       /* ConnectableObservable<Integer>observable=Observable.range(1,3)
                .map(i->ThreadLocalRandom.current().nextInt(1000)).publish();
        observable.subscribe(p-> System.out.println(p));
        observable.subscribe(p-> System.out.println(p));
        observable.connect();*/

        ConnectableObservable<Integer> observable = Observable.range(1, 3)
                .map(i -> ThreadLocalRandom.current().nextInt(1000)).publish();

        observable.subscribe(p -> System.out.println(p));
        observable.reduce(0, (total, next) -> total + next).subscribe(p -> System.out.println(p));
        observable.connect();


    }

}
