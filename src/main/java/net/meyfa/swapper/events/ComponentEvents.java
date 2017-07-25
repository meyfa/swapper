package net.meyfa.swapper.events;

import java.awt.Component;
import java.awt.event.ComponentListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;


/**
 * Collection of {@link Event} constants for components in general.
 */
public class ComponentEvents
{
    // GENERAL

    /**
     * Registers a {@link ComponentListener} on the {@link Component}.
     */
    public static final Event<Component, ComponentListener> COMPONENT =
            (c, l) -> c.addComponentListener(l);

    /**
     * Registers a {@link FocusListener} on the {@link Component}.
     */
    public static final Event<Component, FocusListener> FOCUS =
            (c, l) -> c.addFocusListener(l);



    // KEYBOARD

    /**
     * Registers a {@link KeyListener} on the {@link Component}.
     */
    public static final Event<Component, KeyListener> KEY =
            (c, l) -> c.addKeyListener(l);



    // MOUSE

    /**
     * Registers a {@link MouseListener} on the {@link Component}.
     */
    public static final Event<Component, MouseListener> MOUSE =
            (c, l) -> c.addMouseListener(l);

    /**
     * Registers a {@link MouseMotionListener} on the {@link Component}.
     */
    public static final Event<Component, MouseMotionListener> MOUSE_MOTION =
            (c, l) -> c.addMouseMotionListener(l);

    /**
     * Registers a {@link MouseWheelListener} on the {@link Component}.
     */
    public static final Event<Component, MouseWheelListener> MOUSE_WHEEL =
            (c, l) -> c.addMouseWheelListener(l);
}
