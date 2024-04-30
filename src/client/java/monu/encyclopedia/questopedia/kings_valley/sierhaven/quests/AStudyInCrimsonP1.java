package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen3;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class AStudyInCrimsonP1 extends Screen {

    private Screen parent;


    private static QuestopediaSierhavenQuestScreen3 sierhavenquests = new QuestopediaSierhavenQuestScreen3();


    public AStudyInCrimsonP1() {
        super(Text.literal("A Study in Crimson Part 1 Quest Info"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        final MultilineText text = MultilineText.create(textRenderer,Text.literal("A Study in Crimson Part 1:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - Memories of Battle"),
                Text.literal(" - Soul of the Forest"),
                Text.literal(" - Unveiled"),
                Text.literal(" - Shurima's Big Day Off"),
                Text.literal(" - Completion of any difficulty of EC"),
                Text.literal(" - Defeated Kaul"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal("Jeremiah in the Memory Vault (-917, 91, -161)"),
                Text.literal("Rewards:"),Text.literal(" - 5 HXP"),
                Text.literal(" - Crimson Contract"),
                Text.literal("Wiki Page:"),
                Text.literal("https://monumenta.wiki.gg/wiki/A_Study_in_Crimson_Part_One"),
                Text.literal("Summary:"),
                Text.literal("You meet up with Jeremiah and"),
                Text.literal("the Crimson King comes forth to have a conversation with you."),
                Text.literal("You then enter Telsket's memory, run through Ephemeral Corridors as a POI, and"),
                Text.literal("then right before Callum herring getting blasted to death by Calder and"),
                Text.literal("then making a deal with the King."),
                Text.literal("Then you enter Callum's memory and talk with Calder in a partially corrupted memory."),
                Text.literal("You then go around Farr killing mobs for materials before finally fighting Telsket."),
                Text.literal("Then you enter through Zanil's memory and"),
                Text.literal("he tells you nothing besides showing you the memory"),
                Text.literal("of Ixume talking to him and to be wary of the King."));
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
