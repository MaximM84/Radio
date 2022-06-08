package ru.netology.statistic;

public class Radio {
    private int currentRadioStation;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }
    public void changePrevRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation--;
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void changeNextRadioStation() {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation++;
    }
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }
    public void volumeUpForOne() {

        if (volume == 10) {
            this.volume = volume;
        }
        if (volume < 10) {
            this.volume++;
        }
    }
    public void volumeDownForOne() {
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume > 0) {
            this.volume--;
        }
    }
}