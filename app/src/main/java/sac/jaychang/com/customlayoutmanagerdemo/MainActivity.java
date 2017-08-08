package sac.jaychang.com.customlayoutmanagerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

  RecyclerView recyclerView;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    recyclerView = findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(new MyLayoutManager());
    recyclerView.setAdapter(new MyAdapter(DataUtils.data()));
  }
}
