package ru.vsu.cs.okhryamkin.test;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import ru.vsu.cs.okhryamkin.MergeSort;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortTest {
    @Test
    public void test() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertTrue(Arrays.equals(expected, actual));
    }
}
