package monu.encyclopedia.questopedia;

import monu.encyclopedia.Gigantic_Encyclopedia_Screen;
import monu.encyclopedia.questopedia.architects_rings.QuestopediaArchitectsRingsScreen;
import monu.encyclopedia.questopedia.celsian_isles.QuestopediaCelsianIslesScreen;
import monu.encyclopedia.questopedia.kings_valley.QuestopediaKingsValleyScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class QuestopediaRegionsSelectionScreen extends Screen {

    private Screen parent;
    private static Gigantic_Encyclopedia_Screen encyclopediaScreen = new Gigantic_Encyclopedia_Screen();
    private static QuestopediaKingsValleyScreen townSelectionScreen = new QuestopediaKingsValleyScreen();
    private static QuestopediaCelsianIslesScreen townSelectionScreen2 = new QuestopediaCelsianIslesScreen();
    private static QuestopediaArchitectsRingsScreen townSelectionScreen3 = new QuestopediaArchitectsRingsScreen();
    public QuestopediaRegionsSelectionScreen() {
        super(Text.literal("Questopedia Regions"));
        this.parent = parent;

    }

    public ButtonWidget kingsValley;
    public ButtonWidget celsianIsles;
    public ButtonWidget architectsrings;
    public ButtonWidget back2;

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        kingsValley = ButtonWidget.builder(Text.literal("King's Valley"), button -> {
            System.out.println("You have clicked King's Valley Quest button!");
            client.setScreen(townSelectionScreen);
        })
                .dimensions(75, 100, 100,20)
                .tooltip(Tooltip.of(Text.literal("List of King's Valley Quests! (WIP)")))
                .build();
        celsianIsles = ButtonWidget.builder(Text.literal("Celsian Isles"), button -> {
            System.out.println("You have clicked Celsian Isles Quest button!");
            client.setScreen(townSelectionScreen2);
        })
                .dimensions(200,100,100,20)
                .tooltip(Tooltip.of(Text.literal("List of Celsian Isles Quests! (WIP)")))
                .build();
        architectsrings = ButtonWidget.builder(Text.literal("Architect's Rings"), button -> {
            System.out.println("You have clicked Architect's Rings Quest Button!");
            client.setScreen(townSelectionScreen3);
        })
                .dimensions(325,100,100,20)
                .tooltip(Tooltip.of(Text.literal("List of Architect's Rings Quests! (WIP)")))
                .build();
        back2 = ButtonWidget.builder(Text.literal("Back"), button -> {
            System.out.println("You have clicked the Back Button!");
            client.setScreen(encyclopediaScreen);
        })
                .dimensions(200,150,100,20)
                .tooltip(Tooltip.of(Text.literal("Back to previous Screen!")))
                .build();

        addDrawableChild(kingsValley);
        addDrawableChild(celsianIsles);
        addDrawableChild(architectsrings);
        addDrawableChild(back2);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        drawCenteredTextWithShadow(matrices, textRenderer, Text.literal("Which Regions"), 250, 50, 0xffffff);
    }

}
