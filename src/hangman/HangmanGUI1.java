package hangman;

import hangman.images.Resource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

/**
 * Η κλάση για το GUI της κρεμάλας.
 */
public class HangmanGUI1 {

    private JFrame frame;
    private JPanel topPanel;
    private JLabel hangman;
    private JLabel givenCharacters;
    private JLabel currentWordLabel;
    private JLabel letterLabel;
    private JLabel result;
    private JPanel letterPanel;

    /**
     * Στον κατασκευαστή θα πρέπει να ορίζονται όλα τα γραφικά στοιχεία του κεντρικού παραθύρου της εφαρμογής.
     */
    public HangmanGUI1() {

        // Κεντρικό frame & panel

        // Κουμπί για την έναρξη του παιχνιδιού.

        // Η κρεμάλα

        // Το κεντρικό panel

        // Label για την τρέχουσα λέξη

        // Label για τους χαρακτήρες που έχουν δωθεί

        // Panel για το label εισόδου

        // Το label εισόδου

        // Label για το αποτέλεσμα

        
        frame.setLocationRelativeTo(null);
    }

    public void start() {
        frame.setVisible(true);
    }

    /**
     * Μέθοδος που καλείται όταν δίνεται είσοδος από τον χρήστη. Θα πρέπει να ελέγχει αν έχει δωθεί ήδη ο χαρακτήρας
     * και να εμφανίζει το κατάλληλο μήνυμα. Επίσης, θα πρέπει να ελέγχει αν έχει ολοκληρωθεί το παιχνίδι και αν κέρδισε
     * η έχασε ο παίχτης.
     */
    private void letterGiven() {

    }

    /**
     * Μέθοδος που θα ανανεώνει το παράθυρο μετά την είσοδο του χρήστη.
     */
    private void updateScreen() {

    }

    /**
     * Μέθοδος για την έναρξη του παιχνίδιου. Θα πρέπει να εμφανίζεται ένα παράθυρο διαλόγου στο οποίο θα ορίζουμε την
     * νέα λέξη.
     */
    private void newGame() {

    }
}
