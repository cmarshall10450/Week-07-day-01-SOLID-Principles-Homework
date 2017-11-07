package example.codeclan.com.dependencyinversion;


public interface JournalAdapter {

  void write(String entry);

  String readLast();

}
