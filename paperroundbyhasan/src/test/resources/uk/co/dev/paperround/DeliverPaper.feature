Feature:  A paper boy or girl delivers newspapers to all the houses in a given street. They are experimenting with two approaches to delivering papers:
  (1) In one approach they first travel from west to east delivering to the houses on the left hand (north) side of the street. They then travel east to
  west delivering to houses on the south side of the street.
  (2) In the second approach they deliver to each house in turn from west to east, regardless of which side of the road they are on.

  As a newspaper boy or girl given a street, I want to know for both approaches (1) and (2):

  AC5. the list of house numbers in the order that I will be delivering to, so that I can sort by satchel in advance
  AC6. how many times I will have to cross the road from one side to the other to make my deliveries

  Scenario: 1 Delivering papers by linear approach
    Given  a street
    When the boy is delivering papers from west to east delivering to the houses on the left hand (north) side of the street and then east to west
    Then list the house numbers in the order that I will be delivering to
    And how many times I will have to cross the road from one side to the other to make my deliveries

  Scenario: 2 Delivering papers by zigzag approach

    Given  a street
    When the boy is delivering papers to each house in turn from west to east, regardless of which side of the road they are on.
    Then list the house numbers in the order that I will be delivering zigzag
    And how many times I will have to cross the road from one side to the other to make my deliveries zigzag