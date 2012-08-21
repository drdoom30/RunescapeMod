package net.minecraft.src;

import java.util.Map;
import java.util.Random;

public class mod_Runescape extends BaseMod
{
	
	
	public static final Block blockDragon = new DragonOre(160, 0).setBlockName("Dragon Ore").setHardness(3F).setResistance(4F).setLightValue(1F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockRune = new RuneOre(161, 0).setBlockName("Rune Ore").setHardness(3F).setResistance(4F).setLightValue(1F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockAdamantite = new AdamantiteOre(162, 0).setBlockName("Adamantite Ore").setHardness(3F).setResistance(4F).setLightValue(1F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockMithril = new MithOre(163, 0).setBlockName("Mithril Ore").setHardness(3F).setResistance(4F).setLightValue(1F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockSteel = new SteelOre(164, 0).setBlockName("Steel Ore").setHardness(3F).setResistance(4F).setLightValue(1F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockBronze = new BronzeOre(165, 0).setBlockName("Bronze Ore").setHardness(3F).setResistance(4F).setLightValue(1F).setCreativeTab(CreativeTabs.tabBlock);
	
	public static final Item helmetRune = (new RunescapeArmor(5501, RunescapeArmorMaterial.Rune, ModLoader.addArmor("Rune"), 0).setItemName("Rune Helmet"));
	public static final Item plateRune = (new RunescapeArmor(5502, RunescapeArmorMaterial.Rune, ModLoader.addArmor("Rune"), 1).setItemName("Rune Plate"));
    public static final Item legsRune = (new RunescapeArmor(5503, RunescapeArmorMaterial.Rune, ModLoader.addArmor("Rune"), 2).setItemName("Rune Legs"));
    public static final Item bootsRune = (new RunescapeArmor(5504, RunescapeArmorMaterial.Rune, ModLoader.addArmor("Rune"), 3).setItemName("Rune Boots"));
    public static final Item Runeaxe = new Runescapeaxe(5505, EnumToolMaterialLink.Rune).setItemName("Rune Axe");
    public static final Item Runesword = new Runescapesword(5506, EnumToolMaterialLink.Rune).setItemName("Rune Sword");
    public static final Item Runehoe = new Runescapehoe(5507, EnumToolMaterialLink.Rune).setItemName("Rune Hoe");
    public static final Item Runepick = new RunescapePick(5508, EnumToolMaterialLink.Rune).setItemName("Rune Pickaxe");
    public static final Item Runeshovel = new RunescapeShovel(5509, EnumToolMaterialLink.Rune).setItemName("Rune Shovel");
    
    public static final Item helmetMithril = (new RunescapeArmor(5510, RunescapeArmorMaterial.Mithril, ModLoader.addArmor("Mithril"), 0).setItemName("Mithril Helmet"));
	public static final Item plateMithril = (new RunescapeArmor(5511, RunescapeArmorMaterial.Mithril, ModLoader.addArmor("Mithril"), 1).setItemName("Mithril Plate"));
    public static final Item legsMithril = (new RunescapeArmor(5512, RunescapeArmorMaterial.Mithril, ModLoader.addArmor("Mithril"), 2).setItemName("Mithril Legs"));
    public static final Item bootsMithril = (new RunescapeArmor(5513, RunescapeArmorMaterial.Mithril, ModLoader.addArmor("Mithril"), 3).setItemName("Mithril Boots"));
    public static final Item Mithrilaxe = new Runescapeaxe(5514, EnumToolMaterialLink.Mithril).setItemName("Mithril Axe");
    public static final Item Mithrilsword = new Runescapesword(5515, EnumToolMaterialLink.Mithril).setItemName("Mithril Sword");
    public static final Item Mithrilhoe = new Runescapehoe(5516, EnumToolMaterialLink.Mithril).setItemName("Mithril Hoe");
    public static final Item Mithrilpick = new RunescapePick(5517, EnumToolMaterialLink.Mithril).setItemName("Mithril Pickaxe");
    public static final Item Mithrilshovel = new RunescapeShovel(5518, EnumToolMaterialLink.Mithril).setItemName("Mithril Shovel");
	
    public static final Item helmetAdamantite = (new RunescapeArmor(5519, RunescapeArmorMaterial.Adamantite, ModLoader.addArmor("Adamantite"), 0).setItemName("Adamantite Helmet"));
	public static final Item plateAdamantite = (new RunescapeArmor(5520, RunescapeArmorMaterial.Adamantite, ModLoader.addArmor("Adamantite"), 1).setItemName("Adamantite Plate"));
    public static final Item legsAdamantite = (new RunescapeArmor(5521, RunescapeArmorMaterial.Adamantite, ModLoader.addArmor("Adamantite"), 2).setItemName("Adamantite Legs"));
    public static final Item bootsAdamantite = (new RunescapeArmor(5522, RunescapeArmorMaterial.Adamantite, ModLoader.addArmor("Adamantite"), 3).setItemName("Adamantite Boots"));
    public static final Item Adamantiteaxe = new Runescapeaxe(5523, EnumToolMaterialLink.Adamantite).setItemName("Adamantite Axe");
    public static final Item Adamantitesword = new Runescapesword(5524, EnumToolMaterialLink.Adamantite).setItemName("Adamantite Sword");
    public static final Item Adamantitehoe = new Runescapehoe(5525, EnumToolMaterialLink.Adamantite).setItemName("Adamantite Hoe");
    public static final Item Adamantitepick = new RunescapePick(5526, EnumToolMaterialLink.Adamantite).setItemName("Adamantite Pickaxe");
    public static final Item Adamantiteshovel = new RunescapeShovel(5527, EnumToolMaterialLink.Adamantite).setItemName("Adamantite Shovel");
	
    public static final Item helmetDragon = (new RunescapeArmor(5528, RunescapeArmorMaterial.Dragon, ModLoader.addArmor("Dragon"), 0).setItemName("Dragon Helmet"));
	public static final Item plateDragon = (new RunescapeArmor(5529, RunescapeArmorMaterial.Dragon, ModLoader.addArmor("Dragon"), 1).setItemName("Dragon Plate"));
    public static final Item legsDragon = (new RunescapeArmor(5530, RunescapeArmorMaterial.Dragon, ModLoader.addArmor("Dragon"), 2).setItemName("Dragon Legs"));
    public static final Item bootsDragon = (new RunescapeArmor(5531, RunescapeArmorMaterial.Dragon, ModLoader.addArmor("Dragon"), 3).setItemName("Dragon Boots"));
    public static final Item Dragonaxe = new Runescapeaxe(5532, EnumToolMaterialLink.Dragon).setItemName("Dragon Axe");
    public static final Item Dragonsword = new Runescapesword(5533, EnumToolMaterialLink.Dragon).setItemName("Dragon Sword");
    public static final Item Dragonhoe = new Runescapehoe(5534, EnumToolMaterialLink.Dragon).setItemName("Dragon Hoe");
    public static final Item Dragonpick = new RunescapePick(5535, EnumToolMaterialLink.Dragon).setItemName("Dragon Pickaxe");
    public static final Item Dragonshovel = new RunescapeShovel(5536, EnumToolMaterialLink.Dragon).setItemName("Dragon Shovel");
	
    public static final Item helmetSteel = (new RunescapeArmor(5537, RunescapeArmorMaterial.Steel, ModLoader.addArmor("Steel"), 0).setItemName("Steel Helmet"));
	public static final Item plateSteel = (new RunescapeArmor(5538, RunescapeArmorMaterial.Steel, ModLoader.addArmor("Steel"), 1).setItemName("Steel Plate"));
    public static final Item legsSteel = (new RunescapeArmor(5539, RunescapeArmorMaterial.Steel, ModLoader.addArmor("Steel"), 2).setItemName("Steel Legs"));
    public static final Item bootsSteel = (new RunescapeArmor(5540, RunescapeArmorMaterial.Steel, ModLoader.addArmor("Steel"), 3).setItemName("Steel Boots"));
    public static final Item Steelaxe = new Runescapeaxe(5541, EnumToolMaterialLink.Steel).setItemName("Steel Axe");
    public static final Item Steelsword = new Runescapesword(5542, EnumToolMaterialLink.Steel).setItemName("Steel Sword");
    public static final Item Steelhoe = new Runescapehoe(5543, EnumToolMaterialLink.Steel).setItemName("Steel Hoe");
    public static final Item Steelpick = new RunescapePick(5544, EnumToolMaterialLink.Steel).setItemName("Steel Pickaxe");
    public static final Item Steelshovel = new RunescapeShovel(5545, EnumToolMaterialLink.Steel).setItemName("Steel Shovel");
	
    public static final Item helmetBronze = (new RunescapeArmor(5546, RunescapeArmorMaterial.Bronze, ModLoader.addArmor("Bronze"), 0).setItemName("Bronze Helmet"));
	public static final Item plateBronze = (new RunescapeArmor(5547, RunescapeArmorMaterial.Bronze, ModLoader.addArmor("Bronze"), 1).setItemName("Bronze Plate"));
    public static final Item legsBronze = (new RunescapeArmor(5548, RunescapeArmorMaterial.Bronze, ModLoader.addArmor("Bronze"), 2).setItemName("Bronze Legs"));
    public static final Item bootsBronze = (new RunescapeArmor(5549, RunescapeArmorMaterial.Bronze, ModLoader.addArmor("Bronze"), 3).setItemName("Bronze Boots"));
    public static final Item Bronzeaxe = new Runescapeaxe(5550, EnumToolMaterialLink.Bronze).setItemName("Bronze Axe");
    public static final Item Bronzesword = new Runescapesword(5551, EnumToolMaterialLink.Bronze).setItemName("Bronze Sword");
    public static final Item Bronzehoe = new Runescapehoe(5552, EnumToolMaterialLink.Bronze).setItemName("Bronze Hoe");
    public static final Item Bronzepick = new RunescapePick(5553, EnumToolMaterialLink.Bronze).setItemName("Bronze Pickaxe");
    public static final Item Bronzeshovel = new RunescapeShovel(5554, EnumToolMaterialLink.Bronze).setItemName("Bronze Shovel");
	
	public static final Item Dragonignot = new Item(5000).setItemName("Dragon Ignot");
	public static final Item Runeignot = new Item(5001).setItemName("Rune Ignot");
	public static final Item Adamantiteignot = new Item(5002).setItemName("Adamantite Ignot");
	public static final Item Mithrilignot = new Item(5003).setItemName("Mithril Ignot");
	public static final Item Steelignot = new Item(5004).setItemName("Steel Ignot");
	public static final Item Bronzeignot = new Item(5005).setItemName("Bronze Ignot");

	  public void load()
	  {
	    blockRune.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Runescape/terrian/runeore.png");
	    ModLoader.registerBlock(blockRune);
	    ModLoader.addName(blockRune, "Rune Ore");
	    
	    blockDragon.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Runescape/terrian/Dragonore.png");
	    ModLoader.registerBlock(blockDragon);
	    ModLoader.addName(blockDragon, "Dragon Ore");
		  
	    blockMithril.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Runescape/terrian/Mithrilore.png");
	    ModLoader.registerBlock(blockMithril);
	    ModLoader.addName(blockMithril, "Mithril Ore");
	    
	    blockSteel.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Runescape/terrian/Steelore.png");
	    ModLoader.registerBlock(blockSteel);
	    ModLoader.addName(blockSteel, "Steel Ore");
	    
	    blockBronze.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Runescape/terrian/Bronzeore.png");
	    ModLoader.registerBlock(blockBronze);
	    ModLoader.addName(blockBronze, "Bronze Ore");
	    
	    blockAdamantite.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Runescape/terrian/Adamantiteore.png");
	    ModLoader.registerBlock(blockAdamantite);
	    ModLoader.addName(blockAdamantite, "Adamantite Ore");
	    
	    ModLoader.addSmelting(blockMithril.blockID, new ItemStack(Mithrilignot, 1), 0.3F); 
	    ModLoader.addSmelting(blockDragon.blockID, new ItemStack(Dragonignot, 1), 0.3F); 
	    ModLoader.addSmelting(blockRune.blockID, new ItemStack(Runeignot, 1), 0.3F); 
	    ModLoader.addSmelting(blockBronze.blockID, new ItemStack(Bronzeignot, 1), 0.3F); 
	    ModLoader.addSmelting(blockSteel.blockID, new ItemStack(Steelignot, 1), 0.3F); 
	    ModLoader.addSmelting(blockAdamantite.blockID, new ItemStack(Adamantiteignot, 1), 0.3F); 
	    
		ModLoader.addName(Dragonignot, "Dragon Ignot");  
		ModLoader.addName(Runeignot, "Rune Ignot");
		ModLoader.addName(Adamantiteignot, "Adamantite Ignot");
		ModLoader.addName(Mithrilignot, "Mithril Ignot");
		ModLoader.addName(Steelignot, "Steel Ignot");
		ModLoader.addName(Bronzeignot, "Bronze Ignot");
		  
	    ModLoader.addName(Runeaxe, "Rune Axe");
	    ModLoader.addName(Runeshovel, "Rune Shovel");
	    ModLoader.addName(Runepick, "Rune Pickaxe");
	    ModLoader.addName(Runehoe, "Rune Hoe");
	    ModLoader.addName(Runesword, "Rune Sword");
	    ModLoader.addName(helmetRune, "Rune Helmet");
	    ModLoader.addName(legsRune, "Rune Legs");
	    ModLoader.addName(plateRune, "Rune Chest");
	    ModLoader.addName(bootsRune, "Rune Boots");
	    
	    ModLoader.addName(Dragonaxe, "DragonAxe");
	    ModLoader.addName(Dragonshovel, "DragonShovel");
	    ModLoader.addName(Dragonpick, "DragonPickaxe");
	    ModLoader.addName(Dragonhoe, "DragonHoe");
	    ModLoader.addName(Dragonsword, "DragonSword");
	    ModLoader.addName(helmetDragon, "DragonHelmet");
	    ModLoader.addName(legsDragon, "DragonLegs");
	    ModLoader.addName(plateDragon, "DragonChest");
	    ModLoader.addName(bootsDragon, "DragonBoots");
	    
	    ModLoader.addName(Adamantiteaxe, "Adamantite Axe");
	    ModLoader.addName(Adamantiteshovel, "Adamantite Shovel");
	    ModLoader.addName(Adamantitepick, "Adamantite Pickaxe");
	    ModLoader.addName(Adamantitehoe, "Adamantite Hoe");
	    ModLoader.addName(Adamantitesword, "Adamantite Sword");
	    ModLoader.addName(helmetAdamantite, "Adamantite Helmet");
	    ModLoader.addName(legsAdamantite, "Adamantite Legs");
	    ModLoader.addName(plateAdamantite, "Adamantite Chest");
	    ModLoader.addName(bootsAdamantite, "Adamantite Boots");
	    
	    ModLoader.addName(Mithrilaxe, "Mithril Axe");
	    ModLoader.addName(Mithrilshovel, "Mithril Shovel");
	    ModLoader.addName(Mithrilpick, "Mithril Pickaxe");
	    ModLoader.addName(Mithrilhoe, "Mithril Hoe");
	    ModLoader.addName(Mithrilsword, "Mithril Sword");
	    ModLoader.addName(helmetMithril, "Mithril Helmet");
	    ModLoader.addName(legsMithril, "Mithril Legs");
	    ModLoader.addName(plateMithril, "Mithril Chest");
	    ModLoader.addName(bootsMithril, "Mithril Boots");
	    
	    ModLoader.addName(Steelaxe, "Steel Axe");
	    ModLoader.addName(Steelshovel, "Steel Shovel");
	    ModLoader.addName(Steelpick, "Steel Pickaxe");
	    ModLoader.addName(Steelhoe, "Steel Hoe");
	    ModLoader.addName(Steelsword, "Steel Sword");
	    ModLoader.addName(helmetSteel, "Steel Helmet");
	    ModLoader.addName(legsSteel, "Steel Legs");
	    ModLoader.addName(plateSteel, "Steel Chest");
	    ModLoader.addName(bootsSteel, "Steel Boots");
	    
	    ModLoader.addName(Bronzeaxe, "Bronze Axe");
	    ModLoader.addName(Bronzeshovel, "Bronze Shovel");
	    ModLoader.addName(Bronzepick, "Bronze Pickaxe");
	    ModLoader.addName(Bronzehoe, "Bronze Hoe");
	    ModLoader.addName(Bronzesword, "Bronze Sword");
	    ModLoader.addName(helmetBronze, "Bronze Helmet");
	    ModLoader.addName(legsBronze, "Bronze Legs");
	    ModLoader.addName(plateBronze, "Bronze Chest");
	    ModLoader.addName(bootsBronze, "Bronze Boots");
	    
	    Bronzeignot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzeignot.png");
	    Runeignot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runeignot.png");
	    Adamantiteignot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantiteignot.png");
	    Mithrilignot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilignot.png");
	    Steelignot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelignot.png");
	    Dragonignot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Dragonignot.png");
	    
	    Dragonaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonaxe.png");
	    Dragonsword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonsword.png");
	    Dragonshovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonshovel.png");
	    Dragonhoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonhoe.png");
	    Dragonpick.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonpick.png");
	    helmetDragon.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonhelm.png");
	    plateDragon.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonplate.png");
	    bootsDragon.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonboots.png");
	    legsDragon.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/dragonlegs.png");
	    
	    Runeaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runeaxe.png");
	    Runesword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runesword.png");
	    Runeshovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runeshovel.png");
	    Runehoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runehoe.png");
	    Runepick.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runepick.png");
	    helmetRune.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runehelm.png");
	    plateRune.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runeplate.png");
	    bootsRune.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runeboots.png");
	    legsRune.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Runelegs.png");
	    
	    Adamantiteaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantiteaxe.png");
	    Adamantitesword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantitesword.png");
	    Adamantiteshovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantiteshovel.png");
	    Adamantitehoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantitehoe.png");
	    Adamantitepick.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantitepick.png");
	    helmetAdamantite.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantitehelm.png");
	    plateAdamantite.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantiteplate.png");
	    bootsAdamantite.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantiteboots.png");
	    legsAdamantite.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Adamantitelegs.png");
	    
	    Mithrilaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilaxe.png");
	    Mithrilsword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilsword.png");
	    Mithrilshovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilshovel.png");
	    Mithrilhoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilhoe.png");
	    Mithrilpick.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilpick.png");
	    helmetMithril.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilhelm.png");
	    plateMithril.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilplate.png");
	    bootsMithril.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrilboots.png");
	    legsMithril.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Mithrillegs.png");
	    
	    Steelaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelaxe.png");
	    Steelsword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelsword.png");
	    Steelshovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelshovel.png");
	    Steelhoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelhoe.png");
	    Steelpick.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelpick.png");
	    helmetSteel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelhelm.png");
	    plateSteel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelplate.png");
	    bootsSteel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steelboots.png");
	    legsSteel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Steellegs.png");
	    
	    Bronzeaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzeaxe.png");
	    Bronzesword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzesword.png");
	    Bronzeshovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzeshovel.png");
	    Bronzehoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzehoe.png");
	    Bronzepick.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzepick.png");
	    helmetBronze.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzehelm.png");
	    plateBronze.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzeplate.png");
	    bootsBronze.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzeboots.png");
	    legsBronze.iconIndex = ModLoader.addOverride("/gui/items.png", "/Runescape/Bronzelegs.png");
	    
	    ModLoader.addRecipe(new ItemStack(Adamantitehoe), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Adamantitesword), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Adamantiteaxe), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Adamantitepick), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Adamantiteshovel), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Adamantiteignot, Character.valueOf('@'), Item.stick});
        
        ModLoader.addRecipe(new ItemStack(helmetAdamantite), new Object[] {"XXX", "X X", Character.valueOf('X'), Adamantiteignot});
        ModLoader.addRecipe(new ItemStack(plateAdamantite), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Adamantiteignot});
        ModLoader.addRecipe(new ItemStack(legsAdamantite), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Adamantiteignot});
        ModLoader.addRecipe(new ItemStack(bootsAdamantite), new Object[] {"X X", "X X", Character.valueOf('X'), Adamantiteignot});
        
        ModLoader.addRecipe(new ItemStack(Runehoe), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Runesword), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Runeaxe), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Runepick), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Runeshovel), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Runeignot, Character.valueOf('@'), Item.stick});
        
        ModLoader.addRecipe(new ItemStack(helmetRune), new Object[] {"XXX", "X X", Character.valueOf('X'), Runeignot});
        ModLoader.addRecipe(new ItemStack(plateRune), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Runeignot});
        ModLoader.addRecipe(new ItemStack(legsRune), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Runeignot});
        ModLoader.addRecipe(new ItemStack(bootsRune), new Object[] {"X X", "X X", Character.valueOf('X'), Runeignot});
	    
        ModLoader.addRecipe(new ItemStack(Dragonhoe), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Dragonsword), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Dragonaxe), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Dragonpick), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Dragonshovel), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Dragonignot, Character.valueOf('@'), Item.stick});
        
        ModLoader.addRecipe(new ItemStack(helmetDragon), new Object[] {"XXX", "X X", Character.valueOf('X'), Dragonignot});
        ModLoader.addRecipe(new ItemStack(plateDragon), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Dragonignot});
        ModLoader.addRecipe(new ItemStack(legsDragon), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Dragonignot});
        ModLoader.addRecipe(new ItemStack(bootsDragon), new Object[] {"X X", "X X", Character.valueOf('X'), Dragonignot});
        
        ModLoader.addRecipe(new ItemStack(Mithrilhoe), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Mithrilsword), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Mithrilaxe), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Mithrilpick), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Mithrilshovel), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Mithrilignot, Character.valueOf('@'), Item.stick});
        
        ModLoader.addRecipe(new ItemStack(helmetMithril), new Object[] {"XXX", "X X", Character.valueOf('X'), Mithrilignot});
        ModLoader.addRecipe(new ItemStack(plateMithril), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Mithrilignot});
        ModLoader.addRecipe(new ItemStack(legsMithril), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Mithrilignot});
        ModLoader.addRecipe(new ItemStack(bootsMithril), new Object[] {"X X", "X X", Character.valueOf('X'), Mithrilignot});
        
        ModLoader.addRecipe(new ItemStack(Steelhoe), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Steelsword), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Steelaxe), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Steelpick), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Steelshovel), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Steelignot, Character.valueOf('@'), Item.stick});
        
        ModLoader.addRecipe(new ItemStack(helmetSteel), new Object[] {"XXX", "X X", Character.valueOf('X'), Steelignot});
        ModLoader.addRecipe(new ItemStack(plateSteel), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Steelignot});
        ModLoader.addRecipe(new ItemStack(legsSteel), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Steelignot});
        ModLoader.addRecipe(new ItemStack(bootsSteel), new Object[] {"X X", "X X", Character.valueOf('X'), Steelignot});
        
        ModLoader.addRecipe(new ItemStack(Bronzehoe), new Object[] {" XX", " @ ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Bronzesword), new Object[] {" X ", " X ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Bronzeaxe), new Object[] {"XX ", "X@ ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Bronzepick), new Object[] {"XXX", " @ ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        ModLoader.addRecipe(new ItemStack(Bronzeshovel), new Object[] {" X ", " @ ", " @ ", Character.valueOf('X'), Bronzeignot, Character.valueOf('@'), Item.stick});
        
        ModLoader.addRecipe(new ItemStack(helmetBronze), new Object[] {"XXX", "X X", Character.valueOf('X'), Bronzeignot});
        ModLoader.addRecipe(new ItemStack(plateBronze), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), Bronzeignot});
        ModLoader.addRecipe(new ItemStack(legsBronze), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), Bronzeignot});
        ModLoader.addRecipe(new ItemStack(bootsBronze), new Object[] {"X X", "X X", Character.valueOf('X'), Bronzeignot});
        
	    Runeaxe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Runeshovel.setTabToDisplayOn(CreativeTabs.tabTools);
	    Runepick.setTabToDisplayOn(CreativeTabs.tabTools);
	    Runehoe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Runesword.setTabToDisplayOn(CreativeTabs.tabCombat);
	    helmetRune.setTabToDisplayOn(CreativeTabs.tabCombat);
	    legsRune.setTabToDisplayOn(CreativeTabs.tabCombat);
	    plateRune.setTabToDisplayOn(CreativeTabs.tabCombat);
	    bootsRune.setTabToDisplayOn(CreativeTabs.tabCombat);
	    
	    Dragonaxe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Dragonshovel.setTabToDisplayOn(CreativeTabs.tabTools);
	    Dragonpick.setTabToDisplayOn(CreativeTabs.tabTools);
	    Dragonhoe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Dragonsword.setTabToDisplayOn(CreativeTabs.tabCombat);
	    helmetDragon.setTabToDisplayOn(CreativeTabs.tabCombat);
	    legsDragon.setTabToDisplayOn(CreativeTabs.tabCombat);
	    plateDragon.setTabToDisplayOn(CreativeTabs.tabCombat);
	    bootsDragon.setTabToDisplayOn(CreativeTabs.tabCombat);
	    
	    Adamantiteaxe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Adamantiteshovel.setTabToDisplayOn(CreativeTabs.tabTools);
	    Adamantitepick.setTabToDisplayOn(CreativeTabs.tabTools);
	    Adamantitehoe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Adamantitesword.setTabToDisplayOn(CreativeTabs.tabCombat);
	    helmetAdamantite.setTabToDisplayOn(CreativeTabs.tabCombat);
	    legsAdamantite.setTabToDisplayOn(CreativeTabs.tabCombat);
	    plateAdamantite.setTabToDisplayOn(CreativeTabs.tabCombat);
	    bootsAdamantite.setTabToDisplayOn(CreativeTabs.tabCombat);
	    
	    Mithrilaxe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Mithrilshovel.setTabToDisplayOn(CreativeTabs.tabTools);
	    Mithrilpick.setTabToDisplayOn(CreativeTabs.tabTools);
	    Mithrilhoe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Mithrilsword.setTabToDisplayOn(CreativeTabs.tabCombat);
	    helmetMithril.setTabToDisplayOn(CreativeTabs.tabCombat);
	    legsMithril.setTabToDisplayOn(CreativeTabs.tabCombat);
	    plateMithril.setTabToDisplayOn(CreativeTabs.tabCombat);
	    bootsMithril.setTabToDisplayOn(CreativeTabs.tabCombat);
	    
	    Steelaxe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Steelshovel.setTabToDisplayOn(CreativeTabs.tabTools);
	    Steelpick.setTabToDisplayOn(CreativeTabs.tabTools);
	    Steelhoe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Steelsword.setTabToDisplayOn(CreativeTabs.tabCombat);
	    helmetSteel.setTabToDisplayOn(CreativeTabs.tabCombat);
	    legsSteel.setTabToDisplayOn(CreativeTabs.tabCombat);
	    plateSteel.setTabToDisplayOn(CreativeTabs.tabCombat);
	    bootsSteel.setTabToDisplayOn(CreativeTabs.tabCombat);
	    
	    Bronzeaxe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Bronzeshovel.setTabToDisplayOn(CreativeTabs.tabTools);
	    Bronzepick.setTabToDisplayOn(CreativeTabs.tabTools);
	    Bronzehoe.setTabToDisplayOn(CreativeTabs.tabTools);
	    Bronzesword.setTabToDisplayOn(CreativeTabs.tabCombat);
	    helmetBronze.setTabToDisplayOn(CreativeTabs.tabCombat);
	    legsBronze.setTabToDisplayOn(CreativeTabs.tabCombat);
	    plateBronze.setTabToDisplayOn(CreativeTabs.tabCombat);
	    bootsBronze.setTabToDisplayOn(CreativeTabs.tabCombat);
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
	                     (new WorldGenMinable(blockBronze.blockID, 5)).generate(world, random, randPosX, randPosY, randPosZ);
	             }
	             
	             for(int i = 0; i < 7; i++)
	             {
	                     int randPosX = chunkX + random.nextInt(16);
	                     int randPosY = random.nextInt(60);
	                     int randPosZ = chunkZ + random.nextInt(16);
	                     (new WorldGenMinable(blockSteel.blockID, 5)).generate(world, random, randPosX, randPosY, randPosZ);
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
	                     (new WorldGenMinable(blockMithril.blockID, 5)).generate(world, random, randPosX, randPosY, randPosZ);
	             }
	             
	     }

	  public void generateNether(World world, Random random, int i, int j)
	  {
	  }

	  public void addRenderer(Map map)
	  {
	  }

	  public int addFuel(int i, int j) {
	    return 0;
	  }

	  public String getVersion() {
	    return "1.3.2";
	  }
}