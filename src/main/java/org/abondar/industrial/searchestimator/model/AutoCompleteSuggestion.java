package org.abondar.industrial.searchestimator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * POJO class for reading suggestion of autocomplete API
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoCompleteSuggestion {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AutoCompleteSuggestion{" +
                "value='" + value + '\'' +
                '}';
    }
}
