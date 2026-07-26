package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import defpackage.bx1;
import defpackage.lt4;
import defpackage.ot4;
import defpackage.qm5;
import defpackage.tt4;
import defpackage.vt4;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ListPopupWindow implements tt4 {
    public static final Method E;
    public qm5 D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // defpackage.tt4
    public final void d(ot4 ot4Var, MenuItem menuItem) {
        qm5 qm5Var = this.D;
        if (qm5Var != null) {
            qm5Var.d(ot4Var, menuItem);
        }
    }

    @Override // defpackage.tt4
    public final void m(ot4 ot4Var, vt4 vt4Var) {
        qm5 qm5Var = this.D;
        if (qm5Var != null) {
            qm5Var.m(ot4Var, vt4Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView, bx1] */
    @Override // androidx.appcompat.widget.ListPopupWindow
    public final bx1 q(final Context context, final boolean z) {
        ?? r0 = new bx1(context, z) { // from class: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView
            public final int m;
            public final int n;
            public tt4 o;
            public vt4 p;

            {
                super(context, z);
                if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                    this.m = 21;
                    this.n = 22;
                } else {
                    this.m = 22;
                    this.n = 21;
                }
            }

            @Override // defpackage.bx1, android.view.View
            public final boolean onHoverEvent(MotionEvent motionEvent) {
                lt4 lt4Var;
                int headersCount;
                int iPointToPosition;
                int i;
                if (this.o != null) {
                    ListAdapter adapter = getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        headersCount = headerViewListAdapter.getHeadersCount();
                        lt4Var = (lt4) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        lt4Var = (lt4) adapter;
                        headersCount = 0;
                    }
                    vt4 vt4VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= lt4Var.getCount()) ? null : lt4Var.b(i);
                    vt4 vt4Var = this.p;
                    if (vt4Var != vt4VarB) {
                        ot4 ot4Var = lt4Var.a;
                        if (vt4Var != null) {
                            this.o.d(ot4Var, vt4Var);
                        }
                        this.p = vt4VarB;
                        if (vt4VarB != null) {
                            this.o.m(ot4Var, vt4VarB);
                        }
                    }
                }
                return super.onHoverEvent(motionEvent);
            }

            @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
                if (listMenuItemView != null && i == this.m) {
                    if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                        performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                    }
                    return true;
                }
                if (listMenuItemView == null || i != this.n) {
                    return super.onKeyDown(i, keyEvent);
                }
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (lt4) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (lt4) adapter).a.c(false);
                return true;
            }

            public void setHoverListener(tt4 tt4Var) {
                this.o = tt4Var;
            }

            @Override // defpackage.bx1, android.widget.AbsListView
            public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
                super.setSelector(drawable);
            }
        };
        r0.setHoverListener(this);
        return r0;
    }
}
