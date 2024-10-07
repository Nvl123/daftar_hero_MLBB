package com.dicoding.tugassubmissionakhir


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ListHeroAdapter (private val listHero:ArrayList<HeroMlbb>): RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback : OnItemClickCallback


    fun setonItemClickCallback(onItemClickCallback : OnItemClickCallback){
        this.onItemClickCallback=onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.hero_mlbb, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listHero.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]
        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .into(holder.imgPhoto)

        holder.tvName.text = hero.name
        holder.tvPeran.text = hero.peran
        holder.tvGelar.text = hero.gelar
        holder.tvSpesialis.text = hero.spesialis
        holder.tvRilis.text = hero.rilis


        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_HERO, hero) // Kirim objek hero langsung
            holder.itemView.context.startActivity(intent)
        }


    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgPhoto: ImageView= itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView= itemView.findViewById(R.id.tv_item_name)
        val tvPeran : TextView = itemView.findViewById(R.id.peran)
        val tvGelar: TextView=itemView.findViewById(R.id.julukan)
        val tvSpesialis : TextView = itemView.findViewById(R.id.spesialisasi)
        val tvRilis : TextView = itemView.findViewById(R.id.tahun_rilis)
        val tvDetail : TextView = itemView.findViewById(R.id.details)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data:HeroMlbb)
    }


}