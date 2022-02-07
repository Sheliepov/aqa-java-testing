package ReflectionApi;

class SomeClass {
    private int number = 20;

    public SomeClass() {
    }

    SomeClass(String s) {
    }

    private synchronized String someMethod(String s) {
        System.out.println("this is" + s);
        return s;
    }
}
