package monu.encyclopedia.questopedia.kings_valley;

import monu.encyclopedia.questopedia.QuestopediaRegionsSelectionScreen;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class QuestopediaKingsValleyScreen extends Screen {

    private Screen parent;
    private static QuestopediaRegionsSelectionScreen regionsSelectionScreen = new QuestopediaRegionsSelectionScreen();

    private static QuestopediaSierhavenQuestScreen1 sierhavenQuestPage1 = new QuestopediaSierhavenQuestScreen1();

    public QuestopediaKingsValleyScreen() {
        super(Text.literal("Questopedia Kings Valley"));
        this.parent = parent;
    }

    public ButtonWidget sierhaven;
    public ButtonWidget nyr;
    public ButtonWidget farr;
    public ButtonWidget highwatch;
    public ButtonWidget lowtide;
    public ButtonWidget oceangate;
    public ButtonWidget taeldim;
    public ButtonWidget back2;

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        sierhaven = ButtonWidget.builder(Text.literal("Sierhaven"), button -> {
                    System.out.println("You have clicked Sierhaven Quest List!");
                    client.setScreen(sierhavenQuestPage1);
                })
                .dimensions(90, 75, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Sierhaven Quest.")))
                .build();

        nyr = ButtonWidget.builder(Text.literal("Nyr"), button -> {
                    System.out.println("You have clicked Nyr Quest List, which is not out yet!");
                })
                .dimensions(200, 75, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Nyr Quest. (WIP)")))
                .build();

        farr = ButtonWidget.builder(Text.literal("Farr"), button -> {
                    System.out.println("You have clicked Farr Quest List, which is not out yet!");
                })
                .dimensions(310, 75, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Farr Quest. (WIP)")))
                .build();

        highwatch = ButtonWidget.builder(Text.literal("Highwatch"), button -> {
                    System.out.println("You have clicked Highwatch Quest List, which is not out yet!");
                })
                .dimensions(10, 150, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Highwatch Quest. (WIP)")))
                .build();

        lowtide = ButtonWidget.builder(Text.literal("Lowtide"), button -> {
                    System.out.println("You have clicked Lowtide Quest List, which is not out yet!");
                })
                .dimensions(135, 150, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Lowtide Quest. (WIP)")))
                .build();

        oceangate = ButtonWidget.builder(Text.literal("Oceangate"), button -> {
                    System.out.println("You have clicked Oceangate Quest List, which is not out yet!");
                })
                .dimensions(250, 150, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Oceangate Quest. (WIP)")))
                .build();

        taeldim = ButtonWidget.builder(Text.literal("Ta'Eldim"), button -> {
                    System.out.println("You have clicked Ta'Eldim Quest List, which is not out yet!");
                })
                .dimensions(365, 150, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Ta'Eldim Quest. (WIP)")))
                .build();

        back2 = ButtonWidget.builder(Text.literal("Back"), button -> {
                    System.out.println("You have clicked Back Button which will take you to previous  screen!");
                    client.setScreen(regionsSelectionScreen);
                })
                .dimensions(200, 180, 100, 20)
                .tooltip(Tooltip.of(Text.literal("Take you back to previous screen.")))
                .build();

        addDrawableChild(sierhaven);
        addDrawableChild(nyr);
        addDrawableChild(farr);
        addDrawableChild(highwatch);
        addDrawableChild(lowtide);
        addDrawableChild(oceangate);
        addDrawableChild(taeldim);
        addDrawableChild(back2);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY,delta);
        drawCenteredTextWithShadow(matrices, textRenderer, Text.literal("Select Towns"), 250, 50, 0xffffff);
    }

}
