package com.vaadin.tests.testbenchapi.components.combobox;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.elements.ComboBoxElement;
import com.vaadin.tests.testbenchapi.MultiBrowserTest;

public class ComboBoxGetSuggestionsIT extends MultiBrowserTest {
    @Test
    public void testSuggestions() {
        openTestURL();
        ComboBoxElement cb = $(ComboBoxElement.class).get(0);
        List<String> suggestions = cb.getPopupSuggestions();
        List<String> expectedSuggestions = new ArrayList<String>();
        for (int i = 1; i < 11; i++) {
            expectedSuggestions.add("item" + i);
        }
        Assert.assertEquals(expectedSuggestions, suggestions);
    }
}
