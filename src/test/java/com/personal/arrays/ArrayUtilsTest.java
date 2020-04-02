package com.personal.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsTest {

  //removeThreeRepeatedSequentiallyNumbers testing

  @Test
  public void shouldRemoveThreeSequentiallyRepeatedNumbersFromArrayAtTheBeginning() {
    testRemovingThreeRepeatedSequentiallyNumbers(List.of(2, 3, 4), List.of(1, 1, 1, 2, 3, 4));
  }

  @Test
  public void shouldRemoveThreeSequentiallyRepeatedNumbersFromArrayAtTheEnd() {
    testRemovingThreeRepeatedSequentiallyNumbers(List.of(1, 2, 3), List.of(1, 2, 3, 4, 4, 4));
  }

  @Test
  public void shouldNotRemoveAnythingFromArrayIfThereAreNoRepeatedNumbers() {
    testRemovingThreeRepeatedSequentiallyNumbers(List.of(1, 2, 3, 4), List.of(1, 2, 3, 4));
  }

  @Test
  public void shouldNotRemoveAnythingFromArrayIfThereAreNoEnoughRepeatedNumbers() {
    testRemovingThreeRepeatedSequentiallyNumbers(List.of(1, 2, 3, 3, 4), List.of(1, 2, 3, 3, 4));
  }

  @Test
  public void removeThreeRepeatedSequentiallyNumbersShouldNotDoAnythingWithArrayIfItsEmpty() {
    testRemovingThreeRepeatedSequentiallyNumbers(List.of(), List.of());
  }

  @Test
  public void removeThreeRepeatedSequentiallyNumbersShouldNotFailIfItsNull() {
    ArrayUtils.removeThreeRepeatedSequentiallyNumbers(null);
  }

  @Test
  public void shouldClearArrayIfThereAreOnlySequentiallyRepeatedNumbers() {
    testRemovingThreeRepeatedSequentiallyNumbers(List.of(), List.of(1, 1, 1, 1, 1));
  }

  private void testRemovingThreeRepeatedSequentiallyNumbers(final List<Integer> expected, final List<Integer> underTest) {
    final List<Integer> mutableUnderTest = new ArrayList<>(underTest);
    ArrayUtils.removeThreeRepeatedSequentiallyNumbers(mutableUnderTest);
    assertEquals(expected, mutableUnderTest);
  }

  //removeThreeRepeatedNumbers testing

  @Test
  public void removingThreeRepeatedNumbersShouldNotFailIfItsNull() {
    ArrayUtils.removeThreeRepeatedNumbers(null);
  }

  @Test
  public void shouldRemoveThreeRepeatedNumbersFromArray() {
    testRemovingThreeRepeatedNumbers(List.of(2, 3), List.of(1, 2, 1, 3, 1));
  }

  @Test
  public void removeThreeRepeatedNumbersShouldNotDoAnythingWithArrayIfItsEmpty() {
    testRemovingThreeRepeatedNumbers(List.of(), List.of());
  }

  @Test
  public void shouldClearArrayIfThereAreOnlyRepeatedNumbers() {
    testRemovingThreeRepeatedNumbers(List.of(), List.of(1, 1, 1, 1, 1));
  }

  private void testRemovingThreeRepeatedNumbers(final List<Integer> expected, final List<Integer> underTest) {
    final List<Integer> mutableUnderTest = new ArrayList<>(underTest);
    ArrayUtils.removeThreeRepeatedNumbers(mutableUnderTest);
    assertEquals(expected, mutableUnderTest);
  }
}