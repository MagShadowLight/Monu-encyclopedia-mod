package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen2;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class FinishedBusiness extends Screen {

    private Screen parent;
    private static MatrixStack matrices = new MatrixStack();


    private static QuestopediaSierhavenQuestScreen2 sierhavenquests = new QuestopediaSierhavenQuestScreen2();


    public FinishedBusiness() {
        super(Text.literal("Finished Business Quest Info"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        final MultilineText text = MultilineText.create(textRenderer,
                Text.literal("Finished Business:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - Clear as Glass"),
                Text.literal(" - A Study in Crimson Part One"),
                Text.literal(" - Time to Reflect"),
                Text.literal(" - Shurima's Big Day Off"),
                Text.literal(" - A Crew to Remember"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal("Taymian (-826, 102, 39)"),
                Text.literal("Rewards:"),
                Text.literal(" - Awarded a sense of satisfaction for helping that weird fan-fiction author... Ugh"),
                Text.literal("Wiki Page:"),
                Text.literal("https://monumenta.wiki.gg/wiki/Finished_Business"),
                Text.literal("Summary:"),
                Text.literal("A weird fan-fiction author copied our adventure"),
                Text.literal("into some weird fan fic novel and parodies"),
                Text.literal("a couple of quests that we've done,"),
                Text.literal("basically getting you a screwed-up retelling of your"),
                Text.literal("adventures by that dude."));
        text.drawWithShadow(matrices, 20, 20, 8, 0xffffff);
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
