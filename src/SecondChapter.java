import io.reactivex.rxjava3.core.Observable;

public class SecondChapter {
    public static void main(String[] args) {
        Observable<String>first=Observable.create(emitter -> {
            emitter.onNext("one");
            emitter.onNext("two");
            emitter.onNext("three");
            emitter.onComplete();
        });
        first.subscribe(s -> {
            System.out.println(s);
        });
    }
}
