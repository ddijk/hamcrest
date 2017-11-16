package snippets.dijkrosoft.nl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class HamcrestTest {

    @Test
    public void testMap() {

        Map<String, Integer> persons = new HashMap<>();
        persons.put("Jens", Integer.valueOf(12));
        persons.put("Lieve", Integer.valueOf(9));

        assertThat(persons, hasKey("Jens") );
        assertThat(persons, not(hasKey("Dick")) );

    }

    @Test
    public void testList() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, hasSize(3));

        // ensure the order is correct
        assertThat(list, contains(5, 2, 4));

        assertThat(list, containsInAnyOrder(2, 4, 5));

        assertThat(list, everyItem(greaterThan(1)));

    }
}
