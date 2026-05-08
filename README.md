# MineColonies: Jade Crops

A lightweight addon for Jade that adds crop growth information for MineColonies crops.

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
| Minecraft    | 1.21.1                   |
| NeoForge     | 21.1.227+                |
| MineColonies | 1.1.1300-1.21.1-snapshot |
| Jade         | 15.10.5+                 |

## Preview

Displays tooltip information similar to vanilla crops:

* `Growth: 17%`
* `Growth: Mature`

## Installation

1. Install NeoForge 1.21.1
2. Install Jade
3. Install MineColonies and its required dependencies
4. Place `mcjadecrops.jar` into your `mods` folder

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

The tooltip module can also be enabled or disabled directly inside Jade settings.

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

### Build

```powershell
.\gradlew build
```

### Run Client

```powershell
.\gradlew runClient
```

## License

This project is licensed under the MIT License.

## Credits

* Jade by Snownee
* MineColonies by LDTTeam
* NeoForge Team
