package net.minecraft.src;

import java.io.File;
import java.util.*;
import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.*;

public class mod_Runescape extends BaseMod{
	
	  static Configuration lmconfiguration = new Configuration(new File(Minecraft.getMinecraftDir(), "config/Runescape.cfg"));
	
	    static int RuneBlockID = configurationProperties();
		static int BronzeBlockID = configurationProperties();
		static int SteelBlockID = configurationProperties();
		static int AdamantiteBlockID = configurationProperties();
		static int MithrilBlockID = configurationProperties();
		static int DragonBlockID = configurationProperties();
		
		static int BronzeignotShiftedIndex;
		static int RuneignotShiftedIndex;
		static int SteelignotShiftedIndex;
		static int AdamantiteignotShiftedIndex;
		static int MithrilignotShiftedIndex;
		static int DragonignotShiftedIndex;
		
		static int RuneHelmetShiftedIndex ;
		static int RuneLegsShiftedIndex;
		static int RunePlateShiftedIndex;
		static int RuneBootShiftedIndex;
		static int RunehoeShiftedIndex;
		static int RuneaxeShiftedIndex;
		static int RuneswordShiftedIndex;
		static int RunepickShiftedIndex;     
		static int RuneshovelShiftedIndex;
		
		static int DragonHelmetShiftedIndex ;
		static int DragonLegsShiftedIndex;
		static int DragonPlateShiftedIndex;
		static int DragonBootShiftedIndex;
		static int DragonhoeShiftedIndex;
		static int DragonaxeShiftedIndex;
		static int DragonswordShiftedIndex;
		static int DragonpickShiftedIndex;     
		static int DragonshovelShiftedIndex;
	     
		
		static int BronzeHelmetShiftedIndex ;
		static int BronzeLegsShiftedIndex;
		static int BronzePlateShiftedIndex;
		static int BronzeBootShiftedIndex;
		static int BronzehoeShiftedIndex;
		static int BronzeaxeShiftedIndex;
		static int BronzeswordShiftedIndex;
		static int BronzepickShiftedIndex;     
		static int BronzeshovelShiftedIndex;
	    
		
		static int SteelHelmetShiftedIndex ;
		static int SteelLegsShiftedIndex;
		static int SteelPlateShiftedIndex;
		static int SteelBootShiftedIndex;
		static int SteelhoeShiftedIndex;
		static int SteelaxeShiftedIndex;
		static int SteelswordShiftedIndex;
		static int SteelpickShiftedIndex;     
		static int SteelshovelShiftedIndex;
		
		static int AdamantiteHelmetShiftedIndex ;
		static int AdamantiteLegsShiftedIndex;
		static int AdamantitePlateShiftedIndex;
		static int AdamantiteBootShiftedIndex;
		static int AdamantitehoeShiftedIndex;
		static int AdamantiteaxeShiftedIndex;
		static int AdamantiteswordShiftedIndex;
		static int AdamantitepickShiftedIndex;     
		static int AdamantiteshovelShiftedIndex;
		
		static int MithrilHelmetShiftedIndex ;
		static int MithrilLegsShiftedIndex;
		static int MithrilPlateShiftedIndex;
		static int MithrilBootShiftedIndex;
		static int MithrilhoeShiftedIndex;
		static int MithrilaxeShiftedIndex;
		static int MithrilswordShiftedIndex;
		static int MithrilpickShiftedIndex;     
		static int MithrilshovelShiftedIndex;
		
		
	
