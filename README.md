# Java Labs

This repository collects weekly Java lab assignments. Each week's work is kept in its own folder.

## Week 1 — Java Recall

Sources are in `week1/src`. The week includes the Playlist Track exercise and the Game Shop Inventory exercise.

### Compile and run (Java 17+)

From the repository root:

```bash
mkdir -p week1/out
javac -d week1/out week1/src/Track.java week1/src/PlaylistDemo.java week1/src/game/inventory/Item.java week1/src/game/inventory/Inventory.java week1/src/GameShop.java
java -cp week1/out PlaylistDemo
java -cp week1/out GameShop
```

Future assignments can be added as `week2/`, `week3/`, and so on.
