package net.glowstone.block.block2.details;

import net.glowstone.block.GlowBlock;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NoDrops extends BaseBlockBehavior {
    public static final Collection<ItemStack> EMPTY = Collections.unmodifiableList(Arrays.asList(new ItemStack[0]));

    @Override
    public Collection<ItemStack> getDrops(GlowBlock block, ItemStack tool) {
        return EMPTY;
    }
}
