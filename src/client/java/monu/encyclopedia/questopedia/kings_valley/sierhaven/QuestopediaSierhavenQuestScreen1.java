package monu.encyclopedia.questopedia.kings_valley.sierhaven;

import monu.encyclopedia.questopedia.kings_valley.QuestopediaKingsValleyScreen;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.ACrownOfMajesty;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.BanditTrouble;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.BaneOfTheBakers;
import monu.encyclopedia.questopedia.kings_valley.sierhaven.quests.CastingForHelp;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.Selectable;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ElementListWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import java.util.List;

public class QuestopediaSierhavenQuestScreen1 extends Screen {
//    private final QuestListWidget questList;
    private Screen parent;
    private static final QuestopediaKingsValleyScreen townSelectionScreen = new QuestopediaKingsValleyScreen();
    private static final QuestopediaSierhavenQuestScreen2 page2 = new QuestopediaSierhavenQuestScreen2();
    private static final BanditTrouble quest1Screen = new BanditTrouble();
    private static final BaneOfTheBakers quest2Screen = new BaneOfTheBakers();
    private static final CastingForHelp quest3Screen = new CastingForHelp();
    private static final ACrownOfMajesty quest7Screen = new ACrownOfMajesty();

    public QuestopediaSierhavenQuestScreen1() {
        super(Text.literal("Questopedia Sierhaven Quest List Page 1"));
        this.parent = parent;
        this.client = MinecraftClient.getInstance();
//        this.questList = new QuestListWidget(client, 500, 200, 32, 200 - 64, 10);
    }

//    public ElementListWidget ButtonLists;
//    public ElementListWidget TextBoxes;
    // public ButtonWidget previouspage;

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
//        this.renderBackground(matrices);
//        addDrawableChild(questList);
        int inLeftRectangleX = 60;
        int inLeftRectangleY = 15;
        int inLeftRectangleWidth = 190;
        int inLeftRectangleHeight = 215;
        int outLeftRectangleX = 58;
        int outLeftRectangleY = 13;
        int outLeftRectangleWidth = 192;
        int outLeftRectangleHeight = 217;
        fill(matrices, inLeftRectangleX, inLeftRectangleY, inLeftRectangleWidth, inLeftRectangleHeight, -500, 0x99E1AD01);
        fill(matrices, outLeftRectangleX, outLeftRectangleY, outLeftRectangleWidth, outLeftRectangleHeight, -501, 0x99000000);
        int inRightRectangleX = 250;
        int inRightRectangleY = 15;
        int inRightRectangleWidth = 450;
        int inRightRectangleHeight = 215;
        int outRightRectangleX = 248;
        int outRightRectangleY = 13;
        int outRightRectangleWidth = 452;
        int outRightRectangleHeight = 217;
        fill(matrices, inRightRectangleX, inRightRectangleY, inRightRectangleWidth, inRightRectangleHeight, -500, 0x99E1AD01);
        fill(matrices, outRightRectangleX, outRightRectangleY, outRightRectangleWidth, outRightRectangleHeight, -501, 0x99000000);
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    protected void init() {
        super.init();
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("Bandit Trouble"), button -> {
//            System.out.println("You have clicked Bandit Trouble quest");
//            client.setScreen(quest1Screen);
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("Bane of the Bakers"), button -> {
//            System.out.println("You have clicked Bane of the Bakers Quest!");
//            client.setScreen(quest2Screen);
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("Casting for Help"), button -> {
//            System.out.println("You have clicked Casting for Help quest!");
//            client.setScreen(quest3Screen);
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("Clear as Glass"), button -> {
//            System.out.println("You have clicked Clear as Glass quest!");
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("Crazy, Cupid, Love"), button -> {
//            System.out.println("You have clicked Crazy, Cupid, Love quest!");
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("A Crown of Madness"), button -> {
//            System.out.println("You have clicked A Crown of Madness quest!");
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("A Crown of Majesty"), button -> {
//            System.out.println("You have clicked A Crown of Majesty quest!");
//            client.setScreen(quest7Screen);
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("Flash in the Pan"), button -> {
//            System.out.println("You have clicked Flash in the Pan quest!");
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("A Little Spark"), button -> {
//            System.out.println("You have clicked A Little Spark quest!");
//        }));
//
//        this.questList.addEntry(new QuestButtonEntry(Text.literal("Mage's Legacy"), button -> {
//            System.out.println("You have clicked Mage's Legacy quest!");
//        }));
        addDrawableChild(
                ButtonWidget.builder(Text.literal("Bane of the Bakers"), button -> {
                            System.out.println("You have clicked Bane of the Bakers Quest!");
                            client.setScreen(quest2Screen);
                        })
                        .dimensions(200, 35, 100, 15)
                        .position(75, 35)
                        .tooltip(Tooltip.of(Text.literal("Open Bane of the Bakers Quest info.")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Casting for Help"), button -> {
                            System.out.println("You have clicked Casting for Help quest!");
                            client.setScreen(quest3Screen);
                        })
                        .dimensions(200, 50, 100, 15)
                        .position(75, 50)
                        .tooltip(Tooltip.of(Text.literal("Open Casting for Help quest info")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Clear as Glass"), button -> {
                            System.out.println("You have clicked Clear as Glass quest!");
                        })
                        .dimensions(200, 65, 100, 15)
                        .position(75, 65)
                        .tooltip(Tooltip.of(Text.literal("Open Clear as glass quest.")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Crazy, Cupid, Love"), button -> {
                            System.out.println("You have clicked Crazy, Cupid, Love quest!");
                        })
                        .dimensions(200, 80, 100, 15)
                        .position(75, 80)
                        .tooltip(Tooltip.of(Text.literal("Open Crazy, Cupid, Love quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("A Crown of Madness"), button -> {
                            System.out.println("You have clicked A Crown of Madness quest!");
                        })
                        .dimensions(200, 95, 100, 15)
                        .position(75, 95)
                        .tooltip(Tooltip.of(Text.literal("Open A Crown of Madness quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("A Crown of Majesty"), button -> {
                            System.out.println("You have clicked A Crown of Majesty quest!");
                            client.setScreen(quest7Screen);
                        })
                        .dimensions(200, 110, 100, 15)
                        .position(75, 110)
                        .tooltip(Tooltip.of(Text.literal("Open A Crown of Majesty quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Flash in the Pan"), button -> {
                            System.out.println("You have clicked Flash in the Pan quest!");
                        })
                        .dimensions(200, 125, 100, 15)
                        .position(75, 125)
                        .tooltip(Tooltip.of(Text.literal("Open Flash in the Pan quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("A Little Spark"), button -> {
                            System.out.println("You have clicked A Little Spark quest!");
                        })
                        .dimensions(200, 140, 100, 15)
                        .position(75, 140)
                        .tooltip(Tooltip.of(Text.literal("Open A Little Spark quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Mage's Legacy"), button -> {
                            System.out.println("You have clicked Mage's Legacy quest!");
                        })
                        .dimensions(200, 155, 100, 15)
                        .position(75, 155)
                        .tooltip(Tooltip.of(Text.literal("Open Mage's Legacy quest")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Next Page"), button -> {
                            System.out.println("You have clicked Next Page Button!");
                            client.setScreen(page2);
                        })
                        .dimensions(200, 185, 100, 15)
                        .position(75, 185)
                        .tooltip(Tooltip.of(Text.literal("Go to next page")))
                        .build()
        );

        addDrawableChild(
                ButtonWidget.builder(Text.literal("Back"), button -> {
                            System.out.println("You have clicked Back Button which will take you to previous screen!");
                            client.setScreen(townSelectionScreen);
                        })
                        .dimensions(200, 200, 100, 15)
                        .position(200,225)
                        .tooltip(Tooltip.of(Text.literal("Take you back to previous screen.")))
                        .build()
        );

//        @Environment(EnvType.CLIENT)
//        private class ButtonListWidget extends ElementListWidget<ButtonListWidget.Entry>{
//            private ButtonListWidget(MinecraftClient client, int width, int height, int top, int bottom, int itemHeight) {
//                super(client, width, height, top, bottom, itemHeight);
//            }
//
//            public class Entry extends ElementListWidget.Entry<Entry> {
//                private final MinecraftClient client;
//                private static ButtonWidget button1;
//                private static ButtonWidget button2;
//                private static ButtonWidget button3;
//                private static ButtonWidget button4;
//                private static ButtonWidget button5;
//                private static ButtonWidget button6;
//                private static ButtonWidget button7;
//                private static ButtonWidget button8;
//                private static ButtonWidget button9;
//                private static ButtonWidget button10;
//
//
//                public Entry(MinecraftClient client) {
//                    this.client = client;
//                    button1 = ButtonWidget.builder(Text.literal("Bandit Trouble"), button -> {
//                                System.out.println("You have clicked Bandit Trouble quest");
//                                client.setScreen(quest1Screen);
//                            })
//                            .dimensions(200, 20, 100, 15)
//                            .position(75, 20)
//                            .tooltip(Tooltip.of(Text.literal("Open Bandit Trouble quest info.")))
//                            .build();
//                    button2 = ButtonWidget.builder(Text.literal("Bane of the Bakers"), button -> {
//                                System.out.println("You have clicked Bane of the Bakers Quest!");
//                                client.setScreen(quest2Screen);
//                            })
//                            .dimensions(200, 35, 100, 15)
//                            .position(75, 35)
//                            .tooltip(Tooltip.of(Text.literal("Open Bane of the Bakers Quest info.")))
//                            .build();
//                    button3 = ButtonWidget.builder(Text.literal("Casting for Help"), button -> {
//                                System.out.println("You have clicked Casting for Help quest!");
//                                client.setScreen(quest3Screen);
//                            })
//                            .dimensions(200, 50, 100, 15)
//                            .position(75, 50)
//                            .tooltip(Tooltip.of(Text.literal("Open Casting for Help quest info")))
//                            .build();
//                    button4 = ButtonWidget.builder(Text.literal("Clear as Glass"), button -> {
//                                System.out.println("You have clicked Clear as Glass quest!");
//                            })
//                            .dimensions(200, 65, 100, 15)
//                            .position(75, 65)
//                            .tooltip(Tooltip.of(Text.literal("Open Clear as glass quest.")))
//                            .build();
//                    button5 = ButtonWidget.builder(Text.literal("Crazy, Cupid, Love"), button -> {
//                                System.out.println("You have clicked Crazy, Cupid, Love quest!");
//                            })
//                            .dimensions(200, 80, 100, 15)
//                            .position(75, 80)
//                            .tooltip(Tooltip.of(Text.literal("Open Crazy, Cupid, Love quest")))
//                            .build();
//                    button6 = ButtonWidget.builder(Text.literal("A Crown of Madness"), button -> {
//                                System.out.println("You have clicked A Crown of Madness quest!");
//                            })
//                            .dimensions(200, 95, 100, 15)
//                            .position(75, 95)
//                            .tooltip(Tooltip.of(Text.literal("Open A Crown of Madness quest")))
//                            .build();
//                    button7 = ButtonWidget.builder(Text.literal("A Crown of Majesty"), button -> {
//                                System.out.println("You have clicked A Crown of Majesty quest!");
//                                client.setScreen(quest7Screen);
//                            })
//                            .dimensions(200, 110, 100, 15)
//                            .position(75, 110)
//                            .tooltip(Tooltip.of(Text.literal("Open A Crown of Majesty quest")))
//                            .build();
//                    button8 = ButtonWidget.builder(Text.literal("Flash in the Pan"), button -> {
//                                System.out.println("You have clicked Flash in the Pan quest!");
//                            })
//                            .dimensions(200, 125, 100, 15)
//                            .position(75, 125)
//                            .tooltip(Tooltip.of(Text.literal("Open Flash in the Pan quest")))
//                            .build();
//                    button9 =  ButtonWidget.builder(Text.literal("A Little Spark"), button -> {
//                                System.out.println("You have clicked A Little Spark quest!");
//                            })
//                            .dimensions(200, 140, 100, 15)
//                            .position(75, 140)
//                            .tooltip(Tooltip.of(Text.literal("Open A Little Spark quest")))
//                            .build();
//                    button10 = ButtonWidget.builder(Text.literal("Mage's Legacy"), button -> {
//                                System.out.println("You have clicked Mage's Legacy quest!");
//                            })
//                            .dimensions(200, 155, 100, 15)
//                            .position(75, 155)
//                            .tooltip(Tooltip.of(Text.literal("Open Mage's Legacy quest")))
//                            .build();
//                }
//
//                @Override
//                public void render(MatrixStack matrices, int index, int y, int x, int entryWidth, int entryHeight, int mouseX, int mouseY, boolean hovered, float tickDelta) {
//                    addEntry(button1);
//                    addEntry(button2);
//                    addEntry(button3);
//                    addEntry(button4);
//                    addEntry(button5);
//                    addEntry(button6);
//                    addEntry(button7);
//                    addEntry(button8);
//                    addEntry(button9);
//                    addEntry(button10);
//                }
//
//                @Override
//                public List<? extends Selectable> selectableChildren() {
//                    return null;
//                }
//
//                @Override
//                public List<? extends Element> children() {
//                    return null;
//                }
//            }
//
//        }

//        @Environment(value = EnvType.CLIENT)
//        public class TextListWidget extends ElementListWidget{
//
//        }


    }

//    @Environment(EnvType.CLIENT)
//    private class QuestListWidget extends ElementListWidget<QuestButtonEntry> {
//
//        public QuestListWidget(MinecraftClient client, int width, int height, int top, int bottom, int itemHeight) {
//            super(client, width, height, top, bottom, itemHeight);
//        }
//
//        @Override
//        public int addEntry(QuestButtonEntry entry) {
//            super.addEntry(entry);
//            return 0;
//        }
//        @Override
//        public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
//            super.render(matrices, mouseX, mouseY, delta);
//        }
//
//
//
//    }
//
////    @Environment(EnvType.CLIENT)
//    public static class QuestButtonEntry extends ElementListWidget.Entry<QuestButtonEntry> {
//        private final ButtonWidget button;
//
//        public QuestButtonEntry(Text text, ButtonWidget.PressAction action) {
//            this.button = ButtonWidget.builder(text, action)
//                    .dimensions(200, 20, 150, 15) // Adjust dimensions as needed
//                    .build();
//        }
//
//        @Override
//        public void render(MatrixStack matrices, int index, int y, int x, int entryWidth, int entryHeight, int mouseX, int mouseY, boolean hovered, float tickDelta) {
//            this.button.setPosition(x, y);
//            this.button.render(matrices, mouseX, mouseY, tickDelta);
//        }
//
//        @Override
//        public List<? extends Selectable> selectableChildren() {
//            return List.of(button);
//        }
//
//        @Override
//        public List<? extends Element> children() {
//            return List.of(button);
//        }
//
//    }
}

