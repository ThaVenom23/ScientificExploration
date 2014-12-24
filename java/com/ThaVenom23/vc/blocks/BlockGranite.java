package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGranite extends Block {
	
	public static int id = 3003;

	public BlockGranite(Material material, int id) {
		super(material);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setHardness(5f);
		this.setResistance(5.0f);
		this.setBlockTextureName(References.MODID + ":" + "granite");
		this.setBlockName("Granite");
		
	}

}
