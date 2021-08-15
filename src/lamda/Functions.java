package lamda;

@FunctionalInterface
public interface Functions<T, R> {
    R apply(T t) throws Throwable;
}