package pageObject2;

public abstract class BasePage extends DriverHandler implements UiElements, Wait {

    protected UiElementsRe uiElementsRe;
    protected WaitRe waitRe;

    public BasePage() {
        uiElementsRe = new UiElementsRe();
        waitRe = new WaitRe();
    }
}
