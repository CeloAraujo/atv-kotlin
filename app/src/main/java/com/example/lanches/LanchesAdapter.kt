package com.example.lanches

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lanches.model.Lanche

class LanchesAdapter(private val lanches: List<Lanche>) : RecyclerView.Adapter<LanchesAdapter.LancheViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LancheViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lanche, parent, false)
        return LancheViewHolder(view)
    }

    override fun onBindViewHolder(holder: LancheViewHolder, position: Int) {
        val lanche = lanches[position]
        holder.bind(lanche)
    }

    override fun getItemCount(): Int = lanches.size

    class LancheViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nomeTextView: TextView = itemView.findViewById(R.id.nome_text_view)
        private val tamanhoTextView: TextView = itemView.findViewById(R.id.tamanho_text_view)

        fun bind(lanche: Lanche) {
            nomeTextView.text = lanche.nome
            tamanhoTextView.text = lanche.tamanho
        }
    }
}
