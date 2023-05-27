@file:Suppress("UnusedReceiverParameter")

package org.rsmod.plugins.api

import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_ATTACK_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_CHATBOX_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_CLAN_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_EMOTES_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_EQUIPMENT_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_HUD_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_INVENTORY_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_LOGOUT_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_MANAGEMENT_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_MINIMAP_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_MUSIC_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_PRAYER_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_PVP_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_QUEST_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_SETTINGS_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_SKILLS_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_SOCIAL_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_SPELLS_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_USERNAME_CHILD
import org.rsmod.plugins.api.prot.Revision.GAMEFRAME_XP_COUNTER_CHILD
import org.rsmod.plugins.types.NamedComponent
import org.rsmod.plugins.types.NamedInterface
import org.rsmod.plugins.types.NamedScript
import org.rsmod.plugins.types.NamedVarbit
import org.rsmod.plugins.types.NamedVarp
import org.rsmod.plugins.types.ScriptTypeList1
import org.rsmod.plugins.types.ScriptTypeList3
import org.rsmod.plugins.types.ScriptTypeList4

public val varp.running_enabled: NamedVarp get() = NamedVarp(173)

public val varbit.chatbox_unlocked: NamedVarbit get() = NamedVarbit(8119)

/* interface ids don't _usually_ change per revision. should be fine to use magic numbers here */
public inline val interf.gameframe_fixed: NamedInterface get() = NamedInterface(548)
public inline val interf.gameframe_resize_normal: NamedInterface get() = NamedInterface(161)
public inline val interf.gameframe_resize_list: NamedInterface get() = NamedInterface(164)
public inline val interf.gameframe_fullscreen: NamedInterface get() = NamedInterface(165)
public inline val interf.gameframe_mobile: NamedInterface get() = NamedInterface(601)
public inline val interf.chatbox: NamedInterface get() = NamedInterface(162)
public inline val interf.buff_bar: NamedInterface get() = NamedInterface(651)
public inline val interf.chatbox_username: NamedInterface get() = NamedInterface(163)
public inline val interf.pvp_skull: NamedInterface get() = NamedInterface(90)
public inline val interf.health_hud: NamedInterface get() = NamedInterface(303)
public inline val interf.minimap: NamedInterface get() = NamedInterface(160)
public inline val interf.xp_counter: NamedInterface get() = NamedInterface(122)
public inline val interf.skills_tab: NamedInterface get() = NamedInterface(320)
public inline val interf.activity_tab: NamedInterface get() = NamedInterface(629)
public inline val interf.quest_tab: NamedInterface get() = NamedInterface(399)
public inline val interf.inventory_tab: NamedInterface get() = NamedInterface(149)
public inline val interf.equipment_tab: NamedInterface get() = NamedInterface(387)
public inline val interf.prayer_tab: NamedInterface get() = NamedInterface(541)
public inline val interf.spellbook_tab: NamedInterface get() = NamedInterface(218)
public inline val interf.social_tab: NamedInterface get() = NamedInterface(429)
public inline val interf.management_tab: NamedInterface get() = NamedInterface(109)
public inline val interf.logout_tab: NamedInterface get() = NamedInterface(182)
public inline val interf.settings_tab: NamedInterface get() = NamedInterface(261)
public inline val interf.emotes_tab: NamedInterface get() = NamedInterface(216)
public inline val interf.music_tab: NamedInterface get() = NamedInterface(239)
public inline val interf.clan_tab: NamedInterface get() = NamedInterface(7)
public inline val interf.attack_tab: NamedInterface get() = NamedInterface(593)

public val component.gameframe_target_hud: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_HUD_CHILD)
public val component.gameframe_target_pvp: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_PVP_CHILD)
public val component.gameframe_target_xp: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_XP_COUNTER_CHILD)
public val component.gameframe_target_minimap: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_MINIMAP_CHILD)
public val component.gameframe_target_attack: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_ATTACK_CHILD)
public val component.gameframe_target_skills: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_SKILLS_CHILD)
public val component.gameframe_target_quests: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_QUEST_CHILD)
public val component.gameframe_target_inv: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_INVENTORY_CHILD)
public val component.gameframe_target_prayer: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_PRAYER_CHILD)
public val component.gameframe_target_spells: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_SPELLS_CHILD)
public val component.gameframe_target_clan: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_CLAN_CHILD)
public val component.gameframe_target_social: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_SOCIAL_CHILD)
public val component.gameframe_target_logout: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_LOGOUT_CHILD)
public val component.gameframe_target_emotes: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_EMOTES_CHILD)
public val component.gameframe_target_music: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_MUSIC_CHILD)
public val component.gameframe_target_chatbox: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_CHATBOX_CHILD)
public val component.gameframe_target_username: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_USERNAME_CHILD)
public val component.gameframe_target_settings: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_SETTINGS_CHILD)
public val component.gameframe_target_management: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_MANAGEMENT_CHILD)
public val component.gameframe_target_equipment: NamedComponent
    get() = interf.gameframe_resize_normal.child(GAMEFRAME_EQUIPMENT_CHILD)

public val component.quest_tab_free_quest: NamedComponent get() = interf.quest_tab.child(4)
public val component.quest_tab_members_quest: NamedComponent get() = interf.quest_tab.child(5)

public val cs2.scrollbar_resize: NamedScript<ScriptTypeList3<NamedComponent, NamedComponent, Int>>
    get() = NamedScript(72)
public val cs2.pvp_icons_layout: NamedScript<ScriptTypeList1<Boolean>>
    get() = NamedScript(385)
public val cs2.playermember: NamedScript<ScriptTypeList1<Boolean>>
    get() = NamedScript(828)
public val cs2.script_876: NamedScript<ScriptTypeList4<Int, Int, String, String>>
    get() = NamedScript(876)
public val cs2.settings_interface_scaling: NamedScript<ScriptTypeList1<Int>>
    get() = NamedScript(2358)
public val cs2.account_info_update: NamedScript<ScriptTypeList3<Boolean, Boolean, Boolean>>
    get() = NamedScript(2498)
