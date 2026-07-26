package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iC;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((o) this.k.get(i2)).a;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
            if (view3 != view && !layoutParams.a.i() && (iC = (layoutParams.a.c() - this.d) * this.e) >= 0 && iC < i) {
                view2 = view3;
                if (iC == 0) {
                    break;
                } else {
                    i = iC;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).a.c();
        }
    }

    public final View b(l lVar) {
        List list = this.k;
        if (list == null) {
            View viewD = lVar.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((o) this.k.get(i)).a;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.a.i() && this.d == layoutParams.a.c()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
