# MineColonies: Jade Crops

A lightweight addon for Jade that adds crop growth information for MineColonies crops.

> This branch contains the **Forge 1.20.1** version of the mod.
> The NeoForge 1.21.1 version lives in the [`NeoForge-1.21.1`](../../tree/NeoForge-1.21.1) branch.

## Features

* Displays crop growth percentage
* Shows when crops are fully mature
* Automatically detects MineColonies crops
* Vanilla-style Jade integration
* Lightweight and optimized
* Multilingual support

## Supported Versions

| Component    | Version                  |
| ------------ | ------------------------ |
| Minecraft    | 1.20.1                   |
| Forge        | 47.x (47.4.28+ tested)   |
| MineColonies | 1.20.1-1.1.1301+         |
| Jade         | 11.x (11.13.3+ tested)   |
| Java         | 17                       |

## Preview

Displays tooltip information similar to vanilla crops:

* `Growth: 17%`
* `Growth: Mature`

## Installation

1. Install Forge 1.20.1 (47.x)
2. Install Jade for Forge 1.20.1
3. Install MineColonies for 1.20.1 and its required dependencies
4. Place `mcjadecrops-forge-1.20.1-1.1.1300.jar` into your `mods` folder

## Configuration

Configuration file:

```text
config/mcjadecrops-common.toml
```

Available options:

```toml
enabled = true
debugLogging = false
```

### Jade Integration

The tooltip module can also be enabled or disabled directly inside Jade settings
(`Plugin Settings` → `MineColonies: Jade crops` → `MineColonies crop stage`).

## Dependencies

Required mods:

* Jade
* MineColonies

MineColonies required:

* Structurize
* BlockUI
* Domum Ornamentum
* Multi-Piston

## Localization

Currently supported languages:

* English
* Russian
* German
* Spanish
* Italian
* Japanese
* Korean
* Dutch
* Polish
* Portuguese (Brazil)
* Ukrainian
* Simplified Chinese
* Traditional Chinese

## Development

Requires JDK 17. If it is not installed, Gradle downloads it automatically (Foojay toolchain resolver).
Built with ForgeGradle 6 and Gradle 8.8 using official Mojang mappings.

### Build

```powershell
.\gradlew build
```

The mod jar is written to `build/libs/`.

### Run Client

```powershell
.\gradlew runClient
```

The development client starts with Jade, MineColonies and all MineColonies dependencies.

## License

This project is licensed under the MIT License.

## Credits

* Jade by Snownee
* MineColonies by LDTTeam
* Minecraft Forge Team
