package com.personal.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayUtils {
  private ArrayUtils() {}

  public static void removeThreeRepeatedSequentiallyNumbers(final List<Integer> numbers) {
    removeSequentiallyRepeatedNumbers(3, numbers);
  }

  /**
   * Removes sequentially repeated numbers from specified array.
   * @param repeatedCount - number of times for a number which should be removed.
   * @param numbers - array of numbers.
   */
  public static void removeSequentiallyRepeatedNumbers(final int repeatedCount, final List<Integer> numbers) {
    if (numbers == null || repeatedCount <= 0 ||  numbers.size() < repeatedCount) {
      return;
    }

    final Set<Integer> numbersToRemove = new HashSet<>();
    int repeatTimes = 1;
    for (int i = 1; i < numbers.size(); i++) {
      Integer nextNumber = numbers.get(i);
      if (numbers.get(i-1).equals(nextNumber)) {
        repeatTimes++;
      } else {
        repeatTimes = 1;
      }
      if (repeatTimes == repeatedCount) {
        numbersToRemove.add(nextNumber);
      }
    }
    removeAllOccurrencesOfNumbers(numbersToRemove, numbers);
  }

  public static void removeThreeRepeatedNumbers(final List<Integer> numbers) {
    removeRepeatedNumbers(3, numbers);
  }

  /**
   * Removes repeated numbers from specified array.
   * @param repeatedCount - number of times for a number which should be removed.
   * @param numbers - array of numbers.
   */
  public static void removeRepeatedNumbers(final int repeatedCount, final List<Integer> numbers) {
    if (numbers == null || repeatedCount <= 0 || numbers.size() < repeatedCount) {
      return;
    }

    final Map<Integer, Integer> numberAndRepeatedCount = new HashMap<>();
    numbers.forEach(nextNumber -> numberAndRepeatedCount.merge(nextNumber, 1, Integer::sum));

    final Set<Integer> numbersToRemove = numberAndRepeatedCount.entrySet().stream()
            .filter(entry -> entry.getValue() >= repeatedCount)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
    removeAllOccurrencesOfNumbers(numbersToRemove, numbers);
  }

  public static void removeAllOccurrencesOfNumbers(final Set<Integer> numbersToRemove, final List<Integer> numbersArray) {
    numbersArray.removeIf(numbersToRemove::contains);
  }
}
