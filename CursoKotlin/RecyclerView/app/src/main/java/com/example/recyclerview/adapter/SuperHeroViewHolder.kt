package com.example.recyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.SuperHero
import com.example.recyclerview.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHero: SuperHero, onClickListener: (SuperHero) -> Unit) {
        binding.SuperHeroName.text = superHero.superhero
        binding.SuperHeroRealName.text = superHero.realName
        binding.SuperHeroPublisher.text = superHero.publisher
        Glide.with(binding.imageSuperHero.context).load(superHero.photo)
            .into(binding.imageSuperHero)

        itemView.setOnClickListener {
           onClickListener(superHero)
        }
    }
}