package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.common.collect.ImmutableList;
import defpackage.am8;
import defpackage.bd6;
import defpackage.bm8;
import defpackage.bt6;
import defpackage.cd6;
import defpackage.dd6;
import defpackage.fd6;
import defpackage.gb6;
import defpackage.gd6;
import defpackage.hp8;
import defpackage.id6;
import defpackage.j29;
import defpackage.kd6;
import defpackage.ll8;
import defpackage.lp4;
import defpackage.pj9;
import defpackage.ps6;
import defpackage.qd6;
import defpackage.qp8;
import defpackage.rp8;
import defpackage.u03;
import defpackage.ua6;
import defpackage.vy2;
import defpackage.wu8;
import defpackage.yl8;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] d1;
    public final ImageView A;
    public final float A0;
    public final ImageView B;
    public final float B0;
    public final ImageView C;
    public final String C0;
    public final ImageView D;
    public final String D0;
    public final ImageView E;
    public final Drawable E0;
    public final View F;
    public final Drawable F0;
    public final View G;
    public final String G0;
    public final View H;
    public final String H0;
    public final TextView I;
    public final Drawable I0;
    public final TextView J;
    public final Drawable J0;
    public final ll8 K;
    public final String K0;
    public final StringBuilder L;
    public final String L0;
    public final Formatter M;
    public gb6 M0;
    public final yl8 N;
    public boolean N0;
    public final am8 O;
    public boolean O0;
    public final u03 P;
    public boolean P0;
    public final Drawable Q;
    public boolean Q0;
    public final Drawable R;
    public boolean R0;
    public final Drawable S;
    public boolean S0;
    public final Drawable T;
    public int T0;
    public final Drawable U;
    public boolean U0;
    public final String V;
    public int V0;
    public final String W;
    public int W0;
    public long[] X0;
    public boolean[] Y0;
    public long[] Z0;
    public final qd6 a;
    public boolean[] a1;
    public final Resources b;
    public long b1;
    public final cd6 c;
    public boolean c1;
    public final Class d;
    public final Method e;
    public final Method f;
    public final Class g;
    public final Method h;
    public final Method i;
    public final CopyOnWriteArrayList j;
    public final RecyclerView k;
    public final id6 l;
    public final fd6 m;
    public final bd6 n;
    public final bd6 o;
    public final pj9 p;
    public final PopupWindow q;
    public final int r;
    public final ImageView s;
    public final ImageView t;
    public final ImageView u;
    public final View v;
    public final View w;
    public final TextView x;
    public final String x0;
    public final TextView y;
    public final Drawable y0;
    public final ImageView z;
    public final Drawable z0;

    static {
        lp4.a("media3.ui");
        d1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public static void a(PlayerControlView playerControlView, gb6 gb6Var, long j) {
        if (playerControlView.R0) {
            if (gb6Var.f0(17) && gb6Var.f0(10)) {
                bm8 bm8VarS = gb6Var.S();
                int iO = bm8VarS.o();
                int i = 0;
                while (true) {
                    long jK0 = j29.k0(bm8VarS.m(i, playerControlView.O, 0L).m);
                    if (j < jK0) {
                        break;
                    }
                    if (i == iO - 1) {
                        j = jK0;
                        break;
                    } else {
                        j -= jK0;
                        i++;
                    }
                }
                gb6Var.j(i, j);
            }
        } else if (gb6Var.f0(5)) {
            gb6Var.x(j);
        }
        playerControlView.t();
    }

    public static boolean c(gb6 gb6Var, am8 am8Var) {
        bm8 bm8VarS;
        int iO;
        if (!gb6Var.f0(17) || (iO = (bm8VarS = gb6Var.S()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i = 0; i < iO; i++) {
            if (bm8VarS.m(i, am8Var, 0L).m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        gb6 gb6Var = this.M0;
        if (gb6Var == null || !gb6Var.f0(13)) {
            return;
        }
        gb6 gb6Var2 = this.M0;
        gb6Var2.d(new ua6(f, gb6Var2.g().b));
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        gb6 gb6Var = this.M0;
        if (gb6Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (gb6Var.e() == 4 || !gb6Var.f0(12)) {
                return true;
            }
            gb6Var.Y();
            return true;
        }
        if (keyCode == 89 && gb6Var.f0(11)) {
            gb6Var.a0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            j29.N(gb6Var, this.Q0);
            return true;
        }
        if (keyCode == 87) {
            if (!gb6Var.f0(9)) {
                return true;
            }
            gb6Var.X();
            return true;
        }
        if (keyCode == 88) {
            if (!gb6Var.f0(7)) {
                return true;
            }
            gb6Var.z();
            return true;
        }
        if (keyCode == 126) {
            j29.M(gb6Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        j29.L(gb6Var);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(g gVar, View view) {
        this.k.setAdapter(gVar);
        v();
        this.c1 = false;
        PopupWindow popupWindow = this.q;
        popupWindow.dismiss();
        this.c1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.r;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList f(rp8 rp8Var, int i) {
        vy2.m(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        ImmutableList immutableList = rp8Var.a;
        int i2 = 0;
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            qp8 qp8Var = (qp8) immutableList.get(i3);
            if (qp8Var.b.c == i) {
                for (int i4 = 0; i4 < qp8Var.a; i4++) {
                    if (qp8Var.b(i4)) {
                        b bVarA = qp8Var.a(i4);
                        if ((bVarA.e & 2) == 0) {
                            kd6 kd6Var = new kd6(rp8Var, i3, i4, this.p.t(bVarA));
                            int i5 = i2 + 1;
                            int iT = wu8.t(objArrCopyOf.length, i5);
                            if (iT > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iT);
                            }
                            objArrCopyOf[i2] = kd6Var;
                            i2 = i5;
                        }
                    }
                }
            }
        }
        return ImmutableList.l(i2, objArrCopyOf);
    }

    public final void g() {
        qd6 qd6Var = this.a;
        int i = qd6Var.z;
        if (i == 3 || i == 2) {
            return;
        }
        qd6Var.f();
        if (!qd6Var.C) {
            qd6Var.i(2);
        } else if (qd6Var.z == 1) {
            qd6Var.m.start();
        } else {
            qd6Var.n.start();
        }
    }

    public gb6 getPlayer() {
        return this.M0;
    }

    public int getRepeatToggleModes() {
        return this.W0;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.A);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.C);
    }

    public int getShowTimeoutMs() {
        return this.T0;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.B);
    }

    public final boolean h(gb6 gb6Var) {
        Class cls;
        return (gb6Var == null || (cls = this.g) == null || !cls.isAssignableFrom(gb6Var.getClass())) ? false : true;
    }

    public final boolean i(gb6 gb6Var) {
        Class cls;
        return (gb6Var == null || (cls = this.d) == null || !cls.isAssignableFrom(gb6Var.getClass())) ? false : true;
    }

    public final boolean j() {
        qd6 qd6Var = this.a;
        return qd6Var.z == 0 && qd6Var.a.l();
    }

    public final boolean k(gb6 gb6Var) {
        try {
            if (i(gb6Var)) {
                Method method = this.f;
                method.getClass();
                Object objInvoke = method.invoke(gb6Var, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (!h(gb6Var)) {
                return false;
            }
            Method method2 = this.i;
            method2.getClass();
            Object objInvoke2 = method2.invoke(gb6Var, null);
            objInvoke2.getClass();
            return ((Boolean) objInvoke2).booleanValue();
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    public final boolean l() {
        return getVisibility() == 0;
    }

    public final void m() {
        qd6 qd6Var = this.a;
        PlayerControlView playerControlView = qd6Var.a;
        if (!playerControlView.l()) {
            playerControlView.setVisibility(0);
            playerControlView.n();
            ImageView imageView = playerControlView.u;
            if (imageView != null) {
                imageView.requestFocus();
            }
        }
        qd6Var.k();
    }

    public final void n() {
        r();
        q();
        u();
        w();
        y();
        s();
        x();
    }

    public final void o(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.A0 : this.B0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qd6 qd6Var = this.a;
        qd6Var.a.addOnLayoutChangeListener(qd6Var.x);
        this.O0 = true;
        if (j()) {
            qd6Var.g();
        }
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qd6 qd6Var = this.a;
        qd6Var.a.removeOnLayoutChangeListener(qd6Var.x);
        this.O0 = false;
        removeCallbacks(this.P);
        qd6Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p(boolean z) {
        if (this.N0 == z) {
            return;
        }
        this.N0 = z;
        String str = this.L0;
        Drawable drawable = this.J0;
        String str2 = this.K0;
        Drawable drawable2 = this.I0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.E;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    public final void q() {
        boolean zF0;
        boolean zF02;
        boolean zF03;
        boolean zF04;
        boolean zF05;
        if (l() && this.O0) {
            gb6 gb6Var = this.M0;
            if (gb6Var != null) {
                zF02 = (this.P0 && c(gb6Var, this.O)) ? gb6Var.f0(10) : gb6Var.f0(5);
                zF03 = gb6Var.f0(7);
                zF04 = gb6Var.f0(11);
                zF05 = gb6Var.f0(12);
                zF0 = gb6Var.f0(9);
            } else {
                zF0 = false;
                zF02 = false;
                zF03 = false;
                zF04 = false;
                zF05 = false;
            }
            Resources resources = this.b;
            View view = this.w;
            if (zF04) {
                gb6 gb6Var2 = this.M0;
                int iE0 = (int) ((gb6Var2 != null ? gb6Var2.e0() : 5000L) / 1000);
                TextView textView = this.y;
                if (textView != null) {
                    textView.setText(String.valueOf(iE0));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(ps6.exo_controls_rewind_by_amount_description, iE0, Integer.valueOf(iE0)));
                }
            }
            View view2 = this.v;
            if (zF05) {
                gb6 gb6Var3 = this.M0;
                int iD = (int) ((gb6Var3 != null ? gb6Var3.D() : 15000L) / 1000);
                TextView textView2 = this.x;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iD));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(ps6.exo_controls_fastforward_by_amount_description, iD, Integer.valueOf(iD)));
                }
            }
            o(this.s, zF03);
            o(view, zF04);
            o(view2, zF05);
            o(this.t, zF0);
            ll8 ll8Var = this.K;
            if (ll8Var != null) {
                ll8Var.setEnabled(zF02);
            }
        }
    }

    public final void r() {
        ImageView imageView;
        if (l() && this.O0 && (imageView = this.u) != null) {
            boolean zG0 = j29.g0(this.M0, this.Q0);
            Drawable drawable = zG0 ? this.Q : this.R;
            int i = zG0 ? bt6.exo_controls_play_description : bt6.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.b.getString(i));
            o(imageView, j29.f0(this.M0));
        }
    }

    public final void s() {
        fd6 fd6Var;
        gb6 gb6Var = this.M0;
        if (gb6Var == null) {
            return;
        }
        float f = gb6Var.g().a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            fd6Var = this.m;
            float[] fArr = fd6Var.e;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        fd6Var.f = i2;
        String str = fd6Var.d[i2];
        id6 id6Var = this.l;
        id6Var.e[0] = str;
        o(this.F, id6Var.x(1) || id6Var.x(0));
    }

    public void setAnimationEnabled(boolean z) {
        this.a.C = z;
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.Z0 = new long[0];
            this.a1 = new boolean[0];
        } else {
            zArr.getClass();
            vy2.j(jArr.length == zArr.length);
            this.Z0 = jArr;
            this.a1 = zArr;
        }
        x();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(dd6 dd6Var) {
        boolean z = dd6Var != null;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = dd6Var != null;
        ImageView imageView2 = this.E;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(gb6 gb6Var) {
        vy2.s(Looper.myLooper() == Looper.getMainLooper());
        vy2.j(gb6Var == null || gb6Var.g0() == Looper.getMainLooper());
        gb6 gb6Var2 = this.M0;
        if (gb6Var2 == gb6Var) {
            return;
        }
        cd6 cd6Var = this.c;
        if (gb6Var2 != null) {
            gb6Var2.O(cd6Var);
        }
        this.M0 = gb6Var;
        if (gb6Var != null) {
            gb6Var.n(cd6Var);
        }
        n();
    }

    public void setRepeatToggleModes(int i) {
        this.W0 = i;
        gb6 gb6Var = this.M0;
        if (gb6Var != null && gb6Var.f0(15)) {
            int iF = this.M0.f();
            if (i == 0 && iF != 0) {
                this.M0.N(0);
            } else if (i == 1 && iF == 2) {
                this.M0.N(1);
            } else if (i == 2 && iF == 1) {
                this.M0.N(2);
            }
        }
        this.a.h(this.z, i != 0);
        u();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.v, z);
        q();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.P0 = z;
        x();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.t, z);
        q();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.Q0 = z;
        r();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.s, z);
        q();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.w, z);
        q();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.A, z);
        w();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.C, z);
    }

    public void setShowTimeoutMs(int i) {
        this.T0 = i;
        if (j()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.B, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.V0 = j29.i(i, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.U0 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            o(imageView, onClickListener != null);
        }
    }

    public final void t() {
        long jF;
        long jW;
        if (l() && this.O0) {
            gb6 gb6Var = this.M0;
            if (gb6Var == null || !gb6Var.f0(16)) {
                jF = 0;
                jW = 0;
            } else {
                jF = gb6Var.F() + this.b1;
                jW = gb6Var.W() + this.b1;
            }
            TextView textView = this.J;
            if (textView != null && !this.S0) {
                textView.setText(j29.G(this.L, this.M, jF));
            }
            ll8 ll8Var = this.K;
            if (ll8Var != null) {
                ll8Var.setPosition(jF);
                if (k(gb6Var)) {
                    jW = jF;
                }
                ll8Var.setBufferedPosition(jW);
            }
            u03 u03Var = this.P;
            removeCallbacks(u03Var);
            int iE = gb6Var == null ? 1 : gb6Var.e();
            if (gb6Var != null && gb6Var.H()) {
                long jMin = Math.min(ll8Var != null ? ll8Var.getPreferredUpdateDelay() : 1000L, 1000 - (jF % 1000));
                float f = gb6Var.g().a;
                postDelayed(u03Var, j29.j(f > 0.0f ? (long) (jMin / f) : 1000L, this.V0, 1000L));
            } else {
                if (iE == 4 || iE == 1) {
                    return;
                }
                postDelayed(u03Var, 1000L);
            }
        }
    }

    public final void u() {
        ImageView imageView;
        if (l() && this.O0 && (imageView = this.z) != null) {
            if (this.W0 == 0) {
                o(imageView, false);
                return;
            }
            gb6 gb6Var = this.M0;
            String str = this.V;
            Drawable drawable = this.S;
            if (gb6Var == null || !gb6Var.f0(15)) {
                o(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            o(imageView, true);
            int iF = gb6Var.f();
            if (iF == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iF == 1) {
                imageView.setImageDrawable(this.T);
                imageView.setContentDescription(this.W);
            } else {
                if (iF != 2) {
                    return;
                }
                imageView.setImageDrawable(this.U);
                imageView.setContentDescription(this.x0);
            }
        }
    }

    public final void v() {
        RecyclerView recyclerView = this.k;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.r;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.q;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void w() {
        ImageView imageView;
        if (l() && this.O0 && (imageView = this.A) != null) {
            gb6 gb6Var = this.M0;
            if (!this.a.b(imageView)) {
                o(imageView, false);
                return;
            }
            String str = this.D0;
            Drawable drawable = this.z0;
            if (gb6Var == null || !gb6Var.f0(14)) {
                o(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            o(imageView, true);
            if (gb6Var.U()) {
                drawable = this.y0;
            }
            imageView.setImageDrawable(drawable);
            if (gb6Var.U()) {
                str = this.C0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.x():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        bd6 bd6Var = this.n;
        bd6Var.getClass();
        List list = Collections.EMPTY_LIST;
        bd6Var.d = list;
        bd6 bd6Var2 = this.o;
        bd6Var2.getClass();
        bd6Var2.d = list;
        gb6 gb6Var = this.M0;
        ImageView imageView = this.C;
        if (gb6Var != null && gb6Var.f0(30) && this.M0.f0(29)) {
            rp8 rp8VarG = this.M0.G();
            ImmutableList immutableListF = f(rp8VarG, 1);
            bd6Var2.d = immutableListF;
            PlayerControlView playerControlView = bd6Var2.g;
            gb6 gb6Var2 = playerControlView.M0;
            id6 id6Var = playerControlView.l;
            gb6Var2.getClass();
            hp8 hp8VarV = gb6Var2.V();
            if (!immutableListF.isEmpty()) {
                if (bd6Var2.x(hp8VarV)) {
                    int i = 0;
                    while (true) {
                        if (i >= immutableListF.size()) {
                            break;
                        }
                        kd6 kd6Var = (kd6) immutableListF.get(i);
                        if (kd6Var.a.e[kd6Var.b]) {
                            id6Var.e[1] = kd6Var.c;
                            break;
                        }
                        i++;
                    }
                } else {
                    id6Var.e[1] = playerControlView.getResources().getString(bt6.exo_track_selection_auto);
                }
            } else {
                id6Var.e[1] = playerControlView.getResources().getString(bt6.exo_track_selection_none);
            }
            if (this.a.b(imageView)) {
                bd6Var.y(f(rp8VarG, 3));
            } else {
                bd6Var.y(ImmutableList.q());
            }
        }
        o(imageView, bd6Var.c() > 0);
        id6 id6Var2 = this.l;
        o(this.F, id6Var2.x(1) || id6Var2.x(0));
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0446  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3, types: [ll8] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View, android.view.ViewGroup, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v7, types: [qd6] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlayerControlView(android.content.Context r36, android.util.AttributeSet r37, int r38, android.util.AttributeSet r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    public void setProgressUpdateListener(gd6 gd6Var) {
    }
}
