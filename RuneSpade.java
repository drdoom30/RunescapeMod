package net.minecraft.src;

import net.minecraft.src.forge.*;

public class RuneSpade extends ItemSpade implements ITextureProvider
{
        
        protected RuneSpade(int i, EnumToolMaterial enumtoolmaterial)
        {
                super(i, enumtoolmaterial);
        }
        
        public String getTextureFile()
        {
                return "/Runescape/gui/items.png";
        }

}