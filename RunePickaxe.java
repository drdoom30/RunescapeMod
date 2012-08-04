package net.minecraft.src;

import net.minecraft.src.forge.*;

public class RunePickaxe extends ItemPickaxe implements ITextureProvider
{
        
        protected RunePickaxe(int i, EnumToolMaterial enumtoolmaterial)
        {
                super(i, enumtoolmaterial);
        }
        
        public String getTextureFile()
        {
        	 return "/Runescape/gui/items.png";
        }

}