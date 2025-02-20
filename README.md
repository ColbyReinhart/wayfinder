# Wayfinder Teleportation Plugin

Wayfinder is a minecraft bukkit server plugin that enables a simple, balanced, and vanilla-style
teleportation system using existing vanilla features. To use it, simply right-click on a compass
which is attuned to a lodestone. If the lodestone exists in the world, the player will be
teleported to the lodestone.

## Installation steps

This project is made with kotlin and thus requires the kotlin standard library. To make sure this
is included in the classpath when executing your server you can either include the stdlib jar in
the classpath when starting the server or build this project with the `shadowJar` plugin task. If
you're not sure what this means or how to manipulate the java classpath then go with the latter.

Without kotlin stdlib: `./gradlew build`

With kotlin stdlib: `./gradlew shadowJar`

Once complete, the plugin jar will be created in build/libs. Plop this into the plugins directory
of your bukkit/paper server and restart to take effect.
