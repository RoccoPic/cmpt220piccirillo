
import java.io.IOException;
import java.util.HashMap;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Hangman extends Application {

	 public static void main(String[] args) throws Exception{
	    	launch(args);
	    }
    private static final Font DEFAULT_FONT = new Font("Bernard MT Condensed", 50); //font options
   
    
   //the word you are trying to guess
    private SimpleStringProperty word = new SimpleStringProperty(); //the String property is used over a normal String to be observed by others

   //# of letters left to guess
    private SimpleIntegerProperty lettersToGuess = new SimpleIntegerProperty();

    //if you can play the game this is true
    private SimpleBooleanProperty playable = new SimpleBooleanProperty();

    //list of letters
    private ObservableList<Node> letters;

    //basically just the alphabet
    private HashMap<Character, Text> alphabet = new HashMap<Character, Text>();

    private HangmanImage hangman = new HangmanImage();

    //references to the wordreader class to get random word
    private WordBank wordBank;
 
    //this is created to avoid the error "Must define explicit constructor Error Java"
    //using an explicit constuctor to catch the exception and rethrow it while wrapped in RuntimeException
    public Hangman() throws Exception {
    	try {
    		wordBank = new WordBank();
    	} catch (IOException e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public Parent createContent() {
        HBox lettersRow = new HBox();
        lettersRow.setAlignment(Pos.CENTER);
        letters = lettersRow.getChildren();

        //if hangmans lives and there are still letters to guess, you can play
        playable.bind(hangman.guesses.greaterThan(0).and(lettersToGuess.greaterThan(0)));
        //tracks what happens when a property changes, and the if statement runs
        playable.addListener((obs, old, newValue) -> {
            // if the game is no longer playable the game stops
        	if (!newValue.booleanValue())
                endGame();
        });
        // text that appears on the button
        Button replayButton = new Button("Play again?");
        //if the game is playable the button stays disabled
        replayButton.disableProperty().bind(playable);
        //code to be called when buton is pressed
        replayButton.setOnAction(event -> startGame());

        // layout
        // elements within the box will be laid out horizontally
        HBox alphabetRow = new HBox(5);
        //letters will be centered
        alphabetRow.setAlignment(Pos.CENTER);
        //can be done with letters from A-Z
        for (char c = 'A'; c <= 'Z'; c++) {
        	//text is the user interfaced part
            Text t = new Text(String.valueOf(c));
            t.setFont(DEFAULT_FONT);
            alphabet.put(c, t);
         //prints out a row from A-Z
            alphabetRow.getChildren().add(t);
        }
        
        //gap between element in the horizontal box
        HBox hangmanRow = new HBox(10, replayButton, hangman);
        hangmanRow.setAlignment(Pos.CENTER);

        VBox orientation = new VBox(10);
        // vertical layout of how everything is printed
        orientation.getChildren().addAll(
                lettersRow,
                alphabetRow,
                hangmanRow);
        return orientation;
    }
 // for each letter
    private void startGame() {
    	//sets the numbers to be default, and gets rid of the slashes in the letters
        for (Text t : alphabet.values()) {
            t.setStrikethrough(false);
            t.setFill(Color.SLATEGREY);
        }
        //the whole game resets
        hangman.restart();
        //sets a new randomized word
        word.set(wordBank.wordRandomizer());
        //how many letters left to guess
        lettersToGuess.set(word.length().get());

        //clears letters in the middle box
        letters.clear();
        for (char c : word.get().toCharArray()) {
            letters.add(new Letter(c));
        }
    }
    // shows all the letters
    private void endGame() {
        for (Node node : letters) {
            Letter letter = (Letter) node;
            letter.show();
        }
    }
    
    //These are the images that get printed when you get a letter wrong in hangman
    private static class HangmanImage extends Parent {
        private static final int SPINE_START_X = 100; // the #'s are the coordinates of where they print
        private static final int SPINE_START_Y = 20; //how long the spine goes 
        private static final int SPINE_END_X = SPINE_START_X;
        private static final int SPINE_END_Y = SPINE_START_Y + 50;

      //integer keeping track of how many lives left
        private SimpleIntegerProperty guesses = new SimpleIntegerProperty();

        public HangmanImage() {
            Circle head = new Circle(20); //20 is the radius of the circle
            head.setTranslateX(SPINE_START_X);
            head.setFill(Color.BLACK); //can set colors for each piece
            
            Line spine = new Line(); //makes spine to an actual line
            spine.setStartX(SPINE_START_X); 
            spine.setStartY(SPINE_START_Y);
            spine.setEndX(SPINE_END_X);
            spine.setEndY(SPINE_END_Y);

            Line leftArm = new Line();
            leftArm.setStartX(SPINE_START_X);
            leftArm.setStartY(SPINE_START_Y);
            leftArm.setEndX(SPINE_START_X + 40);
            leftArm.setEndY(SPINE_START_Y + 10);

            Line rightArm = new Line();
            rightArm.setStartX(SPINE_START_X);
            rightArm.setStartY(SPINE_START_Y);
            rightArm.setEndX(SPINE_START_X - 40);
            rightArm.setEndY(SPINE_START_Y + 10);

            Line leftLeg = new Line();
            leftLeg.setStartX(SPINE_END_X);
            leftLeg.setStartY(SPINE_END_Y);
            leftLeg.setEndX(SPINE_END_X + 25);
            leftLeg.setEndY(SPINE_END_Y + 50);

            Line rightLeg = new Line();
            rightLeg.setStartX(SPINE_END_X);
            rightLeg.setStartY(SPINE_END_Y);
            rightLeg.setEndX(SPINE_END_X - 25);
            rightLeg.setEndY(SPINE_END_Y + 50);

            getChildren().addAll(head, spine, rightArm, leftArm, rightLeg, leftLeg);
            //lives is equal to the number of elements to the parts the hangman has
            guesses.set(getChildren().size());
        }
        
        //this resets the whole game
        public void restart() {
            getChildren().forEach(node -> node.setVisible(false));
            guesses.set(getChildren().size());
        }

        //if you lose a life it sets one of the limbs to true and prints it
        public void lifeLost() {
            for (Node node : getChildren()) {
                if (!node.isVisible()) {
                    node.setVisible(true);
                    guesses.set(guesses.get() - 1);
                    break;
                }
            }
        }
    }

    //boxes that are made
    private static class Letter extends StackPane {
        private Rectangle rectangle = new Rectangle(40, 60);
        private Text text;

        //set color for the wordboxes
        public Letter(char letter) {
            rectangle.setFill(Color.LAVENDER);
            //stroke is the color that surrounds the rectangle
            rectangle.setStroke(Color.BLACK);
            //what you type in and takes the value and makes it uppercase
            text = new Text(String.valueOf(letter).toUpperCase());
            //uses the font I chose above
            text.setFont(DEFAULT_FONT);
            //text is originally set blank
            text.setVisible(false);

            // the text is centered in the boxs they are
            getChildren().addAll(rectangle, text);
        }

        public void show() {
        	//rotates when the correct letter has been guesses, the background rotates
            RotateTransition rotator = new RotateTransition(Duration.seconds(1), rectangle);
            //rotates around its y axis
            rotator.setAxis(Rotate.X_AXIS);
            //this means it will do just one spin
            rotator.setToAngle(180);
            //the text gets displayed when the animation is done
            rotator.setOnFinished(event -> text.setVisible(true));
            rotator.play();
        }
        
        //checks if the letter guess is equal to a letter in the hidden word
        public boolean isEqualTo(char match) {
        	//returns if correct and prints 
            return text.getText().equals(String.valueOf(match));
        }
    }


    public void start(Stage gameWindow) throws Exception {
        Scene guiContent = new Scene(createContent());
        //what happens if a user clicks a key
        guiContent.setOnKeyPressed((KeyEvent event) -> {
        	//if it is empty dont do anything
            if (event.getText().isEmpty())
                return;
            //if it is not empty, do something
            char pressed = event.getText().toUpperCase().charAt(0);
            //makes sure the user presses an actual letter plus the -
            if ((pressed < 'A' || pressed > 'Z')) //&& pressed != '-')
                return;
            //if playable is true run this
            if (playable.get()) {
            	//if a letter is already entered do nothing
                Text t = alphabet.get(pressed);
                if (t.isStrikethrough())
                    return;

                // if the letter gets used, mark it
                t.setFill(Color.CRIMSON);
                t.setStrikethrough(true);

                boolean wordFound = false;
                
                //for each letter in the list, you are checking if it is in the list
                for (Node node : letters) {
                    Letter letter = (Letter) node;
                    //if it is found run this loop
                    if (letter.isEqualTo(pressed)) {
                        wordFound = true;
                        //decreases the amount of letters left to guess
                        lettersToGuess.set(lettersToGuess.get() - 1);
                        //prints the correct letter you guessed
                        letter.show();
                    }
                }

                if (!wordFound) {
                	//if a letter is not found take away a life and print a limb
                    hangman.lifeLost();
                   
                }
               
            }
        });
        //sets everything for the game, width, height, title, 
        gameWindow.setResizable(false);
        gameWindow.setWidth(800);
        gameWindow.setHeight(350);
        gameWindow.setTitle("Project2 Hangman");
        gameWindow.setScene(guiContent);
        gameWindow.show();
        startGame();
    }
  
    
   
    
}