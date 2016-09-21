package com.jenkins.plugins.sparknotify;

public enum SparkMessageType {
	TEXT("text"),
	MARKUP("markup"),
	HTML("html");

	private final String text;

	SparkMessageType(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
};