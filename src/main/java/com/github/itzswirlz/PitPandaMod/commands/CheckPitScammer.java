package com.github.itzswirlz.PitPandaMod.commands;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import com.github.itzswirlz.PitPandaMod.api.APIFetcher;
import com.mojang.authlib.GameProfile;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.fml.server.FMLServerHandler;

public class CheckPitScammer extends CommandBase {

	@Override
	public int getRequiredPermissionLevel() {
		return 0;
	}
	
	@Override
	public String getCommandName() {
		return "checkpitscammer";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/checkpitscammer <player>";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		// TODO: Fetch player from Pit Panda, and check if they have a scammer field. If they do, put a message in chat saying to not trade iwth this player
		try {
			APIFetcher.fetchUUID(args);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}