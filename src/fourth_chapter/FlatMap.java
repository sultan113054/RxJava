package fourth_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class FlatMap {
    public static void main(String[] args) throws InterruptedException {
        /*Observable.just("Abul","Samad")
                .flatMap(s->Observable.fromArray(s.split("")))
                .subscribe(p-> System.out.println(p));*/
        /*Observable.just("abc/def/123","567/890/qw")
                .flatMap(s->Observable.fromArray(s.split("/")))
                .filter(f->f.matches("[0-9]+"))
                .map(Integer::valueOf)
                .subscribe(p-> System.out.println(p));*/

/*        Observable.just(1,2)
                .flatMap(s->Observable.interval(s, TimeUnit.SECONDS).map(i->s+" s interval "+ i +" seconds elapsed"))
                .subscribe(p-> System.out.println(p));
        Thread.sleep(12000);*/


      /*  Observable.just(1, 2, 0, 3)
                .flatMap(s -> {
                    if (s == 0) return Observable.empty();
                    else
                        return Observable.interval(s, TimeUnit.SECONDS).map(i -> s + " s interval " + i + " seconds elapsed");
                })
                .subscribe(p -> System.out.println(p));
        Thread.sleep(6000);*/

        Observable.just(10,20,30)
                .flatMap(s->Observable.fromArray(s/2),(s,r)->s+"-"+r).subscribe(System.out::println);


    }
}