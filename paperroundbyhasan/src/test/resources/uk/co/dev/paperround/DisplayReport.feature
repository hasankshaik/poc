Feature:  A town planner is responsible for keeping track of the layout of a street and numbering houses. The layout is stored in a street specification file.
  An example is given in street1.txt

  The street specification file can be interpreted as follows:
  - The street specification file lists all the house numbers in the street from west to east.
  - House numbering starts from 1
  - All the houses on the left-hand (north) side of the street are odd numbered
  - All the houses on the right-hand (south) side of the street are even numbered
  - For example, a street specification file containing "1 3 2" can be interpreted as there being, from west to east:
  - house #1 on the left-hand (north) side of the street,
  - followed by house #3, also on the left-hand (north) side of the street,
  - followed by house #2 on the right-hand (south) side of the street.
  - (Note: in the real world houses on a street are frequently directly opposite each other. For this purposes of this exercise,
  this is assumed never to be the case!)
  - On each side of the street no number can be skipped and no number can be used more than once

  As a town planner, given a street specification file, I want to display a report showing:

  AC1. that the file is valid.
  AC2. how many houses there are in a given street
  AC3. how many houses are on the left hand (north) side of the street
  AC4. how many houses are on the right hand (south) side of the street

  Scenario: 1 Display a report
    Given a street specification file
    When a report is generated
    Then report should show  the file is valid
    And report should show number of houses in a given street
    And number of houses are on the left hand (north) side of the street
    And number of houses are on the right hand (south) side of the street

