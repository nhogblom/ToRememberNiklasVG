package team.dream.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note implements Serializable {
    private String title;
    private String description;
    private int priorityIndex;
    private String category;
    private boolean isDone;


    public Note(String title, String description, int priorityIndex, String category) {
        this.title = title;
        this.description = description;
        this.priorityIndex = priorityIndex;
        this.category = category;
        this.isDone = false;
    }

    public void printNote(){
        IO.println("Title: " + title);
        IO.println("Description: " + description);
        IO.println("Priority: " + priorityIndex);
        IO.println("Category: " + category);
    }

}