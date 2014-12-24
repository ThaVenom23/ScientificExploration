package com.ThaVenom23.vc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLamp extends Block {

	public BlockLamp(int id, Material glass) {
		super(glass);
		this.setStepSound(soundTypeGlass);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setLightLevel(1f);
		this.setBlockName("Lamp");
		
	}

}
