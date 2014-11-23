import org.jfugue.*;

/**
 *
 * @author Dell
 */
public class StevenLiaoBlackMIDI
{
    static Player player = new Player();
    public static void main(String[] args)
    {
        
    }
    
    public static void spring()
    {
        Pattern pattern = new Pattern("T[Allegro]");
        pattern.add("V0 C5q | E5q+C5q E5q+C5q E5q+C5q D5i C5i |Eh.+Gh. G5i F5i | E5q+C5q E5q+C5q E5q+C5q D5i C5i | Eh.+Gh. G5i F5i");
        pattern.add("V1 Rq  | C4h C4h                         | C4h C4h        | C4h C4h                         | C4h C4h");
        player.play(pattern);
    }
    
    public static void generateNote1()
    {
        String notes = "V9 ";
        notes += "L0 RW $BD=BASS_DRUM ";
        for (int i = 0; i < 16; i++)
                notes += "[BD]q. [BD]i [BD]q. [BD]i | [BD]q. [BD]i [BD]i Ri [BD]i Ri ";
        notes += "L1 RW $AS=ACOUSTIC_SNARE ";
        for (int i = 0; i < 16; i++)
                notes += "Rq [AS]q Rq [AS]q | Rq [AS]q Ri [AS]i Ri [AS]i ";
        notes += "L2 RW $CHH=CLOSED_HI_HAT ";
        for (int i = 0; i < 16; i++)
                notes += "Ri [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i |"
                        + " [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i [CHH]i ";
        notes += "L3 RW $CB=COWBELL ";
        for (int i = 0; i < 16; i++)
                notes += "[CB]q Ri [CB]i [CB]i [CB]i | "
                        + "Rq [CB]i [CB]i Rq [CB]t [CB]t [CB]t [CB]t [CB]t Ri [CB]i [CB]s [CB]s ";
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
