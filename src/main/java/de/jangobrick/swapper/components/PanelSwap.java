package de.jangobrick.swapper.components;

import javax.swing.JPanel;

import de.jangobrick.swapper.ContainerSwap;


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
