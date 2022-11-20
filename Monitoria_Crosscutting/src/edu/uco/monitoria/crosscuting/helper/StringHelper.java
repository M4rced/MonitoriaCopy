package edu.uco.monitoria.crosscuting.helper;

import static edu.uco.monitoria.crosscuting.helper.ObjectHelper.getDefault;

public class StringHelper {
	public static final String EMPTY = "";

	private StringHelper() {
		super();
	}

	public static final String getDefaultString(String value, String defaultValue) {
		return getDefaultString(value, defaultValue);
	}

	public static final String getDefaultString(String value) {
		return getDefaultString(value, EMPTY);
	}

	public static final String applyTrim(String value) {
		return getDefaultString(value).trim();
	}

	public static boolean isEmpty(String value) {

		return EMPTY.equals((value));

	}
}
