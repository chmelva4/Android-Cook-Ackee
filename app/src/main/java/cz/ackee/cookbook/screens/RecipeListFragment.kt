package cz.ackee.cookbook.screens

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cz.ackee.cookbook.R
import cz.ackee.cookbook.data.RecipeLight
import kotlinx.android.synthetic.main.fragment_recipe_list.view.*

/**
 * Created by vasek on 10/29/2017.
 */
class RecipeListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //set adapter and other stuff
        val v = inflater?.inflate(R.layout.fragment_recipe_list, container, false);
        val data = arrayListOf<RecipeLight>(
            RecipeLight("aaaaaaaa", 1, 10),
            RecipeLight("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", 3, 30),
            RecipeLight("ccc", 5, 120)
        )

        v!!.recipe_list_recycler.layoutManager = LinearLayoutManager(context)
        v.recipe_list_recycler.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        v.recipe_list_recycler.adapter = RecipesAdapter(context, data)
        return v;
    }
}