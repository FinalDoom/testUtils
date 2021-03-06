/**
 * Copyright (C) 2011 Franck Valentin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.outsideMyBox.testUtils;

import java.util.List;

/**
 * Bean with invalid accessor that doesn't return a value set.
 */
public final class BeanWithInvalidAccessor4 {
	private String       aString;
	private String       aStringWithValue = "aValue";
	private List<String> aListOfString;
	private int          anInt;
	private Integer      anInteger;
	private boolean      aBooleanPrimitive;
	private Boolean      aBoolean;

	public String getAString() {
		return aString;
	}

	public void setAString(String string) {
		aString = string;
	}

	public String getAStringWithValue() {
		return aStringWithValue;
	}

	public void setAStringWithValue(String stringWithValue) {
		aStringWithValue = stringWithValue;
	}

	public List<String> getAListOfString() {
		return aListOfString;
	}

	public void setAListOfString(List<String> listOfString) {
		aListOfString = listOfString;
	}

	public int getAnInt() {
		return anInt - 1; // Should return the value set!
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

}
