package cz.ackee.cookbook.data

/**
 * Created by vasek on 10/30/2017.
 */
data class RecipeFull(val name: String, val stars: Int, val time: Int, val desc: String, val ingredients: ArrayList<String>, val preparation: String) {
}