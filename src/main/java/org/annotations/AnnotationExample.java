package org.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // This annotation should be available at runtime
@Target(ElementType.METHOD) // This annotation can be applied to methods
@interface DeprecatedInfo {
    String version(); // This annotation has a value for indicating the version

    String reason() default ""; // You can also provide a reason, with a default value
}

// Use the custom annotation
class MyClass {
    @DeprecatedInfo(version = "2.0", reason = "Use the newMethod() instead")
    void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    @DeprecatedInfo(version = "3.0", reason = "That's the right method")
    void newMethod() {
        System.out.println("This is the recommended method.");
    }
}

public class AnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException {
        MyClass obj = new MyClass();
        obj.oldMethod(); // This will print a deprecation message along with the version and reason

        // Retrieve and display annotation information using reflection
        Method oldMethod = MyClass.class.getDeclaredMethod("oldMethod");
        DeprecatedInfo annotation = oldMethod.getAnnotation(DeprecatedInfo.class);
        System.out.println("Deprecated Version: " + annotation.version());
        System.out.println("Reason: " + annotation.reason());

        obj.newMethod(); // This will print the new method's message
    }
}