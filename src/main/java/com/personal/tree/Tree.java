package com.personal.tree;

import java.util.Objects;

public class Tree {
  private final Node rootNode;

  public Tree(final Node rootNode) {
    Objects.requireNonNull(rootNode, "root node cannot be null.");
    this.rootNode = rootNode;
  }

  public Node getRootNode() {
    return rootNode;
  }

  /**
   * @return recursively calculated height of tree. May case StackOverflowError with big number of nodes.
   */
  public int getTreeHeight() {
    return TreeUtils.calculateTreeHeightRecursively(rootNode);
  }
}
