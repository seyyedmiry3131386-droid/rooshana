package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.e;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class on0 extends au4 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int A = ls6.abc_cascading_menu_item_layout;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public View n;
    public View o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean v;
    public fu4 w;
    public ViewTreeObserver x;
    public PopupWindow.OnDismissListener y;
    public boolean z;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final v6 i = new v6(3, this);
    public final mg j = new mg(1, this);
    public final qm5 k = new qm5(11, this);
    public int l = 0;
    public int m = 0;
    public boolean u = false;

    public on0(Context context, View view, int i, boolean z) {
        this.b = context;
        this.n = view;
        this.d = i;
        this.e = z;
        this.p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(rq6.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // defpackage.mv7
    public final void a() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((ot4) it.next());
        }
        arrayList.clear();
        View view = this.n;
        this.o = view;
        if (view != null) {
            boolean z = this.x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.o.addOnAttachStateChangeListener(this.j);
        }
    }

    @Override // defpackage.mv7
    public final boolean b() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((nn0) arrayList.get(0)).a.z.isShowing();
    }

    @Override // defpackage.gu4
    public final void c(boolean z) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((nn0) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((lt4) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.gu4
    public final void d(ot4 ot4Var, boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ot4Var == ((nn0) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((nn0) arrayList.get(i2)).b.c(false);
        }
        nn0 nn0Var = (nn0) arrayList.remove(i);
        ot4 ot4Var2 = nn0Var.b;
        e eVar = nn0Var.a;
        PopupWindow popupWindow = eVar.z;
        ot4Var2.r(this);
        if (this.z) {
            du4.b(popupWindow, null);
            popupWindow.setAnimationStyle(0);
        }
        eVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.p = ((nn0) arrayList.get(size2 - 1)).c;
        } else {
            this.p = this.n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((nn0) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        fu4 fu4Var = this.w;
        if (fu4Var != null) {
            fu4Var.d(ot4Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeGlobalOnLayoutListener(this.i);
            }
            this.x = null;
        }
        this.o.removeOnAttachStateChangeListener(this.j);
        this.y.onDismiss();
    }

    @Override // defpackage.mv7
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            nn0[] nn0VarArr = (nn0[]) arrayList.toArray(new nn0[size]);
            for (int i = size - 1; i >= 0; i--) {
                nn0 nn0Var = nn0VarArr[i];
                if (nn0Var.a.z.isShowing()) {
                    nn0Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.gu4
    public final boolean e(p98 p98Var) {
        for (nn0 nn0Var : this.h) {
            if (p98Var == nn0Var.b) {
                nn0Var.a.c.requestFocus();
                return true;
            }
        }
        if (!p98Var.hasVisibleItems()) {
            return false;
        }
        n(p98Var);
        fu4 fu4Var = this.w;
        if (fu4Var != null) {
            fu4Var.l(p98Var);
        }
        return true;
    }

    @Override // defpackage.gu4
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gu4
    public final void i(fu4 fu4Var) {
        this.w = fu4Var;
    }

    @Override // defpackage.mv7
    public final bx1 k() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((nn0) o40.u(1, arrayList)).a.c;
    }

    @Override // defpackage.gu4
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.au4
    public final void n(ot4 ot4Var) {
        ot4Var.b(this, this.b);
        if (b()) {
            w(ot4Var);
        } else {
            this.g.add(ot4Var);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        nn0 nn0Var;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                nn0Var = null;
                break;
            }
            nn0Var = (nn0) arrayList.get(i);
            if (!nn0Var.a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (nn0Var != null) {
            nn0Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.au4
    public final void p(View view) {
        if (this.n != view) {
            this.n = view;
            this.m = Gravity.getAbsoluteGravity(this.l, view.getLayoutDirection());
        }
    }

    @Override // defpackage.au4
    public final void q(boolean z) {
        this.u = z;
    }

    @Override // defpackage.au4
    public final void r(int i) {
        if (this.l != i) {
            this.l = i;
            this.m = Gravity.getAbsoluteGravity(i, this.n.getLayoutDirection());
        }
    }

    @Override // defpackage.au4
    public final void s(int i) {
        this.q = true;
        this.s = i;
    }

    @Override // defpackage.au4
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    @Override // defpackage.au4
    public final void u(boolean z) {
        this.v = z;
    }

    @Override // defpackage.au4
    public final void v(int i) {
        this.r = true;
        this.t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(defpackage.ot4 r20) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on0.w(ot4):void");
    }

    @Override // defpackage.gu4
    public final void h(Parcelable parcelable) {
    }
}
