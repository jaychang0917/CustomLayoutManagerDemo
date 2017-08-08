package sac.jaychang.com.customlayoutmanagerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MyLayoutManager extends RecyclerView.LayoutManager {

  @Override
  public RecyclerView.LayoutParams generateDefaultLayoutParams() {
    return new RecyclerView.LayoutParams(
      RecyclerView.LayoutParams.MATCH_PARENT,
      RecyclerView.LayoutParams.MATCH_PARENT);
  }

  @Override
  public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
    detachAndScrapAttachedViews(recycler);

    int offsetY = 0;
    for (int i = 0; i < getItemCount(); i++) {
      View view = recycler.getViewForPosition(i);
      addView(view);
      measureChildWithMargins(view, 0, 0);
      int width = getDecoratedMeasuredWidth(view);
      int height = getDecoratedMeasuredHeight(view);
      layoutDecorated(view, 0, offsetY, width, offsetY + height);
      offsetY += height;
    }
  }

}
