package sk.uniba.fmph.dcs.game_board;

import java.util.ArrayList;
import java.util.OptionalInt;

import org.junit.jupiter.api.Test;
import sk.uniba.fmph.dcs.stone_age.Effect;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleBuildingTest {
    @Test
    public void test_calculation() {
        ArrayList<Effect> buildingResources = new ArrayList<Effect>();
        buildingResources.add(Effect.WOOD);

        SimpleBuilding building = new SimpleBuilding(buildingResources);

        assertEquals(building.build(buildingResources), OptionalInt.of(3));

        ArrayList<Effect> otherResources = new ArrayList<Effect>();
        otherResources.add(Effect.WOOD);
        otherResources.add(Effect.WOOD);
        assertEquals(building.build(otherResources), OptionalInt.empty());
    }
}
