package activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    // Chapter and stage data for Rooshana (shrine-based content)
    public static final String[] CHAPTERS = {
        "فصل اول: حرم مطهر امام رضا (ع)",
        "فصل دوم: حرم مطهر امام حسین (ع)",
        "فصل سوم: حرم مطهر امیرالمؤمنین (ع)"
    };

    public static final String[] CHAPTER_1_STAGES = {
        "صحن جامع رضوی",
        "صحن آزادی",
        "صحن قدس",
        "صحن جمهوری اسلامی",
        "صحن انقلاب اسلامی",
        "صحن هدایت",
        "صحن کوثر"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.layout.activity_list_item); // placeholder layout
        // Initialize attractive gold/dark-blue theme for Rooshana
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == android.R.id.button1) {
            // Navigate to Chapter 1 stages (Imam Reza shrine)
        } else if (id == android.R.id.button2) {
            // Navigate to Chapter 2 stages (Imam Hussein shrine)
        } else if (id == android.R.id.button3) {
            // Navigate to Chapter 3 stages (Amir al-Mu'minin shrine)
        }
    }
}
