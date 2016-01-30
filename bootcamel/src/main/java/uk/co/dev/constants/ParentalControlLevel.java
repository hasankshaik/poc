package uk.co.dev.constants;

import java.util.Arrays;

public enum ParentalControlLevel {
	U(1, "U"), PG(2, "PG"), FOR12(3, "12"), FOR15(4, "15"), FOR18(5, "18");

	private int level;
	private String rating;

	private ParentalControlLevel(int level, String value) {
		this.level = level;
		this.rating = value;
	}

	public String getRating() {
		return rating;
	}

	public int getlevel() {
		return level;
	}

	public static ParentalControlLevel getParentalControlLevel(String customerPrefRating) {
		return Arrays.stream(ParentalControlLevel.values()).filter((s) -> s.rating.equals(customerPrefRating)).findFirst().get();

	}

	public boolean isSuitableToWatch(ParentalControlLevel custRefControlLevel) {
		return custRefControlLevel.level <= this.level;
	}
}
