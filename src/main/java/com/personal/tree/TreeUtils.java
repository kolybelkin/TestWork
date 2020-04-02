package com.personal.tree;

public class TreeUtils {
  private TreeUtils() {}

  public static int calculateTreeHeightRecursively(final Node node) {
    if (node == null) {
      return 0;
    } else {
      return node.getHeight()
              + calculateTreeHeightRecursively(node.getLeftChild())
              + calculateTreeHeightRecursively(node.getRightChild());
    }
  }
}
