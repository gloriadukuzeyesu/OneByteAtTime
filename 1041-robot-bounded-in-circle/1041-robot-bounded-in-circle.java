class Solution {
    public boolean isRobotBounded(String instructions) {
        // Initialize robot's initial position and direction
    int x = 0;
    int y = 0;
    int dirX = 0;
    int dirY = 1;  // Initially facing North

    for (char instruction : instructions.toCharArray()) {
        if (instruction == 'G') {
            x += dirX;
            y += dirY;
        } else if (instruction == 'L') {
            // Rotate 90 degrees counterclockwise
            int temp = dirX;
            dirX = -dirY;
            dirY = temp;
        } else if (instruction == 'R') {
            // Rotate 90 degrees clockwise
            int temp = dirX;
            dirX = dirY;
            dirY = -temp;
        }
    }

    // Check if the robot returns to the initial position or faces a different direction
    // If it returns to the initial position or faces North, it will form a circle.
    return (x == 0 && y == 0) || (dirX != 0 || dirY != 1);
        
    }
}