package net.minecraft.src;

import net.minecraft.src.forge.*;

public class RuneAxe extends ItemAxe implements ITextureProvider
{
        
        protected RuneAxe(int i, EnumToolMaterial enumtoolmaterial)
        {
                super(i, enumtoolmaterial);
        }
        
        public String getTextureFile()
        {
        	 return "/Runescape/gui/items.png";
        }

}