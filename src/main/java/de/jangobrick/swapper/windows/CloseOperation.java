package de.jangobrick.swapper.windows;

import javax.swing.WindowConstants;


/**
 * The possible default operations for window close requests.
 */
public enum CloseOperation
{
    /** Does nothing on a close request. */
    NONE(WindowConstants.DO_NOTHING_ON_CLOSE),

    /** Hides the window when closing it is requested. */
    HIDE(WindowConstants.HIDE_ON_CLOSE),

    /** Disposes the window when closing it is requested. */
    DISPOSE(WindowConstants.DISPOSE_ON_CLOSE),

    /** Exits the application when closing the window is requested. */
    EXIT(WindowConstants.EXIT_ON_CLOSE);

    private final int value;

    /**
     * @param value The operation's constant from {@link WindowConstants}.
     */
    private CloseOperation(int value)
    {
        this.value = value;
    }

    /**
     * @return The {@link WindowConstants} {@code int} for this operation.
     */
    public int getValue()
    {
        return value;
    }
}
