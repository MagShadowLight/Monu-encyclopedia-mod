package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen2;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class SupplyAndDemand extends Screen {

    private Screen parent;
    private static MatrixStack matrices = new MatrixStack();


    private static QuestopediaSierhavenQuestScreen2 sierhavenquests = new QuestopediaSierhavenQuestScreen2();


    public SupplyAndDemand() {
        super(Text.literal("Supply and Demand Quest Info"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        final MultilineText text = MultilineText.create(textRenderer,
                Text.literal("Supply and Demand:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - none"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal("Buildmaster Jr. (-778, 106, 20)"),
                Text.literal("Rewards:"),
                Text.literal(" - 12 CXP"),
                Text.literal(" - Experience Flask"),
                Text.literal("Wiki Page:"),
                Text.literal("https://monumenta.wiki.gg/wiki/Supply_and_Demand"),
                Text.literal("Summary:"),
                Text.literal("Buildmaster Jr. asks you to get some materials found"),
                Text.literal("in various places around Sierhaven"),
                Text.literal("for an item that you bring to the guy in the Forgery"),
                Text.literal("that you then take to Melinda"));
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
