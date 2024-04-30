package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen3;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class WordsUponHushedLips extends Screen {

    private Screen parent;


    private static QuestopediaSierhavenQuestScreen3 sierhavenquests = new QuestopediaSierhavenQuestScreen3();


    public WordsUponHushedLips() {
        super(Text.literal("Words Upon Hushed Lips Quest Info"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        final MultilineText text = MultilineText.create(textRenderer,
                Text.literal("Words Upon Hushed Lips:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - 3 Skill Points"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal("Dimitri (-800 116 -45)"),
                Text.literal("Rewards:"),
                Text.literal(" - 16 CXP"),
                Text.literal(" - 2 Potions of Protection"),
                Text.literal("Wiki Page:"),
                Text.literal("https://monumenta.wiki.gg/wiki/Words_Upon_Hushed_Lips"),
                Text.literal("Summary:"),
                Text.literal("We find Selari's assistant Dmitri."),
                Text.literal("He told us to go find Selari Ignos."),
                Text.literal("We search the Monastery first where we find a book in a wall"),
                Text.literal("that details how Selari felt this strange pressure within the monastery"),
                Text.literal("and found the book known as \"Thicker than Blood\""),
                Text.literal("which details the Architect's Dream about the attack on Farr."),
                Text.literal("We then using some more information to head off to Anthill,"),
                Text.literal("where we find Selari's lab near the Ephemeral Corridors entrance."),
                Text.literal("He was studying the entrance before he ripped a portal from his lab (using Agartha)"),
                Text.literal("to the Celsian Isles since he feared the Masked were onto and after him."),
                Text.literal("We then tell Dmitiri the last place we know where Selari was which is in the Lab."));
        text.drawWithShadow(matrices, 20, 20, 7, 0xffffff);
    }

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {

        back = ButtonWidget.builder(Text.literal("Back"), button -> {
            System.out.println("You have clicked the back button!");
            client.setScreen(sierhavenquests);
        })
                .dimensions(200,225, 100, 20)
                .tooltip(Tooltip.of(Text.literal("Go Back to the quest list")))
                .build();
        addDrawableChild(back);
    }

}
