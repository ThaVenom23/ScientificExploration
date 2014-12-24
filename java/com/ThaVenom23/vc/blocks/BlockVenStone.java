package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockVenStone extends Block {

	protected BlockVenStone(Material material, int id) {
		super(material);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockName("Ven Stone");
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "BlockVen");
	}

}
