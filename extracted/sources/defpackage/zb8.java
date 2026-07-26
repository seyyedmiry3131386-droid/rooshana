package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import io.sentry.android.core.t0;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class zb8 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ ac8 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public l6 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public zb8(ac8 ac8Var, Menu menu) {
        this.E = ac8Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            t0.n("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        ac8 ac8Var = this.E;
        Context context = ac8Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (ac8Var.d == null) {
                ac8Var.d = ac8.a(context);
            }
            Object obj = ac8Var.d;
            String str = this.y;
            yb8 yb8Var = new yb8();
            yb8Var.b = obj;
            Class<?> cls = obj.getClass();
            try {
                yb8Var.c = cls.getMethod(str, yb8.d);
                menuItem.setOnMenuItemClickListener(yb8Var);
            } catch (Exception e) {
                StringBuilder sbN = t61.n("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbN.append(cls.getName());
                InflateException inflateException = new InflateException(sbN.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof vt4) {
                ((vt4) menuItem).f(true);
            } else if (menuItem instanceof zt4) {
                zt4 zt4Var = (zt4) menuItem;
                bc8 bc8Var = zt4Var.c;
                try {
                    if (zt4Var.d == null) {
                        zt4Var.d = bc8Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    zt4Var.d.invoke(bc8Var, Boolean.TRUE);
                } catch (Exception e2) {
                    t0.n("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, ac8.e, ac8Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                t0.m("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        l6 l6Var = this.z;
        if (l6Var != null) {
            if (menuItem instanceof bc8) {
                ((bc8) menuItem).a(l6Var);
            } else {
                t0.m("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof bc8;
        if (z2) {
            ((bc8) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            aq3.t(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((bc8) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            aq3.B(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((bc8) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            aq3.r(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((bc8) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            aq3.x(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((bc8) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                aq3.w(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((bc8) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                aq3.v(menuItem, colorStateList);
            }
        }
    }
}
