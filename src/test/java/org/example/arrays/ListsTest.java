package org.example.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ListsTest {

    @Test
    void createAListContaining3Numbers() {
        Lists lists = new Lists();

        var list = lists.createListWith3Numbers();

        assertThat(list).contains(1,2,3).hasSize(3);
    }

    @Test
    void shouldContainOnlyPositiveNumbers() {
        Lists lists = new Lists();

        var list = lists.removeNegativeNumbers(List.of(-1,1,0));

        assertFalse(list.contains(-1));

        assertThat(list).doesNotContain(-1);

        assertThatExceptionOfType(NullPointerException.class).isThrownBy(()->lists.removeNegativeNumbers(null));
    }
}
