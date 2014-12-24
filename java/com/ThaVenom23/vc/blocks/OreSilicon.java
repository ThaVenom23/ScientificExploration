package com.ThaVenom23.vc.blocks;

import java.util.Random;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;
import com.ThaVenom23.vc.items.CustomItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OreSilicon extends Block {
	
	public static int id = 3021;

	public OreSilicon(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(4);
		this.setResistance(4);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "silicon_ore");
		this.setBlockName("Silicon Ore");
		
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return CustomItems.siliconIngot;
	}

}
