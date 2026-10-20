# Earthfall: The Last Homecoming

Android adventure game based on the book series by William Gargan.

**Tagline:** There ain’t no home here. Just a fight to live another day.

## Features
- 10 progressive levels of post-apocalyptic survival in the Central Valley
- Choice-driven branching narrative with resource management (Health, Hunger, Supplies, Morale)
- Multiple endings
- Monetization ready: AdMob (rewarded + interstitial), Google Play Billing (consumables, Remove Ads, subscription)
- Data-driven levels for easy expansion (add Level 11+ in Levels.kt)
- Progress saving

## Setup
1. Open in Android Studio (Arctic Fox or newer)
2. Sync Gradle
3. Replace AdMob App ID in AndroidManifest.xml with your production ID
4. Configure product IDs in Play Console to match MonetizationManager.kt
5. Run on device/emulator (min SDK 26)

## Expansion
Add new levels by extending the levels list in `app/src/main/java/.../Levels.kt` and corresponding scenes in Narrative.kt.

There ain’t no home here. Just a fight to live another day.
