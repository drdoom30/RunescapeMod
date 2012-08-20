package net.minecraft.src;

import net.minecraft.src.forge.*;

public class RuneSword extends ItemSword implements ITextureProvider
{
        
        protected RuneSword(int i, EnumToolMaterial enumtoolmaterial)
        {
                super(i, enumtoolmaterial);
        }
        
        public String getTextureFile()
        {
                return "/Runescape/gui/items.png";
        }

}