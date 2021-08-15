package lamda;

public class Test implements Animal {
    @Override
    public String cry(String arg) {
        return "pig"+arg;
    }
}
