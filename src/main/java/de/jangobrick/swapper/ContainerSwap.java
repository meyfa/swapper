package de.jangobrick.swapper;

import java.awt.Container;
import java.awt.LayoutManager;


/**
 * Abstract extension of the {@link Swap} class for {@code Container}
 * components.
 * 
 * @param <C> The wrapped component type.
 */
public abstract class ContainerSwap<C extends Container> extends Swap<C>
{
    /**
     * Sets the component's {@link LayoutManager} to the one given.
     * 
     * @param layout The new layout manager to use.
     * 
     * @return This instance.
     */
    public ContainerSwap<C> layout(LayoutManager layout)
    {
        getComponent().setLayout(layout);
        return this;
    }

    /**
     * Adds the given {@link Swap} as a child to this Swap's component.
     * 
     * @param swap The Swap to add as a child.
     * 
     * @return This instance.
     */
    public ContainerSwap<C> add(Swap<?> swap)
    {
        getComponent().add(swap.getComponent());
        return this;
    }

    /**
     * Adds the given {@link Swap} as a child to this Swap's component, using
     * the given constraints object.
     * 
     * @param swap The Swap to add as a child.
     * @param constraints The constraints object to use.
     * 
     * @return This instance.
     */
    public ContainerSwap<C> add(Swap<?> swap, Object constraints)
    {
        getComponent().add(swap.getComponent(), constraints);
        return this;
    }
}
