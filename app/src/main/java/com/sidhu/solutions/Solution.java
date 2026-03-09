package com.sidhu.solutions;

public interface Solution {
    default boolean test(TestExecutor testExecutor) {
        return testExecutor.execute();
    }
}
