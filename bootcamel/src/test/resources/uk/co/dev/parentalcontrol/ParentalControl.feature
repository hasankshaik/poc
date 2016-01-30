Feature: Prevent access to movies based on parental control level
  As a customer 
  I don’t want my account to be able to access movies that have a higher parental control level than my current preference setting.

  Scenario Outline: 1  Movie is on any acceptable Parental Control level
    Given The Movie title is available for viewing
    Then customer with <customerPreferenceLevel> request to watch the movie <MovieName> with rating <RatingLevel> gets a message <IsSuitable>

    Examples: 
      | customerPreferenceLevel | MovieName                   | RatingLevel | IsSuitable              |
      | "PG"                    | "Spectre"                   | "U"         | "Enjoy the movie"       |
      | "PG"                    | "Martian"                   | "15"        | "Not suitable to watch" |
      | "PG"                    | "Martian"                   | "PG"        | "Enjoy the movie"       |
      | "PG"                    | "TitleNotFoundException"    | "15"        | "Title Not Found"       |
      | "PG"                    | "TechnicalFailureException" | "15"        | "Technical Failure"     |
