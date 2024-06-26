# A-10C-MFCD
## What
My very own implementation of the left MFCD screen of an A-10C and its systems.

The development of this application will try to cover most functions that the left MFCD screen supports, completely or partially excluding those who rely on cameras to provide feed-based information such as IR-Missiles target acquisition systems and most TGP interfaces that require a TGP-Pod to operate (I'll try to replace such things with real video feed coming from a webcam if possible).

## Why
The main goals of this project are to make a niche-specific application featuring an interactive user interface and to prove my own knowlegde about many of the airframe's software components and their manipulation.

## How
This software will rely on JavaFX to accomplish most display-related tasks (handling the user's interaction with OSB's, and the screen itself). Built with Maven, Java 17 will be the backbone of this whole project and I'd rather keep it as simple as possible.
The intention is to be as faithful as possible to the real version which, among other things, means that the implementation of the systems described below will be directly based on the information available from trustworthy sources like Fairchild Republic's official flight manual, Chuck Guide's documentation for the corresponding Digital Combat Simulator Module, and lastly but not least, the Eagle Dynamics official user manual for the mentioned module.

## Systems to be featured
- DSMS (Digital Store Management System)
- Loadout profiles
- Inventory and station management
- TAD (Tactical Awareness Display) featuring a static map
- MAV interface for Laser-Guided maverick missiles
- Data loading
- TGP Interface (will try to provide image feed from your own webcam)
- STATUS (systems report)

