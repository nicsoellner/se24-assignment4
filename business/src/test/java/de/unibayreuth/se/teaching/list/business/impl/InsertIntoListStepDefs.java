package de.unibayreuth.se.teaching.list.business.impl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsertIntoListStepDefs {
    private DoublyLinkedList list;
    private double value;


    @When("I choose to insert an element with value {double}")
    public void i_choose_to_insert_an_element_with_value(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the list should contain {int} element")
    public void the_list_should_contain_element(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the list should contain that element")
    public void the_list_should_contain_that_element() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    /**
    @Before
    public void initialization() {
        this.list = new DoublyLinkedList();
    }

    @Given("an empty list")
    public void an_empty_list() {
        Assertions.assertTrue(this.list.isEmpty());
    }

    @When("I choose to insert an element with value {double}")
    public void iChooseToInsertAnElementWithValue(double arg0) {
            list.append(new Value(arg0));
    }

    @Then("the list should contain {int} element")
    public void theListShouldContainElement(int arg0) {
        Assertions.assertEquals(1, this.list.size());

    }

    @And("the list should contain that element")
    public void theListShouldContainThatElement() {
        Assertions.assertTrue(this.list.contains(value)));
    }

    @io.cucumber.java.en.When("I append an element with value {double}")
    public void iAppendAnElementWithValue(int arg0, int arg1) {
    }

    @io.cucumber.java.en.Then("the list should contain {int} elements and it should be sorted")
    public void theListShouldContainElementsAndItShouldBeSorted(int arg0) {
    }

    @io.cucumber.java.en.And("the list should contain the elements in the following order:")
    public void theListShouldContainTheElementsInTheFollowingOrder() {
    }

    @io.cucumber.java.en.Given("a list with the following elements:")
    public void aListWithTheFollowingElements() {
    }

    @io.cucumber.java.en.When("I insert an element with value {double}")
    public void iInsertAnElementWithValue(int arg0, int arg1) {
    }
    **/
}
