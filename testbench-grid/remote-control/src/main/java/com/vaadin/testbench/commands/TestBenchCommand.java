package com.vaadin.testbench.commands;

/**
 * Additional TestBench commands are enumerated here.
 * 
 * @author Jonatan Kronqvist / Vaadin Ltd.
 */
public enum TestBenchCommand {
    /**
     * Defines the name of the test.
     */
    setTestName,

    /**
     * Takes a screen shot and compares it to the provided data. If shots
     * differing after N tries, the screen shot image is sent back to the caller
     * for more thorough comparison and/or error reporting.
     * 
     * Parameters (Strings): <br>
     * - A representation of reference image calculated as the average sum of
     * RGB values over 16x16 blocks <br>
     * - The maximum number of retries <br>
     * - The delay between retries
     */
    compareScreen,

    /**
     * Initializes the browser to a certain canvas size and returns the
     * coordinates and the size.
     * 
     * Parameters:<br>
     * - canvas width<br>
     * - canvas height
     * 
     * Returns:
     * OK,screenWidth,screenHeight,canvasWidth,canvasHeight,canvasX,canvasY
     */
    setCanvasSize,

    /**
     * Fetches the current canvas size from cache if possible, otherwise it
     * measures the canvas size and returns the result.
     * 
     * Returns:
     * OK,screenWidth,screenHeight,canvasWidth,canvasHeight,canvasX,canvasY
     */
    getCanvasSize,

    /**
     * Sends a file that is to be passed to an Upload input field.
     * 
     * Parameters:<br>
     * - The fieldLocator (locator of the upload input field)<br>
     * - The name of the file<br>
     * - The base64 encoded file data
     */
    uploadFile,

    /**
     * Returns the name of the remote control. Mainly useful for debugging
     * problems with specific machines.
     */
    getRemoteControlName,

    /**
     * An empty command. Used instead of passing nulls here and there.
     */
    none;

    public static TestBenchCommand getValue(final String command) {
        try {
            return valueOf(command);
        } catch (Exception e) {
            return none;
        }
    }

}
