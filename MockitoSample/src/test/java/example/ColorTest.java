package example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ColorTest {

  @Test
  @DisplayName("Colorのtest")
  void test1() {
    // モックの作成
    Color c1 = mock(Color.class);

    c1.getName("色は");
    verify(c1).getName("色は");

    // スタブの作成
    when(c1.getName("色は")).thenReturn("色は赤です");

    String assumption = "色は赤です";
    String result = c1.getName("色は");
    assertEquals(assumption, result);
  }

  @Test
  @DisplayName("Colorのtest:null")
  void test2() {
    // モックの作成
    Color c2 = mock(Color.class);

    when(c2.getName(null)).thenReturn("nullです");
    
    String assumption = "nullです";
    String result = c2.getName(null);
    assertEquals(assumption, result);
  }
}
