package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationBarView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class el5 {
    public final /* synthetic */ WeakReference a;
    public final /* synthetic */ ij5 b;

    public el5(WeakReference weakReference, ij5 ij5Var) {
        this.a = weakReference;
        this.b = ij5Var;
    }

    public final void a(ij5 ij5Var, wi5 wi5Var) {
        js3.p(wi5Var, "destination");
        NavigationBarView navigationBarView = (NavigationBarView) this.a.get();
        if (navigationBarView == null) {
            ni5 ni5Var = this.b.b;
            ni5Var.getClass();
            ni5Var.o.remove(this);
        } else {
            if (wi5Var instanceof ve2) {
                return;
            }
            Menu menu = navigationBarView.getMenu();
            js3.o(menu, "getMenu(...)");
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                if (fl5.a(item.getItemId(), wi5Var)) {
                    item.setChecked(true);
                }
            }
        }
    }
}
