package software.ulpgc.kata7;

import java.util.List;
import java.util.Map;

public interface ApplicationStatistics {
    Map<String, Integer> calculate(List<Application> applications);
}
