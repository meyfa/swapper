package de.jangobrick.swapper;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;


/**
 * This class controls a Swap's appearance or style by providing setters for the
 * most common properties like font, background or cursor.
 */
public class ComponentStyle
{
    private Component component;

    /**
     * @param component The component this instance controls.
     */
    public ComponentStyle(Component component)
    {
        this.component = component;
    }

    /**
     * Sets the component's font.
     * 
     * @param f The new font.
     * 
     * @return This instance.
     */
    public ComponentStyle font(Font f)
    {
        component.setFont(f);
        return this;
    }

    /**
     * Sets the component's background color.
     * 
     * @param c The new background color.
     * 
     * @return This instance.
     */
    public ComponentStyle background(Color c)
    {
        component.setBackground(c);
        return this;
    }

    /**
     * Sets the component's foreground color.
     * 
     * @param c The new foreground color.
     * 
     * @return This instance.
     */
    public ComponentStyle foreground(Color c)
    {
        component.setForeground(c);
        return this;
    }

    /**
     * Sets the component's cursor.
     * 
     * @param cursor The new cursor.
     * 
     * @return This instance.
     */
    public ComponentStyle cursor(Cursor cursor)
    {
        component.setCursor(cursor);
        return this;
    }
}
