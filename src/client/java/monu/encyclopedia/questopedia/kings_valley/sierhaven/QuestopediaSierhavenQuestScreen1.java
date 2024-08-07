package monu.encyclopedia.questopedia.kings_valley.sierhaven;

import monu.encyclopedia.questopedia.QuestopediaRegionsSelectionScreen;
import monu.encyclopedia.questopedia.kings_valley.QuestopediaKingsValleyScreen;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.ACrownOfMajesty;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.BanditTrouble;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.BaneOfTheBakers;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.CastingForHelp;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ElementListWidget;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class QuestopediaSierhavenQuestScreen1 extends Screen {
    private BufferBuilder builder;
    private Screen parent;
    private static QuestopediaKingsValleyScreen townSelectionScreen = new QuestopediaKingsValleyScreen();
    private static QuestopediaSierhavenQuestScreen2 page2 = new QuestopediaSierhavenQuestScreen2();
    private static BanditTrouble quest1Screen = new BanditTrouble();
    private static BaneOfTheBakers quest2Screen = new BaneOfTheBakers();
    private static CastingForHelp quest3Screen = new CastingForHelp();
    private static ACrownOfMajesty quest7Screen = new ACrownOfMajesty();

    public QuestopediaSierhavenQuestScreen1() {
        super(Text.literal("Questopedia Sierhaven Quest List Page 1"));
        this.parent = parent;
    }


    public ElementListWidget ButtonLists;
    public ElementListWidget TextBoxes;
    // public ButtonWidget previouspage;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        int rectangleX = 60;
        int rectangleY = 15;
        int rectangleWidth = 190;
        int rectangleHeight = 215;
        fill(matrices, rectangleX, rectangleY, rectangleWidth, rectangleHeight, -500, 0xff000000);
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        addDrawableChild(
                ButtonWidget.builder(Text.literal("Bandit Trouble"), button -> {
                            System.out.println("You have clicked Bandit Trouble quest");
                            client.setScreen(quest1Screen);
                        })
                        .dimensions(200, 20, 100, 15)
                        .position(75, 20)
                        .tooltip(Tooltip.of(Text.literal("Open Bandit Trouble quest info.")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Bane of the Bakers"), button -> {
                            System.out.println("You have clicked Bane of the Bakers Quest!");
                            client.setScreen(quest2Screen);
                        })
                        .dimensions(200, 35, 100, 15)
                        .position(75, 35)
                        .tooltip(Tooltip.of(Text.literal("Open Bane of the Bakers Quest info.")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Casting for Help"), button -> {
                            System.out.println("You have clicked Casting for Help quest!");
                            client.setScreen(quest3Screen);
                        })
                        .dimensions(200, 50, 100, 15)
                        .position(75, 50)
                        .tooltip(Tooltip.of(Text.literal("Open Casting for Help quest info")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Clear as Glass"), button -> {
                            System.out.println("You have clicked Clear as Glass quest!");
                        })
                        .dimensions(200, 65, 100, 15)
                        .position(75, 65)
                        .tooltip(Tooltip.of(Text.literal("Open Clear as glass quest.")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Crazy, Cupid, Love"), button -> {
                            System.out.println("You have clicked Crazy, Cupid, Love quest!");
                        })
                        .dimensions(200, 80, 100, 15)
                        .position(75, 80)
                        .tooltip(Tooltip.of(Text.literal("Open Crazy, Cupid, Love quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("A Crown of Madness"), button -> {
                            System.out.println("You have clicked A Crown of Madness quest!");
                        })
                        .dimensions(200, 95, 100, 15)
                        .position(75, 95)
                        .tooltip(Tooltip.of(Text.literal("Open A Crown of Madness quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("A Crown of Majesty"), button -> {
                            System.out.println("You have clicked A Crown of Majesty quest!");
                            client.setScreen(quest7Screen);
                        })
                        .dimensions(200, 110, 100, 15)
                        .position(75, 110)
                        .tooltip(Tooltip.of(Text.literal("Open A Crown of Majesty quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Flash in the Pan"), button -> {
                            System.out.println("You have clicked Flash in the Pan quest!");
                        })
                        .dimensions(200, 125, 100, 15)
                        .position(75, 125)
                        .tooltip(Tooltip.of(Text.literal("Open Flash in the Pan quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("A Little Spark"), button -> {
                            System.out.println("You have clicked A Little Spark quest!");
                        })
                        .dimensions(200, 140, 100, 15)
                        .position(75, 140)
                        .tooltip(Tooltip.of(Text.literal("Open A Little Spark quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Mage's Legacy"), button -> {
                            System.out.println("You have clicked Mage's Legacy quest!");
                        })
                        .dimensions(200, 155, 100, 15)
                        .position(75, 155)
                        .tooltip(Tooltip.of(Text.literal("Open Mage's Legacy quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Next Page"), button -> {
                            System.out.println("You have clicked Next Page Button!");
                            client.setScreen(page2);
                        })
                        .dimensions(200, 185, 100, 15)
                        .position(75, 185)
                        .tooltip(Tooltip.of(Text.literal("Go to next page")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Back"), button -> {
                            System.out.println("You have clicked Back Button which will take you to previous screen!");
                            client.setScreen(townSelectionScreen);
                        })
                        .dimensions(200, 200, 100, 15)
                        .position(75,225)
                        .tooltip(Tooltip.of(Text.literal("Take you back to previous screen.")))
                        .build()
        );
    }
}
