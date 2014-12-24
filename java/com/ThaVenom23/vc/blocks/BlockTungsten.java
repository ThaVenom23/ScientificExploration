package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTungsten extends Block {
	
	public static int id = 4014;

	public BlockTungsten(Material material, int id) {
		super(material);
		this.setHardness(5.0F);
		this.setResistance(6.0F);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "tungsten_block");
		this.setBlockName("Tungsten Block");
		
	}

}