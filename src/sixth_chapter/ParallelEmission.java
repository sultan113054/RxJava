package sixth_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelEmission {
    public static void main(String[] args) throws Exception {
       /* Observable.range(1, 10)
                .map(s -> print(s))
                .subscribe(s -> System.out.println(s));*/

        /*Observable.range(1, 10)
                .flatMap(s -> Observable.just(s).subscribeOn(Schedulers.computation()).map(m->print(m)))
                .subscribe(p-> System.out.println(Thread.currentThread().getName()+"-"+p));
        Thread.sleep(3000);*/

        int core=Runtime.getRuntime().availableProcessors()/2;
        AtomicInteger atomicInteger=new AtomicInteger(0);
        Observable.range(1,10)
                .groupBy(g->atomicInteger.incrementAndGet()%core)
                .flatMap(f->f.observeOn(Schedulers.computation()).map(m->print(m)))
                .subscribe(s-> System.out.println(Thread.currentThread().getName()+"-"+s));
        Thread.sleep(6000);
    }

    private static <T> T print(T value) throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }
}
