package com.ThaVenom23.vc.items;

import com.ThaVenom23.vc.VenomCraft;

import net.minecraft.item.Item;

public class ItemVen extends Item {

	public ItemVen(String name) {
		this.setUnlocalizedName(name);
		this.maxStackSize = 64;
		this.setCreativeTab(VenomCraft.tabVC);
	}
}
