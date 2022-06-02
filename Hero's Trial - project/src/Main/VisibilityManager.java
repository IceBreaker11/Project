package Main;

public class VisibilityManager {

    UI ui;

    public VisibilityManager(UI UserInterface) {

        ui = UserInterface;

    }

    public void showTitleScreen() {

        // to show the title screen panels
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        // to hide game screen panels
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
        ui.bottomPanel.setVisible(false);

    }

    public void titletoScreen1() {

        // to hide the title screen panels
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        // to show game screen panels
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
        ui.bottomPanel.setVisible(true);

    }

}
