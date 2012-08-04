package net.minecraft.src;

import net.minecraft.src.forge.*;

public class RuneHoe extends ItemHoe implements ITextureProvider
{
        
        protected RuneHoe(int i, EnumToolMaterial enumtoolmaterial)
        {
                super(i, enumtoolmaterial);
        }
        
        public String getTextureFile()
        {
        	 return "/Runescape/gui/items.png";
        }

}