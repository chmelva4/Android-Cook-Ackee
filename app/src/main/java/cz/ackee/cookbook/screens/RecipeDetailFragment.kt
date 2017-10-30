package cz.ackee.cookbook.screens

import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import cz.ackee.cookbook.R
import cz.ackee.cookbook.data.RecipeFull
import kotlinx.android.synthetic.main.fragment_recipe_detail.view.*
import kotlinx.android.synthetic.main.fragment_recipe_detail.*

/**
 * Created by vasek on 10/29/2017.
 */
class RecipeDetailFragment : Fragment() {

    private lateinit var recipe : RecipeFull


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater?.inflate(R.layout.fragment_recipe_detail, container, false);
        return v;
    }

    fun bindRecipe(recipe: RecipeFull) {
        for (i in 0 until recipe.stars)
            ((stars as ViewGroup).getChildAt(i) as ImageView).setImageResource(R.drawable.ic_star_white);
        var builder = StringBuilder()
        for (ing in recipe.ingredients) {
            builder.append("&#8226  $ing<br>")
        }
        recipe_name.text = recipe.name
        recipe_ingredients.text = Html.fromHtml(builder.toString())
        recipe_description.text = recipe.desc
        recipe_preparation.text = recipe.preparation
    }

    override fun onResume() {
        super.onResume()
        recipe = RecipeFull(
                "Domaci nutela fkat uber mega extra uber vytunena",
                3,
                90,
                getString(R.string.nutela_popis),
                arrayListOf("300g choco", "250g o5echy", "mirne prepustene maslo (si zaplatis)", "sul"),
                getString(R.string.nutela_postup)
        )
        bindRecipe(recipe)
    }
}