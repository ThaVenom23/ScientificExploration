package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreAluminium extends Block{
	
	public static int id = 3010;

	public OreAluminium(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(5);
		this.setResistance(5);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "aluminium_ore");
		this.setBlockName("Aluminium Ore");
		
	}

}
