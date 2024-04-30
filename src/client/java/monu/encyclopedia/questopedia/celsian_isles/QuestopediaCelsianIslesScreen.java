package monu.encyclopedia.questopedia.celsian_isles;

import monu.encyclopedia.questopedia.QuestopediaRegionsSelectionScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class QuestopediaCelsianIslesScreen extends Screen {

    private Screen parent;
    private static QuestopediaRegionsSelectionScreen regionsSelectionScreen = new QuestopediaRegionsSelectionScreen();

    public QuestopediaCelsianIslesScreen() {
        super(Text.literal("Questopedia Celsian Isles Town Selection"));
        this.parent = parent;
    }

    public ButtonWidget mistport;
    public ButtonWidget frostgate;
    public ButtonWidget nightroost;
    public ButtonWidget wispervale;
    public ButtonWidget alnera;
    public ButtonWidget rahkeri;
    public ButtonWidget molta;
    public ButtonWidget steelmeld;
    public ButtonWidget breachpoint;
    public ButtonWidget back3;

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        mistport = ButtonWidget.builder(Text.literal("Mistport"), button -> {
                    System.out.println("You have clicked Mistport Quest List, which is not out yet!");
                })
                .dimensions(90, 45, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Mistport Quest. (WIP)")))
                .build();

        frostgate = ButtonWidget.builder(Text.literal("Frostgate"), button -> {
                    System.out.println("You have clicked Frostgate Quest List, which is not out yet!");
                })
                .dimensions(200, 45, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Frostgate Quest. (WIP)")))
                .build();

        nightroost = ButtonWidget.builder(Text.literal("Nightroost"), button -> {
                    System.out.println("You have clicked Nightroost Quest List, which is not out yet!");
                })
                .dimensions(310, 45, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Nightroost Quest. (WIP)")))
                .build();

        wispervale = ButtonWidget.builder(Text.literal("Wispervale"), button -> {
                    System.out.println("You have clicked Wispervale Quest List, which is not out yet!");
                })
                .dimensions(90, 80, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Wispervale Quest. (WIP)")))
                .build();

        alnera = ButtonWidget.builder(Text.literal("Alnera"), button -> {
                    System.out.println("You have clicked Alnera Quest List, which is not out yet!");
                })
                .dimensions(200, 80, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Alnera Quest. (WIP)")))
                .build();

        rahkeri = ButtonWidget.builder(Text.literal("Rahkeri"), button -> {
                    System.out.println("You have clicked Rahkeri Quest List, which is not out yet!");
                })
                .dimensions(310, 80, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Rahkeri Quest. (WIP)")))
                .build();

        molta = ButtonWidget.builder(Text.literal("Molta"), button -> {
                    System.out.println("You have clicked Molta Quest List, which is not out yet!");
                })
                .dimensions(90, 115, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Molta Quest. (WIP)")))
                .build();

        steelmeld = ButtonWidget.builder(Text.literal("Steelmeld"), button -> {
                    System.out.println("You have clicked Steelmeld Quest List, which is not out yet!");
                })
                .dimensions(200, 115, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Steelmeld Quest. (WIP)")))
                .build();

        breachpoint = ButtonWidget.builder(Text.literal("Breachpoint"), button -> {
                    System.out.println("You have clicked Breachpoint Quest List, which is not out yet!");
                })
                .dimensions(310, 115, 100, 20)
                .tooltip(Tooltip.of(Text.literal("List of Breachpoint Quest. (WIP)")))
                .build();

        back3 = ButtonWidget.builder(Text.literal("Back"), button -> {
                    System.out.println("You have clicked Back Button which will take you to previous screen!");
                    client.setScreen(regionsSelectionScreen);
                })
                .dimensions(200, 180, 100, 20)
                .tooltip(Tooltip.of(Text.literal("Take you back to previous screen.")))
                .build();

        addDrawableChild(mistport);
        addDrawableChild(frostgate);
        addDrawableChild(nightroost);
        addDrawableChild(wispervale);
        addDrawableChild(alnera);
        addDrawableChild(rahkeri);
        addDrawableChild(molta);
        addDrawableChild(steelmeld);
        addDrawableChild(breachpoint);
        addDrawableChild(back3);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY,delta);
        drawCenteredTextWithShadow(matrices, textRenderer, Text.literal("Select Towns"), 250, 20, 0xffffff);
    }

}
