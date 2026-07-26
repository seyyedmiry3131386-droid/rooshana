package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b94 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ c94 b;

    public b94(c94 c94Var) {
        this.b = c94Var;
        a();
    }

    public final void a() {
        ot4 ot4Var = this.b.c;
        vt4 vt4Var = ot4Var.v;
        if (vt4Var != null) {
            ot4Var.i();
            ArrayList arrayList = ot4Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vt4) arrayList.get(i)) == vt4Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vt4 getItem(int i) {
        c94 c94Var = this.b;
        ot4 ot4Var = c94Var.c;
        ot4Var.i();
        ArrayList arrayList = ot4Var.j;
        c94Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vt4) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        c94 c94Var = this.b;
        ot4 ot4Var = c94Var.c;
        ot4Var.i();
        int size = ot4Var.j.size();
        c94Var.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            c94 c94Var = this.b;
            view = c94Var.b.inflate(c94Var.e, viewGroup, false);
        }
        ((iu4) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
