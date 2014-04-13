package GameView;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameSelect {
	private String gameName;
	
	public GameSelect () {
		JFrame frame = new JFrame("Select");
		frame.setSize(800, 500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			String[] games = getGameNames(getListOfGames());
			gameName = getGameNameFromUser(frame, games);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getGameName() {
		return gameName;
	}
	
	private static String[] getGameNames (List<File> gameFiles) {
		String[] gameNames = new String[gameFiles.size()];
		for (int i = 0; i < gameFiles.size(); i++) {
			gameNames[i] = gameFiles.get(i).getName();
		}
		
		return gameNames;
	}
	
	private static List<File> getListOfGames () throws IOException {
		String path = new File(".").getCanonicalPath() + "/src/SavedGames";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		List<File> games = new ArrayList<File>();
		
		for (File file : listOfFiles) {
				games.add(file);
		}
		return games;
	}
	
	private static String getGameNameFromUser (JFrame frame, String[] games) {
		return (String) JOptionPane.showInputDialog(frame, "Select a Game to Play", "Select", JOptionPane.PLAIN_MESSAGE, null, games, "");
		
	}
	
	
}