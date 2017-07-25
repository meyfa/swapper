package net.meyfa.swapper.components;

import javax.swing.Icon;
import javax.swing.JButton;

import net.meyfa.swapper.Swap;


/**
 * Swap class for {@link JButton}. Allows setting text and icon (both optional).
 */
public class ButtonSwap extends Swap<JButton>
{
    @Override
    protected JButton build()
    {
        return new JButton();
    }

    /**
     * Sets the text displayed on this button.
     * 
     * @param text The text to display.
     * 
     * @return This instance.
     */
    public ButtonSwap text(String text)
    {
        getComponent().setText(text);
        return this;
    }

    /**
     * Sets the icon displayed on this button.
     * 
     * @param icon The icon to display.
     * 
     * @return This instance.
     */
    public ButtonSwap icon(Icon icon)
    {
        getComponent().setIcon(icon);
        return this;
    }
}
