package monu.encyclopedia;

import monu.encyclopedia.questopedia.QuestopediaRegionsSelectionScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
@Environment(EnvType.CLIENT)
public class Gigantic_Encyclopedia_Screen extends Screen {
    private Screen parent;
    private static QuestopediaRegionsSelectionScreen questopediaRegionsSelectScreen = new QuestopediaRegionsSelectionScreen();

    public Gigantic_Encyclopedia_Screen() {
        super(Text.literal("Encyclopedia of Monumenta"));
        this.parent = parent;
    }

    public ButtonWidget questopedia;
    public ButtonWidget button2;
    public ButtonWidget button3;
    public ButtonWidget button4;
    public ButtonWidget button5;

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        questopedia = ButtonWidget.builder(Text.literal("Questopedia"), button -> {
                    System.out.println("You have clicked the Questopedia button!");
                    client.setScreen(questopediaRegionsSelectScreen);
                })
                .dimensions(200,50,100,20)
                .tooltip(Tooltip.of(Text.literal("Open Questopedia (WIP)!")))
                .build();
        button2 = ButtonWidget.builder(Text.literal("Coming Soon"), button -> {
                    System.out.println("You have clicked the button that will coming!");
                })
                .dimensions(200,70,100,20)
                .tooltip(Tooltip.of(Text.literal("Coming Soon!")))
                .build();
        button3 = ButtonWidget.builder(Text.literal("Coming Soon"), button -> {
                    System.out.println("You have clicked the button that will coming!");
                })
                .dimensions(200,90,100,20)
                .tooltip(Tooltip.of(Text.literal("Coming Soon!")))
                .build();
        button4 = ButtonWidget.builder(Text.literal("Coming Soon"), button -> {
                    System.out.println("You have clicked the button that will coming!");
                })
                .dimensions(200,110,100,20)
                .tooltip(Tooltip.of(Text.literal("Coming Soon!")))
                .build();
        button5 = ButtonWidget.builder(Text.literal("Exit"), button -> {
                    this.close();
                })
                .dimensions(200,150,100,20)
                .tooltip(Tooltip.of(Text.literal("Exit to the previous screen")))
                .build();


        addDrawableChild(questopedia);
        addDrawableChild(button2);
        addDrawableChild(button3);
        addDrawableChild(button4);
        addDrawableChild(button5);
    }


}
