# VisionCommunicatorPlugin

### Crevolution's Shuffleboard UDP communications GUI for interfacing with our [OffseasonVision2019](https://github.com/CrevolutionRoboticsProgramming/OffseasonVision2019) vision processing program

We recommend using the other [VisionCommunicator](https://github.com/CrevolutionRoboticsProgramming/VisionCommunicator) project instead of this one. This one is much more unstable. WPI didn't make their programs very easy to debug.

## Usage

Download the latest release and load it into Shuffleboard, configure the IP and ports of the target device, and restart Shuffleboard for these changes to take effect. Then, run the vision program on the target device and click the Update Values button to sync the configuration. If you change the HSV values, the configuration is automatically sent to the target device. Otherwise, click the Transmit Data button to send your data. The Toggle Stream button sends a request to the target device to change its stream from the driver vision camera to the vision processing camera for tuning. Your ```GENERAL``` configuration will be stored in the profile.txt file in your ```AppData``` folder under ```Vision Communicator Plugin Data```.
