package monu.encyclopedia.questopedia.kings_valley.sierhaven.quests;

import monu.encyclopedia.questopedia.kings_valley.sierhaven.QuestopediaSierhavenQuestScreen1;
import net.minecraft.client.font.MultilineText;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class ACrownOfMajesty extends Screen {

    private Screen parent;
    private static MatrixStack matrices = new MatrixStack();


    private static QuestopediaSierhavenQuestScreen1 sierhavenquests = new QuestopediaSierhavenQuestScreen1();


    public ACrownOfMajesty() {
        super(Text.literal("A Crown of Majesty"));
        this.parent = parent;
    }

    public ButtonWidget back;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {

        final MultilineText text = MultilineText.create(textRenderer,
                Text.literal("A Crown of Majesty:"),
                Text.literal("Prerequisites:"),
                Text.literal(" - None"),
                Text.literal("Starting NPC & Coords:"),
                Text.literal(" - Aimee (-760, 106, 19)"),
                Text.literal("Rewards:"),
                Text.literal(" - Jeweled Tiara"),
                Text.literal(" - 128 XP Bottles"),
                Text.literal("Wiki Page:"),
                Text.literal(" https://monumenta.wiki.gg/wiki/A_Crown_of_Majesty"),
                Text.literal("Summary:"),
                Text.literal(" Aimee told us that King's birthday is coming up and a mysterious donor commissioned her"),
                Text.literal(" shop to make a new crown for him. She asked us to get the gem from the mine. We headed"),
                Text.literal(" to the mine where we will find Ominous Scout to kill. After Ominous Scout been killed, we"),
                Text.literal(" head to the shortcut to grab the gem, only to realize that it made you chilly. We brought"),
                Text.literal(" the gem to Aimee. She asked us to go down the basement to craft the crown"),
                Text.literal(" and then talked to her to get rewards."));
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
