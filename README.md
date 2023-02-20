# Mars Rover Kata

Kata from [Kata-log](https://kata-log.rocks/mars-rover-kata)

## Requirements

- Java 19
- Maven 3.8.7

## Execution

1. `mvn package` build the JAR file, execute the test during the build and create the package.
2. `java -jar target/mvn-example-1.0-SNAPSHOT.jar` Execure the project

## Your Task

You’re part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet. Develop an API that translates the commands sent from earth to instructions that are understood by the rover.

## Requirements

- You are given the initial starting point (x,y) of a rover and the direction (n,s,e,w) it is facing.
- The rover receives commands by standard input.
- Implement commands that move the rover forward/backward (f,b).
- Implement commands that turn the rover left/right (l,r).
- Implement wrapping at edges. But be careful, planets are spheres.
