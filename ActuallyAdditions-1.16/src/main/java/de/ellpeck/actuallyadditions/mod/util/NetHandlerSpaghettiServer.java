package de.ellpeck.actuallyadditions.mod.util;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.IPacket;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketDirection;
import net.minecraft.network.play.ServerPlayNetHandler;
import net.minecraft.network.play.client.*;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.FakePlayer;

import javax.annotation.Nullable;
import java.util.Set;

public class NetHandlerSpaghettiServer extends ServerPlayNetHandler {

    public NetHandlerSpaghettiServer(FakePlayer player) {
        super(null, new NetworkManager(PacketDirection.CLIENTBOUND), player);
    }

    @Override
    public void disconnect(ITextComponent textComponent) {
    }

    @Override
    public void handlePlayerInput(CInputPacket p_147358_1_) {
    }

    @Override
    public void handleMoveVehicle(CMoveVehiclePacket p_184338_1_) {
    }

    @Override
    public void handleAcceptTeleportPacket(CConfirmTeleportPacket p_184339_1_) {
    }

    @Override
    public void handleRecipeBookSeenRecipePacket(CMarkRecipeSeenPacket p_191984_1_) {
    }

    @Override
    public void handleRecipeBookChangeSettingsPacket(CUpdateRecipeBookStatusPacket p_241831_1_) {
    }

    @Override
    public void handleSeenAdvancements(CSeenAdvancementsPacket p_194027_1_) {
    }

    @Override
    public void handleCustomCommandSuggestions(CTabCompletePacket p_195518_1_) {
    }

    @Override
    public void handleSetCommandBlock(CUpdateCommandBlockPacket p_210153_1_) {
    }

    @Override
    public void handleSetCommandMinecart(CUpdateMinecartCommandBlockPacket p_210158_1_) {
    }

    @Override
    public void handlePickItem(CPickItemPacket p_210152_1_) {
    }

    @Override
    public void handleRenameItem(CRenameItemPacket p_210155_1_) {
    }

    @Override
    public void handleSetBeaconPacket(CUpdateBeaconPacket p_210154_1_) {
    }

    @Override
    public void handleSetStructureBlock(CUpdateStructureBlockPacket p_210157_1_) {
    }

    @Override
    public void handleSetJigsawBlock(CUpdateJigsawBlockPacket p_217262_1_) {
    }

    @Override
    public void handleJigsawGenerate(CJigsawBlockGeneratePacket p_230549_1_) {
    }

    @Override
    public void handleSelectTrade(CSelectTradePacket p_210159_1_) {
    }

    @Override
    public void handleEditBook(CEditBookPacket p_210156_1_) {
    }

    @Override
    public void handleEntityTagQuery(CQueryEntityNBTPacket p_211526_1_) {
    }

    @Override
    public void handleBlockEntityTagQuery(CQueryTileEntityNBTPacket p_211525_1_) {
    }

    @Override
    public void handleMovePlayer(CPlayerPacket p_147347_1_) {
    }

    @Override
    public void teleport(double p_147364_1_, double p_147364_3_, double p_147364_5_, float p_147364_7_, float p_147364_8_) {
    }

    @Override
    public void teleport(double p_175089_1_, double p_175089_3_, double p_175089_5_, float p_175089_7_, float p_175089_8_, Set<SPlayerPositionLookPacket.Flags> p_175089_9_) {
    }

    @Override
    public void handlePlayerAction(CPlayerDiggingPacket p_147345_1_) {
    }

    @Override
    public void handleUseItemOn(CPlayerTryUseItemOnBlockPacket p_184337_1_) {
    }

    @Override
    public void handleUseItem(CPlayerTryUseItemPacket p_147346_1_) {
    }

    @Override
    public void handleTeleportToEntityPacket(CSpectatePacket p_175088_1_) {
    }

    @Override
    public void handleResourcePackResponse(CResourcePackStatusPacket p_175086_1_) {
    }

    @Override
    public void handlePaddleBoat(CSteerBoatPacket p_184340_1_) {
    }

    @Override
    public void onDisconnect(ITextComponent p_147231_1_) {
    }

    @Override
    public void send(IPacket<?> p_147359_1_) {
    }

    @Override
    public void send(IPacket<?> p_211148_1_, @Nullable GenericFutureListener<? extends Future<? super Void>> p_211148_2_) {
    }

    @Override
    public void handleSetCarriedItem(CHeldItemChangePacket p_147355_1_) {
    }

    @Override
    public void handleChat(CChatMessagePacket p_147354_1_) {
    }

    @Override
    public void handleAnimate(CAnimateHandPacket p_175087_1_) {
    }

    @Override
    public void handlePlayerCommand(CEntityActionPacket p_147357_1_) {
    }

    @Override
    public void handleInteract(CUseEntityPacket p_147340_1_) {
    }

    @Override
    public void handleClientCommand(CClientStatusPacket p_147342_1_) {
    }

    @Override
    public void handleContainerClose(CCloseWindowPacket p_147356_1_) {
    }

    @Override
    public void handleContainerClick(CClickWindowPacket p_147351_1_) {
    }

    @Override
    public void handlePlaceRecipe(CPlaceRecipePacket p_194308_1_) {
    }

    @Override
    public void handleContainerButtonClick(CEnchantItemPacket p_147338_1_) {
    }

    @Override
    public void handleSetCreativeModeSlot(CCreativeInventoryActionPacket p_147344_1_) {
    }

    @Override
    public void handleContainerAck(CConfirmTransactionPacket p_147339_1_) {
    }

    @Override
    public void handleSignUpdate(CUpdateSignPacket p_147343_1_) {
    }

    @Override
    public void handleKeepAlive(CKeepAlivePacket p_147353_1_) {
    }

    @Override
    public void handlePlayerAbilities(CPlayerAbilitiesPacket p_147348_1_) {
    }

    @Override
    public void handleClientInformation(CClientSettingsPacket p_147352_1_) {
    }

    @Override
    public void handleCustomPayload(CCustomPayloadPacket p_147349_1_) {
    }

    @Override
    public void handleChangeDifficulty(CSetDifficultyPacket p_217263_1_) {
    }

    @Override
    public void handleLockDifficulty(CLockDifficultyPacket p_217261_1_) {
    }
}
