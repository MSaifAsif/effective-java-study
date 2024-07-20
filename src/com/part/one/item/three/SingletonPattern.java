package com.part.one.item.three;

import java.io.ObjectStreamException;
import java.util.Objects;

public class SingletonPattern {

    public static void main(String[] args) {
        SingletonItemA singletonItemA = SingletonItemA.INSTANCE;
        SingletonItemB singletonItemB = SingletonItemB.getInstance();
        SingletonItemC singletonItemC = SingletonItemC.INSTANCE;
    }
}

/**
 * Method 1 : The Reflection method. Also eager creation. the static block is loaded as
 * as soon as the classloader loads the class the first time it is requested
 * <ul>
 *     <li>private constructor</li>
 *     <li>Instance pre-initialized as static final</li>
 * </ul>
 */
class SingletonItemA {
    static final SingletonItemA INSTANCE = new SingletonItemA();

    // OR we can rely on static block

    /*
     static {
         INSTANCE = new SingletonItemA();
     }
    */

    private SingletonItemA() {
    }
}


/**
 * Method 2 : The Lazy Init method. Only create the instance when requested
 * <ul>
 *     <li>private constructor</li>
 *     <li>Instance pre-initialized as static final</li>
 *     <li>getInstance() returns the same instance</li>
 * </ul>
 */
class SingletonItemB {
    private static SingletonItemB INSTANCE;

    private SingletonItemB() {
    }

    static SingletonItemB getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new SingletonItemB();
        }
        return INSTANCE;
    }

    // to prevent recreation via serialization / deserialization
    // with readResolve() we let the garbage collector take care of any
    // other instances that may have been created
    // We therefore use readResolve() to ensure that the deserialized object is the same as the existing instance
    // for a singleton instance.
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}

/**
 * Method 3 : Using Enums
 * <ul>
 *     <li>combines simplicity, readability, and clarity</li>
 *     <li>Initialization guarantees and provides instance control and thread safety.</li>
 * </ul>
 */
enum SingletonItemC {
    INSTANCE;
}