package snippets.dijkrosoft.nl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.not;

import java.util.HashMap;
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
}
