# Original Topic

In the Discussion board for this module, post a brief description of a problem (each student must post a unique problem) which to program a solution would require complex decisions (a decision required to test more than one condition) and/or loops. Provide a code snippet under your description which implements a solution using the most appropriate Java constructs discussed so far in the course. Make sure variable names reflect the purpose of the variables. Please see the attachment for an example: Module 3 Discussion Forum Example.pdf

After you have posted your problem and Java solution, post a reply to another student’s problem and code a different solution using different Java control constructs and/or a different arrangement of Java control constructs studied in this module. At the bottom of your reply, write a brief paragraph declaring which solution is better and why.

# Response

A device that tries to move forward, (lateral) left, or (lateral) right based on whether there is an obstacle in the way. The goal is to run through a corridor without running into any obstacles.

Some assumptions and ground rules include:

- The course consists of a white ground, and black obstacles
- The race is started by a green light indicator
- There is no instance where the device runs into a 3-sided wall that would prevent it from dodging to the left or right
- The device can see far enough ahead to make a decision 1-step ahead of time
- At the end, there is a red stopping line

```java
    public class Device {
    // device statuses and current state
    private static final String[] STATUS = { "off", "standby", "on"}; // immutable
    String currentStatus = STATUS[0]; // default state is off mode, changed by user

    public static void main(String [] args) {
        // once device status is on or standby, begin to constantly scan and move
        while (currentStatus == STATUS[1] || currentStatus == STATUS[2]) {
            scanAndMove();
        }
    } // end main

    // all checkFor functions scan forward, left, and right
    // assumes checkFor is implemented by some sort of computer vision library, returns true or false
    // assumes move[direction]OneStep is implemented by some sort of motor library
    private static void scanAndMove() {
        if (currentStatus == STATUS[1]) {
            if (checkForGreen()) {
                moveForwardOneStep();
                currentStatus == STATUS[2];
            }
            scanAndMove(); // continue to loop on scanAndMove (recursive)
        } else if (currentStatus == "on") {
            if (checkForRed()) {
                currentStatus = STATUS[0];
                return; // exit recursive function
            } else if (checkForBlack("forward")) {
                // if forward is blocked, check right
                if (checkForBlack("right")) {
                    // if right is blocked, move right and recurse
                    moveLeftOneStep();
                    scanAndMove();
                } else {
                    // if left and forward are blocked, move right and recurse
                    moveRightOneStep();
                    scanAndMove();
                }
            } else {
                // if no blockers exist, move forward and recurse
                moveForwardOneStep();
                scanAndMove();
            }
        }
    } // end scanAndMove
} // end Device class
```

# Response to Timothy Grovenburg

### Original Post

A baby rocker main control can instruct the machine to engage in sleep mode with volume control or awake mode with rocking control.

```
//the machine will either play white noise or engage the rocking feature based on the user input of mode and setting preference

if (machinestatus == ON & sleepmode == ON) {
    if (novolume == ON)
        whitenoisevolume = 0;
    if (lowvolume == ON)
        whitenoisevolume = 1;
    if (mediumvolume == ON)
        whitenoisevolume = 2;
    if (highvolume == ON)
        whitenoisevolume = 3;
}

if (machinestatus == ON & awakemode == ON) {
    if (norocking == ON)
        rockingspeed = 0;
    if (slowrocking == ON)
        rockingspeed = 1;
    if (mediumrocking == ON)
        rockingspeed = 2;
    if (fastrocking == ON)
        rockingspeed = 3;
}

//the machine will then use the values of whitenoisevolume and rockingspeed to engage the appropriate features at the requested specifications
```

### Response

Hey Tim - this would be a great real-life product, if it doesn't already exist haha! I will re-write yours using switch statements mixed in using a slightly different logic order and solution:

```java
// user may decide between the volume and rocking settings
String[] volumeSetting = {"no", "low", "medium", "high"};
int whiteNoiseVolume = 0; // default
String[] rockingSetting = {"no", "slow", "medium", "fast"};
int rockingSpeed = 0; // default

// user turns "on" or "off" machine and modes, default false for "off"
boolean awakeModeOn = false;
boolean sleepModeOn = false;
boolean machineStatusOn = false;

if (machineStatus & sleepModeOn)
{ // if the machine is on and white noise is on, check what volume of white noise
    switch (volumeSetting) {
        case "low":
            whiteNoiseVolume = 1;
        case "medium":
            whiteNoiseVolume = 2;
        case "high":
            whiteNoiseVolume = 3;
        default:
            // default "no" option
            whiteNoiseVolume = 0;
    }
}

if (machineStatus & awakeMode)
{ // if the machine is on and rocking is on, check what speed of rocking
    switch (rockingSetting) {
        case "slow":
            rockingSpeed = 1;
        case "medium":
            rockingSpeed = 2;
        case "fast":
            rockingSpeed = 3;
        default:
            // default "no" option
            rockingSpeed = 0;
    }
}

```

I think my method is a little more robust to read, understand, and modify; however it is not really any faster (O(n)) nor memory efficient. By declaring the settings and bounding the possible states of each setting upfront, the reader can better understand the if/switch statements. Using switch statements for the setting-to-speed/volume is also a little easier to read in my opinion.
