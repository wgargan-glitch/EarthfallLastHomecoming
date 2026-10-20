package com.wgargan.earthfall.data

import com.wgargan.earthfall.models.*

// Expandable: Add more Level objects here or load from JSON later
val allLevels: List<Level> = listOf(
    Level(1, "The Ruined Homestead", "homestead_start", listOf(
        Scene("homestead_start", "You crest the rise. The house is gone. Just a concrete pad and a chimney standing like a middle finger. There ain’t no home here. Just a fight to live another day.", listOf(
            Choice("Search the ruins", "house_search") { it.copy(supplies = it.supplies + 15, health = it.health - 5) },
            Choice("Head to the highway", "highway") { it.copy(day = it.day + 1, hunger = it.hunger + 10) },
            Choice("Cut through the orchards", "orchard") { it.copy(day = it.day + 1) }
        ))
        // Add more scenes for Level 1...
    )),
    Level(2, "Dead Orchards", "orchard_start", listOf(
        Scene("orchard_start", "Dead trees claw at a white sky. Something moves in the brush.", listOf(
            Choice("Investigate carefully", "orchard_investigate"),
            Choice("Move on fast", "next_level")
        ))
    )),
    // Levels 3-10 stubs - expand with full scenes
    Level(3, "Broken Highway", "highway_start", emptyList()),
    Level(4, "Town Outskirts", "town_start", emptyList()),
    Level(5, "The Water Tower", "tower_start", emptyList()),
    Level(6, "Irrigation Canals", "canal_start", emptyList()),
    Level(7, "The Last Farm", "farm_start", emptyList()),
    Level(8, "Highway 99 Wrecks", "wrecks_start", emptyList()),
    Level(9, "Refugee Camp", "camp_start", emptyList()),
    Level(10, "Beyond the Valley", "end_start", listOf(
        Scene("end_start", "The valley ends here. There ain’t no home here. Just the road ahead or the fight behind.", listOf(
            Choice("Walk on alone", "ending_lone") { it.copy(morale = it.morale + 20) },
            Choice("Turn back to the group", "ending_group")
        )),
        Scene("ending_lone", "You live another day. That’s all there is.", emptyList(), true),
        Scene("ending_group", "Maybe not home. But not alone either.", emptyList(), true)
    ))
)