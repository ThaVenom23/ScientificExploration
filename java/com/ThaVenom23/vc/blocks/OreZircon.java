package com.ThaVenom23.vc.blocks;

import java.util.Random;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;
import com.ThaVenom23.vc.items.CustomItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OreZircon extends Block {
	
	public static int id = 3026;

	public OreZircon(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(8);
		this.setResistance(8);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "zircon_ore");
		this.setBlockName("Zircon Ore");
		
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return CustomItems.zirconIngot;
	}

}
