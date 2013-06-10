package org.briansimulator.briandroid.Simulations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * TODO: Replace all uses of this class before publishing your app.
 */
public class SimulationContent {

    public static List<SimItem> SIMS = new ArrayList<SimItem>();
    public static Map<String, SimItem> SIMS_MAP = new HashMap<String, SimItem>();

    static {
        // Add 3 sample items.
        addItem(new SimItem("COBA", "COBA simulation"));
        addItem(new SimItem("CUBA", "CUBA simulation"));
    }

    private static void addItem(SimItem item) {
        SIMS.add(item);
        SIMS_MAP.put(item.id, item);
    }

    public static class SimItem {
        public String id;
        public String description;
        public COBA simulation; // FIXME: COBA should be a subclass of some sort of simulation abstract class

        public SimItem(String id, String description) {
            this.id = id;
            this.description = description;
            this.simulation = new COBA();
        }

        @Override
        public String toString() {
            return this.description;
        }

        public void run() {
            this.simulation.run();
        }
    }
}
