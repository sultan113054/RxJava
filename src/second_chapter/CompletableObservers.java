package second_chapter;

import io.reactivex.rxjava3.core.Completable;

public class CompletableObservers {
    public static void main(String[] args) {
        Completable.fromRunnable(() -> runProcess())
                .subscribe(() -> System.out.printf("done"));
        Completable.fromRunnable(() -> runProcess())
                .subscribe(() -> System.out.println("Done!"));
    }
    private static void runProcess() {
//run process here
    }

    private static void test() {
    }
}
