package Leaf;


import RenderEngine.DisplayManager;
import org.lwjgl.opengl.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class MainGameLoop {

    public static void main(String[] args) {
        if (!glfwInit())
            throw new IllegalStateException("Unable to initialize GLFW");
        long window = DisplayManager.createDisplay("LEAF");

        GL.createCapabilities();

        glClearColor(0f, 0f, 0f, 0.0f);
        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();
            glClear(GL_COLOR_BUFFER_BIT);

            glBegin(GL_QUADS);

                glColor4f(1, 0, 0, 1);
                glVertex2d(-0.5, 0.5);

                glColor4f(0, 1, 0, 1);
                glVertex2d(0.5, 0.5);

                glColor4f(0, 0, 1, 1);
                glVertex2d(0.5, -0.5);

                glColor4f(1, 1, 1, 1);
                glVertex2d(-0.5, -0.5);

            glEnd();

            glfwSwapBuffers(window);
        }

        glfwTerminate();
    }
}
