// Quick way to show how to combine fixed values + generated values.

package com.demo;

import autoparams.ValueAutoSource;
import org.junit.jupiter.params.ParameterizedTest;

class ValueAutoSourceDemoTest {

    @ParameterizedTest
    @ValueAutoSource(ints = {18, 30, 65})
    void mixes_fixed_and_auto(int age, String name) {
        System.out.printf("Fixed age=%d, Random name=%s%n", age, name);
    }
}
