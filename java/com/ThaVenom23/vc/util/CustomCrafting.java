package com.ThaVenom23.vc.util;

import net.minecraft.item.ItemStack;

import com.ThaVenom23.vc.blocks.CustomBlocks;
import com.ThaVenom23.vc.items.CustomItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CustomCrafting {

	public static void init() {
		//Blocks
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockAluminium), "III", "III", "III", 'I', CustomItems.aluminiumIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockBoron), "III", "III", "III", 'I', CustomItems.boronIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockChromium), "III", "III", "III", 'I', CustomItems.chromiumIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockCobalt), "III", "III", "III", 'I', CustomItems.cobaltIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockCopper), "III", "III", "III", 'I', CustomItems.copperIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockDilithium), "III", "III", "III", 'I', CustomItems.dilithiumIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockHematite), "III", "III", "III", 'I', CustomItems.hematiteIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockIridium), "III", "III", "III", 'I', CustomItems.iridiumIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockLead), "III", "III", "III", 'I', CustomItems.leadIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockNickel), "III", "III", "III", 'I', CustomItems.nickelIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockPlatinum), "III", "III", "III", 'I', CustomItems.platinumIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockSilicon), "III", "III", "III", 'I', CustomItems.siliconIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockTin), "III", "III", "III", 'I', CustomItems.tinIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockTitanium), "III", "III", "III", 'I', CustomItems.titaniumIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockTungsten), "III", "III", "III", 'I', CustomItems.tungstenIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockUranium), "III", "III", "III", 'I', CustomItems.uraniumIngot);
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.blockZircon), "III", "III", "III", 'I', CustomItems.zirconIngot);
		
		//Items
		
		//Smelting
		GameRegistry.addSmelting(CustomBlocks.aluminiumOre, new ItemStack(CustomItems.aluminiumIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.boronOre, new ItemStack(CustomItems.boronIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.chromiumOre, new ItemStack(CustomItems.chromiumIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.cobaltOre, new ItemStack(CustomItems.cobaltIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.copperOre, new ItemStack(CustomItems.copperIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.dilithiumOre, new ItemStack(CustomItems.dilithiumIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.hematiteOre, new ItemStack(CustomItems.hematiteIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.iridiumOre, new ItemStack(CustomItems.iridiumIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.leadOre, new ItemStack(CustomItems.leadIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.nickelOre, new ItemStack(CustomItems.nickelIngot),0.1f);
		GameRegistry.addSmelting(CustomBlocks.platinumOre, new ItemStack(CustomItems.platinumIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.siliconOre, new ItemStack(CustomItems.siliconIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.tinOre, new ItemStack(CustomItems.tinIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.titaniumOre, new ItemStack(CustomItems.titaniumIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.tungstenOre, new ItemStack(CustomItems.tungstenIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.uraniumOre, new ItemStack(CustomItems.uraniumIngot), 0.1f);
		GameRegistry.addSmelting(CustomBlocks.zirconOre, new ItemStack(CustomItems.zirconIngot), 0.1f);
	}

}