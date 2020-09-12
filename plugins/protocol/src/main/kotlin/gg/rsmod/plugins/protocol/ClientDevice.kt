package gg.rsmod.plugins.protocol

import com.google.inject.Inject
import gg.rsmod.game.message.ClientPacketStructureMap
import gg.rsmod.game.message.ServerPacketStructureMap

sealed class Device {
    object Ios : Device()
    object Android : Device()
    object Desktop : Device()
}

class DesktopPacketStructure @Inject constructor(
    val server: ServerPacketStructureMap,
    val client: ClientPacketStructureMap
)
