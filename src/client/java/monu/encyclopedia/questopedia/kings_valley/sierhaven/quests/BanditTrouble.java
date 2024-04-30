package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen1;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import java.util.List;

public class BanditTrouble extends Screen {

    private Screen parent;
    private static MatrixStack matrices = new MatrixStack();


    private static QuestopediaSierhavenQuestScreen1 sierhavenquests = new QuestopediaSierhavenQuestScreen1();


    public BanditTrouble() {
        super(Text.literal("Bandit Trouble"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        final MultilineText text = MultilineText.create(textRenderer,
                Text.literal("Bandit Trouble:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - None"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal(" Octavius (-672, 107, 70)"),
                Text.literal("Rewards:"),
                Text.literal(" - Two options you can choose:"),
                Text.literal("  1. If you side with Octavius: 192 XP bottles"),
                Text.literal("  2. If you side with Captain Murano: Watcher's Sword"),
                Text.literal("Wiki Page:"),
                Text.literal(" https://monumenta.wiki.gg/wiki/Bandit_Troubles"),
                Text.literal("Summary:"),
                Text.literal(" Octavius told us that Bandits have been harassed his caravan and asked us to kill"),
                Text.literal(" two Bandit Leaders in Northwestern Stronghold and Hilltops Fortress. Once we killed"),
                Text.literal(" both leaders, we found out that Octavius was being sus so we told him up front."),
                Text.literal(" He told us to not tell Captain Murano, but we can choose to not tell them for"),
                Text.literal(" 3 stacks of XP or do tell them that Octavius is sus with the evidences."));
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
