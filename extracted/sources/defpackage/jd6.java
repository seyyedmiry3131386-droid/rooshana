package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes.dex */
public final class jd6 extends o {
    public final TextView u;
    public final View v;

    public jd6(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(ir6.exo_text);
        this.v = view.findViewById(ir6.exo_check);
    }
}
