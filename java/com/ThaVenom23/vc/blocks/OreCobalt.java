package com.ThaVenom23.vc.blocks;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class OreCobalt extends Block {
	
	public static int id = 3013;

	public OreCobalt(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(5);
		this.setResistance(5);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "cobalt_ore");
		this.setBlockName("Cobalt Ore");
		
	}

}
