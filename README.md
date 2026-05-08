# Ulam Spiral Java Visualizer

A clean, algorithm-driven visualization of the **Ulam Spiral**, refactored into pure Java using the Swing framework.

## * Overview

The Ulam Spiral is a graphical depiction of the set of prime numbers, devised by mathematician Stanisław Ulam in 1963. It reveals a surprising and non-random pattern where prime numbers tend to line up on diagonal lines.

This project was originally inspired by a Processing-based implementation and has been **completely refactored** into standard Java to demonstrate:

- **Algorithm implementation** without high-level library abstractions.
- **GUI rendering** using Java’s native `Graphics2D` and Swing components.
- **Code refactoring** skills from scripting-style code to Object-Oriented Java.

## * Key Features

- **Custom Spiral Logic:** Implements a state-machine approach to calculate the expanding square spiral coordinates ($x, y$).
- **Optimized Prime Calculation:** Uses an $O(\sqrt{n})$ primality test for efficient rendering.
- **Dynamic Scaling:** Adjustable `stepSize` to control the density of the visualization.
- **Pure Java Implementation:** Zero external dependencies (no Processing core required).

## * Technical Refinement

In this version, I translated the procedural logic common in Processing into a robust Java Swing architecture:

1. **Rendering Engine:** Overrode `paintComponent(Graphics g)` to handle drawing cycles correctly within the Swing Event Dispatch Thread (EDT).
2. **State Management:** Managed direction transitions (Right → Up → Left → Down) using a modular arithmetic-based state machine.
3. **Performance:** Optimized the drawing loop to ensure the spiral calculates and renders smoothly within a standard `JPanel`.

## * How to Run

1. **Prerequisites:** Ensure you have **JDK 17** or higher installed.
2. **Clone the Repository:**
```
git clone https://github.com/YOUR_USERNAME/Ulam-Spiral-Java-Visualizer.git
```
3. **Compile and Run:**
    Open the project in your preferred IDE (IntelliJ IDEA recommended) and run the `UlamSpiral.java` file.

## * License

This project is open source and available under the [MIT License](https://github.com/crimson95/UlamSpiral/blob/master/LICENSE).