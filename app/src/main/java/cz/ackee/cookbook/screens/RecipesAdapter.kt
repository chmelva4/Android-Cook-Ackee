package cz.ackee.cookbook.screens

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import cz.ackee.cookbook.R
import cz.ackee.cookbook.data.RecipeLight
import kotlinx.android.synthetic.main.row_recipe_list.view.*

/**
 * Created by vasek on 10/29/2017.
 */
class RecipesAdapter(private var context: Context, private var data :ArrayList<RecipeLight>) : RecyclerView.Adapter<RecipesAdapter.RecipeViewHolder>() {

    private var inflater: LayoutInflater = LayoutInflater.from(context);

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecipeViewHolder{
        val v = inflater.inflate(R.layout.row_recipe_list, parent, false)
        return RecipeViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bindRecipe(data[position])
    }

    class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindRecipe(recipe: RecipeLight) {
            itemView.recipe_name.text = recipe.name
            itemView.time_text.text = "${recipe.time} min"
            for (i in 0 until recipe.stars)
                ((itemView.stars as ViewGroup).getChildAt(i) as ImageView).setImageResource(R.drawable.ic_star);

        }

    }
}