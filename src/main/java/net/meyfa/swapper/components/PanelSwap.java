package net.meyfa.swapper.components;

import javax.swing.JPanel;

import net.meyfa.swapper.ContainerSwap;


/**
 * Swap class for {@link JPanel}.
 */
public class PanelSwap extends ContainerSwap<JPanel>
{
    @Override
    protected JPanel build()
    {
        return new JPanel();
    }
}
