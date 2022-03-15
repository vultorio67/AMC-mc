package de.ellpeck.actuallyadditions.mod.items.base;

import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import net.minecraft.item.Item;

/**
 * I'm using a custom class here as I'm sure we'll need a unified way of declaring rules
 * but also so we can always know if something is ours in the simplest form.
 */
public abstract class ActuallyItem extends Item implements IActuallyItem {
    public ActuallyItem(Properties properties) {
        super(properties);
    }

    protected static Properties baseProps() {
        return new Properties().tab(ActuallyAdditions.GROUP);
    }
}
