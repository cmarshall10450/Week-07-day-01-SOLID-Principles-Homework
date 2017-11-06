package example.codeclan.com.singleresponsibility;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JournalTest {

  @Test
  public void canWriteJournalEntry() {
    Journal journal = new Journal();
    journal.addEntry("Dear Diary, I ate today.");
    assertEquals("Dear Diary, I ate today.", journal.getLastEntry());
  }

}
