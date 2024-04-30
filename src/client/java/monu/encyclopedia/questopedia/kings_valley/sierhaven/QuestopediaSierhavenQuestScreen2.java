package monu.encyclopedia.questopedia.kings_valley.sierhaven;

import monu.encyclopedia.questopedia.kings_valley.QuestopediaKingsValleyScreen;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.FinishedBusiness;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.SnowManLeftBehind;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.SupplyAndDemand;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class QuestopediaSierhavenQuestScreen2 extends Screen {

    private Screen parent;
    private static QuestopediaKingsValleyScreen townSelectionScreen = new QuestopediaKingsValleyScreen();
    private static QuestopediaSierhavenQuestScreen1 page1 = new QuestopediaSierhavenQuestScreen1();
    private static QuestopediaSierhavenQuestScreen3 page3 = new QuestopediaSierhavenQuestScreen3();
    private static FinishedBusiness quest8Screen = new FinishedBusiness();
    private static SnowManLeftBehind quest9Screen = new SnowManLeftBehind();
    private static SupplyAndDemand quest10Screen = new SupplyAndDemand();

    public QuestopediaSierhavenQuestScreen2() {
        super(Text.literal("Questopedia Sierhaven Quest List Page 2"));
        this.parent = parent;
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
    public ButtonWidget previouspage;
    public ButtonWidget nextpage;
    public ButtonWidget back;

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        quest1 = ButtonWidget.builder(Text.literal("Memories of Battle"), button -> {
                    System.out.println("You have clicked Memories of Battle quest");
                })
                .dimensions(200, 20, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open Memories of Battle quest info.")))
                .build();

        quest2 = ButtonWidget.builder(Text.literal("A Crew to Remember"), button -> {
                    System.out.println("You have clicked A Crew to Remember Quest!");
                })
                .dimensions(200, 35, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open A Crew to Remember Quest info.")))
                .build();

        quest3 = ButtonWidget.builder(Text.literal("A Pigculiar Problem"), button -> {
                    System.out.println("You have clicked A Pigculiar Problem quest!");
                })
                .dimensions(200, 50, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open A Pigculiar Problem quest info")))
                .build();

        quest4 = ButtonWidget.builder(Text.literal("Scars of Magic"), button -> {
                    System.out.println("You have clicked Scars of Magic quest!");
                })
                .dimensions(200, 65, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open Scars of Magic quest.")))
                .build();

        quest5 = ButtonWidget.builder(Text.literal("The Scout's Codex"), button -> {
                    System.out.println("You have clicked The Scout's Codex quest!");
                })
                .dimensions(200, 80, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open The Scout's Codex quest")))
                .build();
        quest6 = ButtonWidget.builder(Text.literal("Nelfine's Curse"), button -> {
                    System.out.println("You have clicked Nelfine's Curse quest!");
                })
                .dimensions(200, 95, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open Nelfine's Curse quest")))
                .build();
        quest7 = ButtonWidget.builder(Text.literal("Glooper Duper"), button -> {
                    System.out.println("You have clicked Glooper Duper quest!");
                })
                .dimensions(200, 110, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open Glooper Duper quest")))
                .build();
        quest8 = ButtonWidget.builder(Text.literal("Finished Business"), button -> {
                    System.out.println("You have clicked Finished Business quest!");
                    client.setScreen(quest8Screen);
                })
                .dimensions(200, 125, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open Finished Business quest")))
                .build();
        quest9 = ButtonWidget.builder(Text.literal("Snow Man Left Behind"), button -> {
                    System.out.println("You have clicked Snow Man Left Behind quest!");
                    client.setScreen(quest9Screen);
                })
                .dimensions(200, 140, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open Snow Man Left Behind quest")))
                .build();
        quest10 = ButtonWidget.builder(Text.literal("Supply and Demand"), button -> {
                    System.out.println("You have clicked Supply and Demand quest!");
                    client.setScreen(quest10Screen);
                })
                .dimensions(200, 155, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open Supply and Demand quest")))
                .build();
        previouspage = ButtonWidget.builder(Text.literal("Previous Page"), button -> {
                    System.out.println("You have clicked Previous Page Button!");
                    client.setScreen(page1);
                })
                .dimensions(200, 170, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Go to next page")))
                .build();
        nextpage = ButtonWidget.builder(Text.literal("Next Page"), button -> {
                    System.out.println("You have clicked Next Page Button!");
                    client.setScreen(page3);
                })
                .dimensions(200, 185, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Go to next page")))
                .build();
        back = ButtonWidget.builder(Text.literal("Back"), button -> {
                    System.out.println("You have clicked Back Button which will take you to previous screen!");
                    client.setScreen(townSelectionScreen);
                })
                .dimensions(200, 200, 100, 15)
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
        addDrawableChild(previouspage);
        addDrawableChild(nextpage);
        addDrawableChild(back);
    }


}
