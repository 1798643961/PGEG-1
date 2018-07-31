package org.burgersim.pgeg.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.trees.AbstractTree;
import net.minecraft.client.particle.Particle;
import net.minecraft.init.Blocks;
import net.minecraft.particles.ParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import org.burgersim.pgeg.listener.Listener;

import java.util.Random;

public class BlockModSapling extends BlockSapling {
    public BlockModSapling(AbstractTree tree, Builder builder) {
        super(tree, builder);
    }

    @Override
    protected boolean isValidGround(IBlockState p_isValidGround_1_, IBlockReader p_isValidGround_2_, BlockPos p_isValidGround_3_) {
        Block block = p_isValidGround_1_.getBlock();
        return block == Blocks.GRASS_BLOCK ||
                block == Blocks.DIRT ||
                block == Blocks.COARSE_DIRT ||
                block == Blocks.PODZOL ||
                block == Blocks.FARMLAND ||
                block == Listener.MANA_GRASS;
    }
}
