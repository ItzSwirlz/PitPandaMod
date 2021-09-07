package com.github.itzswirlz.PitPandaMod.commands;

import net.minecraft.command.CommandHelp;

import java.awt.TextComponent;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IChatComponent;

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
		IChatComponent response = null;
		Minecraft.getMinecraft().thePlayer.addChatMessage(response.appendText("Hello"));
	}

}
