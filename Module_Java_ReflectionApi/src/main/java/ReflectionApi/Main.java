package ReflectionApi;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        System.out.println(clss.getName());
        System.out.println("");
        System.out.println("Constructors:");
        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());

            }
        }
        System.out.println("");
        System.out.println("Methods");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
                System.out.println(Modifier.toString(method.getModifiers()));
                System.out.println(method.getReturnType().getName());
                method.setAccessible(true);
                method.invoke(someClass, " test");
            }

            System.out.println("");
            System.out.println("fields");
            Field[] fields = clss.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
                System.out.println(field.getType().getName());
                System.out.println(Modifier.toString(field.getModifiers()));
                field.setAccessible(true);
                System.out.println(field.getInt(someClass));
                field.setInt(someClass, 55);
                System.out.println(field.getInt(someClass));
            }
        }
    }
}
