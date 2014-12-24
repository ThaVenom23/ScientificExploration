package com.ThaVenom23.vc.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class CustomBlocks {

	//Blocks
	//public static Block BlockVenStone = new BlockVenStone(Material.rock, 2001);
	public static Block Marble = new BlockMarble(Material.rock, 3001);
	public static Block marbleBrick = new BlockMarbleBrick(Material.rock, 3002);
	public static Block Granite = new BlockGranite(Material.rock, 3003);
	
	//Ores
	public static Block aluminiumOre = new OreAluminium(Material.rock, 3010);
	public static Block boronOre = new OreBoron(Material.rock, 3011);
	public static Block chromiumOre = new OreChromium(Material.rock, 3012);
	public static Block cobaltOre = new OreCobalt(Material.rock, 3013);
	public static Block copperOre = new OreCopper(Material.rock, 3014);
	public static Block dilithiumOre = new OreDilithium(Material.rock, 3015);
	public static Block hematiteOre = new OreHematite(Material.rock, 3016);
	public static Block iridiumOre = new OreIridium(Material.rock, 3017);
	public static Block leadOre = new OreLead(Material.rock, 3018);
	public static Block nickelOre = new OreNickel(Material.rock, 3019);
	public static Block platinumOre = new OrePlatinum(Material.rock, 3020);
	public static Block siliconOre = new OreSilicon(Material.rock, 3021);
	public static Block tinOre = new OreTin(Material.rock, 3022);
	public static Block titaniumOre = new OreTitanium(Material.rock, 3023);
	public static Block tungstenOre = new OreTungsten(Material.rock, 3024);
	public static Block uraniumOre = new OreUranium(Material.rock, 3025);
	public static Block zirconOre = new OreZircon(Material.rock, 3026);
	
	//Metal/Gem Blocks
	public static Block blockAluminium = new BlockAluminium(Material.iron, 4000);
	public static Block blockBoron = new BlockBoron(Material.iron, 4001);
	public static Block blockChromium = new BlockChromium(Material.iron, 4002);
	public static Block blockCobalt = new BlockCobalt(Material.iron, 4003);
	public static Block blockCopper = new BlockCopper(Material.iron, 4004);
	public static Block blockDilithium = new BlockDilithium(Material.iron, 4005);
	public static Block blockHematite = new BlockHematite(Material.iron, 4006);
	public static Block blockIridium = new BlockIridium(Material.iron, 4007);
	public static Block blockLead = new BlockLead(Material.iron, 4008);
	public static Block blockNickel = new BlockNickel(Material.iron, 4009);
	public static Block blockPlatinum = new BlockPlatinum(Material.iron, 4010);
	public static Block blockSilicon = new BlockSilicon(Material.iron, 4011);
	public static Block blockTin = new BlockTin(Material.iron, 4012);
	public static Block blockTitanium = new BlockTitanium(Material.iron, 4013);
	public static Block blockTungsten = new BlockTungsten(Material.iron, 4014);
	public static Block blockUranium = new BlockUranium(Material.iron, 4015);
	public static Block blockZircon = new BlockZircon(Material.iron, 4016);
	

	
	public static void init() {
		//Register Blocks
		registerBlock(marbleBrick, "Marble Brick", 3002);
		registerBlock(blockAluminium, "Aluminium Block", 4000);
		registerBlock(blockBoron, "Boron Block", 4001);
		registerBlock(blockChromium, "Chromium Block", 4002);
		registerBlock(blockCobalt, "Cobalt Block", 4003);
		registerBlock(blockCopper, "Copper Block", 4004);
		registerBlock(blockDilithium, "Dilithium Block", 4005);
		registerBlock(blockHematite, "Hematite Block", 4006);
		registerBlock(blockIridium, "Iridium Block", 4007);
		registerBlock(blockLead, "Lead Block", 4008);
		registerBlock(blockNickel, "Nickel Block", 4009);
		registerBlock(blockPlatinum, "Platinum Block", 4010);
		registerBlock(blockSilicon, "Silicon Block", 4011);
		registerBlock(blockTin, "Tin Block", 4012);
		registerBlock(blockTitanium, "Titanium Block", 4013);
		registerBlock(blockTungsten, "Tungsten Block", 4014);
		registerBlock(blockUranium, "Uranium Block", 4015);
		registerBlock(blockZircon, "Zircon Block", 4016);
		
		//Register Ores
		registerOre(Marble, "Marble", 3001);
		registerOre(Granite, "Granite", 3003);
		registerOre(aluminiumOre, "Aluminium Ore", 3010);
		registerOre(boronOre, "Boron Ore", 3011);
		registerOre(chromiumOre, "Chromium Ore", 3012);
		registerOre(cobaltOre, "Cobalt Ore", 3013);
		registerOre(copperOre, "Copper Ore", 3014);
		registerOre(dilithiumOre, "Dilithium Ore", 3015);
		registerOre(hematiteOre, "Hematite Ore", 3016);
		registerOre(iridiumOre, "Iridium Ore", 3017);
		registerOre(leadOre, "Lead Ore", 3018);
		registerOre(nickelOre, "Nickel Ore", 3019);
		registerOre(platinumOre, "Platinum Ore", 3020);
		registerOre(siliconOre, "Silicon Ore", 3021);
		registerOre(tinOre, "Tin Ore", 3022);
		registerOre(titaniumOre, "Titanium Ore", 3023);
		registerOre(tungstenOre, "Tungsten Ore", 3024);
		registerOre(uraniumOre, "Uranium Ore", 3025);
		registerOre(zirconOre, "Zircon Ore", 3026);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void registerOre(Block ore, String name, int id)
	{
		GameRegistry.registerBlock(ore, name);
		LanguageRegistry.addName(ore, name);
		OreDictionary.registerOre(id, ore);
	}
	
	@SuppressWarnings("deprecation")
	public static void registerBlock(Block block, String name, int id)
	{
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
		OreDictionary.registerOre(id, block);
	}
}
