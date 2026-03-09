package com.sidhu.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AddListNodeTwoNumberTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({"342, 465, 807", "0, 0, 0", "9999999, 9999, 10009998"})
    public void test(int n1, int n2, int n3) {
        solution = new AddListNodeTwoNumber();
        boolean result = solution.test(() -> {
            System.out.print("l1: ");
            ListNode l1 = ((AddListNodeTwoNumber)solution).listNodeFromNumber(n1);
            System.out.print("l2: ");
            ListNode l2 = ((AddListNodeTwoNumber)solution).listNodeFromNumber(n2);
            ListNode output = ((AddListNodeTwoNumber)solution).addTwoNumbers(l1, l2);
            System.out.print("Expected result: ");
            ListNode expected = ((AddListNodeTwoNumber)solution).listNodeFromNumber(n3);
            return expected.isEqual(output);
        });
        assertTrue(result);
    }
    
}
