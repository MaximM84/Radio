package ru.netology.statistic;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changeOnPreviousRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeOnNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {

        if (volume == maxVolume) {
            this.volume = volume;
        }
        if (volume < maxVolume) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == minVolume) {
            this.volume = volume;
        }
        if (volume > minVolume) {
            this.volume--;
        }
    }

}