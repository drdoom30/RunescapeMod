package net.minecraft.src;
import java.util.Random;

import net.minecraft.src.forge.ITextureProvider;

public class RuneBlockOre extends Block implements ITextureProvider
{
                public RuneBlockOre(int i, int j)
                {
                        super(i, j, Material.iron);
                }


        public int idDropped(int i, Random random, int j)
        {
                return mod_Runescape.blockRune.blockID;
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