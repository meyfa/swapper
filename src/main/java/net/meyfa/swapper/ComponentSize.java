package net.meyfa.swapper;

import java.awt.Component;
import java.awt.Dimension;


/**
 * This class controls a Swap's dimensions by providing setters for the
 * component's three size properties: preferred, minimum, maximum.
 * 
 * <p>
 * All of them can be set either with separate (width, height) components or
 * with a {@link Dimension} object.
 */
public class ComponentSize
{
    private Component component;

    /**
     * @param component The component this instance controls.
     */
    public ComponentSize(Component component)
    {
        this.component = component;
    }

    /**
     * Sets the component's preferred size.
     * 
     * @param dim The new preferred size.
     * 
     * @return This instance.
     */
    public ComponentSize preferred(Dimension dim)
    {
        component.setPreferredSize(dim);
        return this;
    }

    /**
     * Sets the component's preferred size.
     * 
     * @param width The new preferred width.
     * @param height The new preferred height.
     * 
     * @return This instance.
     */
    public ComponentSize preferred(int width, int height)
    {
        return preferred(new Dimension(width, height));
    }

    /**
     * Sets the component's minimum size.
     * 
     * @param dim The new minimum size.
     * 
     * @return This instance.
     */
    public ComponentSize minimum(Dimension dim)
    {
        component.setMinimumSize(dim);
        return this;
    }

    /**
     * Sets the component's minimum size.
     * 
     * @param width The new minimum width.
     * @param height The new minimum height.
     * 
     * @return This instance.
     */
    public ComponentSize minimum(int width, int height)
    {
        return minimum(new Dimension(width, height));
    }

    /**
     * Sets the component's maximum size.
     * 
     * @param dim The new maximum size.
     * 
     * @return This instance.
     */
    public ComponentSize maximum(Dimension dim)
    {
        component.setMaximumSize(dim);
        return this;
    }

    /**
     * Sets the component's maximum size.
     * 
     * @param width The new maximum width.
     * @param height The new maximum height.
     * 
     * @return This instance.
     */
    public ComponentSize maximum(int width, int height)
    {
        return maximum(new Dimension(width, height));
    }
}
