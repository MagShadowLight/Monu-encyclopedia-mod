package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen1;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class BaneOfTheBakers extends Screen {

    private Screen parent;
    private static MatrixStack matrices = new MatrixStack();


    private static QuestopediaSierhavenQuestScreen1 sierhavenquests = new QuestopediaSierhavenQuestScreen1();


    public BaneOfTheBakers() {
        super(Text.literal("Bane of the Bakers"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        final MultilineText text = MultilineText.create(textRenderer,
                Text.literal("Bane of the Bakers:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - None"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal(" - Stefan (-865, 104, 31)"),
                Text.literal("Rewards:"),
                Text.literal(" - Fidget Spinner"),
                Text.literal(" - 32 Pretzels"),
                Text.literal("Wiki Page:"),
                Text.literal(" https://monumenta.wiki.gg/wiki/Bane_of_the_Bakers"),
                Text.literal("Summary:"),
                Text.literal(" Stefan told us that the Bakers stole Stefan's recipe"),
                Text.literal(" and asked us to retrieve it back from them."),
                Text.literal(" We asked the Head Baker to borrow recipe from them,"),
                Text.literal(" but they never give it up easily."),
                Text.literal(" We sneak through the Baker's kitchen to steal the recipe from them"),
                Text.literal(" to give back to Stefan."));
        super.render(matrices, mouseX, mouseY, delta);
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
