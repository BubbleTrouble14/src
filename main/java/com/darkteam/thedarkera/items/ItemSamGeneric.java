package com.darkteam.thedarkera.items;

import com.darkteam.thedarkera.ModMain;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSamGeneric extends Item 
{
	public ItemSamGeneric(String name)
	{
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(ModMain.MODID + "_" + name);
		setTextureName(ModMain.MODID + ":" + name);
	}
}
