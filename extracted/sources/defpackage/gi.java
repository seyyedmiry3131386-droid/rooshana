package defpackage;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gi {
    public final hi a;
    public final di b;
    public final di c;
    public final View d;

    public gi(hi hiVar, di diVar, di diVar2, View view) {
        this.a = hiVar;
        this.b = diVar;
        this.c = diVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        zf8 zf8Var = (zf8) this.b.invoke();
        if (js3.i(zf8Var, null)) {
            return false;
        }
        menu.clear();
        List list = zf8Var.a;
        int size = list.size();
        int i2 = 1;
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            yf8 yf8Var = (yf8) list.get(i4);
            if (yf8Var instanceof ig8) {
                i = i2 + 1;
                ig8 ig8Var = (ig8) yf8Var;
                MenuItem menuItemAdd = menu.add(i3, i2, i2, ig8Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new fi(ig8Var, this, 0));
            } else {
                if (yf8Var instanceof ng8) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i2 + 1;
                        ng8 ng8Var = (ng8) yf8Var;
                        ul.c(menu, i2, this.d.getContext(), ng8Var.b, ng8Var.c);
                    }
                } else if (yf8Var instanceof lg8) {
                    i3++;
                }
            }
            i2 = i;
        }
        return true;
    }
}