	static EnumArmorMaterial Rune = EnumHelper.addArmorMaterial("RUNE", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumToolMaterial RuneT = EnumHelper.addToolMaterial("RUNE", 3, 1561, 8.0F, 3, 10);
	
	static EnumArmorMaterial Dragon = EnumHelper.addArmorMaterial("Dragon", 48, new int[]{3, 10, 8, 3}, 20);
	static EnumToolMaterial DragonT = EnumHelper.addToolMaterial("Dragon", 3, 2015, 8.0F, 3, 10);
	
	static EnumArmorMaterial Bronze = EnumHelper.addArmorMaterial("BRONZE", 11, new int[] {3, 6, 5, 2}, 9);
	static EnumToolMaterial BronzeT = EnumHelper.addToolMaterial("BRONZE", 1, 131, 4.0F, 1, 5);
	
	static EnumArmorMaterial Steel = EnumHelper.addArmorMaterial("STEEL", 7, new int[] {1, 4, 3, 2}, 9);
	static EnumToolMaterial SteelT = EnumHelper.addToolMaterial("STEEL", 2, 250, 6.0F, 2, 14);
	
	static EnumArmorMaterial Adamantite = EnumHelper.addArmorMaterial("ADDY", 28, new int[]{2, 6, 4, 1}, 25);
	static EnumToolMaterial AdamantiteT = EnumHelper.addToolMaterial("ADDY", 3, 1123, 12.0F, 3, 22);
	
	static EnumArmorMaterial Mithril = EnumHelper.addArmorMaterial("MITH", 28, new int[]{2, 6, 4, 1}, 25);
	static EnumToolMaterial MithrilT = EnumHelper.addToolMaterial("MITH", 3, 1123, 12.0F, 3, 22);
	
	public static final Block blockRune = new RuneBlockOre(RuneBlockID, 0).setHardness(3F).setResistance(5F).setStepSound(Block.soundStoneFootstep).setBlockName("Rune Ore");
    public static final Block blockBronze = new BronzeBlockOre(BronzeBlockID, 1).setHardness(3F).setResistance(5F).setStepSound(Block.soundStoneFootstep).setBlockName("Bronze Ore");
    public static final Block blockSteel = new SteelBlockOre(SteelBlockID, 2).setHardness(3F).setResistance(5F).setStepSound(Block.soundStoneFootstep).setBlockName("Steel Ore");
    public static final Block blockAdamantite = new AddyBlockOre(AdamantiteBlockID, 3).setHardness(3F).setResistance(5F).setStepSound(Block.soundStoneFootstep).setBlockName("Adamantite Ore");
    public static final Block blockMithril = new MithBlockOre(MithrilBlockID, 4).setHardness(3F).setResistance(5F).setStepSound(Block.soundStoneFootstep).setBlockName("Mithril Ore");
    public static final Block blockDragon = new DragonBlockOre(DragonBlockID, 5).setHardness(3F).setResistance(5F).setStepSound(Block.soundStoneFootstep).setBlockName("Dragonite Ore");
    
	public static final Item bootsRune = (new RuneScapeArmor(RuneBootShiftedIndex-256, Rune, 8, 3)).setIconCoord(0, 0).setItemName("Rune Boots");
    public static final Item helmetRune = (new RuneScapeArmor(RuneHelmetShiftedIndex-256, Rune, 8, 0)).setIconCoord(1, 0).setItemName("Rune Helmet");
    public static final Item plateRune = (new RuneScapeArmor(RunePlateShiftedIndex-256, Rune, 8, 1)).setIconCoord(2, 0).setItemName("Rune Chest");
    public static final Item legsRune = (new RuneScapeArmor(RuneLegsShiftedIndex-256, Rune, 8, 2)).setIconCoord(3, 0).setItemName("Rune Legs");
    
    public static final Item shovelRune = (new RuneSpade(RuneshovelShiftedIndex-256, RuneT)).setIconCoord(4, 0).setItemName("Rune Shovel");
    public static final Item pickaxeRune = (new RunePickaxe(RunepickShiftedIndex-256, RuneT)).setIconCoord(5, 0).setItemName("Rune Pickaxe");
    public static final Item axeRune = (new RuneAxe(RuneaxeShiftedIndex-256, RuneT)).setIconCoord(6, 0).setItemName("Rune Hatchet");
    public static final Item swordRune = (new RuneSword(RuneswordShiftedIndex-256, RuneT)).setIconCoord(7, 0).setItemName("Rune Sword");
    public static final Item hoeRune = (new RuneHoe(RunehoeShiftedIndex-256, RuneT)).setIconCoord(8,0).setItemName("Rune Hoe");
    
    public static final Item Runeignot = (new Runeignot(RuneignotShiftedIndex-256)).setIconCoord(9,0).setItemName("Rune Ignot");
    public static final Item Bronzeignot = (new Runeignot(BronzeignotShiftedIndex-256)).setIconCoord(10,0).setItemName("Bronze Ignot");
    public static final Item Steelignot = (new Runeignot(SteelignotShiftedIndex-256)).setIconCoord(4,1).setItemName("Steel Ignot");
    public static final Item Adamantiteignot = (new Runeignot(AdamantiteignotShiftedIndex-256)).setIconCoord(14,1).setItemName("Adamantite Ignot");
    public static final Item Mithrilignot = (new Runeignot(MithrilignotShiftedIndex-256)).setIconCoord(8,2).setItemName("Mithril Ignot");
    public static final Item Dragonignot = (new Runeignot(DragonignotShiftedIndex-256)).setIconCoord(2,3).setItemName("Dragonite Ignot");
    
    public static final Item bootsBronze = (new RuneScapeArmor(BronzeBootShiftedIndex-256, Bronze, 9, 3)).setIconCoord(11, 0).setItemName("Bronze Boots");
    public static final Item helmetBronze = (new RuneScapeArmor(BronzeHelmetShiftedIndex-256, Bronze, 9, 0)).setIconCoord(12, 0).setItemName("Bronze Helmet");
    public static final Item plateBronze = (new RuneScapeArmor(BronzePlateShiftedIndex-256, Bronze, 9, 1)).setIconCoord(13, 0).setItemName("Bronze Chest");
    public static final Item legsBronze = (new RuneScapeArmor(BronzeLegsShiftedIndex-256, Bronze, 9, 2)).setIconCoord(14, 0).setItemName("Bronze Legs");
    
    public static final Item shovelBronze = (new RuneSpade(BronzeshovelShiftedIndex-256, BronzeT)).setIconCoord(15, 0).setItemName("Bronze Shovel");
    public static final Item pickaxeBronze = (new RunePickaxe(BronzepickShiftedIndex-256, BronzeT)).setIconCoord(0,1).setItemName("Bronze Pickaxe");
    public static final Item axeBronze = (new RuneAxe(BronzeaxeShiftedIndex-256, BronzeT)).setIconCoord(1, 1).setItemName("Bronze Hatchet");
    public static final Item swordBronze = (new RuneSword(BronzeswordShiftedIndex-256, BronzeT)).setIconCoord(2, 1).setItemName("Bronze Sword");
    public static final Item hoeBronze = (new RuneHoe(BronzehoeShiftedIndex-256, BronzeT)).setIconCoord(3,1).setItemName("Bronze Hoe");
    
    public static final Item bootsSteel = (new RuneScapeArmor(SteelBootShiftedIndex-256, Steel, 10, 3)).setIconCoord(5, 1).setItemName("Steel Boots");
    public static final Item helmetSteel = (new RuneScapeArmor(SteelHelmetShiftedIndex-256, Steel, 10, 0)).setIconCoord(6, 1).setItemName("Steel Helmet");
    public static final Item plateSteel = (new RuneScapeArmor(SteelPlateShiftedIndex-256, Steel, 10, 1)).setIconCoord(7, 1).setItemName("Steel Chest");
    public static final Item legsSteel = (new RuneScapeArmor(SteelLegsShiftedIndex-256, Steel, 10, 2)).setIconCoord(8, 1).setItemName("Steel Legs");
    
    public static final Item shovelSteel = (new RuneSpade(SteelshovelShiftedIndex-256, SteelT)).setIconCoord(9, 1).setItemName("Steel Shovel");
    public static final Item pickaxeSteel = (new RunePickaxe(SteelpickShiftedIndex-256, SteelT)).setIconCoord(10,1).setItemName("Steel Pickaxe");
    public static final Item axeSteel = (new RuneAxe(SteelaxeShiftedIndex-256, SteelT)).setIconCoord(11, 1).setItemName("Steel Hatchet");
    public static final Item swordSteel = (new RuneSword(SteelswordShiftedIndex-256, SteelT)).setIconCoord(12, 1).setItemName("Steel Sword");
    public static final Item hoeSteel = (new RuneHoe(SteelhoeShiftedIndex-256, SteelT)).setIconCoord(13,1).setItemName("Steel Hoe");
    
    public static final Item bootsAdamantite = (new RuneScapeArmor(AdamantiteBootShiftedIndex-256, Adamantite, 10, 3)).setIconCoord(15, 1).setItemName("Adamantite Boots");
    public static final Item helmetAdamantite = (new RuneScapeArmor(AdamantiteHelmetShiftedIndex-256, Adamantite, 10, 0)).setIconCoord(0, 2).setItemName("Adamantite Helmet");
    public static final Item plateAdamantite = (new RuneScapeArmor(AdamantitePlateShiftedIndex-256, Adamantite, 10, 1)).setIconCoord(1, 2).setItemName("Adamantite Chest");
    public static final Item legsAdamantite = (new RuneScapeArmor(AdamantiteLegsShiftedIndex-256, Adamantite, 10, 2)).setIconCoord(2, 2).setItemName("Adamantite Legs");
    
    public static final Item shovelAdamantite = (new RuneSpade(AdamantiteshovelShiftedIndex-256, AdamantiteT)).setIconCoord(3, 2).setItemName("Adamantite Shovel");
    public static final Item pickaxeAdamantite = (new RunePickaxe(AdamantitepickShiftedIndex-256, AdamantiteT)).setIconCoord(4,2).setItemName("Adamantite Pickaxe");
    public static final Item axeAdamantite = (new RuneAxe(AdamantiteaxeShiftedIndex-256, AdamantiteT)).setIconCoord(5, 2).setItemName("Adamantite Hatchet");
    public static final Item swordAdamantite = (new RuneSword(AdamantiteswordShiftedIndex-256, AdamantiteT)).setIconCoord(6, 2).setItemName("Adamantite Sword");
    public static final Item hoeAdamantite = (new RuneHoe(AdamantitehoeShiftedIndex-256, AdamantiteT)).setIconCoord(7,2).setItemName("Adamantite Hoe");
	
    public static final Item bootsMithril = (new RuneScapeArmor(MithrilBootShiftedIndex-256, Mithril, 10, 3)).setIconCoord(9, 2).setItemName("Mithril Boots");
    public static final Item helmetMithril = (new RuneScapeArmor(MithrilHelmetShiftedIndex-256, Mithril, 10, 0)).setIconCoord(10, 2).setItemName("Mithril Helmet");
    public static final Item plateMithril = (new RuneScapeArmor(MithrilPlateShiftedIndex-256, Mithril, 10, 1)).setIconCoord(11, 2).setItemName("Mithril Chest");
    public static final Item legsMithril = (new RuneScapeArmor(MithrilLegsShiftedIndex-256, Mithril, 10, 2)).setIconCoord(12, 2).setItemName("Mithril Legs");
    
    public static final Item shovelMithril = (new RuneSpade(MithrilshovelShiftedIndex-256, MithrilT)).setIconCoord(13, 2).setItemName("Mithril Shovel");
    public static final Item pickaxeMithril = (new RunePickaxe(MithrilpickShiftedIndex-256, MithrilT)).setIconCoord(14,2).setItemName("Mithril Pickaxe");
    public static final Item axeMithril = (new RuneAxe(MithrilaxeShiftedIndex-256, MithrilT)).setIconCoord(15, 2).setItemName("Mithril Hatchet");
    public static final Item swordMithril = (new RuneSword(MithrilswordShiftedIndex-256, MithrilT)).setIconCoord(0, 3).setItemName("Mithril Sword");
    public static final Item hoeMithril = (new RuneHoe(MithrilhoeShiftedIndex-256, MithrilT)).setIconCoord(1,3).setItemName("Mithril Hoe");

    public static final Item bootsDragon = (new RuneScapeArmor(DragonBootShiftedIndex-256, Dragon, 8, 3)).setIconCoord(3, 3).setItemName("Dragon Boots");
    public static final Item helmetDragon = (new RuneScapeArmor(DragonHelmetShiftedIndex-256, Dragon, 8, 0)).setIconCoord(4, 3).setItemName("Dragon Helmet");
    public static final Item plateDragon = (new RuneScapeArmor(DragonPlateShiftedIndex-256, Dragon, 8, 1)).setIconCoord(5, 3).setItemName("Dragon Chest");
    public static final Item legsDragon = (new RuneScapeArmor(DragonLegsShiftedIndex-256, Dragon, 8, 2)).setIconCoord(6, 3).setItemName("Dragon Legs");
    
    public static final Item shovelDragon = (new RuneSpade(DragonshovelShiftedIndex-256, DragonT)).setIconCoord(7, 3).setItemName("Dragon Shovel");
    public static final Item pickaxeDragon = (new RunePickaxe(DragonpickShiftedIndex-256, DragonT)).setIconCoord(8, 3).setItemName("Dragon Pickaxe");
    public static final Item axeDragon = (new RuneAxe(DragonaxeShiftedIndex-256, DragonT)).setIconCoord(9, 3).setItemName("Dragon Hatchet");
    public static final Item swordDragon = (new RuneSword(DragonswordShiftedIndex-256, DragonT)).setIconCoord(10, 3).setItemName("Dragon Sword");
    public static final Item hoeDragon = (new RuneHoe(DragonhoeShiftedIndex-256, DragonT)).setIconCoord(11,3).setItemName("Dragon Hoe");
    
	public void load() {
		
		
	
		
		
		
		MinecraftForgeClient.preloadTexture("/Runescape/gui/items.png");
        MinecraftForgeClient.preloadTexture("/Runescape/gui/terrian.png");
        
        ModLoader.registerBlock(blockAdamantite);
        ModLoader.addName(blockAdamantite, "Adamantite Ore");
        ModLoader.addName(Adamantiteignot, "Adamantite Ignot");
        
        ModLoader.addSmelting(blockAdamantite.blockID, new ItemStack(Adamantiteignot, 1));
        
        ModLoader.addName(hoeAdamantite, "Adamantite Hoe");
		ModLoader.addName(swordAdamantite, "Adamantite Sword");
		ModLoader.addName(axeAdamantite, "Adamantite Axe");
		ModLoader.addName(pickaxeAdamantite, "Adamantite Pickaxe");	
		ModLoader.addName(shovelAdamantite, "Adamantite Shovel");
		
		ModLoader.addRecipe(new ItemStack(hoeAdamantite), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(swordAdamantite), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(axeAdamantite), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(pickaxeAdamantite), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(shovelAdamantite), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        
        
		ModLoader.addName(helmetAdamantite, "Adamantite Helmet");
		ModLoader.addName(plateAdamantite, "Adamantite Chestplate");
		ModLoader.addName(legsAdamantite, "Adamantite Leggings");
		ModLoader.addName(bootsAdamantite, "Adamantite Boots");	
		
		ModLoader.addRecipe(new ItemStack(helmetAdamantite), new Object[] {"XXX", "X X", Character.valueOf('X'), Adamantiteignot});
        ModLoader.addRecipe(new ItemStack(plateAdamantite), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Adamantiteignot});
        ModLoader.addRecipe(new ItemStack(legsAdamantite), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Adamantiteignot});
        ModLoader.addRecipe(new ItemStack(bootsAdamantite), new Object[] {"X X", "X X", Character.valueOf('X'), Adamantiteignot});
		
        MinecraftForge.setToolClass(pickaxeAdamantite, "pickaxe", 3);
        MinecraftForge.setToolClass(shovelAdamantite, "shovel", 3);
        MinecraftForge.setToolClass(axeAdamantite, "axe", 3);
	
        
        ModLoader.registerBlock(blockRune);
        ModLoader.addName(blockRune, "Rune Ore");
        ModLoader.addName(Runeignot, "Rune Ignot");
        
        ModLoader.addSmelting(blockRune.blockID, new ItemStack(Runeignot, 1));
        
        ModLoader.addName(hoeRune, "Rune Hoe");
		ModLoader.addName(swordRune, "Rune Sword");
		ModLoader.addName(axeRune, "Rune Axe");
		ModLoader.addName(pickaxeRune, "Rune Pickaxe");	
		ModLoader.addName(shovelRune, "Rune Shovel");
		
		ModLoader.addRecipe(new ItemStack(hoeRune), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(swordRune), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(axeRune), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(pickaxeRune), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(shovelRune), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        
        
		ModLoader.addName(helmetRune, "Rune Helmet");
		ModLoader.addName(plateRune, "Rune Chestplate");
		ModLoader.addName(legsRune, "Rune Leggings");
		ModLoader.addName(bootsRune, "Rune Boots");	
		
		ModLoader.addRecipe(new ItemStack(helmetRune), new Object[] {"XXX", "X X", Character.valueOf('X'), Runeignot});
        ModLoader.addRecipe(new ItemStack(plateRune), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Runeignot});
        ModLoader.addRecipe(new ItemStack(legsRune), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Runeignot});
        ModLoader.addRecipe(new ItemStack(bootsRune), new Object[] {"X X", "X X", Character.valueOf('X'), Runeignot});
		
