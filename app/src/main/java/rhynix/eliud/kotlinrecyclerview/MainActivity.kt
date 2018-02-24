package rhynix.eliud.kotlinrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        val users = ArrayList<User>()

        users.add(User("Eliud Njugush","Manama, Bahrain"))
        users.add(User("Eston Ngoth","Muharaq, Bahrain"))
        users.add(User("Josphat Ng'ang'a","Juffair, Bahrain"))
        users.add(User("Alez Mkalafa","Isa Town, Bahrain"))
        users.add(User("Denis denororo","Seef, Bahrain"))
        users.add(User("Sammy Khalifa","Dry Dock, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))
        users.add(User("Stevo Njugush","Adliya, Bahrain"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}
