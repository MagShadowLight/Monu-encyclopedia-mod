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

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        int rectangleX = 50;
        int rectangleY = 15;
        int rectangleWidth = 120;
        int rectangleHeight = 145;
        fill(matrices, rectangleX, rectangleY, rectangleWidth, rectangleHeight, 0x00000000);

//        final MultilineText text = MultilineText.create(textRenderer,
//                Text.literal("A Crown of Majesty:"),
//                Text.literal("Prerequisites:"),
//                Text.literal(" - None"),
//                Text.literal("Starting NPC & Coords:"),
//                Text.literal(" - Aimee (-760, 106, 19)"),
//                Text.literal("Rewards:"),
//                Text.literal(" - Jeweled Tiara"),
//                Text.literal(" - 128 XP Bottles"),
//                Text.literal("Wiki Page:"),
//                Text.literal(" https://monumenta.wiki.gg/wiki/A_Crown_of_Majesty"),
//                Text.literal("Summary:"),
//                Text.literal(" Aimee told us that King's birthday is coming up and a mysterious donor commissioned her"),
//                Text.literal(" shop to make a new crown for him. She asked us to get the gem from the mine. We headed"),
//                Text.literal(" to the mine where we will find Ominous Scout to kill. After Ominous Scout been killed, we"),
//                Text.literal(" head to the shortcut to grab the gem, only to realize that it made you chilly. We brought"),
//                Text.literal(" the gem to Aimee. She asked us to go down the basement to craft the crown"),
//                Text.literal(" and then talked to her to get rewards."));
//        super.render(matrices, mouseX, mouseY, delta);
//        text.drawWithShadow(matrices, 20, 20, 8, 0xffffff);
    }

    public ButtonWidget quest1;
    public ButtonWidget quest2;
    public ButtonWidget quest3;
    public ButtonWidget quest4;
    public ButtonWidget quest5;
    public ButtonWidget quest6;
    public ButtonWidget quest7;
    public ButtonWidget quest8;
    public ButtonWidget quest9;
    public ButtonWidget quest10;
    public ElementListWidget ButtonLists;
    public ElementListWidget TextBoxes;
//    public ButtonWidget previouspage;
    public ButtonWidget nextpage;
    public ButtonWidget back;

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        quest1 = ButtonWidget.builder(Text.literal("Bandit Trouble"), button -> {
                    System.out.println("You have clicked Bandit Trouble quest");
                    client.setScreen(quest1Screen);
                })
                .dimensions(200, 20, 100, 15)
                .position(75, 20)
                .tooltip(Tooltip.of(Text.literal("Open Bandit Trouble quest info.")))
                .build();

        quest2 = ButtonWidget.builder(Text.literal("Bane of the Bakers"), button -> {
                    System.out.println("You have clicked Bane of the Bakers Quest!");
                    client.setScreen(quest2Screen);
                })
                .dimensions(200, 35, 100, 15)
                .position(75, 35)
                .tooltip(Tooltip.of(Text.literal("Open Bane of the Bakers Quest info.")))
                .build();

        quest3 = ButtonWidget.builder(Text.literal("Casting for Help"), button -> {
                    System.out.println("You have clicked Casting for Help quest!");
                    client.setScreen(quest3Screen);
                })
                .dimensions(200, 50, 100, 15)
                .position(75, 50)
                .tooltip(Tooltip.of(Text.literal("Open Casting for Help quest info")))
                .build();

        quest4 = ButtonWidget.builder(Text.literal("Clear as Glass"), button -> {
                    System.out.println("You have clicked Clear as Glass quest!");
                })
                .dimensions(200, 65, 100, 15)
                .position(75, 65)
                .tooltip(Tooltip.of(Text.literal("Open Clear as glass quest.")))
                .build();

        quest5 = ButtonWidget.builder(Text.literal("Crazy, Cupid, Love"), button -> {
                    System.out.println("You have clicked Crazy, Cupid, Love quest!");
                })
                .dimensions(200, 80, 100, 15)
                .position(75, 80)
                .tooltip(Tooltip.of(Text.literal("Open Crazy, Cupid, Love quest")))
                .build();
        quest6 = ButtonWidget.builder(Text.literal("A Crown of Madness"), button -> {
                    System.out.println("You have clicked A Crown of Madness quest!");
                })
                .dimensions(200, 95, 100, 15)
                .position(75, 95)
                .tooltip(Tooltip.of(Text.literal("Open A Crown of Madness quest")))
                .build();
        quest7 = ButtonWidget.builder(Text.literal("A Crown of Majesty"), button -> {
                    System.out.println("You have clicked A Crown of Majesty quest!");
                    client.setScreen(quest7Screen);
                })
                .dimensions(200, 110, 100, 15)
                .position(75, 110)
                .tooltip(Tooltip.of(Text.literal("Open A Crown of Majesty quest")))
                .build();
        quest8 = ButtonWidget.builder(Text.literal("Flash in the Pan"), button -> {
                    System.out.println("You have clicked Flash in the Pan quest!");
                })
                .dimensions(200, 125, 100, 15)
                .position(75, 125)
                .tooltip(Tooltip.of(Text.literal("Open Flash in the Pan quest")))
                .build();
        quest9 = ButtonWidget.builder(Text.literal("A Little Spark"), button -> {
                    System.out.println("You have clicked A Little Spark quest!");
                })
                .dimensions(200, 140, 100, 15)
                .position(75, 140)
                .tooltip(Tooltip.of(Text.literal("Open A Little Spark quest")))
                .build();
        quest10 = ButtonWidget.builder(Text.literal("Mage's Legacy"), button -> {
                    System.out.println("You have clicked Mage's Legacy quest!");
                })
                .dimensions(200, 155, 100, 15)
                .position(75, 155)
                .tooltip(Tooltip.of(Text.literal("Open Mage's Legacy quest")))
                .build();
//        previouspage = ButtonWidget.builder(Text.literal("Previous Page"), button -> {
//                    System.out.println("You have clicked Previous Page Button!");
//                    client.setScreen(page1);
//                })
//                .dimensions(200, 170, 100, 15)
//                .tooltip(Tooltip.of(Text.literal("Go to next page")))
//                .build();
        nextpage = ButtonWidget.builder(Text.literal("Next Page"), button -> {
                    System.out.println("You have clicked Next Page Button!");
                    client.setScreen(page2);
                })
                .dimensions(200, 185, 100, 15)
                .position(75, 185)
                .tooltip(Tooltip.of(Text.literal("Go to next page")))
                .build();
        back = ButtonWidget.builder(Text.literal("Back"), button -> {
                    System.out.println("You have clicked Back Button which will take you to previous screen!");
                    client.setScreen(townSelectionScreen);
                })
                .dimensions(200, 200, 100, 15)
                .position(75,225)
                .tooltip(Tooltip.of(Text.literal("Take you back to previous screen.")))
                .build();

        addDrawableChild(quest1);
        addDrawableChild(quest2);
        addDrawableChild(quest3);
        addDrawableChild(quest4);
        addDrawableChild(quest5);
        addDrawableChild(quest6);
        addDrawableChild(quest7);
        addDrawableChild(quest8);
        addDrawableChild(quest9);
        addDrawableChild(quest10);
//        addDrawableChild(previouspage);
        addDrawableChild(nextpage);
        addDrawableChild(back);
    }


}
