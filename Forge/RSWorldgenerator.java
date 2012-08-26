package net.minecraft.src;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import cpw.mods.fml.common.IWorldGenerator;

public class RSWorldgenerator implements IWorldGenerator 
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	 {
	  switch (world.provider.worldType)
	  {
	   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
	   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
	  }
	 }	
	 private void generateNether(World world, Random random, int blockX, int blockY) 
	 {
	  
	 }
	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	  for(int i = 0; i < 7; i++)
      {
              int randPosX = chunkX + random.nextInt(16);
              int randPosY = random.nextInt(20);
              int randPosZ = chunkZ + random.nextInt(16);
              (new WorldGenMinable(mod_Runescape.blockRune.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
      }
      
      for(int i = 0; i < 7; i++)
      {
              int randPosX = chunkX + random.nextInt(16);
              int randPosY = random.nextInt(20);
              int randPosZ = chunkZ + random.nextInt(16);
              (new WorldGenMinable(mod_Runescape.blockDragon.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
      }
      
      for(int i = 0; i < 7; i++)
      {
              int randPosX = chunkX + random.nextInt(16);
              int randPosY = random.nextInt(128);
              int randPosZ = chunkZ + random.nextInt(16);
              (new WorldGenMinable(mod_Runescape.blockBronze.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
      }
      
      for(int i = 0; i < 7; i++)
      {
              int randPosX = chunkX + random.nextInt(16);
              int randPosY = random.nextInt(60);
              int randPosZ = chunkZ + random.nextInt(16);
              (new WorldGenMinable(mod_Runescape.blockSteel.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
      }
      
      for(int i = 0; i < 7; i++)
      {
              int randPosX = chunkX + random.nextInt(16);
              int randPosY = random.nextInt(40);
              int randPosZ = chunkZ + random.nextInt(16);
              (new WorldGenMinable(mod_Runescape.blockAdamantite.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
      }
      for(int i = 0; i < 7; i++)
      {
              int randPosX = chunkX + random.nextInt(16);
              int randPosY = random.nextInt(50);
              int randPosZ = chunkZ + random.nextInt(16);
              (new WorldGenMinable(mod_Runescape.blockMithril.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
      }
      
}
 

}
