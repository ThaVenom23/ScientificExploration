package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreCopper extends Block {
	
	public static int id = 3014;

	public OreCopper(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(5);
		this.setResistance(5);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "copper_ore");
		this.setBlockName("Copper Ore");
		
	}

}
