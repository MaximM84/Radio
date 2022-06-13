package ru.netology.statistic;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private short stationsQuantity = 10;

    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {

    }
    public Radio(int size) {
        maxRadioStation = minRadioStation + size;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changeOnPreviousRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeOnNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
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
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume > 0) {
            this.volume--;
        }
    }

}