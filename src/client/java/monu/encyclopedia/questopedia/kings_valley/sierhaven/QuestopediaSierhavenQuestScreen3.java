package monu.encyclopedia.questopedia.kings_valley.sierhaven;

import monu.encyclopedia.questopedia.kings_valley.QuestopediaKingsValleyScreen;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.AStudyInCrimsonP1;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.BanditTrouble;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.WordsUponHushedLips;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

import java.util.prefs.BackingStoreException;

public class QuestopediaSierhavenQuestScreen3 extends Screen {

    private Screen parent;
    private static QuestopediaKingsValleyScreen townSelectionScreen = new QuestopediaKingsValleyScreen();
    private static QuestopediaSierhavenQuestScreen2 page2 = new QuestopediaSierhavenQuestScreen2();
    private static WordsUponHushedLips quest1Screen = new WordsUponHushedLips();
    private static AStudyInCrimsonP1 quest2Screen = new AStudyInCrimsonP1();

    public QuestopediaSierhavenQuestScreen3() {
        super(Text.literal("Questopedia Sierhaven Quest List Page 2"));
        this.parent = parent;
    }

    public ButtonWidget quest1;
    public ButtonWidget quest2;
    public ButtonWidget quest3;
    public ButtonWidget previouspage;
//    public ButtonWidget nextpage;
    public ButtonWidget back;

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        quest1 = ButtonWidget.builder(Text.literal("Words Upon Hushed Lips"), button -> {
                    System.out.println("You have clicked Words Upon Hushed Lips quest");
                    client.setScreen(quest1Screen);
                })
                .dimensions(200, 20, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open Words Upon Hushed Lips quest info.")))
                .build();

        quest2 = ButtonWidget.builder(Text.literal("A Study in Crimson P.1"), button -> {
                    System.out.println("You have clicked A Study in Crimson Part 1 Quest!");
                    client.setScreen(quest2Screen);
                })
                .dimensions(200, 35, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open A Study in Crimson Part 1 Quest info.")))
                .build();

        quest3 = ButtonWidget.builder(Text.literal("A Study in Crimson P.2"), button -> {
                    System.out.println("You have clicked A Study in Crimson Part 2 quest!");
                })
                .dimensions(200, 50, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Open A Study in Crimson Part 2 quest info")))
                .build();

        previouspage = ButtonWidget.builder(Text.literal("Previous Page"), button -> {
                    System.out.println("You have clicked Previous Page Button!");
                    client.setScreen(page2);
                })
                .dimensions(200, 170, 100, 15)
                .tooltip(Tooltip.of(Text.literal("Go to next page")))
                .build();
//        nextpage = ButtonWidget.builder(Text.literal("Next Page"), button -> {
//                    System.out.println("You have clicked Next Page Button!");
//
//                })
//                .dimensions(200, 185, 100, 15)
//                .tooltip(Tooltip.of(Text.literal("Go to next page")))
//                .build();
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
        addDrawableChild(previouspage);
//        addDrawableChild(nextpage);
        addDrawableChild(back);
    }


}
