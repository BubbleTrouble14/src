package com.darkteam.thedarkera.items.tools;

import com.darkteam.thedarkera.ModMain;


import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemSamPickaxe extends ItemPickaxe 
{
	public ItemSamPickaxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(ModMain.MODID + "_" + name);
		setTextureName(ModMain.MODID + ":" + name);
	}
}