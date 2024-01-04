![Maven Build](https://github.com/ecos-umons/itemis-statecharts/actions/workflows/maven.yml/badge.svg)

# CDPlayer statechart with auto-generated code and tests

Example of a statechart created with Itemis Create. The example also features statechart unit testing made with SCTUnit. The Java code and JUnit code has been auto-generated using code generator models.

## Contents

Directory `CDPlayer` contains an example of a statechart controller for a CD Player, triggered through events like on, off, play, pause and stop.

### Version history:

* V0.1: A simple CD Player, triggered through events like on, off, play, pause and stop.
* V1.0: Addition of a remote controller to control the CD Player. The remote controller is modelled as a separate statechart in a separate orthogonal region. It raises events that are forwared to the CD Player.
* V2.0: Addition of a boolean variable isPlaying, reduction of the number of events in the remote controller, and use of a unit test suite composed of multiple test cases to separate the tests of the remote controller from the tests of the CD Player itself.
* V3.0: Addition of an integer variable timeout, change of the CDPlayer statechart to add a history state and a timeout transition, and refactoring of unit test suite to separate black-box tests from white-box tests.
* V3.2: Addition of auto-generated Java code and JUnit tests, with Maven commands for compiling and running the tests. Addition of a Main.java file (to be run with "mvn exec:java) to illustrate how to call the generated statechart code.

## Usage instructions
To simulate the statechart model in the example, or execute its SCTUnit tests at model level, one needs to install the statechart tooling from https://www.itemis.com/en/products/itemis-create/
To run the generated code and its generated JUnit tests, one can use maven:

* 'mvn compile' just compiles the code
* 'mvn package' compiles all code, runs the unit tests, and packages the code
* 'mvn exec:java' allows to execute the generated code 

## Acknowledgements

Created by Tom Mens, in the context of lectures at the Department of Computer Science at the University of Mons, Belgium.

https://www.umons.ac.be

https://staff.umons.ac.be/tom.mens
