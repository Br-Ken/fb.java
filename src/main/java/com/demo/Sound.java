package com.demo;

import javafx.scene.media.AudioClip;

public class Sound {
    private AudioClip soundEffect;

    public Sound(String filePath) {
        soundEffect = new AudioClip(getClass().getResource(filePath).toExternalForm());
    }

    public void playClip() {
        soundEffect.play();
    }
}
