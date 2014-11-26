/**
 * This program will generate the Prelude in C Major (Agitato) written by
 * Chopin and the produce a MIDI file for it.
 * 
 * @author Steven Liao
 */

import org.jfugue.*;
import java.io.File;
import java.io.IOException;

public class PreludeInCMajor 
{
    static Player player = new Player();
    public static void main(String[] args)
    {
        String musicString = "";
        musicString += generateFirstLine();
        musicString += generateSecondLine();
        musicString += generateThirdLine();
        musicString += generateFourthLine();
        musicString += generateFifthLine();
        try
        {
            player.saveMidi(musicString, new File("PreludeInCMajor.midi"));
//            player.play(musicString);
        } catch (IOException ie)
        {
            System.err.println("ERROR SAVING");
        }
    }
    
    public static String generateFifthLine()
    {
        String bar28    = "V0 Ri* Ei* Gi* Bi*+E6i* Gi* Di*+D6i* ";
               bar28   += "V1 C3i* G3i* F4i* Ri* Ri* Ri* ";
        
        String bar29    = "V0 Ci* Fi* Ai*+C6i* Fi* Ei*+Gi* ";
               bar29   += "V1 C3i* G3i* G4i* Ri* Ri* Ri* ";
               
        String bar30    = bar29, bar31 = bar29, bar32 = bar29;
        
        String bar33    = "V0 Ri* Ri* Ri* Ri* Ri* Ci* ";
               bar33   += "V1 C3i* G3i* C4i* E4i* G4i* Ri* ";
               
        String lastBar  = "V0 Cw*+Ew* ";
               lastBar += "V1 C3w*+G3w*+C4w*+E4w*+G4w* ";
        String musicString = bar28 + bar29 + bar30 + bar31 + bar32 + bar33 + lastBar;
        return musicString;
    }
    
    public static String generateFourthLine()
    {
        String bar21    = "V0 Ri* D6i* E6i* G6i*+D7i* E6i* C6i*+C7i* ";
               bar21   += "V1 E4i* Ci* Gi* Ri* Ri* Ri* ";
               
        String bar22    = "V0 Ri* Bi* C6i* D6i*+B6i* C6i* Ai*+A6i* ";
               bar22   += "V1 F3i* D4i* Ci* Ri* Ri* Ri* ";
               
        String bar23    = "V0 Ai* Rs* C6s* Ri* E6i*+A6i* C6i* Gi*+G6i* ";
               bar23   += "V1 G3i* E4i* Ci* Ri* Ri* Ri* ";
               
        String bar24    = "V0 Ri* Ei* Gi* Bi*+E6i* Gi* Di*+D6i* ";
               bar24   += "V1 G3i* F4i* B4i* Ri* Ri* Ri* ";
        
        String bar25    = "V0 Ci* Rs* Cs* Ri* Ei*+Gi* Ci* Ai* ";
               bar25   += "V1 C3i*+G4i* G3i* E4i* Ri* Ri* A4i* ";
               
        String bar26    = "V0 Ei* Rs* Gs* Ri* Bi*+E6i* Gi* Di*+D6i* ";
               bar26   += "V1 C3i* G3i* F4i* Ri* Ri* Ri* ";
               
        String bar27    = "V0 Ri* Ri* Ci* Ei*+Gi* Ci* Ai* ";
               bar27   += "V1 C3i* G3i*+G4i* E4i* Ri* Ri* A4i* ";       
        String musicString = bar21 + bar22 + bar23 + bar24 + bar25 + bar26 + bar27;
        return musicString;
    }
    
    public static String generateThirdLine()
    {
        String bar14    = "V0 Ri* Di* Gi* C6i*+D6i* Gi* Ei*+E6i* ";
               bar14   += "V1 G3i* C4i* B4i* Ri* Ri* Ri* ";
        
        String bar15    = "V0 Ri* Gi* Ai* C6i*+G6i* Ai* Fi*+F6i* ";
               bar15   += "V1 A3i* F4i* Ci* Ri* Ri* Ri* ";
               
        String bar16    = "V0 Ri* Di* Gi* C6i*+D6i* Gi* Ei*+E6i* ";
               bar16   += "V1 G3i* C4i* Ci* Ri* Ri* Ri* ";
               
        String bar17    = "V0 Ri* Ei* Ai* C6i*+E6i* Ai* Fi*+F6i* ";
               bar17   += "V1 A3i* F4i* Ci* Ri* Ri* Ri* ";
               
        String bar18    = "V0 Fi* Rs* Bs* Ri*  D6i*+F6i* Bi* Gi*+G6i* ";
               bar18   += "V1 B3i* G4i* Di* Ri* Ri* Ri* ";
               
        String bar19    = "V0 Gi* Rs* C6s* Ri* E6i*+G6i* C6i* Ai*+A6i* ";
               bar19   += "V1 C4i* G4i* Ei* Ri* Ri* Ri* ";
               
        String bar20    = "V0 Ai* Rs* D6s* Ri* F6i*+A6i* D6i* Bi*+B6i* ";
               bar20   += "V1 D4i* G4i* Fi* Ri* Ri* Ri* ";
        String musicString = bar14 + bar15 + bar16 + bar17 + bar18 + bar19 + bar20;
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
        
        String bar2     = "V0 Ri* Ri* Di* Fi*+Gi* Di* Ai* ";
               bar2    += "V1 B2i* G3i*+G4i* F4i* Ri* Ri* A4i* ";
        
        String bar3     = bar1;
        
        String bar4     = "V0 Ri* Ri* Ci* Gi*+Bi* Ei* C6i* ";
               bar4    += "V1 E3i* C4i*+B4i* G4i* Ri* Ri* Ci* ";
        
        String bar5     = "V0 Ri* Ei* Ai* C6i*+E6i* Ai* Di* D6i* ";
               bar5    += "V1 F3i* C4i* A4i* Ri* Ri* Ri* ";
        
        String bar6     = "V0 Ri* Ei* Ai* C6i*+E6i* Ai* Di*+D6i* ";
               bar6    += "V1 F3i* D4i* Ci* Ri* Ri* Ri* ";
        
        String musicString = bar1 + bar2 + bar3 + bar4 + bar5 + bar6;
        return musicString;
    }
}
