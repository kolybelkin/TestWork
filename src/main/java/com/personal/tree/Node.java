package com.personal.tree;

public class Node {
  private int height;
  private Node leftChild;
  private Node rightChild;

  public Node(final int height) {
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

  public Node setLeftChild(final Node leftChild) {
    this.leftChild = leftChild;
    return this;
  }

  public Node setRightChild(final Node rightChild) {
    this.rightChild = rightChild;
    return this;
  }
}
