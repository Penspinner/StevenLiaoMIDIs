/**
 * This program will generate the Prelude in C Major (Agitato) written by
 * Chopin and the produce a MIDI file for it.
 * 
 * @author Steven Liao
 */

import org.jfugue.*;

public class PreludeInCMajor 
{
    static Player player = new Player();
    public static void main(String[] args)
    {
        Pattern pattern = new Pattern("V0 E3h F3h G3h A3h E4q");
        String notes = "V0 ";
        for (int i = 0; i < 8; i++) 
            notes += "E3h F3h G3h A3h ";
        notes += "V1 ";
        for (int i = 0; i < 4; i++)
             notes += "E4q* F4q* G4q* E5q* F5q* G5q* E6q* F6q* G6q* E7q* F7q* G7q* ";
        for (int i = 0; i < 4; i++)
             notes +=  "E4q*2:6 F4q*2:6 G4q*2:6 E4q*2:6 F4q*2:6 G4q*2:6 "
                          + "E5q*2:6 F5q*2:6 G5q*2:6 E5q*2:6 F5q*2:6 G5q*2:6 "
                          + "E6q*2:6 F6q*2:6 G6q*2:6 E6q*2:6 F6q*2:6 G6q*2:6 "
                          + "E7q*2:6 F7q*2:6 G7q*2:6 E7q*2:6 F7q*2:6 G7q*2:6 ";
//        player.play(notes);
//        creep();
//        player.play("L8 C2 E3+E4");
//        generateNote1();
//        spring();
        String musicString = "";
        musicString += generateFirstLine();
        musicString += generateSecondLine();
        player.play(musicString);
    }
    public static String generateThirdLine()
    {
        String bar14    = "V0 Ri* Di* Gi* C6i*+D ";
               bar14   += "V1 G3i* C4i* B4i* Ri* Ri* Ri* ";
        String musicString = bar14;
        return musicString;
    }
    public static String generateSecondLine()
    {
        String bar7     = "V0 Ri* Ei* Gi* Bi*+E6i* Gi* Di*+D6i* ";
               bar7    += "V1 G3i* F4i* B4i* Ri* Ri* Ri* ";
               
        String bar8     = "V0 Ri* Ri* Di* Fi*+Bi* Di* Ai* ";
               bar8    += "V1 G2i* G3i*+B4i* F4i* Ri* Ri* A4i* ";
               
        String bar9     = "V0 Ri* Ri* Ci* Ei*+Gi* Ci* Ai* ";
               bar9    += "V1 C3i* G3i*+G4i* E4i* Ri* Ri* A4i* ";
               
        String bar10    = "V0 Ri* Ri* Di* Fi*+Gi* Di* Ai* ";
               bar10   += "V1 D3i* G3i*+G4i* F4i* Ri* Ri* A4i* ";
               
        String bar11    = bar9;
        
        String bar12    = "V0 Ri* Ri* Ei* Gi*+Bi* Ei* C6i* ";
               bar12   += "V1 E3i* C4i*+B4i* G4i* Ri* Ri* Ci* ";
               
        String bar13    = "V0 Ri* Ci* Fi* Ai*+C6i* Fi* Di*+D6i* ";
               bar13   += "V1 F3i* C4i* A4i* Ri* Ri* Ri* ";
               
        String musicString = bar7 + bar8 + bar9 + bar10 + bar11 + bar12 + bar13;
        return musicString;
    }
    public static String generateFirstLine()
    {
        String bar1     = "V0 Ri* Ri* Ci* Ei*+Gi* Ci* Ai* ";
               bar1    += "V1 C3i* G3i*+G4i* E3i* Ri* Ri* A4i* ";
        
        String bar2     = "V0 Ri Ri Di Fi+Gi Di Ai ";
               bar2    += "V1 B2i G3i+G4i F4i Ri Ri A4i ";
        
        String bar3     = bar1;
        
        String bar4     = "V0 Ri Ri Ci Gi+Bi Ei C6i ";
               bar4    += "V1 E3i C4i+B4i G4i Ri Ri Ci ";
        
        String bar5     = "V0 Ri* Ei* Ai* C6i*+E6i* Ai* Di* D6i* ";
               bar5    += "V1 F3i* C4i* A4i* Ri* Ri* Ri* ";
        
        String bar6     = "V0 Ri* Ei* Ai* C6i*+E6i* Ai* Di*+D6i* ";
               bar6    += "V1 F3i* D4i* Ci* Ri* Ri* Ri* ";
        
        String musicString = bar1 + bar2 + bar3 + bar4 + bar5 + bar6;
        return musicString;
    }
    
    public static void spring()
    {
        Pattern pattern = new Pattern("T[Allegro]");
        pattern.add("V0 C5q | E5q+C5q E5q+C5q E5q+C5q D5i C5i |Eh.+Gh. G5i F5i | E5q+C5q E5q+C5q E5q+C5q D5i C5i | Eh.+Gh. G5i F5i");
//        pattern.add("V1 Rq  | C4h C4h                         | C4h C4h        | C4h C4h                         | C4h C4h");
        player.play(pattern);
    }
    
    public static void generateNote1()
    {
        String notes = "V9 ";
        notes += "L0 RW $BD=BASS_DRUM ";
        for (int i = 0; i < 16; i++)
                notes += "[BD]q. [BD]i [BD]q. [BD]i | [BD]q. [BD]i [BD]i Ri [BD]i Ri ";
        notes += "L1 RW $AS=ACOUSTIC_SNARE ";
//        for (int i = 0; i < 16; i++)
//                notes += "Rq [AS]q Rq [AS]q | Rq [AS]q Ri [AS]i Ri [AS]i ";
        notes += "L2 RW $CHH=CLOSED_HI_HAT ";
//        for (int i = 0; i < 16; i++)
//                notes += "Ri [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i |"
//                        + " [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i ";
        notes += "L3 RW $CB=COWBELL ";
//        for (int i = 0; i < 16; i++)
//                notes += "[CB]q Ri [CB]i [CB]i [CB]i | "
//                        + "Rq [CB]i [CB]i Rq [CB]t [CB]t [CB]t [CB]t [CB]t Ri [CB]i [CB]s [CB]s ";
        notes += "Rw ";
        player.play(notes);

    }
    
    public static void creep()
    {
        String notes = "IREED_ORGAN ";
        for (int i = 0; i < 4; i++) notes += creepChords();
        player.play(notes);
    }
    
    public static String creepChords()
    {
        String notes = "";
        for (int i = 0; i < 4; i++)  notes += "Cmajq Cmaj^q Cmaj^^q Cmaj^^^q \n";
        for (int i = 0; i < 4; i++)  notes += "Emajq Emaj^q Emaj^^q Emaj^^^q \n";
        for (int i = 0; i < 4; i++)  notes += "Fmajq Fmaj^q Fmaj^^q Fmaj^^^q \n";
        for (int i = 0; i < 4; i++)  notes += "Fminq Fmin^q Fmin^^q Fmin^^^q \n";
        return notes;
    }

}
