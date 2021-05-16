package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NahodneCisloService {

    private final Random random;

    public NahodneCisloService(Random random) {
        this.random = random;
    }

    public int dejNahodneCislo(int horniMez) {
        int index = random.nextInt(7);
        return index;
    }




}
