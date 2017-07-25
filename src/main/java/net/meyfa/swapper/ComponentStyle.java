package net.meyfa.swapper;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.border.Border;


/**
 * This class controls a Swap's appearance or style by providing setters for the
 * most common properties like font, background or cursor.
 * 
 * <p>
 * Some properties might not be supported by every instance of this class; for
 * example, border, or whether the component is opaque, are limited to
 * subclasses of {@code JComponent}. In case of an unsupported property being
 * set anyway, this class guarantees not to throw.
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

    /**
     * Sets whether the component shall be opaque, i.e. whether it shall paint
     * every pixel inside its bounds (for a value of {@code true}) or allow the
     * background to show through (for a value of {@code false}, the default).
     * 
     * <p>
     * This requires the component to be a subclass of {@code JComponent}.
     * 
     * @param o Whether the component shall be opaque.
     * 
     * @return This instance.
     */
    public ComponentStyle opaque(boolean o)
    {
        if (!(component instanceof JComponent)) {
            return this;
        }
        ((JComponent) component).setOpaque(o);
        return this;
    }

    /**
     * Sets the component's border.
     * 
     * <p>
     * This requires the component to be a subclass of {@code JComponent}.
     * 
     * @param border The new border.
     * 
     * @return This instance.
     */
    public ComponentStyle border(Border border)
    {
        if (!(component instanceof JComponent)) {
            return this;
        }
        ((JComponent) component).setBorder(border);
        return this;
    }
}
