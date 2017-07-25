package net.meyfa.swapper.events;

import java.awt.event.ActionListener;

import javax.swing.AbstractButton;


/**
 * Collection of {@link Event} constants for buttons.
 */
public class ButtonEvents
{
    /**
     * Registers an {@link ActionListener} on the {@link AbstractButton}.
     */
    public static final Event<AbstractButton, ActionListener> ACTION = (c, l) -> {
        c.addActionListener(l);
    };
}
