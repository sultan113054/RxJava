package lamda;

public class LamdaConcept {
    public static void main(String[] args) {
        Test t=new Test();
        t.cry("mao");
        Animal animal=new Animal() {
            @Override
            public String cry(String arg) {
                System.out.println(arg);
                return null;
            }
        };

        animal.cry("try");
    }
}
