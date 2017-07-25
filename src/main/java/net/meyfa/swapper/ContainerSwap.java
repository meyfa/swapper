package net.meyfa.swapper;

import java.awt.Container;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Abstract extension of the {@link Swap} class for {@code Container}
 * components.
 * 
 * @param <C> The wrapped component type.
 */
public abstract class ContainerSwap<C extends Container> extends Swap<C>
        implements Iterable<Swap<?>>
{
    private List<Swap<?>> components = new ArrayList<>();

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
     * @return The number of children this container has.
     */
    public int count()
    {
        return components.size();
    }

    /**
     * Obtains the child {@link Swap} at the given index.
     * 
     * @param index The index.
     * 
     * @return The Swap at the given index.
     */
    public Swap<?> get(int index)
    {
        return components.get(index);
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
        components.add(swap);
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
        components.add(swap);
        getComponent().add(swap.getComponent(), constraints);

        return this;
    }

    /**
     * Removes the {@link Swap} at the given index from this Swap's child list.
     * 
     * @param index The index of the Swap to remove.
     * 
     * @return This instance.
     */
    public ContainerSwap<C> remove(int index)
    {
        components.remove(index);
        getComponent().remove(index);

        return this;
    }

    /**
     * Removes the given {@link Swap} from this Swap's child list.
     * 
     * @param swap The swap to remove.
     * 
     * @return This instance.
     */
    public ContainerSwap<C> remove(Swap<?> swap)
    {
        components.remove(swap);
        getComponent().remove(swap.getComponent());

        return this;
    }

    /**
     * Returns an iterator over this {@link Swap}'s children.
     * 
     * @return An iterator over the children.
     */
    @Override
    public Iterator<Swap<?>> iterator()
    {
        return components.iterator();
    }
}
