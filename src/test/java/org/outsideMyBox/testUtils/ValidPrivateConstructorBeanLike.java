package org.outsideMyBox.testUtils;

import java.util.List;

public class ValidPrivateConstructorBeanLike {
	private final String       aString;                                    // Can only be set by a constructor.
	private final List<String> aListOfString;                              // Can only be set by a constructor.
	private int                anInt;                                      // Can be set by either a constructor or a setter.
	private Integer            anInteger;                                  // Can be set by either a constructor or a setter.
	private boolean            aBooleanPrimitive;                          // Can only be set by a setter.
	private Boolean            aBoolean;                                   // Can only be set by a setter.
	private final Integer      aReadOnlyProperty       = Integer.MAX_VALUE; // get only.
	private final Integer      anotherReadOnlyProperty = null;             // get only.

	public ValidPrivateConstructorBeanLike(String aString, List<String> aListOfString) {
		this.aString = aString;
		this.aListOfString = aListOfString;
	}

	// Change the order of the arguments.
	public ValidPrivateConstructorBeanLike(List<String> aListOfString, String aString) {
		this.aString = aString;
		this.aListOfString = aListOfString;
	}

	public ValidPrivateConstructorBeanLike(String aString, List<String> aListOfString, int anInt, Integer anInteger) {
		this.aString = aString;
		this.aListOfString = aListOfString;
		this.anInt = anInt;
		this.anInteger = anInteger;
	}

	// package private constructor
	ValidPrivateConstructorBeanLike(String aString, List<String> aListOfString, int anInt) {
		this.aString = aString;
		this.aListOfString = aListOfString;
		this.anInt = anInt;
	}

	public String getAString() {
		return aString;
	}

	public List<String> getAListOfString() {
		return aListOfString;
	}

	public int getAnInt() {
		return anInt;
	}

	public void setAnInt(int anInt) {
		this.anInt = anInt;
	}

	public Integer getAnInteger() {
		return anInteger;
	}

	public void setAnInteger(Integer anInteger) {
		this.anInteger = anInteger;
	}

	public boolean isABooleanPrimitive() {
		return aBooleanPrimitive;
	}

	public void setABooleanPrimitive(boolean booleanPrimitive) {
		aBooleanPrimitive = booleanPrimitive;
	}

	public Boolean isABoolean() {
		return aBoolean;
	}

	public void setABoolean(Boolean boolean1) {
		aBoolean = boolean1;
	}

	public Integer getAReadOnlyProperty() {
		return aReadOnlyProperty;
	}

	public Integer getAnotherReadOnlyProperty() {
		return anotherReadOnlyProperty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aBoolean == null) ? 0 : aBoolean.hashCode());
		result = prime * result + (aBooleanPrimitive ? 1231 : 1237);
		result = prime * result + ((aListOfString == null) ? 0 : aListOfString.hashCode());
		result = prime * result + ((aString == null) ? 0 : aString.hashCode());
		result = prime * result + anInt;
		result = prime * result + ((anInteger == null) ? 0 : anInteger.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ValidBeanLike)) {
			return false;
		}
		final ValidPrivateConstructorBeanLike other = (ValidPrivateConstructorBeanLike) obj;
		if (aBoolean == null) {
			if (other.aBoolean != null) {
				return false;
			}
		}
		else if (!aBoolean.equals(other.aBoolean)) {
			return false;
		}
		if (aBooleanPrimitive != other.aBooleanPrimitive) {
			return false;
		}
		if (aListOfString == null) {
			if (other.aListOfString != null) {
				return false;
			}
		}
		else if (!aListOfString.equals(other.aListOfString)) {
			return false;
		}
		if (aString == null) {
			if (other.aString != null) {
				return false;
			}
		}
		else if (!aString.equals(other.aString)) {
			return false;
		}
		if (anInt != other.anInt) {
			return false;
		}
		if (anInteger == null) {
			if (other.anInteger != null) {
				return false;
			}
		}
		else if (!anInteger.equals(other.anInteger)) {
			return false;
		}
		return true;
	}
}
