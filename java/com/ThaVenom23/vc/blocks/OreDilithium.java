package com.ThaVenom23.vc.blocks;

import java.util.Random;

import com.ThaVenom23.vc.VenomCraft;
import com.ThaVenom23.vc.items.CustomItems;
import com.ThaVenom23.vc.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OreDilithium extends Block {
	
	public static int id = 3015;

	public OreDilithium(Material material, int id) {
		super(material);
		this.setStepSound(soundTypeStone);
		this.setHardness(7);
		this.setResistance(5);
		this.setHarvestLevel("pickaxe", 3);
		this.setCreativeTab(VenomCraft.tabVC);
		this.setBlockTextureName(References.MODID + ":" + "dilithium_ore");
		this.setBlockName("Dilithium Ore");
		
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return CustomItems.dilithiumIngot;
	}

}
