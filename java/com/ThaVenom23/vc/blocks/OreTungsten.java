package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreTungsten extends Block {
	
	public static int id = 3024;

	public OreTungsten(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(6);
		this.setResistance(6);
		this.setHarvestLevel("pickaxe", 3);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "tungsten_ore");
		this.setBlockName("Tungsten Ore");
		
	}

}
