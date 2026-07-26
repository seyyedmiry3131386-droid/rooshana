package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.e;

/* JADX INFO: loaded from: classes.dex */
public final class l48 extends au4 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int u = ls6.abc_popup_menu_item_layout;
    public final Context b;
    public final ot4 c;
    public final lt4 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final e h;
    public PopupWindow.OnDismissListener k;
    public View l;
    public View m;
    public fu4 n;
    public ViewTreeObserver o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean t;
    public final v6 i = new v6(5, this);
    public final mg j = new mg(7, this);
    public int s = 0;

    public l48(Context context, ot4 ot4Var, View view, int i, boolean z) {
        this.b = context;
        this.c = ot4Var;
        this.e = z;
        this.d = new lt4(ot4Var, LayoutInflater.from(context), z, u);
        this.g = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(rq6.abc_config_prefDialogWidth));
        this.l = view;
        this.h = new e(context, null, i, 0);
        ot4Var.b(this, context);
    }

    @Override // defpackage.mv7
    public final void a() {
        View view;
        if (b()) {
            return;
        }
        if (this.p || (view = this.l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.m = view;
        e eVar = this.h;
        PopupWindow popupWindow = eVar.z;
        PopupWindow popupWindow2 = eVar.z;
        popupWindow.setOnDismissListener(this);
        eVar.p = this;
        eVar.y = true;
        popupWindow2.setFocusable(true);
        View view2 = this.m;
        boolean z = this.o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        eVar.o = view2;
        eVar.l = this.s;
        boolean z2 = this.q;
        Context context = this.b;
        lt4 lt4Var = this.d;
        if (!z2) {
            this.r = au4.o(lt4Var, context, this.f);
            this.q = true;
        }
        eVar.r(this.r);
        popupWindow2.setInputMethodMode(2);
        Rect rect = this.a;
        eVar.x = rect != null ? new Rect(rect) : null;
        eVar.a();
        bx1 bx1Var = eVar.c;
        bx1Var.setOnKeyListener(this);
        if (this.t) {
            ot4 ot4Var = this.c;
            if (ot4Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(ls6.abc_popup_menu_header_item_layout, (ViewGroup) bx1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(ot4Var.m);
                }
                frameLayout.setEnabled(false);
                bx1Var.addHeaderView(frameLayout, null, false);
            }
        }
        eVar.p(lt4Var);
        eVar.a();
    }

    @Override // defpackage.mv7
    public final boolean b() {
        return !this.p && this.h.z.isShowing();
    }

    @Override // defpackage.gu4
    public final void c(boolean z) {
        this.q = false;
        lt4 lt4Var = this.d;
        if (lt4Var != null) {
            lt4Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gu4
    public final void d(ot4 ot4Var, boolean z) {
        if (ot4Var != this.c) {
            return;
        }
        dismiss();
        fu4 fu4Var = this.n;
        if (fu4Var != null) {
            fu4Var.d(ot4Var, z);
        }
    }

    @Override // defpackage.mv7
    public final void dismiss() {
        if (b()) {
            this.h.dismiss();
        }
    }

    @Override // defpackage.gu4
    public final boolean e(p98 p98Var) {
        boolean z;
        if (p98Var.hasVisibleItems()) {
            cu4 cu4Var = new cu4(this.b, p98Var, this.m, this.e, this.g, 0);
            fu4 fu4Var = this.n;
            cu4Var.h = fu4Var;
            au4 au4Var = cu4Var.i;
            if (au4Var != null) {
                au4Var.i(fu4Var);
            }
            int size = p98Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = p98Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            cu4Var.g = z;
            au4 au4Var2 = cu4Var.i;
            if (au4Var2 != null) {
                au4Var2.q(z);
            }
            cu4Var.j = this.k;
            this.k = null;
            this.c.c(false);
            e eVar = this.h;
            int width = eVar.f;
            int iO = eVar.o();
            if ((Gravity.getAbsoluteGravity(this.s, this.l.getLayoutDirection()) & 7) == 5) {
                width += this.l.getWidth();
            }
            if (!cu4Var.b()) {
                if (cu4Var.e != null) {
                    cu4Var.d(width, iO, true, true);
                }
            }
            fu4 fu4Var2 = this.n;
            if (fu4Var2 != null) {
                fu4Var2.l(p98Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gu4
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gu4
    public final void i(fu4 fu4Var) {
        this.n = fu4Var;
    }

    @Override // defpackage.mv7
    public final bx1 k() {
        return this.h.c;
    }

    @Override // defpackage.gu4
    public final Parcelable m() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.o = this.m.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.i);
            this.o = null;
        }
        this.m.removeOnAttachStateChangeListener(this.j);
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.l = view;
    }

    @Override // defpackage.au4
    public final void q(boolean z) {
        this.d.c = z;
    }

    @Override // defpackage.au4
    public final void r(int i) {
        this.s = i;
    }

    @Override // defpackage.au4
    public final void s(int i) {
        this.h.f = i;
    }

    @Override // defpackage.au4
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    @Override // defpackage.au4
    public final void u(boolean z) {
        this.t = z;
    }

    @Override // defpackage.au4
    public final void v(int i) {
        this.h.j(i);
    }

    @Override // defpackage.gu4
    public final void h(Parcelable parcelable) {
    }

    @Override // defpackage.au4
    public final void n(ot4 ot4Var) {
    }
}
