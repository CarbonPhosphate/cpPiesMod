package net.carbonphosphate.more_pies;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegisterHelper
{   
    public static final PieBlock BLOCK_PUMPKIN_PIE = new PieBlock(AbstractBlock.Settings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));
    public static final PieBlock BLOCK_APPLE_PIE = new PieBlock(AbstractBlock.Settings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));
    public static final PieBlock BLOCK_SWEET_BERRY_PIE = new PieBlock(AbstractBlock.Settings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));
    public static final PieBlock BLOCK_GLOW_BERRY_PIE = new PieBlock(AbstractBlock.Settings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));

    public static final BlockItem ITEM_PUMPKIN_PIE = new BlockItem(BLOCK_PUMPKIN_PIE, (new Item.Settings()).maxCount(1).group(ItemGroup.FOOD));
    public static final BlockItem ITEM_APPLE_PIE = new BlockItem(BLOCK_APPLE_PIE, (new Item.Settings()).maxCount(1).group(ItemGroup.FOOD));
    public static final BlockItem ITEM_SWEET_BERRY_PIE = new BlockItem(BLOCK_SWEET_BERRY_PIE, (new Item.Settings()).maxCount(1).group(ItemGroup.FOOD));
    public static final BlockItem ITEM_GLOW_BERRY_PIE = new BlockItem(BLOCK_GLOW_BERRY_PIE, (new Item.Settings()).maxCount(1).group(ItemGroup.FOOD));

    public static void RegisterBlocks()
    {
        // Register Blocks
        Registry.register(Registry.BLOCK, new Identifier("cp_pies", "pumpkin_pie"), BLOCK_PUMPKIN_PIE);
        Registry.register(Registry.BLOCK, new Identifier("cp_pies", "apple_pie"), BLOCK_APPLE_PIE);
        Registry.register(Registry.BLOCK, new Identifier("cp_pies", "sweet_berry_pie"), BLOCK_SWEET_BERRY_PIE);
        Registry.register(Registry.BLOCK, new Identifier("cp_pies", "glow_berry_pie"), BLOCK_GLOW_BERRY_PIE);

        // Register BlockItems
        Registry.register(Registry.ITEM, new Identifier("cp_pies", "pumpkin_pie"), ITEM_PUMPKIN_PIE);
        Registry.register(Registry.ITEM, new Identifier("cp_pies", "apple_pie"), ITEM_APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier("cp_pies", "sweet_berry_pie"), ITEM_SWEET_BERRY_PIE);
        Registry.register(Registry.ITEM, new Identifier("cp_pies", "glow_berry_pie"), ITEM_GLOW_BERRY_PIE);
    }
}