package net.minecraft.src;
import java.util.Random;

import net.minecraft.src.forge.ITextureProvider;

public class AddyBlockOre extends Block implements ITextureProvider
{
                public AddyBlockOre(int i, int j)
                {
                        super(i, j, Material.rock);
                }


        public int idDropped(int i, Random random, int j)
        {
                return mod_Runescape.blockAdamantite.blockID;
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