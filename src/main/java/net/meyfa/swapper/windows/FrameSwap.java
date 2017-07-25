package net.meyfa.swapper.windows;

import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;

import net.meyfa.swapper.ContainerSwap;


/**
 * Swap class for {@link JFrame}, allowing control over the frame's contents and
 * display parameters.
 */
public class FrameSwap extends ContainerSwap<JFrame>
{
    private GraphicsConfiguration gc;
    private WindowLocation location;

    /**
     * Constructs a new, empty, invisible {@code FrameSwap} using the default
     * graphics configuration.
     */
    public FrameSwap()
    {
        // empty constructor
    }

    /**
     * Constructs a new, empty, invisible {@code FrameSwap} using a specific
     * graphics configuration.
     * 
     * @param gc The graphics configuration to use.
     */
    public FrameSwap(GraphicsConfiguration gc)
    {
        this.gc = gc;
    }

    @Override
    protected JFrame build()
    {
        return gc != null ? new JFrame(gc) : new JFrame();
    }

    /**
     * @return This swap's {@link WindowLocation} used for defining the frame's
     *         placement on screen.
     */
    public WindowLocation location()
    {
        if (location == null) {
            location = new WindowLocation(getComponent());
        }
        return location;
    }

    /**
     * Sets the frame's title.
     * 
     * @param title The new title.
     * 
     * @return This instance.
     */
    public FrameSwap title(String title)
    {
        getComponent().setTitle(title);
        return this;
    }

    /**
     * Sets the default operation that happens when the user initiates a "close"
     * on this frame.
     * 
     * The initial value is {@code CloseOperation.HIDE}.
     * 
     * @param op The default close operation.
     * 
     * @return This instance.
     */
    public FrameSwap closeOperation(CloseOperation op)
    {
        getComponent().setDefaultCloseOperation(op.getValue());
        return this;
    }

    /**
     * Shows ({@code true}) or hides ({@code false}) the frame.
     * 
     * @param visible Whether the frame shall be visible.
     * 
     * @return This instance.
     */
    public FrameSwap setVisible(boolean visible)
    {
        getComponent().setVisible(visible);
        return this;
    }

    /**
     * Prepares the frame for being displayed.
     * 
     * @return This instance.
     */
    public FrameSwap pack()
    {
        getComponent().pack();
        return this;
    }

    /**
     * Packs the frame, then sets it visible.
     * 
     * <p>
     * In other words, this is a shortcut for {@code pack().setVisible(true)}.
     * 
     * @return This instance.
     */
    public FrameSwap show()
    {
        return pack().setVisible(true);
    }
}
