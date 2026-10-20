package com.wgargan.earthfall.models

data class GameState(
    val health: Int = 100,
    val hunger: Int = 30,
    val supplies: Int = 40,
    val morale: Int = 50,
    val day: Int = 1,
    val currentLevel: Int = 1,
    val flags: Set<String> = emptySet(),
    val scrap: Int = 0,
    val adsRemoved: Boolean = false
)

data class Choice(
    val text: String,
    val nextSceneId: String,
    val apply: (GameState) -> GameState = { it }
)

data class Scene(
    val id: String,
    val text: String,
    val choices: List<Choice>,
    val isEnding: Boolean = false
)

data class Level(
    val id: Int,
    val title: String,
    val startSceneId: String,
    val scenes: List<Scene>
)