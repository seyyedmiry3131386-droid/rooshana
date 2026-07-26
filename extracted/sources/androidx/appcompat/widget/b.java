package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import defpackage.au4;
import defpackage.e6;
import defpackage.f6;
import defpackage.fu4;
import defpackage.g6;
import defpackage.h6;
import defpackage.iu4;
import defpackage.l6;
import defpackage.ls6;
import defpackage.ot4;
import defpackage.p98;
import defpackage.ql4;
import defpackage.vt4;
import defpackage.w5;
import defpackage.y70;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends y70 {
    public h6 j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final SparseBooleanArray s;
    public e6 t;
    public e6 u;
    public g6 v;
    public f6 w;
    public final ql4 x;
    public int y;

    public b(Context context) {
        int i = ls6.abc_action_menu_layout;
        int i2 = ls6.abc_action_menu_item_layout;
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.f = i;
        this.g = i2;
        this.s = new SparseBooleanArray();
        this.x = new ql4(2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(vt4 vt4Var, View view, ViewGroup viewGroup) {
        View actionView = vt4Var.getActionView();
        if (actionView == null || vt4Var.e()) {
            iu4 iu4Var = view instanceof iu4 ? (iu4) view : (iu4) this.d.inflate(this.g, viewGroup, false);
            iu4Var.c(vt4Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) iu4Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.h);
            if (this.w == null) {
                this.w = new f6(this);
            }
            actionMenuItemView.setPopupCallback(this.w);
            actionView = (View) iu4Var;
        }
        actionView.setVisibility(vt4Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        g6 g6Var = this.v;
        if (g6Var != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(g6Var);
            this.v = null;
            return true;
        }
        e6 e6Var = this.t;
        if (e6Var == null) {
            return false;
        }
        if (e6Var.b()) {
            e6Var.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu4
    public final void c(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            ot4 ot4Var = this.c;
            if (ot4Var != null) {
                ot4Var.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    vt4 vt4Var = (vt4) arrayListL.get(i2);
                    if ((vt4Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        vt4 itemData = childAt instanceof iu4 ? ((iu4) childAt).getItemData() : null;
                        View viewA = a(vt4Var, childAt, viewGroup);
                        if (vt4Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.h).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        ot4 ot4Var2 = this.c;
        if (ot4Var2 != null) {
            ot4Var2.i();
            ArrayList arrayList2 = ot4Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                l6 l6Var = ((vt4) arrayList2.get(i3)).A;
                if (l6Var != null) {
                    l6Var.a = this;
                }
            }
        }
        ot4 ot4Var3 = this.c;
        if (ot4Var3 != null) {
            ot4Var3.i();
            arrayList = ot4Var3.j;
        }
        if (this.m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((vt4) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.j == null) {
                this.j = new h6(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.j.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                h6 h6Var = this.j;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParamsJ = ActionMenuView.j();
                layoutParamsJ.a = true;
                actionMenuView.addView(h6Var, layoutParamsJ);
            }
        } else {
            h6 h6Var2 = this.j;
            if (h6Var2 != null) {
                Object parent = h6Var2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.j);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.m);
    }

    @Override // defpackage.gu4
    public final void d(ot4 ot4Var, boolean z) {
        b();
        e6 e6Var = this.u;
        if (e6Var != null && e6Var.b()) {
            e6Var.i.dismiss();
        }
        fu4 fu4Var = this.e;
        if (fu4Var != null) {
            fu4Var.d(ot4Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu4
    public final boolean e(p98 p98Var) {
        boolean z;
        if (p98Var.hasVisibleItems()) {
            p98 p98Var2 = p98Var;
            while (true) {
                ot4 ot4Var = p98Var2.z;
                if (ot4Var == this.c) {
                    break;
                }
                p98Var2 = (p98) ot4Var;
            }
            vt4 vt4Var = p98Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof iu4) && ((iu4) childAt).getItemData() == vt4Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.y = p98Var.A.a;
                int size = p98Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = p98Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                e6 e6Var = new e6(this, this.b, p98Var, view);
                this.u = e6Var;
                e6Var.g = z;
                au4 au4Var = e6Var.i;
                if (au4Var != null) {
                    au4Var.q(z);
                }
                e6 e6Var2 = this.u;
                if (!e6Var2.b()) {
                    if (e6Var2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    e6Var2.d(0, 0, false, false);
                }
                fu4 fu4Var = this.e;
                if (fu4Var != null) {
                    fu4Var.l(p98Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gu4
    public final boolean f() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        b bVar = this;
        ot4 ot4Var = bVar.c;
        if (ot4Var != null) {
            arrayListL = ot4Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = bVar.q;
        int i3 = bVar.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) bVar.h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            vt4 vt4Var = (vt4) arrayListL.get(i4);
            int i7 = vt4Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (bVar.r && vt4Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (bVar.m && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = bVar.s;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            vt4 vt4Var2 = (vt4) arrayListL.get(i9);
            int i11 = vt4Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = vt4Var2.b;
            if (z3) {
                View viewA = bVar.a(vt4Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                vt4Var2.g(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewA2 = bVar.a(vt4Var2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        vt4 vt4Var3 = (vt4) arrayListL.get(i13);
                        if (vt4Var3.b == i12) {
                            if ((vt4Var3.x & 32) == 32) {
                                i8++;
                            }
                            vt4Var3.g(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                vt4Var2.g(z5);
            } else {
                vt4Var2.g(false);
                i9++;
                i = 2;
                bVar = this;
                z = true;
            }
            i9++;
            i = 2;
            bVar = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.gu4
    public final void h(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i = ((ActionMenuPresenter$SavedState) parcelable).a) > 0 && (menuItemFindItem = this.c.findItem(i)) != null) {
            e((p98) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean k() {
        e6 e6Var = this.t;
        return e6Var != null && e6Var.b();
    }

    @Override // defpackage.gu4
    public final void l(Context context, ot4 ot4Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = ot4Var;
        Resources resources = context.getResources();
        w5 w5VarB = w5.b(context);
        if (!this.n) {
            this.m = true;
        }
        this.o = w5VarB.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.q = w5VarB.c();
        int measuredWidth = this.o;
        if (this.m) {
            if (this.j == null) {
                h6 h6Var = new h6(this, this.a);
                this.j = h6Var;
                if (this.l) {
                    h6Var.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.gu4
    public final Parcelable m() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.a = this.y;
        return actionMenuPresenter$SavedState;
    }

    public final boolean n() {
        ot4 ot4Var;
        if (!this.m || k() || (ot4Var = this.c) == null || this.h == null || this.v != null) {
            return false;
        }
        ot4Var.i();
        if (ot4Var.j.isEmpty()) {
            return false;
        }
        g6 g6Var = new g6(this, new e6(this, this.b, this.c, this.j), 0);
        this.v = g6Var;
        ((View) this.h).post(g6Var);
        return true;
    }
}
