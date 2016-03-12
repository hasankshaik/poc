package uk.co.dev.response;

import uk.co.dev.constants.Messages;

public class ResponceObj {

	private boolean canWatch;
	private Messages message;

	public boolean isCanWatch() {
		return canWatch;
	}

	public void setCanWatch(boolean canWatch) {
		this.canWatch = canWatch;
	}

	public Messages getMessage() {
		return message;
	}

	public void setMessage(Messages message) {
		this.message = message;
	}

}
