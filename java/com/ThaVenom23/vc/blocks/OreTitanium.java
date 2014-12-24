package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreTitanium extends Block {
	
	public static int id = 3023;

	public OreTitanium(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(6);
		this.setResistance(5);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "titanium_ore");
		this.setBlockName("Titanium Ore");
		
	}

}
