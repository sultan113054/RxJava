package seventh_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Throttle {
    public static void main(String[] args) throws InterruptedException {
        Observable<String>src1=Observable.interval(100, TimeUnit.MILLISECONDS)
                .map(i->(i+1)*100)
                .map(p->"Source 1: "+p)
                .take(11);
        Observable<String>src2=Observable.interval(1000, TimeUnit.MILLISECONDS)
                .map(i->(i+1)*250)
                .map(p->"Source 2: "+p)
                .take(3);
       /* Observable<String> src3 = Observable.interval(1300, TimeUnit.MILLISECONDS)
                .map(i -> (i + 1) * 1300)
                .map(p -> "Source 3: " + p)
                .take(2);*/

        //Observable.concat(src1,src2,20src3).subscribe(p-> System.out.println(p));
       // Observable.concat(src1,src2,src3).throttleLast(1,TimeUnit.SECONDS).subscribe(p-> System.out.println(p));
      // Observable.concat(src1,src2,src3).throttleFirst(1,TimeUnit.SECONDS).subscribe(p-> System.out.println(p));
        Observable.concat(src1,src2).throttleWithTimeout(1,TimeUnit.SECONDS).subscribe(p-> System.out.println(p));

        Thread.sleep(8000);
    }
}
