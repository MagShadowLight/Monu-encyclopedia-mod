package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen2;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class SnowManLeftBehind extends Screen {

    private Screen parent;


    private static QuestopediaSierhavenQuestScreen2 sierhavenquests = new QuestopediaSierhavenQuestScreen2();


    public SnowManLeftBehind() {
        super(Text.literal("Snow Man Left Behind Quest Info"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        final MultilineText text = MultilineText.create(textRenderer,
                Text.literal("Snow Man Left Behind:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - Words Upon Hushed Lips"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal("Selholly Sprignos (-850, 101, 78)"),
                Text.literal("Rewards:"),
                Text.literal(" - Replica Snow Wool"),
                Text.literal(" - Ability to buy and upgrade the Tesseract of Festivity"),
                Text.literal(" - Ability to drink more Eggnog with Colder for more interesting result"),
                Text.literal("Wiki Page:"),
                Text.literal("https://monumenta.wiki.gg/wiki/Snow_Man_Left_Behind"),
                Text.literal("Summary:"),
                Text.literal("Selholly got his research note stolen by culprit."),
                Text.literal("You track down the culprit who is Colder in the Nyr bar."),
                Text.literal("You bring him an essence of winter"),
                Text.literal("and he'll lead you to his labs which unleashed the snow spirit"),
                Text.literal("then you woke up and it was all a dream and you returned to Selholly with no notes."));
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
