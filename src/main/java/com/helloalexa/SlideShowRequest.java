package com.helloalexa;

public class SlideShowRequest {
    /**
     * action : next
     * slideNumber : 3
     */

    private String action;
    private int slideNumber;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getSlideNumber() {
        return slideNumber;
    }

    public void setSlideNumber(int slideNumber) {
        this.slideNumber = slideNumber;
    }
}
