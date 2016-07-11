package labs.potato.cl.heygps.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import labs.potato.cl.heygps.R;
import labs.potato.cl.heygps.listas.ListaOpciones;

/**
 * Created by Leo on 11-07-16.
 */
public class HeyAdapter extends RecyclerView.Adapter<HeyAdapter.ViewHolder> {

    private List<ListaOpciones> listaOpcionesList;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView mCv;
        TextView mTextView,mTextViewTitle;
        ImageView mImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            mTextView = (TextView) itemView.findViewById(R.id.info_text);
            mImageView= (ImageView) itemView.findViewById(R.id.image_card);
            mTextViewTitle =(TextView) itemView.findViewById(R.id.title_text);
        }
    }

    public HeyAdapter(List<ListaOpciones>listaOpcionesList){
        this.listaOpcionesList =listaOpcionesList;
    }


    @Override
    public HeyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(HeyAdapter.ViewHolder holder, int position) {
        holder.mImageView.setImageResource(listaOpcionesList.get(position).getId_imagen());
        holder.mTextView.setText(listaOpcionesList.get(position).getTexto());
        holder.mTextView.setText(listaOpcionesList.get(position).getTitulo());

    }

    @Override
    public int getItemCount() {
        return listaOpcionesList.size();

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
