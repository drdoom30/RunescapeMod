package net.minecraft.src;
import java.util.Random;

import net.minecraft.src.forge.ITextureProvider;

public class BronzeBlockOre extends Block implements ITextureProvider
{
                public BronzeBlockOre(int i, int j)
                {
                        super(i, j, Material.rock);
                }


        public int idDropped(int i, Random random, int j)
        {
                return mod_Runescape.blockBronze.blockID;
        }
        public int quantityDropped(Random random)
        {
                                return 1;
        }
        public String getTextureFile()
        {
                return "/Runescape/gui/terrian.png";
        }
        
        
        
}