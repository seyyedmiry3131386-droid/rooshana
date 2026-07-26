package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bl5 implements gu4 {
    public int A;
    public NavigationMenuView a;
    public LinearLayout b;
    public ot4 c;
    public int d;
    public tk5 e;
    public LayoutInflater f;
    public ColorStateList h;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public RippleDrawable n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int y;
    public int z;
    public int g = 0;
    public int i = 0;
    public boolean j = true;
    public boolean x = true;
    public int B = -1;
    public final r5 C = new r5(7, this);

    public final void a() {
        tk5 tk5Var = this.e;
        if (tk5Var != null) {
            ArrayList arrayList = tk5Var.d;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof wk5) {
                    tk5Var.a.d(i, 1, null);
                }
            }
        }
    }

    public final void b() {
        tk5 tk5Var = this.e;
        if (tk5Var != null) {
            ArrayList arrayList = tk5Var.d;
            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) instanceof xk5) && tk5Var.e(i) == 1) {
                    tk5Var.a.d(i, 1, null);
                }
            }
        }
    }

    @Override // defpackage.gu4
    public final void c(boolean z) {
        tk5 tk5Var = this.e;
        if (tk5Var != null) {
            ArrayList arrayList = tk5Var.d;
            int size = arrayList.size();
            tk5Var.x();
            tk5Var.f();
            if (size == arrayList.size()) {
                tk5Var.a.d(0, arrayList.size(), null);
            }
        }
    }

    @Override // defpackage.gu4
    public final boolean e(p98 p98Var) {
        return false;
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
        return this.d;
    }

    @Override // defpackage.gu4
    public final void h(Parcelable parcelable) {
        vt4 vt4Var;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                tk5 tk5Var = this.e;
                ArrayList arrayList = tk5Var.d;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    tk5Var.f = true;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        vk5 vk5Var = (vk5) arrayList.get(i2);
                        if (vk5Var instanceof xk5) {
                            vt4 vt4Var2 = ((xk5) vk5Var).a;
                            if (vt4Var2.a == i) {
                                tk5Var.y(vt4Var2);
                                break;
                            }
                        }
                        i2++;
                    }
                    tk5Var.f = false;
                    tk5Var.x();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        vk5 vk5Var2 = (vk5) arrayList.get(i3);
                        if ((vk5Var2 instanceof xk5) && (actionView = (vt4Var = ((xk5) vk5Var2).a).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(vt4Var.a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // defpackage.gu4
    public final boolean j(vt4 vt4Var) {
        return false;
    }

    public final void k() {
        tk5 tk5Var = this.e;
        if (tk5Var != null) {
            ArrayList arrayList = tk5Var.d;
            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) instanceof xk5) && tk5Var.e(i) == 0) {
                    tk5Var.a.d(i, 1, null);
                }
            }
        }
    }

    @Override // defpackage.gu4
    public final void l(Context context, ot4 ot4Var) {
        this.f = LayoutInflater.from(context);
        this.c = ot4Var;
        this.A = context.getResources().getDimensionPixelOffset(oq6.design_navigation_separator_vertical_padding);
    }

    @Override // defpackage.gu4
    public final Parcelable m() {
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        tk5 tk5Var = this.e;
        if (tk5Var != null) {
            ArrayList arrayList = tk5Var.d;
            Bundle bundle2 = new Bundle();
            vt4 vt4Var = tk5Var.e;
            if (vt4Var != null) {
                bundle2.putInt("android:menu:checked", vt4Var.a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                vk5 vk5Var = (vk5) arrayList.get(i);
                if (vk5Var instanceof xk5) {
                    vt4 vt4Var2 = ((xk5) vk5Var).a;
                    View actionView = vt4Var2 != null ? vt4Var2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(vt4Var2.a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // defpackage.gu4
    public final void d(ot4 ot4Var, boolean z) {
    }
}
