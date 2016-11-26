package de.jangobrick.swapper.events;

import java.awt.Component;


/**
 * This interface describes an AWT event type that can have listeners of a
 * specific class registered to components of a specific class.
 * 
 * <p>
 * Its {@code register()} method is the bridge between both parts, allowing one
 * to easily add the listener instance through this interface rather than
 * calling the component's method.
 * 
 * @param <C> The component type this event is valid for.
 * @param <L> The listener type that can be registered.
 */
@FunctionalInterface
public interface Event<C extends Component, L>
{
    /**
     * Registers the given listener to the given component.
     * 
     * @param component The target component.
     * @param listener The listener instance to register.
     */
    void register(C component, L listener);
}
