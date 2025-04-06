package com.PublicChatAndNPCOverheadRemover;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("PublicChatAndNPCOverheadRemoverConfigGroup")
public interface PublicChatAndNPCOverheadRemoverPluginConfig extends Config
{
	String GROUP = "com/PublicChatAndNPCOverheadRemover";

	// Special Attacks - Overheads
	@ConfigSection(
			name = "Special Attacks - Overhead",
			description = "Special attack overhead messages",
			position = 0
	)
	String specialAttacksSectionOH = "specialAttacksSectionOH";

	@ConfigItem(
			keyName = "muteAxesOH",
			name = "Hide Axe Specs",
			description = "Hides the 'Chop chop!' overhead message",
			section = specialAttacksSectionOH
	)
	default boolean muteAxesOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "mutePickaxesOH",
			name = "Hide Pickaxe Specs",
			description = "Hides the 'Smashing!' overhead message",
			section = specialAttacksSectionOH
	)
	default boolean mutePickaxesOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteHarpoonsOH",
			name = "Hide Harpoon Specs",
			description = "Hides the 'Here fishy fishies!' overhead message",
			section = specialAttacksSectionOH
	)
	default boolean muteHarpoonsOH()
	{
		return true;
	}

	// Special Attacks - Public Chat
	@ConfigSection(
			name = "Special Attacks - Public Chat",
			description = "Special attack public chat messages",
			position = 1
	)
	String specialAttacksSectionPC = "specialAttacksSectionPC";

	@ConfigItem(
			keyName = "muteAxesPC",
			name = "Hide Axe Specs",
			description = "Hides the 'Chop chop!' public chat message",
			section = specialAttacksSectionPC
	)
	default boolean muteAxesPC()
	{
		return true;
	}

	@ConfigItem(
			keyName = "mutePickaxesPC",
			name = "Hide Pickaxe Specs",
			description = "Hides the 'Smashing!' public chat message",
			section = specialAttacksSectionPC
	)
	default boolean mutePickaxesPC()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteHarpoonsPC",
			name = "Hide Harpoon Specs",
			description = "Hides the 'Here fishy fishies!' public chat message",
			section = specialAttacksSectionPC
	)
	default boolean muteHarpoonsPC()
	{
		return true;
	}


	// NPCs - Overheads
	@ConfigSection(
			name = "NPC - Overhead",
			description = "NPC overhead messages",
			position = 2
	)
	String npcOHSection = "npcOHSection";

	@ConfigItem(
			keyName = "muteRoguesOH",
			name = "Rogues",
			description = "Hides the 'Someones stealing from us, get them!' overhead message when stealing from the chest at Rogue's Castle",
			section = npcOHSection
	)
	default boolean muteRoguesOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteDerangedArchOH",
			name = "Deranged Archaeologist",
			description = "Hides all overhead messages during the Deranged Archaeologist fight",
			section = npcOHSection
	)
	default boolean muteDerangedArchOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteCrazyArchOH",
			name = "Crazy Archaeologist",
			description = "Hides all overhead messages during the Crazy Archaeologist fight",
			section = npcOHSection
	)
	default boolean muteCrazyArchOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteChaosFanaticOH",
			name = "Chaos Fanatic",
			description = "Hides all overhead messages during the Chaos Fanatic fight",
			section = npcOHSection
	)
	default boolean muteChaosFanaticOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteCerberusOH",
			name = "Cerberus",
			description = "Hides all overhead messages during the Cerberus fight",
			section = npcOHSection
	)
	default boolean muteCerberusOH()
	{
		return false;
	}

	@ConfigItem(
			keyName = "muteSummonedSoulOH",
			name = "Cerberus: Summoned Souls",
			description = "Hides all overhead messages from the Summoned Souls during the Cerberus fight",
			section = npcOHSection
	)
	default boolean muteSummonedSoulOH()
	{
		return false;
	}

	@ConfigItem(
			keyName = "muteBarbarianOH",
			name = "Barbarian",
			description = "Hides the 'YYEEEEEAAARRRRGGHHHH!!!' overhead message when fighting a Barbarian",
			section = npcOHSection
	)
	default boolean muteBarbarianOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteNexOH",
			name = "Nex",
			description = "Hides all overhead messages during the Nex fight",
			section = npcOHSection
	)
	default boolean muteNexOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteGeneralGraardorOH",
			name = "General Graardor",
			description = "Hides all overhead messages during the General Graardor fight",
			section = npcOHSection
	)
	default boolean muteGeneralGraardorOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteCommanderZilyanaOH",
			name = "Commander Zilyana",
			description = "Hides all overhead messages during the Commander Zilyana fight",
			section = npcOHSection
	)
	default boolean muteCommanderZilyanaOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteKreeOH",
			name = "Kree'arra",
			description = "Hides all overhead messages during the Kree'arra fight",
			section = npcOHSection
	)
	default boolean muteKreeOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteKrilOH",
			name = "K'ril Tsutsaroth",
			description = "Hides all overhead messages during the K'ril Tsutsaroth fight",
			section = npcOHSection
	)
	default boolean muteKrilOH()
	{
		return true;
	}

	@ConfigItem(
			keyName = "muteTownCrierOH",
			name = "Town Crier",
			description = "Hides all overhead messages from the Town Criers around the world",
			section = npcOHSection
	)
	default boolean muteTownCrierOH()
	{
		return true;
	}

	// Other - Overheads
	@ConfigSection(
			name = "Other - Overhead",
			description = "Other overhead messages",
			position = 3
	)
	String otherSectionOH = "otherSectionOH";

	@ConfigItem(
			keyName = "muteTeaOH",
			name = "Hide Cuppa Tea",
			description = "Hides the 'Aaah, nothing like a nice cuppa tea!' overhead message",
			section = otherSectionOH
	)
	default boolean muteTeaOH()
	{
		return true;
	}

	// Other - Public Chat
	@ConfigSection(
			name = "Other - Public Chat",
			description = "Other public chat messages",
			position = 3
	)
	String otherSectionPC = "otherSectionPC";

	@ConfigItem(
			keyName = "muteTeaPC",
			name = "Hide Cuppa Tea",
			description = "Hides the 'Aaah, nothing like a nice cuppa tea!' public chat message",
			section = otherSectionPC
	)
	default boolean muteTeaPC()
	{
		return true;
	}

	// NPCs - Public Chat
//	@ConfigSection(
//			name = "NPC - Public Chat",
//			description = "NPC public chat messages",
//			position = 3
//	)
//	String npcPCSection = "npcPCSection";
//
//	@ConfigItem(
//			keyName = "muteNexPC",
//			name = "Nex",
//			description = "Hides all public chat messages during the Nex fight",
//			section = npcOHSection
//	)
//	default boolean muteNexPC()
//	{
//		return false;
//	}

}