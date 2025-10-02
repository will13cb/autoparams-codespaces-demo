// AutoParams looks at the parameter types in my test,
// uses built-in generators for primitives and strings,
// and recursively fills objects via their constructors

package com.demo;

import autoparams.AutoParams;
import org.junit.jupiter.api.Test;

class AutoParamsDemo {

    @Test
    @AutoParams
    void injects_into_normal_test(Person person) {
        System.out.println("Generated with @AutoParams -> " + person);
    }
}
