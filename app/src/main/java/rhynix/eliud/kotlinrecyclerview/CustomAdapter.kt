package rhynix.eliud.kotlinrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by eliud on 2/22/18.
 */
class CustomAdapter(val userList:ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val user:User = userList[position]

        holder?.textViewName?.text = user.name
        holder?.textViewAddress?.text = user.address
    }

    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        val textViewName = itemView.findViewById<TextView>(R.id.textViewName)
        val textViewAddress = itemView.findViewById<TextView>(R.id.textViewAddress)
    }
}