package de.jangobrick.swapper;

import java.awt.Component;

import de.jangobrick.swapper.events.Event;


/**
 * Base class for every Swapper component wrapper.
 * 
 * The component is obtained "on demand" by calling the subclass's
 * {@link #build()} method. After that method has been called, the return value
 * is stored, and it will not be called again.
 * 
 * The instance may be accessed with {@link #getComponent()}.
 * 
 * @param <C> The wrapped component type.
 */
public abstract class Swap<C extends Component>
{
    private C component;

    /**
     * Constructs this Swap's component.
     * 
     * @return A new component instance.
     */
    protected abstract C build();

    /**
     * Obtains the component wrapped by this instance, constructing it first if
     * necessary.
     * 
     * @return The wrapped component.
     */
    public C getComponent()
    {
        if (component == null) {
            component = build();
        }
        return component;
    }

    /**
     * Repaints the component.
     * 
     * @return This instance.
     */
    public Swap<C> repaint()
    {
        getComponent().repaint();
        return this;
    }

    /**
     * Revalidates the component.
     * 
     * @return This instance.
     */
    public Swap<C> revalidate()
    {
        getComponent().revalidate();
        return this;
    }

    /**
     * Registers an event listener for the given {@link Event}.
     * 
     * @param event The event type.
     * @param listener The listener to add.
     * 
     * @return This instance.
     */
    public <L> Swap<C> on(Event<? super C, L> event, L listener)
    {
        event.register(getComponent(), listener);
        return this;
    }
}