        MinecraftForge.setToolClass(pickaxeRune, "pickaxe", 3);
        MinecraftForge.setToolClass(shovelRune, "shovel", 3);
        MinecraftForge.setToolClass(axeRune, "axe", 3);
	
        ModLoader.registerBlock(blockBronze);
        ModLoader.addName(blockBronze, "Bronze Ore");
        ModLoader.addName(Bronzeignot, "Bronze Ignot");
        
        ModLoader.addSmelting(blockBronze.blockID, new ItemStack(Bronzeignot, 1)); 
        
        ModLoader.addName(hoeBronze, "Bronze Hoe");
		ModLoader.addName(swordBronze, "Bronze Sword");
		ModLoader.addName(axeBronze, "Bronze Axe");
		ModLoader.addName(pickaxeBronze, "Bronze Pickaxe");	
		ModLoader.addName(shovelBronze, "Bronze Shovel");
		
		ModLoader.addRecipe(new ItemStack(hoeBronze), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(swordBronze), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(axeBronze), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(pickaxeBronze), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(shovelBronze), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        
        ModLoader.addName(helmetBronze, "Bronze Helmet");
		ModLoader.addName(plateBronze, "Bronze Chestplate");
		ModLoader.addName(legsBronze, "Bronze Leggings");
		ModLoader.addName(bootsBronze, "Bronze Boots");	
		
		ModLoader.addRecipe(new ItemStack(helmetBronze), new Object[] {"XXX", "X X", Character.valueOf('X'), Bronzeignot});
        ModLoader.addRecipe(new ItemStack(plateBronze), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Bronzeignot});
        ModLoader.addRecipe(new ItemStack(legsBronze), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Bronzeignot});
        ModLoader.addRecipe(new ItemStack(bootsBronze), new Object[] {"X X", "X X", Character.valueOf('X'), Bronzeignot});
		
        MinecraftForge.setToolClass(pickaxeBronze, "pickaxe", 2);
        MinecraftForge.setToolClass(shovelBronze, "shovel", 2);
        MinecraftForge.setToolClass(axeBronze, "axe", 2);
        
        ModLoader.registerBlock(blockSteel);
        ModLoader.addName(blockSteel, "Steel Ore");
        ModLoader.addName(Steelignot, "Steel Ignot");
        
        ModLoader.addSmelting(blockSteel.blockID, new ItemStack(Steelignot, 1)); 
        
        ModLoader.addName(hoeSteel, "Steel Hoe");
		ModLoader.addName(swordSteel, "Steel Sword");
		ModLoader.addName(axeSteel, "Steel Axe");
		ModLoader.addName(pickaxeSteel, "Steel Pickaxe");	
		ModLoader.addName(shovelSteel, "Steel Shovel");
		
		ModLoader.addRecipe(new ItemStack(hoeSteel), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(swordSteel), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(axeSteel), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(pickaxeSteel), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(shovelSteel), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        
        
		ModLoader.addName(helmetSteel, "Steel Helmet");
		ModLoader.addName(plateSteel, "Steel Chestplate");
		ModLoader.addName(legsSteel, "Steel Leggings");
		ModLoader.addName(bootsSteel, "Steel Boots");	
		
		ModLoader.addRecipe(new ItemStack(helmetSteel), new Object[] {"XXX", "X X", Character.valueOf('X'), Steelignot});
        ModLoader.addRecipe(new ItemStack(plateSteel), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Steelignot});
        ModLoader.addRecipe(new ItemStack(legsSteel), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Steelignot});
        ModLoader.addRecipe(new ItemStack(bootsSteel), new Object[] {"X X", "X X", Character.valueOf('X'), Steelignot});
		
        MinecraftForge.setToolClass(pickaxeSteel, "pickaxe", 3);
        MinecraftForge.setToolClass(shovelSteel, "shovel", 3);
        MinecraftForge.setToolClass(axeSteel, "axe", 3);
        
        ModLoader.registerBlock(blockMithril);
        ModLoader.addName(blockMithril, "Mithril Ore");
        ModLoader.addName(Mithrilignot, "Mithril Ignot");
        
        ModLoader.addSmelting(blockMithril.blockID, new ItemStack(Mithrilignot, 1)); 
        
        ModLoader.addName(hoeMithril, "Mithril Hoe");
		ModLoader.addName(swordMithril, "Mithril Sword");
		ModLoader.addName(axeMithril, "Mithril Axe");
		ModLoader.addName(pickaxeMithril, "Mithril Pickaxe");	
		ModLoader.addName(shovelMithril, "Mithril Shovel");
		
		ModLoader.addRecipe(new ItemStack(hoeMithril), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(swordMithril), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(axeMithril), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(pickaxeMithril), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(shovelMithril), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        
        
		ModLoader.addName(helmetMithril, "Mithril Helmet");
		ModLoader.addName(plateMithril, "Mithril Chestplate");
		ModLoader.addName(legsMithril, "Mithril Leggings");
		ModLoader.addName(bootsMithril, "Mithril Boots");	
		
		ModLoader.addRecipe(new ItemStack(helmetMithril), new Object[] {"XXX", "X X", Character.valueOf('X'), Mithrilignot});
        ModLoader.addRecipe(new ItemStack(plateMithril), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Mithrilignot});
        ModLoader.addRecipe(new ItemStack(legsMithril), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Mithrilignot});
        ModLoader.addRecipe(new ItemStack(bootsMithril), new Object[] {"X X", "X X", Character.valueOf('X'), Mithrilignot});
		
        MinecraftForge.setToolClass(pickaxeMithril, "pickaxe", 3);
        MinecraftForge.setToolClass(shovelMithril, "shovel", 3);
        MinecraftForge.setToolClass(axeMithril, "axe", 3);
        
        
        ModLoader.registerBlock(blockDragon);
        ModLoader.addName(blockDragon, "Dragonite Ore");
        ModLoader.addName(Dragonignot, "Dragonite Ignot");
        
        ModLoader.addSmelting(blockDragon.blockID, new ItemStack(Dragonignot, 1));
        
        ModLoader.addName(hoeDragon, "Dragon Hoe");
		ModLoader.addName(swordDragon, "Dragon Sword");
		ModLoader.addName(axeDragon, "Dragon Axe");
		ModLoader.addName(pickaxeDragon, "Dragon Pickaxe");	
		ModLoader.addName(shovelDragon, "Dragon Shovel");
		
		ModLoader.addRecipe(new ItemStack(hoeDragon), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(swordDragon), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(axeDragon), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(pickaxeDragon), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(shovelDragon), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        
        
		ModLoader.addName(helmetDragon, "Dragon Helmet");
		ModLoader.addName(plateDragon, "Dragon Chestplate");
		ModLoader.addName(legsDragon, "Dragon Leggings");
		ModLoader.addName(bootsDragon, "Dragon Boots");	
		
		ModLoader.addRecipe(new ItemStack(helmetDragon), new Object[] {"XXX", "X X", Character.valueOf('X'), Dragonignot});
        ModLoader.addRecipe(new ItemStack(plateDragon), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Dragonignot});
        ModLoader.addRecipe(new ItemStack(legsDragon), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Dragonignot});
        ModLoader.addRecipe(new ItemStack(bootsDragon), new Object[] {"X X", "X X", Character.valueOf('X'), Dragonignot});
		
        MinecraftForge.setToolClass(pickaxeDragon, "pickaxe", 3);
        MinecraftForge.setToolClass(shovelDragon, "shovel", 3);
        MinecraftForge.setToolClass(axeDragon, "axe", 3);
       
	}
	
	
	 
	 public void generateSurface(World world, Random random, int chunkX, int chunkZ)
     {
             for(int i = 0; i < 7; i++)
             {
                     int randPosX = chunkX + random.nextInt(16);
                     int randPosY = random.nextInt(20);
                     int randPosZ = chunkZ + random.nextInt(16);
                     (new WorldGenMinable(blockRune.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
             }
             
             for(int i = 0; i < 7; i++)
             {
                     int randPosX = chunkX + random.nextInt(16);
                     int randPosY = random.nextInt(20);
                     int randPosZ = chunkZ + random.nextInt(16);
                     (new WorldGenMinable(blockDragon.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
             }
             
             for(int i = 0; i < 7; i++)
             {
                     int randPosX = chunkX + random.nextInt(16);
                     int randPosY = random.nextInt(128);
                     int randPosZ = chunkZ + random.nextInt(16);
                     (new WorldGenMinable(blockBronze.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
             }
             
             for(int i = 0; i < 7; i++)
             {
                     int randPosX = chunkX + random.nextInt(16);
                     int randPosY = random.nextInt(60);
                     int randPosZ = chunkZ + random.nextInt(16);
                     (new WorldGenMinable(blockSteel.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
             }
             
             for(int i = 0; i < 7; i++)
             {
                     int randPosX = chunkX + random.nextInt(16);
                     int randPosY = random.nextInt(40);
                     int randPosZ = chunkZ + random.nextInt(16);
                     (new WorldGenMinable(blockAdamantite.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
             }
             for(int i = 0; i < 7; i++)
             {
                     int randPosX = chunkX + random.nextInt(16);
                     int randPosY = random.nextInt(50);
                     int randPosZ = chunkZ + random.nextInt(16);
                     (new WorldGenMinable(blockMithril.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
             }
             
     }
	 
	 public String getVersion() {
	        return "1.2.5";
	}
	 
	 public static int configurationProperties()
     {
			lmconfiguration.load();
			
			SteelshovelShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Shovel", lmconfiguration.CATEGORY_ITEM, 2945).value);
			
			

			RuneBlockID = Integer.parseInt(lmconfiguration.getOrCreateBlockIdProperty("Rune Ore", 200).value);
			BronzeBlockID = Integer.parseInt(lmconfiguration.getOrCreateBlockIdProperty("Bronze Ore", 201).value);
			SteelBlockID = Integer.parseInt(lmconfiguration.getOrCreateBlockIdProperty("Steel Ore", 202).value);
			AdamantiteBlockID = Integer.parseInt(lmconfiguration.getOrCreateBlockIdProperty("Adamantite Ore", 203).value);
			MithrilBlockID = Integer.parseInt(lmconfiguration.getOrCreateBlockIdProperty("Mithril Ore", 204).value);
			DragonBlockID = Integer.parseInt(lmconfiguration.getOrCreateBlockIdProperty("Dragonite Ore", 205).value);
			
			BronzeignotShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Ignot", lmconfiguration.CATEGORY_ITEM, 2936).value);
			RuneignotShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Ignot", lmconfiguration.CATEGORY_ITEM, 2926).value);
			SteelignotShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Ignot", lmconfiguration.CATEGORY_ITEM, 2946).value);
			AdamantiteignotShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Ignot", lmconfiguration.CATEGORY_ITEM, 2947).value);
			MithrilignotShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Ignot", lmconfiguration.CATEGORY_ITEM, 2957).value);
			DragonignotShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragonite Ignot", lmconfiguration.CATEGORY_ITEM, 2967).value);
			
			RuneHelmetShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Helmet", lmconfiguration.CATEGORY_ITEM, 2917).value);
			RuneLegsShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Legs", lmconfiguration.CATEGORY_ITEM, 2918).value);
		    RunePlateShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Chest", lmconfiguration.CATEGORY_ITEM, 2919).value);
		    RuneBootShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Boots", lmconfiguration.CATEGORY_ITEM, 2920).value);
		    RunehoeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Hoe", lmconfiguration.CATEGORY_ITEM, 2921).value);
		    RuneaxeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Axe", lmconfiguration.CATEGORY_ITEM, 2922).value);
		    RuneswordShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Sword", lmconfiguration.CATEGORY_ITEM, 2923).value);
		    RunepickShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Pickaxe", lmconfiguration.CATEGORY_ITEM, 2924).value);     
		    RuneshovelShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Rune Shovel", lmconfiguration.CATEGORY_ITEM, 2925).value);
		     
			
		    BronzeHelmetShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Helmet", lmconfiguration.CATEGORY_ITEM, 2927).value);
		    BronzeLegsShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Legs", lmconfiguration.CATEGORY_ITEM, 2928).value);
		    BronzePlateShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Chest", lmconfiguration.CATEGORY_ITEM, 2929).value);
		    BronzeBootShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Boots", lmconfiguration.CATEGORY_ITEM, 2930).value);
		    BronzehoeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Hoe", lmconfiguration.CATEGORY_ITEM, 2931).value);
		    BronzeaxeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Axe", lmconfiguration.CATEGORY_ITEM, 2932).value);
		    BronzeswordShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Sword", lmconfiguration.CATEGORY_ITEM, 2933).value);
		    BronzepickShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Pickaxe", lmconfiguration.CATEGORY_ITEM, 2934).value);
		    BronzeshovelShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Bronze Shovel", lmconfiguration.CATEGORY_ITEM, 2935).value);
		    
			
		    SteelHelmetShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Helmet", lmconfiguration.CATEGORY_ITEM, 2937).value);
		    SteelLegsShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Legs", lmconfiguration.CATEGORY_ITEM, 2938).value);
		    SteelPlateShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Chest", lmconfiguration.CATEGORY_ITEM, 2939).value);
		    SteelBootShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Boots", lmconfiguration.CATEGORY_ITEM, 2940).value);
		    SteelhoeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Hoe", lmconfiguration.CATEGORY_ITEM, 2941).value);
		    SteelaxeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Axe", lmconfiguration.CATEGORY_ITEM, 2942).value);
		    SteelswordShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Sword", lmconfiguration.CATEGORY_ITEM, 2943).value);
		    SteelpickShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Steel Pickaxe", lmconfiguration.CATEGORY_ITEM, 2944).value);
		    
		    AdamantiteHelmetShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Helmet", lmconfiguration.CATEGORY_ITEM, 2948).value);
		    AdamantiteLegsShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Legs", lmconfiguration.CATEGORY_ITEM, 2949).value);
		    AdamantitePlateShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Chest", lmconfiguration.CATEGORY_ITEM, 2950).value);
		    AdamantiteBootShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Boots", lmconfiguration.CATEGORY_ITEM, 2951).value);
		    AdamantitehoeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Hoe", lmconfiguration.CATEGORY_ITEM, 2952).value);
		    AdamantiteaxeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Axe", lmconfiguration.CATEGORY_ITEM, 2953).value);
		    AdamantiteswordShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Sword", lmconfiguration.CATEGORY_ITEM, 2954).value);
		    AdamantitepickShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Pickaxe", lmconfiguration.CATEGORY_ITEM, 2955).value);
		    AdamantiteshovelShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Adamantite Shovel", lmconfiguration.CATEGORY_ITEM, 2956).value);
		    
		    MithrilHelmetShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Helmet", lmconfiguration.CATEGORY_ITEM, 2958).value);
		    MithrilLegsShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Legs", lmconfiguration.CATEGORY_ITEM, 2959).value);
		    MithrilPlateShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Chest", lmconfiguration.CATEGORY_ITEM, 2960).value);
		    MithrilBootShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Boots", lmconfiguration.CATEGORY_ITEM, 2961).value);
		    MithrilhoeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Hoe", lmconfiguration.CATEGORY_ITEM, 2962).value);
		    MithrilaxeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Axe", lmconfiguration.CATEGORY_ITEM, 2963).value);
		    MithrilswordShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Sword", lmconfiguration.CATEGORY_ITEM, 2964).value);
		    MithrilpickShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Pickaxe", lmconfiguration.CATEGORY_ITEM, 2965).value);
		    MithrilshovelShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Mithril Shovel", lmconfiguration.CATEGORY_ITEM, 2966).value);
		    
		    DragonHelmetShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Helmet", lmconfiguration.CATEGORY_ITEM, 2968).value);
			DragonLegsShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Legs", lmconfiguration.CATEGORY_ITEM, 2969).value);
		    DragonPlateShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Chest", lmconfiguration.CATEGORY_ITEM, 2970).value);
		    DragonBootShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Boots", lmconfiguration.CATEGORY_ITEM, 2971).value);
		    DragonhoeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Hoe", lmconfiguration.CATEGORY_ITEM, 2972).value);
		    DragonaxeShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Axe", lmconfiguration.CATEGORY_ITEM, 2973).value);
		    DragonswordShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Sword", lmconfiguration.CATEGORY_ITEM, 2974).value);
		    DragonpickShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Pickaxe", lmconfiguration.CATEGORY_ITEM, 2975).value);     
		    DragonshovelShiftedIndex = Integer.parseInt(lmconfiguration.getOrCreateIntProperty("Dragon Shovel", lmconfiguration.CATEGORY_ITEM, 2976).value);
	         
	        
	    	 
	    	 
	   	 
	   	 

			lmconfiguration.save();
		 
		return DragonBlockID;
		 
     }

}
