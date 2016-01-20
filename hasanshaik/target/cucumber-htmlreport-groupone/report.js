$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("uk/co/dev/parentalcontrol/ParentalControl.feature");
formatter.feature({
  "line": 1,
  "name": "Prevent access to movies based on parental control level",
  "description": "As a customer \r\nI don’t want my account to be able to access movies that have a higher parental control level than my current preference setting.",
  "id": "prevent-access-to-movies-based-on-parental-control-level",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "1  Movie is on any acceptable Parental Control level",
  "description": "",
  "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "The Movie title is available for viewing",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer with \u003ccustomerPreferenceLevel\u003e request to watch the movie \u003cMovieName\u003e with rating \u003cRatingLevel\u003e gets a message \u003cIsSuitable\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;",
  "rows": [
    {
      "cells": [
        "customerPreferenceLevel",
        "MovieName",
        "RatingLevel",
        "IsSuitable"
      ],
      "line": 10,
      "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;1"
    },
    {
      "cells": [
        "\"PG\"",
        "\"Spectre\"",
        "\"U\"",
        "\"Enjoy the movie\""
      ],
      "line": 11,
      "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;2"
    },
    {
      "cells": [
        "\"PG\"",
        "\"Martian\"",
        "\"15\"",
        "\"Not suitable to watch\""
      ],
      "line": 12,
      "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;3"
    },
    {
      "cells": [
        "\"PG\"",
        "\"Martian\"",
        "\"PG\"",
        "\"Enjoy the movie\""
      ],
      "line": 13,
      "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;4"
    },
    {
      "cells": [
        "\"PG\"",
        "\"TitleNotFoundException\"",
        "\"15\"",
        "\"Title Not Found\""
      ],
      "line": 14,
      "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;5"
    },
    {
      "cells": [
        "\"PG\"",
        "\"TechnicalFailureException\"",
        "\"15\"",
        "\"Technical Failure\""
      ],
      "line": 15,
      "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "1  Movie is on any acceptable Parental Control level",
  "description": "",
  "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "The Movie title is available for viewing",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer with \"PG\" request to watch the movie \"Spectre\" with rating \"U\" gets a message \"Enjoy the movie\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ParentalControlSteps.the_Movie_title_is_available_for_viewing()"
});
formatter.result({
  "duration": 97537361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PG",
      "offset": 15
    },
    {
      "val": "Spectre",
      "offset": 47
    },
    {
      "val": "U",
      "offset": 69
    },
    {
      "val": "Enjoy the movie",
      "offset": 88
    }
  ],
  "location": "ParentalControlSteps.customer_with_request_to_watch_the_movie_with_rating_gets_a_message(String,String,String,String)"
});
formatter.result({
  "duration": 41201791,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "1  Movie is on any acceptable Parental Control level",
  "description": "",
  "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "The Movie title is available for viewing",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer with \"PG\" request to watch the movie \"Martian\" with rating \"15\" gets a message \"Not suitable to watch\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ParentalControlSteps.the_Movie_title_is_available_for_viewing()"
});
formatter.result({
  "duration": 71845,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PG",
      "offset": 15
    },
    {
      "val": "Martian",
      "offset": 47
    },
    {
      "val": "15",
      "offset": 69
    },
    {
      "val": "Not suitable to watch",
      "offset": 89
    }
  ],
  "location": "ParentalControlSteps.customer_with_request_to_watch_the_movie_with_rating_gets_a_message(String,String,String,String)"
});
formatter.result({
  "duration": 181752,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "1  Movie is on any acceptable Parental Control level",
  "description": "",
  "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "The Movie title is available for viewing",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer with \"PG\" request to watch the movie \"Martian\" with rating \"PG\" gets a message \"Enjoy the movie\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ParentalControlSteps.the_Movie_title_is_available_for_viewing()"
});
formatter.result({
  "duration": 92373,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PG",
      "offset": 15
    },
    {
      "val": "Martian",
      "offset": 47
    },
    {
      "val": "PG",
      "offset": 69
    },
    {
      "val": "Enjoy the movie",
      "offset": 89
    }
  ],
  "location": "ParentalControlSteps.customer_with_request_to_watch_the_movie_with_rating_gets_a_message(String,String,String,String)"
});
formatter.result({
  "duration": 167640,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "1  Movie is on any acceptable Parental Control level",
  "description": "",
  "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "The Movie title is available for viewing",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer with \"PG\" request to watch the movie \"TitleNotFoundException\" with rating \"15\" gets a message \"Title Not Found\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ParentalControlSteps.the_Movie_title_is_available_for_viewing()"
});
formatter.result({
  "duration": 110762,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PG",
      "offset": 15
    },
    {
      "val": "TitleNotFoundException",
      "offset": 47
    },
    {
      "val": "15",
      "offset": 84
    },
    {
      "val": "Title Not Found",
      "offset": 104
    }
  ],
  "location": "ParentalControlSteps.customer_with_request_to_watch_the_movie_with_rating_gets_a_message(String,String,String,String)"
});
formatter.result({
  "duration": 281823,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "1  Movie is on any acceptable Parental Control level",
  "description": "",
  "id": "prevent-access-to-movies-based-on-parental-control-level;1--movie-is-on-any-acceptable-parental-control-level;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "The Movie title is available for viewing",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer with \"PG\" request to watch the movie \"TechnicalFailureException\" with rating \"15\" gets a message \"Technical Failure\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ParentalControlSteps.the_Movie_title_is_available_for_viewing()"
});
formatter.result({
  "duration": 109907,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PG",
      "offset": 15
    },
    {
      "val": "TechnicalFailureException",
      "offset": 47
    },
    {
      "val": "15",
      "offset": 87
    },
    {
      "val": "Technical Failure",
      "offset": 107
    }
  ],
  "location": "ParentalControlSteps.customer_with_request_to_watch_the_movie_with_rating_gets_a_message(String,String,String,String)"
});
formatter.result({
  "duration": 278402,
  "status": "passed"
});
});