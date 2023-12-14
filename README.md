# itemis-statecharts
Example of a statechart created with Itemis Create. The example also features statechart unit testing made with SCTUnit.

To simulate the statechart in the example, or execute its unit tests, one needs to install the statechart tooling from https://www.itemis.com/en/products/itemis-create/

## Contents

Directory `CDPlayer` contains an example of a statechart controller for a CD Player, triggered through events like on, off, play, pause and stop.

### Version history:

* V0.1: A simple CD Player, triggered through events like on, off, play, pause and stop.
* V1.0: Addition of a remote controller to control the CD Player. The remote controller is modelled as a separate statechart in a separate orthogonal region. It raises events that are forwared to the CD Player.
* V2.0: Addition of a boolean variable isPlaying, reduction of the number of events in the remote controller, and use of a unit test suite composed of multiple test cases to separate the tests of the remote controller from the tests of the CD Player itself.

## Acknowledgements

Created by Tom Mens, in the context of lectures at the Department of Computer Science at the University of Mons, Belgium.

https://www.umons.ac.be

https://staff.umons.ac.be/tom.mens
