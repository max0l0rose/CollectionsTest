package com.company;

import lombok.Getter;
import lombok.Setter;

enum E {
    A(10), B(20), C(30), D(40);

    @Getter
    @Setter
    private int val1;

    E(int v) { // public, protected - ERROR ))))))))))))
        val1 = v;
    }
}
