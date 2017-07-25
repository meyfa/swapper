package net.meyfa.swapper.windows;

import java.awt.Component;
import java.awt.Point;
import java.awt.Window;

import net.meyfa.swapper.Swap;


/**
 * This class controls where a window is positioned by exposing methods for
 * defining absolute, relative and platform-dependent locations.
 */
public class WindowLocation
{
    private Window component;

    /**
     * @param component The component this instance controls.
     */
    public WindowLocation(Window component)
    {
        this.component = component;
    }

    /**
     * Positions the window relative to the given {@link Swap}.
     * 
     * @param swap The swap acting as the positioning anchor.
     * 
     * @return This instance.
     */
    public WindowLocation relative(Swap<?> swap)
    {
        Component c = swap != null ? swap.getComponent() : null;
        component.setLocationRelativeTo(c);
        return this;
    }

    /**
     * Positions the window so that its upper-left corner is at the given point.
     * 
     * @param p The point to move the window to.
     * 
     * @return This instance.
     */
    public WindowLocation set(Point p)
    {
        component.setLocation(p);
        return this;
    }

    /**
     * Positions the window so that its upper-left corner is at the given
     * coordinates.
     * 
     * @param x The x coordinate to move the window to.
     * @param y The y coordinate to move the window to.
     * 
     * @return This instance.
     */
    public WindowLocation set(int x, int y)
    {
        component.setLocation(x, y);
        return this;
    }

    /**
     * A value of {@code true} makes the window appear at the location dictated
     * by the native windowing system the next time it is made visible.
     * 
     * This flag is automatically cleared by the underlying Swing classes when
     * the window is made visible or moved manually.
     * 
     * @param b Whether the native windowing system should position the window.
     * 
     * @return This instance.
     */
    public WindowLocation setByPlatform(boolean b)
    {
        component.setLocationByPlatform(b);
        return this;
    }
}
