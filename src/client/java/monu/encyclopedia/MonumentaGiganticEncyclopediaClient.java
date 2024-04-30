package monu.encyclopedia;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class MonumentaGiganticEncyclopediaClient implements ClientModInitializer {

	public static MinecraftClient client;

	private static Gigantic_Encyclopedia_Screen encyclopediaScreen = new Gigantic_Encyclopedia_Screen();
	private static KeyBinding keyBinding;

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"key.monumenta-gigantic-encyclopedia.open-encyclopedia",
				InputUtil.Type.KEYSYM,
				GLFW.GLFW_KEY_I,
				"category.monumenta-gigantic-encyclopedia.encyclopedia"
		));
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (keyBinding.wasPressed()) {
				client.setScreen(encyclopediaScreen);
			}
		});
	}
}