package ru.netology.statistic;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void currentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldChangePrevRadioStationIfStationIsMin() {
        Radio radio = new Radio();
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changePrevRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeNextRadioStationIfStationIsMax() {
        Radio radio = new Radio();
        int currentRadioStation = 7;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeNextRadioStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangePrevRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changePrevRadioStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void setVolume() {
        Radio radio = new Radio();

        radio.setVolume(8);

        int actual = radio.getVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio();
        int volume = 11;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }
    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }
    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }
    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());

    }

    @Test
    void volumeUpForOne() {
        Radio radio = new Radio();
        int volume = 5;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 6;
        assertEquals(expected, radio.getVolume());
    }
    @Test
    void volumeDownForOne() {
        Radio radio = new Radio();
        int volume = 4;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 3;
        assertEquals(expected, radio.getVolume());

    }

}
