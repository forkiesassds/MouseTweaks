package yalter.mousetweaks.handlers;

import net.minecraft.src.GuiContainerCreative;
import net.minecraft.src.Slot;
import yalter.mousetweaks.MouseButton;

public class GuiContainerCreativeHandler extends GuiContainerHandler {
	public GuiContainerCreativeHandler(GuiContainerCreative guiContainerCreative) {
		super(guiContainerCreative);
	}

	@Override
	public boolean isIgnored(Slot slot) {
		return (super.isIgnored(slot) || slot.inventory != mc.thePlayer.inventory);
	}

	@Override
	public void clickSlot(Slot slot, MouseButton mouseButton, boolean shiftPressed) {
	}
}
