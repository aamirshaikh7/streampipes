/*
 * Copyright 2018 FZI Forschungszentrum Informatik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.streampipes.model.client.ontology;

public class QuantitativeValueRange extends Range {

	private static final String TITLE = "";
	private static final String DESCRIPTION = "";
	
	private int minValue;
	private int maxValue;
	
	private String unitCode;
	
	public QuantitativeValueRange(int minValue, int maxValue, String unitCode) {
		this();
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.unitCode = unitCode;
	}

	public QuantitativeValueRange() {
		super(RangeType.QUANTITATIVE_VALUE, TITLE, DESCRIPTION);
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	
	
}
