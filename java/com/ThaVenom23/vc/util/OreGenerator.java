package com.ThaVenom23.vc.util;

import java.util.Random;

import com.ThaVenom23.vc.blocks.CustomBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
 
public class OreGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1:
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateInOverworld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateInEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
		
	}

	private void generateInEnd(World world, Random random, int x, int z) {
		
		
	}


	private void generateInOverworld(World world, Random random, int x, int z) {
		//Ore Generation  //25 is the rarity variable  //chunkY is how high it can generate Ex:diamond at 14 or iron at 64
		//placeholder for(int i = 0; i < 25; i ++) {
		//placeholder int chunkX = x + random.nextInt(16);
		//placeholder int chunkY = random.nextInt(64);
		//placeholder int chunkZ = z + random.nextInt(16);
			
		//placeholder 	(new WorldGenMinable(CustomBlocks.aluminiumOre, 6)).generate(world, random, chunkX, chunkY, chunkZ);
		//placeholder }
		
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.aluminiumOre, 6)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(30);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.boronOre, 6)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(13);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.chromiumOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(13);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.cobaltOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.copperOre, 10)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(13);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.dilithiumOre, 1)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.Granite, 50)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.hematiteOre, 10)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(14);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.iridiumOre, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.leadOre, 8)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(256);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.Marble, 50)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.nickelOre, 9)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(25);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.platinumOre, 6)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.siliconOre, 10)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.tinOre, 8)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(30);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.titaniumOre, 7)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(30);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.tungstenOre, 7)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(14);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.uraniumOre, 1)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 25; i ++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CustomBlocks.zirconOre, 9)).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}

	private void generateInNether(World world, Random random, int x, int z) {
		
		
	}
	
}
