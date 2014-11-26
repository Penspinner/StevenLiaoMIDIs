/**
 * This program will generate my own Black MIDI sequence and save it to MIDI
 * file.
 * 
 * @author Dell
 */

import org.jfugue.*;
import java.io.File;
import java.io.IOException;

public class StevenLiaoBlackMIDI
{
    static final String WAIT_SEC = "........";
    static Player player = new Player();
    static Rhythm rhythm = new Rhythm();
    public static void main(String[] args)
    {
//        String voice1 = "V0 ", voice2 = "V1 ", voice3 = "V2 ", voice4 = "V3 ", 
//               voice5 = "V4 ", voice6 = "V5 ", voice7 = "V6 ", voice8 = "V7 ";
//        voice1 += generateString1();
//        
//        String musicString = voice1 + voice2 + voice3 + voice4+
//                             voice5 + voice6 + voice7 + voice8;
//        IntervalNotation riff = new IntervalNotation("<1>q <5>q");
//        Pattern pattern = riff.getPatternForRootNote("C5");
//        player.play(pattern);
//        player.play(creep() + generateNote1());
//        spring();
//        generateNote1();
        initRhythmSubstitutions();
        initRhythmLayers();
        initRhythmVoiceDetails();
        initRhythmVoice();
//        player.play(rhythm);
        Pattern pattern = rhythm.getPattern();
        try
        {
            player.saveMidi(pattern, new File("StevenLiaoBlackMIDI.midi"));
        } catch (IOException ie)
        {
            System.err.println("ERROR SAVING");
        }
    }
    
    public static void initRhythmSubstitutions()
    {
        rhythm.addSubstitution('.', "Ri");       // REST
        rhythm.addSubstitution('b', "[ACOUSTIC_BASS_DRUM]i");
        rhythm.addSubstitution('s', "[ACOUSTIC_SNARE]i");
        rhythm.addSubstitution('e', "[ELECTRIC_SNARE]i");
        rhythm.addSubstitution('f', "[HI_MID_TOM]i");
        rhythm.addSubstitution('h', "[CLOSED_HI_HAT]i");
        rhythm.addSubstitution('H', "[OPEN_HI_HAT]i");
        rhythm.addSubstitution('c', "[COWBELL]i");
    }
    
    public static void initRhythmLayers()
    {
        int i;
        String layer1 = "";
        String acousticSnare = "s..sss..";
        for (i = 0; i < 100; i++) layer1 += acousticSnare;
        rhythm.setLayer(1, layer1);
        
        String layer2 = "";
        String acousticBassDrum = "......b.";
        for (i = 0; i < 100; i++) layer2 += acousticBassDrum;
        rhythm.setLayer(2, layer2);
        
        String layer3 = "";
        for (i = 0; i < 4; i++) layer3 += "........";
        String closedHiHat = ".h......";
        for (i = 0; i < 96; i++) layer3 += closedHiHat;
        rhythm.setLayer(3, layer3);
        
        String layer4 = "";
        for (i = 0; i < 8; i++) layer4 += "........";
        String openHiHat = ".......H";
        for (i = 0; i < 92; i++) layer4 += openHiHat;
        rhythm.setLayer(4, layer4);
        
        String layer5 = "";
        for (i = 0; i < 12; i++) layer5 += ".........";
        String cowBell = "..c.....";
        for (i = 0; i < 88; i++) layer5 += cowBell;
        rhythm.setLayer(5, layer5);
        
//        String layer6 = "";
//        rhythm.setLayer(6, ".H.H.H.H.H.");
    }
    
    public static void initRhythmVoiceDetails()    
    {
        rhythm.setVoiceDetails(1, "I[PIANO]");
        rhythm.setVoiceDetails(2, "I[REED_ORGAN]");
        rhythm.setVoiceDetails(3, "I[VIOLIN]");
        rhythm.setVoiceDetails(4, "I[VIOLA]");
        rhythm.setVoiceDetails(5, "I[FLUTE]");
        rhythm.setVoiceDetails(6, "I[CLARINET]");
        rhythm.setVoiceDetails(7, "I[WHISTLE]");
        rhythm.setVoiceDetails(8, "I[PICCOLO]");
        rhythm.addSubstitution(':', "Cq Dq Ci Ci Di Ei Fi Rw");
    }
    
    public static void initRhythmVoice()
    {
        int i;
        String voice = "";
        String wait = "";
        for (i = 0; i < 16; i++)
            wait += WAIT_SEC;
        for (i = 1; i <= 8; i++) 
        {
            rhythm.setVoice(i, wait + "::");
            for (int j = 0; j < 4; j++)
                wait += WAIT_SEC;
        }
    }
}
