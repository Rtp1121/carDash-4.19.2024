# Digital CarDash Portfolio Project

Hello! This is my portfolio project for my CSE 2231 Software II class at The
Ohio State University!

## What is it?

Having a massive passion for cars and wanting to work for the automotive
industry, I set out to create a digital car dash. Unfortunately I did not have
enough time to code the graphic portion of the project, so I stuck to focusing
on the basics of component design. I based my component design on the OSU CSE
Map components which is found in the OSU CSE components library which can be
[downloaded here][components-jar]. I also installed the latest JDK
[directly from Oracle's site][jdk-downloads].

## How does it work?

My component works by utilizing OSU's Map component as a representation to
map important vehicle information such as fuel level, maxRPM, speed, etc. There
are two interfaces: CarDashKernel and CarDash which are implemented by
CarDashOnMap and CarDashSecondary (abstract class) respectively. The interfaces
describe each method in detail, and the other two classes implement these
interfaces. The CarDashKernel interface contains primary methods while the
CarDash interface contains secondary methods utilizing the primary methods found
in the CarDashKernel interface. If you take a look at the Example1.java and
Example2.java files, you can see two use cases of how the component is used in
the Main method. There are also two test files CarDashKernelTest.java and
CarDashAbstractTest.java which tests every method in the CarDashOnMap and
CarDashSecondary files respectively.

### Links

[components-jar]: http://web.cse.ohio-state.edu/software/common/components.jar
[jdk-downloads]: https://www.oracle.com/java/technologies/downloads/
