package net.minecraft.src;
import java.util.Random;

import net.minecraft.src.forge.ITextureProvider;

public class MithBlockOre extends Block implements ITextureProvider
{
                public MithBlockOre(int i, int j)
                {
                        super(i, j, Material.rock);
                }


        public int idDropped(int i, Random random, int j)
        {
                return mod_Runescape.blockMithril.blockID;
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