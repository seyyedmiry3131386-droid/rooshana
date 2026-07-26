package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.navigation.NavigationBarItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bm0 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public /* synthetic */ bm0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z67 z67Var = (z67) ((ck4) this.c).b;
                if (z67Var != null) {
                    z67Var.j(this.b);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i = 0;
                if (this.b == 1) {
                    while (i < size) {
                        ((xz1) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((xz1) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            case 2:
                ((MaterialCalendar) this.c).J0.n0(this.b);
                break;
            case 3:
                ((NavigationBarItemView) this.c).j(this.b);
                break;
            case 4:
                xr5 xr5Var = (xr5) this.c;
                int i2 = xr5Var.a;
                int i3 = this.b;
                if (i2 == i3) {
                    xr5Var.t();
                    if (xr5Var.a == i3) {
                        zl5.a.postDelayed(new bm0(i3, 4, xr5Var), 750L);
                        break;
                    }
                }
                break;
            case 5:
                ((RecyclerView) this.c).n0(this.b);
                break;
            default:
                ((wh9) this.c).b(this.b);
                break;
        }
    }

    public bm0(int i, q89 q89Var) {
        this.a = 5;
        this.b = i;
        this.c = q89Var;
    }

    public bm0(List list, int i, Throwable th) {
        this.a = 1;
        wu8.l(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }
}
