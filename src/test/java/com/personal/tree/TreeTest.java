package com.personal.tree;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

  @Test
  public void treeShouldCalculateHeightOfItsChildren() {
    final Node rootNode = new Node(0)
            .setLeftChild(new Node(1)
              .setLeftChild(new Node(2)
                .setLeftChild(new Node(4))
                .setRightChild(new Node(8))
              )
              .setRightChild(new Node(2)
                .setLeftChild(new Node(3))
              )
            )
            .setRightChild(new Node(5)
              .setLeftChild(new Node(10)
                .setLeftChild(new Node(5))
              )
              .setRightChild(new Node(1))
            );
    final Tree underTest = new Tree(rootNode);
    Assert.assertEquals(41 ,underTest.getTreeHeight());
  }

}