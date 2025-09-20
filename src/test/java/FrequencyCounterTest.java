
import com.kamal.ds.FrequencyCounter;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {
    @Test void counts() {
        var res = FrequencyCounter.count(new int[]{1,2,2,3,3,3,4});
        assertEquals(Map.of(1,1,2,2,3,3,4,1), res);
    }
}

