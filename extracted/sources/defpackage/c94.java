package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class c94 implements gu4, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public ot4 c;
    public ExpandedMenuView d;
    public final int e;
    public fu4 f;
    public b94 g;

    public c94(Context context, int i) {
        this.e = i;
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.gu4
    public final void c(boolean z) {
        b94 b94Var = this.g;
        if (b94Var != null) {
            b94Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gu4
    public final void d(ot4 ot4Var, boolean z) {
        fu4 fu4Var = this.f;
        if (fu4Var != null) {
            fu4Var.d(ot4Var, z);
        }
    }

    @Override // defpackage.gu4
    public final boolean e(p98 p98Var) {
        boolean zHasVisibleItems = p98Var.hasVisibleItems();
        Context context = p98Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        pt4 pt4Var = new pt4();
        pt4Var.a = p98Var;
        kd kdVar = new kd(context);
        c94 c94Var = new c94(kdVar.getContext(), ls6.abc_list_menu_item_layout);
        pt4Var.c = c94Var;
        c94Var.f = pt4Var;
        p98Var.b(c94Var, context);
        c94 c94Var2 = pt4Var.c;
        if (c94Var2.g == null) {
            c94Var2.g = new b94(c94Var2);
        }
        b94 b94Var = c94Var2.g;
        gd gdVar = kdVar.a;
        gdVar.k = b94Var;
        gdVar.l = pt4Var;
        View view = p98Var.o;
        if (view != null) {
            gdVar.e = view;
        } else {
            gdVar.c = p98Var.n;
            kdVar.setTitle(p98Var.m);
        }
        gdVar.j = pt4Var;
        ld ldVarCreate = kdVar.create();
        pt4Var.b = ldVarCreate;
        ldVarCreate.setOnDismissListener(pt4Var);
        WindowManager.LayoutParams attributes = pt4Var.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pt4Var.b.show();
        fu4 fu4Var = this.f;
        if (fu4Var == null) {
            return true;
        }
        fu4Var.l(p98Var);
        return true;
    }

    @Override // defpackage.gu4
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gu4
    public final boolean g(vt4 vt4Var) {
        return false;
    }

    @Override // defpackage.gu4
    public final int getId() {
        return 0;
    }

    @Override // defpackage.gu4
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // defpackage.gu4
    public final void i(fu4 fu4Var) {
        throw null;
    }

    @Override // defpackage.gu4
    public final boolean j(vt4 vt4Var) {
        return false;
    }

    @Override // defpackage.gu4
    public final void l(Context context, ot4 ot4Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = ot4Var;
        b94 b94Var = this.g;
        if (b94Var != null) {
            b94Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gu4
    public final Parcelable m() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.g.getItem(i), this, 0);
    }
}
