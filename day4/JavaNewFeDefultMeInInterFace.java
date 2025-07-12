package com.dyashincollectionfm.list;


public interface JavaNewFeDefultMeInInterFace {
    void doStaff();
    void doStaff1();
    void doStaff2();

    // ✅ Java 8 Default Methods
    default void eat() {
        System.out.println("Eating...");
    }

    default void eat2() {
        System.out.println("Eating again...");
    }

    // ✅ Java 8 Static Method (optional example)
    static void drink() {
        System.out.println("Drinking...");
    }
}

