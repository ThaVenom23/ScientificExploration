package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreUranium extends Block {
	
	public static int id = 3025;

	public OreUranium(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(7);
		this.setHardness(6);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "uranium_ore");
		this.setBlockName("Uranium Ore");
		
	}

}
