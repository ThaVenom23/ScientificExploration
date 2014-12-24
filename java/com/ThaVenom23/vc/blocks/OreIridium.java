package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreIridium extends Block {
	
	public static int id = 3017;

	public OreIridium(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(6);
		this.setResistance(6);
		this.setHarvestLevel("pickaxe", 3);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "iridium_ore");
		this.setBlockName("Iridium Ore");
		
	}

}
