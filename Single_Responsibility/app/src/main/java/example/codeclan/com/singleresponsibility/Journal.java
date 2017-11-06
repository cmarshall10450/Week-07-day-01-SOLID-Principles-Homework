package example.codeclan.com.singleresponsibility;


import java.util.ArrayList;

public class Journal {

  ArrayList<String> entries;

  public Journal() {
    this.entries = new ArrayList<>();
  }

  public void addEntry(String entry) {
    this.entries.add(entry);
  }

  public String getEntry(int index) {
    return this.entries.get(index);
  }

  public String getLastEntry() {
    return this.entries.get(this.entries.size() - 1);
  }
}
