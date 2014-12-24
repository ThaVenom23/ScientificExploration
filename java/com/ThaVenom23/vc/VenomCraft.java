package com.ThaVenom23.vc;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import com.ThaVenom23.vc.VCTab;
import com.ThaVenom23.vc.blocks.CustomBlocks;
import com.ThaVenom23.vc.items.CustomItems;
import com.ThaVenom23.vc.lib.References;
import com.ThaVenom23.vc.proxy.ProxyCommon;
import com.ThaVenom23.vc.util.CustomCrafting;
import com.ThaVenom23.vc.util.OreGenerator;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)

public class VenomCraft {

	//CreativeTab
	public static VCTab creativeTab;
	public static CreativeTabs tabVC = new VCTab(CreativeTabs.getNextID(), "vctab");
	
	//Generator
	 public OreGenerator oreGen = new OreGenerator();

	//Proxy
	@SidedProxy(clientSide = "com.ThaVenom23.vc.proxy.ProxyClient", serverSide = "com.ThaVenom23.vc.proxy.ProxyCommon")
	public static ProxyCommon proxy;

	@EventHandler
	public void preinit(FMLInitializationEvent event) {
		
		//1st param Itemstack, 2nd param exp float
		//GameRegistry.addSmelting(CustomBlocks.BlockVenStone, new ItemStack(CustomItems.ven), 0.1f);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		//WorldGen
		GameRegistry.registerWorldGenerator(oreGen, 1);
		
		//Blocks
		CustomBlocks.init();
		
		//Items
		CustomItems.init();
		
		//Crafting
		CustomCrafting.init();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
}
