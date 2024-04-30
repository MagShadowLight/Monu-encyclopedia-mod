package monu.encyclopedia.questopedia.architects_rings;

import monu.encyclopedia.questopedia.QuestopediaRegionsSelectionScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class QuestopediaArchitectsRingsScreen extends Screen {
    private Screen parent;
    private static QuestopediaRegionsSelectionScreen regionsSelectionScreen = new QuestopediaRegionsSelectionScreen();

    public QuestopediaArchitectsRingsScreen() {
        super(Text.literal("Questopedia Architect's Rings Town Selection"));
        this.parent = parent;
    }

    public ButtonWidget galengarde;
    public ButtonWidget portManteau;
    public ButtonWidget newAntium;
    public ButtonWidget dreams;
    public ButtonWidget chantry;
    public ButtonWidget back;

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        galengarde = ButtonWidget.builder(Text.literal("Galengarde"), button -> {
                    System.out.println("You have clicked Galengarde Quest List, which is not out yet!");
                })
                .dimensions(125, 70, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Galengarde Quest. (WIP)")))
                .build();

        portManteau = ButtonWidget.builder(Text.literal("Port Manteau"), button -> {
                    System.out.println("You have clicked Port Manteau Quest List, which is not out yet!");
                })
                .dimensions(275, 70, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Port Manteau Quest. (WIP)")))
                .build();

        newAntium = ButtonWidget.builder(Text.literal("New Antium"), button -> {
                    System.out.println("You have clicked New Antium Quest List, which is not out yet!");
                })
                .dimensions(75, 100, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Nightroost Quest. (WIP)")))
                .build();

        dreams = ButtonWidget.builder(Text.literal("Dreams (Exalted Hall)"), button -> {
                    System.out.println("You have clicked Dreams Quest List, aka Exalted Hall, which is not out yet!");
                })
                .dimensions(200, 100, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Quest in Exalted Hall. (WIP)")))
                .build();

        chantry = ButtonWidget.builder(Text.literal("Chantry of Repentance"), button -> {
                    System.out.println("You have clicked Chantry Quest List, which is not out yet!");
                })
                .dimensions(325, 100, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of CoR Quest. (WIP)")))
                .build();

        back = ButtonWidget.builder(Text.literal("Back"), button -> {
                    System.out.println("You have clicked Back Button which will take you to previous screen!");
                    client.setScreen(regionsSelectionScreen);
                })
                .dimensions(200, 180, 100, 20)
                .tooltip(Tooltip.of(Text.literal("Take you back to previous screen.")))
                .build();

        addDrawableChild(galengarde);
        addDrawableChild(portManteau);
        addDrawableChild(newAntium);
        addDrawableChild(dreams);
        addDrawableChild(chantry);
        addDrawableChild(back);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY,delta);
        drawCenteredTextWithShadow(matrices, textRenderer, Text.literal("Select Towns"), 250, 20, 0xffffff);
    }

}
