package net.meyfa.swapper.components;

import javax.swing.Icon;
import javax.swing.JLabel;

import net.meyfa.swapper.Swap;


/**
 * Swap class for {@link JLabel}. Allows setting text and icon (both optional).
 */
public class LabelSwap extends Swap<JLabel>
{
    @Override
    protected JLabel build()
    {
        return new JLabel();
    }

    /**
     * Sets the text displayed on this label.
     * 
     * @param text The text to display.
     * 
     * @return This instance.
     */
    public LabelSwap text(String text)
    {
        getComponent().setText(text);
        return this;
    }

    /**
     * Sets the icon displayed on this label.
     * 
     * @param icon The icon to display.
     * 
     * @return This instance.
     */
    public LabelSwap icon(Icon icon)
    {
        getComponent().setIcon(icon);
        return this;
    }
}
