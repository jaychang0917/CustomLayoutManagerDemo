package sac.jaychang.com.customlayoutmanagerdemo;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

  public static List<String> data() {
    List<String> list = new ArrayList<>();
     for(int i = 0; i < 100; i++) {
       list.add("foo " + i);
     }
    return list;
  }

}
