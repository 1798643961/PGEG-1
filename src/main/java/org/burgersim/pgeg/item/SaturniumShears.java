package org.burgersim.pgeg.item;

import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class SaturniumShears extends ItemModShears {
    public SaturniumShears(Builder builder) {
        super(builder);
    }

    @Override
    public void onCreated(ItemStack stack, World world, EntityPlayer player) {
        List<EnchantmentData> enchantmentList = EnchantmentHelper.buildEnchantmentList(random, stack, 20, true);
        enchantmentList.forEach(enchantmentData -> stack.addEnchantment(enchantmentData.enchantment, enchantmentData.enchantmentLevel));
    }
}
