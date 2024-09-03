package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.sql.Driver;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage {

    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");

    public String getTextInBigFrame() {
        switchToBigBox();
        String textInBigFrame = find(textInFrame).getText();
        System.out.println("BigFrame text: "+ textInBigFrame);
        switchToDefaultContent();
        return textInBigFrame;
    }

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    private void switchToBigBox() {
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox() {
        switchToFrameIndex(4); //4 because there are 10 iFrames in the page. This number differs if there are more ads and such
    }

    private void switchToSmallBoxViaWebElement() {
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInSamllFrame() {
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

    public String getTextInSamllFrameViaWebElement() {
        switchToSmallBoxViaWebElement();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
