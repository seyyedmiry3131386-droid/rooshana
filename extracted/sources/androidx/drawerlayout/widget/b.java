package androidx.drawerlayout.widget;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import defpackage.b79;
import defpackage.q6;
import defpackage.sb7;

/* JADX INFO: loaded from: classes.dex */
public final class b extends sb7 {
    public final int a;
    public b79 b;
    public final q6 c = new q6(10, this);
    public final /* synthetic */ DrawerLayout d;

    public b(DrawerLayout drawerLayout, int i) {
        this.d = drawerLayout;
        this.a = i;
    }

    @Override // defpackage.sb7
    public final int c(int i, View view) {
        DrawerLayout drawerLayout = this.d;
        if (drawerLayout.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.sb7
    public final int d(int i, View view) {
        return view.getTop();
    }

    @Override // defpackage.sb7
    public final int k(View view) {
        if (DrawerLayout.k(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.sb7
    public final void q(int i, int i2) {
        int i3 = i & 1;
        DrawerLayout drawerLayout = this.d;
        View viewD = i3 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (viewD == null || drawerLayout.f(viewD) != 0) {
            return;
        }
        this.b.c(i2, viewD);
    }

    @Override // defpackage.sb7
    public final void r(int i) {
        this.d.postDelayed(this.c, 160L);
    }

    @Override // defpackage.sb7
    public final void s(int i, View view) {
        ((DrawerLayout.LayoutParams) view.getLayoutParams()).c = false;
        int i2 = this.a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.d;
        View viewD = drawerLayout.d(i2);
        if (viewD != null) {
            drawerLayout.b(viewD, true);
        }
    }

    @Override // defpackage.sb7
    public final void t(int i) {
        this.d.q(i, this.b.t);
    }

    @Override // defpackage.sb7
    public final void u(View view, int i, int i2) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.d;
        float width2 = (drawerLayout.a(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.n(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // defpackage.sb7
    public final void v(View view, float f, float f2) {
        int i;
        int[] iArr = DrawerLayout.L;
        float f3 = ((DrawerLayout.LayoutParams) view.getLayoutParams()).b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.d;
        if (drawerLayout.a(3, view)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.b.s(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // defpackage.sb7
    public final boolean w(int i, View view) {
        if (!DrawerLayout.k(view)) {
            return false;
        }
        int i2 = this.a;
        DrawerLayout drawerLayout = this.d;
        return drawerLayout.a(i2, view) && drawerLayout.f(view) == 0;
    }
}
