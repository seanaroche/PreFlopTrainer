package App; 

import java.util.Map;
import java.util.HashMap;
public class Charts {
    private Map<String, String> Chart = new HashMap<String, String>();
    public void createLooseChart() {
        Chart.put("AA", "raise");
        Chart.put("AKs", "raise");
        Chart.put("AQs", "raise");
        Chart.put("AJs", "raise");
        Chart.put("ATs", "raise");
        Chart.put("AKo", "raise");
        Chart.put("AQo", "raise");
        Chart.put("AJo", "raise");
        Chart.put("KK", "raise");
        Chart.put("KQo", "raise");
        Chart.put("KQs", "raise");
        Chart.put("KJs", "raise");
        Chart.put("QQ", "raise");
        Chart.put("JJ", "raise");
        Chart.put("TT", "raise");
        Chart.put("99", "raise");
        Chart.put("KTs", "call");
        Chart.put("QJs", "call");
        Chart.put("QTs", "call");
        Chart.put("Q9s", "call");
        Chart.put("JTs", "call");
        Chart.put("J9s", "call");
        Chart.put("J8s", "call");
        Chart.put("T9s", "call");
        Chart.put("T8s", "call");
        Chart.put("T7s", "call");
        Chart.put("98s", "call");
        Chart.put("97s", "call");
        Chart.put("88", "call");
        Chart.put("87s", "call");
        Chart.put("86s", "call");
        Chart.put("77", "call");
        Chart.put("76s", "call");
        Chart.put("75s", "call");
        Chart.put("66", "call");
        Chart.put("65s", "call");
        Chart.put("64s", "call");
        Chart.put("55", "call");
        Chart.put("54s", "call");
        Chart.put("53s", "call");
        Chart.put("44", "call");
        Chart.put("43s", "call");
        Chart.put("33", "call");
        Chart.put("22", "call");
        Chart.put("A9s", "call");
        Chart.put("A8s", "call");
        Chart.put("A7s", "call");
        Chart.put("A6s", "call");
        Chart.put("A5s", "call");
        Chart.put("A4s", "call");
        Chart.put("A3s", "call");
        Chart.put("A2s", "call");
    }
    public void createTightChart() {
        Chart.put("AA", "raise");
        Chart.put("AKs", "raise");
        Chart.put("AQs", "raise");
        Chart.put("AJs", "raise");
        Chart.put("ATs", "raise");
        Chart.put("AKo", "raise");
        Chart.put("AQo", "raise");
        Chart.put("AJo", "raise");
        Chart.put("KK", "raise");
        Chart.put("KQo", "raise");
        Chart.put("KQs", "raise");
        Chart.put("KJs", "raise");
        Chart.put("QQ", "raise");
        Chart.put("JJ", "raise");
        Chart.put("TT", "raise");
        Chart.put("99", "raise");
        Chart.put("QJs", "call");
        Chart.put("JTs", "call");
        Chart.put("T9s", "call");
        Chart.put("98s", "call");
        Chart.put("88", "call");
        Chart.put("87s", "call");
        Chart.put("77", "call");
        Chart.put("76s", "call");
        Chart.put("66", "call");
        Chart.put("65s", "call");
        Chart.put("55", "call");
        Chart.put("44", "call");
        Chart.put("33", "call");
        Chart.put("22", "call");
        Chart.put("A9s", "call");
        Chart.put("A8s", "call");
        Chart.put("A7s", "call");
        Chart.put("A6s", "call");
        Chart.put("A5s", "call");
        Chart.put("A4s", "call");
        Chart.put("A3s", "call");
        Chart.put("A2s", "call");
    }
    public Map<String, String> getChart() {
        return Chart;
    }
}