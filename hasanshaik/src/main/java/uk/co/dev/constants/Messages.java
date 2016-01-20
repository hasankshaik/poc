package uk.co.dev.constants;

public enum Messages {
	ENJOY_THE_MOVIE("Enjoy the movie"), TITLE_NOT_FOUND("Title Not Found"), TECHNICAL_FAILURE("Technical Failure"), NOT_SUITABLE(
			"Not suitable to watch");
	private String description;

	private Messages(String value) {
		this.description = value;
	}

	public String getDescription() {
		return description;
	}
}
