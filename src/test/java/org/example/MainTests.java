package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTests {

    @Test
    @DisplayName("a > b")
    public void compare() {
        int a = 3;
        int b = 2;

        int result = Main.compare(a, b);
        assertThat(result, equalTo(1));
    }

    @Test
    @DisplayName("a < b")
    public void compareLess() {
        int a = 2;
        int b = 3;

        int result = Main.compare(a, b);
        assertThat(result, equalTo(-1));
    }

    @Test
    @DisplayName("a = b")
    public void compareEquals() {
        int a = 2;
        int b = 2;

        int result = Main.compare(a, b);
        assertThat(result, equalTo(0));
    }
}
