package com.ThaVenom23.vc.items;

import com.ThaVenom23.vc.VenomCraft;

import net.minecraft.item.Item;


public class ItemIngot extends Item {
	
	public ItemIngot(String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(VenomCraft.tabVC);
		this.maxStackSize = 64;
	}

}
