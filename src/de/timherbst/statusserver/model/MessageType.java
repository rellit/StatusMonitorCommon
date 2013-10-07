package de.timherbst.statusserver.model;

public enum MessageType {
	ERROR, WARN, ACTION, OK, INFO;

	public String getHTMLClass() {
		switch (this) {
		case INFO:
			return "info";
		case OK:
			return "ok";
		case ACTION:
			return "action";
		case WARN:
			return "warn";
		case ERROR:
			return "error";
		}
		return "";
	}
}
