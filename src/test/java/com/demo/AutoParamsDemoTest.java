// Generates string, int, bool values

package com.demo;

import org.junit.jupiter.params.ParameterizedTest;

import autoparams.AutoSource;
import autoparams.Repeat;

class AutoParamsDemoTest {

    @ParameterizedTest(name = "[{index}] text={0}, number={1}, flag={2}")
    @AutoSource
    @Repeat(5)
    void demo_generated_values(String text,int number, boolean flag) {
        System.out.printf("AutoParams -> text=\"%s\", number=%d, flag=%s%n",
                text, number, flag);
    }
}
