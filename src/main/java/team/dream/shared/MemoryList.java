package team.dream.shared;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class MemoryList implements Serializable {
    private List<Note> notes = new ArrayList<>();
    private String title;
    private String ownerUsername;
    private List<String> users = new ArrayList<>();
    private int memoryListID;

    public MemoryList() {
    }

    public MemoryList(String title, String ownerUsername, int memoryListID) {
        this.title = title;
        this.ownerUsername = ownerUsername;
        this.memoryListID = memoryListID;
    }

    public void addNoteToMemoryList(Note noteToAdd) {
        notes.add(noteToAdd);
        IO.println("Note " + noteToAdd.getTitle() + " successfully added to " + title);
    }

    public boolean isUserAuthorized(String username) {
        if (ownerUsername.equalsIgnoreCase(username)) {
            return true;
        }
        for (String user : users) {
            if (user.equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean addUserToMemoryList(String userToAdd) {
        for (String user : users) {
            if (user.equalsIgnoreCase(userToAdd)) {
                return false;
            }
        }
        users.add(userToAdd);
        return true;
    }

    public boolean removeUserFromMemoryList(String userToRemove) {
        for (String user : users) {
            if (user.equalsIgnoreCase(userToRemove)) {
                users.remove(user);
                return true;
            }
        }
            return false;
    }

}
