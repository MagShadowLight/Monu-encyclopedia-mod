package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen1;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class CastingForHelp extends Screen {

    private Screen parent;
    private static MatrixStack matrices = new MatrixStack();


    private static QuestopediaSierhavenQuestScreen1 sierhavenquests = new QuestopediaSierhavenQuestScreen1();


    public CastingForHelp() {
        super(Text.literal("Casting for Help"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        final MultilineText text = MultilineText.create(textRenderer,
                Text.literal("Casting for Help:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - Supply and Demand"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal(" - Melinda (-614, 96, 12)"),
                Text.literal("Rewards:"),
                Text.literal(" - 64 XP Bottles"),
                Text.literal(" - 3 Healing Vials"),
                Text.literal("Wiki Page:"),
                Text.literal(" https://monumenta.wiki.gg/wiki/Casting_for_Help"),
                Text.literal("Summary:"),
                Text.literal(" Melinda told us that her legs is broken and need to see Nurse Deidre"),
                Text.literal(" and asked us if we could see her. We told Nurse Deidre about her legs,"),
                Text.literal(" but she told us that running low on mats and asked us to get Spider Silk "),
                Text.literal(" from Swamp Sinkhole. We handed her Spider Silk and asked us to take the cast"),
                Text.literal(" to Melinda and she'll see her when she got other equipment. Melinda asked"),
                Text.literal(" us to go look for money in her basement, but when we got down to the basement,"),
                Text.literal(" there isn't any money in there, only to realize that she"),
                Text.literal(" took her money for building blocks."));
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
