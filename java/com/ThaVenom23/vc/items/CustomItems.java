package com.ThaVenom23.vc.items;

import net.minecraft.item.Item;

import com.ThaVenom23.vc.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CustomItems {

		//public static ItemVen ven = new ItemVen("Ven");
		
		public static Item nickelIngot = new ItemIngot("Nickel Ingot").setTextureName("nickel_ingot");
		public static Item copperIngot = new ItemIngot("Copper Ingot").setTextureName("copper_ingot");
		public static Item leadIngot = new ItemIngot("Lead Ingot").setTextureName("lead_ingot");
		public static Item tungstenIngot = new ItemIngot("Tungsten Ingot").setTextureName("tungsten_ingot");
		public static Item siliconIngot = new ItemIngot("Silicon").setTextureName("silicon_ingot");
		public static Item iridiumIngot = new ItemIngot("Iridium Ingot").setTextureName("iridium_ingot");
		public static Item zirconIngot = new ItemIngot("Zircon").setTextureName("zircon_ingot");
		public static Item hematiteIngot = new ItemIngot("Hematite Ingot").setTextureName("hematite_ingot");
		public static Item aluminiumIngot = new ItemIngot("Aluminium Ingot").setTextureName("aluminium_ingot");
		public static Item tinIngot = new ItemIngot("Tin Ingot").setTextureName("tin_ingot");
		public static Item titaniumIngot = new ItemIngot("Titanium Ingot").setTextureName("titanium_ingot");
		public static Item boronIngot = new ItemIngot("Boron Ingot").setTextureName("boron_ingot");
		public static Item uraniumIngot = new ItemIngot("Uranium Ingot").setTextureName("uranium_ingot");
		public static Item cobaltIngot = new ItemIngot("Cobalt Ingot").setTextureName("cobalt_ingot");
		public static Item chromiumIngot = new ItemIngot("Chromium Ingot").setTextureName("chromium_ingot");
		public static Item platinumIngot = new ItemIngot("Platinum Ingot").setTextureName("platinum_ingot");
		public static Item dilithiumIngot = new ItemIngot("Dilithium Crystal").setTextureName("dilithium_ingot");
		
		
		public static void init() {
			registerItem(nickelIngot, "Nickel Ingot", References.MODID + ":" + "nickel_ingot");
			registerItem(copperIngot, "Copper Ingot", References.MODID + ":" + "copper_ingot");
			registerItem(leadIngot, "Lead Ingot", References.MODID + ":" + "lead_ingot");
			registerItem(tungstenIngot, "Tungsten Ingot", References.MODID + ":" + "tungsten_ingot");
			registerItem(siliconIngot, "Silicon", References.MODID + ":" + "silicon_ingot");
			registerItem(iridiumIngot, "Iridium Ingot", References.MODID + ":" + "iridium_ingot");
			registerItem(zirconIngot, "Zircon", References.MODID + ":" + "zircon_ingot");
			registerItem(hematiteIngot, "Hematite Ingot", References.MODID + ":" + "hematite_ingot");
			registerItem(aluminiumIngot, "Aluminium Ingot", References.MODID + ":" + "aluminium_ingot");
			registerItem(tinIngot, "Tin Ingot", References.MODID + ":" + "tin_ingot");
			registerItem(titaniumIngot, "Titanium Ingot", References.MODID + ":" + "titanium_ingot");
			registerItem(boronIngot, "Boron Ingot", References.MODID + ":" + "boron_ingot");
			registerItem(uraniumIngot, "Uranium Ingot", References.MODID + ":" + "uranium_ingot");
			registerItem(cobaltIngot, "Cobalt Ingot", References.MODID + ":" + "cobalt_ingot");
			registerItem(chromiumIngot, "Chromium Ingot", References.MODID + ":" + "chromium_ingot");
			registerItem(platinumIngot, "Platinum Ingot", References.MODID + ":" + "platinum_ingot");
			registerItem(dilithiumIngot, "Dilithium Crystal", References.MODID + ":" + "dilithium_ingot");
		
		}

		@SuppressWarnings("deprecation")
		private static void registerItem(Item item, String name, String texture) {
			GameRegistry.registerItem(item, name);
			LanguageRegistry.addName(item, name);
			item.setTextureName(texture);
			item.setUnlocalizedName(name);

		}
}
