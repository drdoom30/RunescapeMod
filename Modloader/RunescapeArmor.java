package net.minecraft.src;

public class RunescapeArmor extends ItemArmor {

	 private static final int maxDamageArray[] = {
         11, 16, 15, 13
 };
 public final int armorType;
 public final int damageReduceAmount;
 public final int renderIndex;
 private final RunescapeArmorMaterial material;

 public RunescapeArmor(int i, RunescapeArmorMaterial enumarmormaterial, int j, int k)
 {
         super(i, EnumArmorMaterial.CLOTH, j, k);
         material = enumarmormaterial;
         armorType = k;
         renderIndex = j;
         damageReduceAmount = enumarmormaterial.getDamageReductionAmount(k);
         setMaxDamage(enumarmormaterial.func_40576_a(k));
         maxStackSize = 1;
 }

 public int getItemEnchantability()
 {
         return material.getEnchantability();
 }

 static int[] getMaxDamageArray()
 {
         return maxDamageArray;
 }
 
 public String getArmorTextureFile(ItemStack itemstack)
 {
 	if(itemstack.itemID == mod_Runescape.helmetRune.shiftedIndex || itemstack.itemID == mod_Runescape.plateRune.shiftedIndex || itemstack.itemID == mod_Runescape.bootsRune.shiftedIndex)
         {
                 return "/Runescape/armor/Rune_1.png";
         }
         if(itemstack.itemID == mod_Runescape.legsRune.shiftedIndex)
         {
                 return "/Runescape/armor/Rune_2.png";
         }
                         
         if(itemstack.itemID == mod_Runescape.helmetBronze.shiftedIndex || itemstack.itemID == mod_Runescape.plateBronze.shiftedIndex || itemstack.itemID == mod_Runescape.bootsBronze.shiftedIndex)
         {
                 return "/Runescape/armor/Bronze_1.png";
         }
         if(itemstack.itemID == mod_Runescape.legsBronze.shiftedIndex)
         {
                 return "/Runescape/armor/Bronze_2.png";
         }
         
         if(itemstack.itemID == mod_Runescape.helmetSteel.shiftedIndex || itemstack.itemID == mod_Runescape.plateSteel.shiftedIndex || itemstack.itemID == mod_Runescape.bootsSteel.shiftedIndex)
         {
                 return "/Runescape/armor/Steel_1.png";
         }
         if(itemstack.itemID == mod_Runescape.legsSteel.shiftedIndex)
         {
                 return "/Runescape/armor/Steel_2.png";
         }
         
         if(itemstack.itemID == mod_Runescape.helmetAdamantite.shiftedIndex || itemstack.itemID == mod_Runescape.plateAdamantite.shiftedIndex || itemstack.itemID == mod_Runescape.bootsAdamantite.shiftedIndex)
         {
                 return "/Runescape/armor/Adamantite_1.png";
         }
         if(itemstack.itemID == mod_Runescape.legsAdamantite.shiftedIndex)
         {
                 return "/Runescape/armor/Adamantite_2.png";
         }
         
         if(itemstack.itemID == mod_Runescape.helmetDragon.shiftedIndex || itemstack.itemID == mod_Runescape.plateDragon.shiftedIndex || itemstack.itemID == mod_Runescape.bootsDragon.shiftedIndex)
         {
                 return "/Runescape/armor/Dragon_1.png";
         }
         if(itemstack.itemID == mod_Runescape.legsDragon.shiftedIndex)
         {
                 return "/Runescape/armor/Dragon_2.png";
         }
         
         if(itemstack.itemID == mod_Runescape.helmetMithril.shiftedIndex || itemstack.itemID == mod_Runescape.plateMithril.shiftedIndex || itemstack.itemID == mod_Runescape.bootsMithril.shiftedIndex)
         {
                 return "/Runescape/armor/Mithril_1.png";
         }
         if(itemstack.itemID == mod_Runescape.legsMithril.shiftedIndex)
         {
                 return "/Runescape/armor/Mithril_2.png";
         }
         
         return  "/Runescape/armor/Rune_1.png";
         
         
         
 }

}
