package sac.jaychang.com.customlayoutmanagerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH> {

  private List<String> data;

  public MyAdapter(List<String> data) {
    this.data = data;
  }

  @Override
  public VH onCreateViewHolder(ViewGroup parent, int viewType) {
    return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_text, parent, false));
  }

  @Override
  public void onBindViewHolder(VH holder, int position) {
    holder.textView.setText(data.get(position));
  }

  @Override
  public int getItemCount() {
    return data.size();
  }

  static class VH extends RecyclerView.ViewHolder {
    TextView textView;

    VH(View itemView) {
      super(itemView);
      textView = itemView.findViewById(R.id.text);
    }

  }


}
