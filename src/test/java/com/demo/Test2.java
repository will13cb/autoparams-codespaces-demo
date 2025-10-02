// Génère des objets

package com.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;

import autoparams.AutoSource;

class Test2 {

    @ParameterizedTest(name = "[{index}] Generated person: {0}")
    @AutoSource
    void auto_generates_person(Person person) {
        System.out.println("Generated -> " + person);
    }
}
