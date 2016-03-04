package intricateoreprocessing;

import java.util.Random;

import mountainLily.MountainLily;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.GeneratorBushFeature;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.getDimensionId()) {
	    case 0: //Overworld
	    	
	    	generateSurface(world, random, chunkX * 16, chunkZ * 16);
	    	
	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	
	}
	
	public void flowerGen(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	}
	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		for (int k = 0; k < 16; k++) {
			int firstBlockXCoord = chunkX + rand.nextInt(16);
			int firstBlockZCoord = chunkZ + rand.nextInt(16);
			
			int intricateoreprocessingY = rand.nextInt(256);
			int pD = rand.nextInt(16);
			int pG = rand.nextInt(30);
			int pI = rand.nextInt(64);
			int pL = rand.nextInt(14);
			int pR = rand.nextInt(24);
			int highFlower = rand.nextInt(256);
			
			BlockPos flower = new BlockPos(firstBlockXCoord, highFlower, firstBlockZCoord);

			
			BlockPos pdbp = new BlockPos(firstBlockXCoord, pD, firstBlockZCoord);
			BlockPos intricateoreprocessingPos = new BlockPos(firstBlockXCoord, intricateoreprocessingY, firstBlockZCoord);
			BlockPos pgbp = new BlockPos(firstBlockXCoord, pG, firstBlockZCoord);
			BlockPos pibp = new BlockPos(firstBlockXCoord, pI, firstBlockZCoord);
			BlockPos plbp = new BlockPos(firstBlockXCoord, pL, firstBlockZCoord);
			BlockPos prbp = new BlockPos(firstBlockXCoord, pR, firstBlockZCoord);
			BlockPos limestonePos = new BlockPos(firstBlockXCoord, intricateoreprocessingY, firstBlockZCoord);
			
//			BlockPos rcbp = new BlockPos(firstBlockXCoord, intricateoreprocessingY, firstBlockZCoord);
//			BlockPos rdbp = new BlockPos(firstBlockXCoord, pD, firstBlockZCoord);
			
			new WorldGenMinable(poorCoalOre.StartupCommon.blockPoorCoalOre.getDefaultState(), 12).generate(world, rand, intricateoreprocessingPos);
			new WorldGenMinable(poorDiamondOre.StartupCommon.blockPoorDiamondOre.getDefaultState(), 3).generate(world, rand, pdbp);
			new WorldGenMinable(poorGoldOre.StartupCommon.blockPoorGoldOre.getDefaultState(), 5).generate(world, rand, pgbp);
			new WorldGenMinable(poorIronOre.StartupCommon.blockPoorIronOre.getDefaultState(), 6).generate(world, rand, pibp);
			new WorldGenMinable(poorLapisOre.StartupCommon.blockPoorLapisOre.getDefaultState(), 3).generate(world, rand, plbp);
			new WorldGenMinable(poorRedstoneOre.StartupCommon.blockPoorRedstoneOre.getDefaultState(), 4).generate(world, rand, prbp);

			new WorldGenMinable(richCoalOre.StartupCommon.blockRichCoalOre.getDefaultState(), 12).generate(world, rand, intricateoreprocessingPos);
			new WorldGenMinable(richDiamondOre.StartupCommon.blockRichDiamondOre.getDefaultState(), 3).generate(world, rand, pdbp);
			new WorldGenMinable(richGoldOre.StartupCommon.blockRichGoldOre.getDefaultState(), 5).generate(world, rand, pgbp);
			new WorldGenMinable(richIronOre.StartupCommon.blockRichIronOre.getDefaultState(), 6).generate(world, rand, pibp);
			new WorldGenMinable(richLapisOre.StartupCommon.blockRichLapisOre.getDefaultState(), 3).generate(world, rand, plbp);
			new WorldGenMinable(richRedstoneOre.StartupCommon.blockRichRedstoneOre.getDefaultState(), 4).generate(world, rand, prbp);			

			new WorldGenMinable(limestone.StartupCommon.blockLimestone.getDefaultState(), 25).generate(world, rand, limestonePos);
			
			
			int randPosY = rand.nextInt(256);
			BlockPos new_pos = new BlockPos(firstBlockXCoord, randPosY, firstBlockZCoord);
			if (world.getBiomeGenForCoords(new_pos).equals(BiomeGenBase.extremeHills)) {
			
			new GeneratorBushFeature((MountainLily)mountainLily.StartupCommon.blockMountainLily).generate(world, rand, new BlockPos(firstBlockXCoord, randPosY, firstBlockZCoord));
			}
		}
		
		
		
		
		
		
	}
	
}