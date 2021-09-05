package seventh_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Windowing {
    public static void main(String[] args) throws InterruptedException {
        /*Observable.range(1, 50)
                .window(8)
                .flatMapSingle(obs -> obs.reduce("", (total, next) -> total + (total.equals("") ? "" : "|") + next))
                .subscribe(s -> System.out.println(s));*/

        /*Observable.range(1, 50)
                .window(3,4)
                .flatMapSingle(obs -> obs.reduce("", (total, next) -> total + (total.equals("") ? "" : "|") + next))
                .subscribe(s -> System.out.println(s));*/
       /* Observable.interval(300, TimeUnit.MILLISECONDS)
                .map(i->(i+1)*300)
                .window(1,TimeUnit.SECONDS)
                .flatMapSingle(obs->obs.reduce("",(total,next)->total+(total.equals("")?"":"|")+next))
                .subscribe(s-> System.out.println(s));
        Thread.sleep(2000); */

        Observable.interval(300, TimeUnit.MILLISECONDS)
                .map(i->(i+1)*300)
                .window(Observable.interval(1,TimeUnit.SECONDS))
                .flatMapSingle(obs->obs.reduce("",(total,next)->total+(total.equals("")?"":"|")+next))
                .subscribe(s-> System.out.println(s));
        Thread.sleep(2000);
    }
}
