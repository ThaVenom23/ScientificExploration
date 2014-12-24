package com.ThaVenom23.vc;

import com.ThaVenom23.vc.items.CustomItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class VCTab extends CreativeTabs {

	public VCTab(int id, String label) {
		super(id, label);

	}

	@Override
	public Item getTabIconItem() {

		return CustomItems.zirconIngot;
	}

}
