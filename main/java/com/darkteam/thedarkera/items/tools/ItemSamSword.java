package com.darkteam.thedarkera.items.tools;

import com.darkteam.thedarkera.ModMain;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSamSword extends ItemSword
{
	public ItemSamSword(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(ModMain.MODID + "_" + name);
		setTextureName(ModMain.MODID + ":" + name);
	}
}