package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMarble extends Block {
	
	public static int id = 3001;

	public BlockMarble(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(4f);
		this.setResistance(1.0f);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "marble");
		this.setBlockName("Marble");
		
	}

}
