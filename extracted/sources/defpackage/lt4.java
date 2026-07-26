package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lt4 extends BaseAdapter {
    public final ot4 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public lt4(ot4 ot4Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = ot4Var;
        this.f = i;
        a();
    }

    public final void a() {
        ot4 ot4Var = this.a;
        vt4 vt4Var = ot4Var.v;
        if (vt4Var != null) {
            ot4Var.i();
            ArrayList arrayList = ot4Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vt4) arrayList.get(i)) == vt4Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vt4 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        ot4 ot4Var = this.a;
        if (z) {
            ot4Var.i();
            arrayListL = ot4Var.j;
        } else {
            arrayListL = ot4Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vt4) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        ot4 ot4Var = this.a;
        if (z) {
            ot4Var.i();
            arrayListL = ot4Var.j;
        } else {
            arrayListL = ot4Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        iu4 iu4Var = (iu4) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        iu4Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
