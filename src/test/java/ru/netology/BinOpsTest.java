package ru.netology;

import org.junit.jupiter.api.Assertions;

class BinOpsTest {
BinOps binOps = new BinOps();
    @org.junit.jupiter.api.Test
    void sum() {
        String result = binOps.sum("10", "101");
        Assertions.assertEquals(result, "111");
    }

    @org.junit.jupiter.api.Test
    void mult() {
        String result = binOps.mult( "10", "101");
        Assertions.assertEquals(result, "1010");
    }
}