package com.idtech.block;

import com.idtech.BaseMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class RubberBlock extends Block {
    private static Properties properties = Properties.of(Material.POWDER_SNOW);
    public static Block INSTANCE = new RubberBlock(properties).setRegistryName(BaseMod.MODID, "rubber");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public RubberBlock(Properties properties){
        super(properties);
    }
    @Override
    public void stepOn(Level levelIn, BlockPos posIn, BlockState blockStateIn, Entity entityIn) {
        super.stepOn(levelIn, posIn, blockStateIn, entityIn);
        entityIn.setDeltaMovement(0,5,0);
    }
}
