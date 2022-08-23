package net.anomz.elementalmod.core.init;

import net.anomz.elementalmod.ElementalMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ElementalMod.MOD_ID);

    public static final RegistryObject<Block> FIRE_ORE = BLOCKS.register("fire_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK)
                    .hardnessAndResistance(3f, 50.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(3)
                    .sound(SoundType.STONE).setRequiresTool()));

    public static final RegistryObject<Block> AIR_ORE = BLOCKS.register("air_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK)
                    .hardnessAndResistance(3f, 50.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(3)
                    .sound(SoundType.STONE).setRequiresTool()));

    public static final RegistryObject<Block> EARTH_ORE = BLOCKS.register("earth_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK)
                    .hardnessAndResistance(3f, 50.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(3)
                    .sound(SoundType.STONE).setRequiresTool()));

    public static final RegistryObject<Block> WATER_ORE = BLOCKS.register("water_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK)
                    .hardnessAndResistance(3f, 50.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(3)
                    .sound(SoundType.STONE).setRequiresTool()));

    public static final RegistryObject<Block> FIRE_BLOCK = BLOCKS.register("fire_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)
                    .hardnessAndResistance(50f, 1000.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .sound(SoundType.METAL).setRequiresTool()));

    public static final RegistryObject<Block> AIR_BLOCK = BLOCKS.register("air_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)
                    .hardnessAndResistance(50f, 1000.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .sound(SoundType.METAL).setRequiresTool()));

    public static final RegistryObject<Block> EARTH_BLOCK = BLOCKS.register("earth_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)
                    .hardnessAndResistance(50f, 1000.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .sound(SoundType.METAL).setRequiresTool()));

    public static final RegistryObject<Block> WATER_BLOCK = BLOCKS.register("water_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)
                    .hardnessAndResistance(50f, 1000.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .sound(SoundType.METAL).setRequiresTool()));
}
