// Génère des objets sans mentionner quels types de valeurs on veut

package com.demo;

import autoparams.AutoParams;
import org.junit.jupiter.api.Test;

class Test4 {

    @Test
    @AutoParams
    void injects_into_normal_test(Person person) {
        System.out.println("Generated with @AutoParams -> " + person);
    }
}
