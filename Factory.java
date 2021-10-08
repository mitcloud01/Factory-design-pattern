package com.phone;

public class Factory {

    public OS get(String str) {
        if (str.equals("open")) {
            return new Android();
        } else if (str.equals("close")) {
            return new IOS();
        } else {
            return new Windows();
        }

    }
}
