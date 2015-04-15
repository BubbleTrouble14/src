package com.darkteam.thedarkera.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.darkteam.thedarkera.ModMain;


public class ItemSamArmor extends ItemArmor
{
	public ItemSamArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(ModMain.MODID + "_" + name);
		setTextureName(ModMain.MODID + ":" + name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == ModItems.samhelmet || stack.getItem() == ModItems.samchest || stack.getItem() == ModItems.samboots) 
		{
			return ModMain.MODID + ":models/armor/samarmor1.png";
		}
		else if(stack.getItem() == ModItems.samleggings)
		{
			return ModMain.MODID + ":models/armor/samarmor2.png";
		}
		else
		{
			System.out.println("Invalid Item");
			return null;
		}
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if(itemStack.getItem().getUnlocalizedName() == "samhelmet")
		{
			if(player.isInWater())
			{
				player.setAir(15);
			}
		}
	}
}