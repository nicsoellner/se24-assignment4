package de.unibayreuth.se.teaching.list.business.impl;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class InsertIntoListStepDefs {
    private DoublyLinkedList list;


    @Before
    public void initialization() {
        list = new DoublyLinkedList();
    }

    @Then("it should be sorted")
    public void it_should_be_sorted() {
        double[] array = list.asArray();
        for(int i = 0; i < list.getLength() - 1; i++) {
            Assertions.assertTrue(array[i] <= array[i + 1]);
        }

    }
}
