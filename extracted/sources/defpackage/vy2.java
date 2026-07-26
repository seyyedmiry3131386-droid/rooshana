package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.platform.o;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.integration.volley.VolleyGlideModule;
import ir.mservices.market.theme.ThemeData;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import ir.myket.movie.common.domain.models.SampleWatch;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes.dex */
public final class vy2 {
    public static final a b = new a(721101182, new yf(1), false);
    public static final a c = new a(-891104780, new yf(2), false);
    public static final ko9 d;
    public static final ko9 e;
    public static final mu3 f;
    public static final mu3 g;
    public static final mu3 h;
    public static final mu3 i;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public final /* synthetic */ int a;

    static {
        new a(-1486710572, new ae(29), false);
        d = new ko9(3);
        e = new ko9(4);
        int i2 = 1;
        f = new mu3("NULL", i2);
        g = new mu3("UNINITIALIZED", i2);
        h = new mu3("DONE", i2);
        i = new mu3("NO_VALUE", i2);
    }

    public static final xe2 A(fu7 fu7Var, w61 w61Var, int i2, BufferOverflow bufferOverflow) {
        return ((i2 == 0 || i2 == -3) && bufferOverflow == BufferOverflow.a) ? fu7Var : new fp0(fu7Var, w61Var, i2, bufferOverflow);
    }

    public static ColorStateList B() {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{sj8.b().u, sj8.b().m});
    }

    public static String C() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String D() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String E(Context context, int i2) {
        if (i2 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i2);
        } catch (Exception unused) {
            return rm7.n(i2, "?");
        }
    }

    public static String F(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static final Object G(pb5 pb5Var, bj6 bj6Var, Serializable serializable) {
        js3.p(pb5Var, "<this>");
        js3.p(bj6Var, "key");
        Object objC = pb5Var.c(bj6Var);
        return objC == null ? serializable : objC;
    }

    public static final void I(qz0 qz0Var, qp2 qp2Var) {
        js3.n(qp2Var, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        wu8.i(2, qp2Var);
        qp2Var.invoke(qz0Var, 1);
    }

    public static final boolean J(long j2) {
        if (zu0.c(j2, zu0.g)) {
            return false;
        }
        nv0 nv0VarF = zu0.f(j2);
        if (!gv0.a(nv0VarF.b, gv0.a)) {
            qn3.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) gv0.b(nv0VarF.b)));
        }
        g97 g97Var = ((androidx.compose.ui.graphics.colorspace.a) nv0VarF).p;
        float fD = (float) ((g97Var.d(zu0.e(j2)) * 0.0722d) + (g97Var.d(zu0.g(j2)) * 0.7152d) + (g97Var.d(zu0.h(j2)) * 0.2126d));
        if (fD < 0.0f) {
            fD = 0.0f;
        }
        if (fD > 1.0f) {
            fD = 1.0f;
        }
        return ((double) fD) <= 0.5d;
    }

    public static VolleyGlideModule K(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof VolleyGlideModule) {
                    return (VolleyGlideModule) objNewInstance;
                }
                throw new RuntimeException(o40.x(objNewInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e2) {
                O(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                O(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                O(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                O(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    public static void L(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void M(Context context, RestrictionInfo restrictionInfo) {
        js3.p(context, "context");
        js3.p(restrictionInfo, "restrictionInfo");
        FragmentActivity fragmentActivityQ = y40.q(context);
        if (fragmentActivityQ != null) {
            fragmentActivityQ.setResult(-1, new Intent().putExtra("MOVIE_RESTRICTION_INFO", restrictionInfo));
            fragmentActivityQ.c().b();
        }
    }

    public static final void N(Context context, SampleWatch sampleWatch) {
        js3.p(context, "context");
        js3.p(sampleWatch, "sampleWatch");
        FragmentActivity fragmentActivityQ = y40.q(context);
        if (fragmentActivityQ != null) {
            fragmentActivityQ.setResult(-1, new Intent().putExtra("MOVIE_RESTRICTION_BUTTON", sampleWatch.e));
            fragmentActivityQ.c().b();
        }
    }

    public static void O(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(bl4.v("Unable to instantiate GlideModule implementation for ", cls), reflectiveOperationException);
    }

    public static final hx4 P(hx4 hx4Var, me9 me9Var) {
        return hx4Var.d(new to3(me9Var, o.a));
    }

    public static final ue a(og ogVar) {
        Canvas canvas = ve.a;
        ue ueVar = new ue();
        ueVar.a = new Canvas(fz.c(ogVar));
        return ueVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(int r22, int r23, defpackage.pd r24, defpackage.hv r25, defpackage.qz0 r26, defpackage.qe1 r27, defpackage.dp2 r28, defpackage.hx4 r29, defpackage.wy5 r30, androidx.compose.foundation.c r31, androidx.compose.foundation.lazy.b r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy2.b(int, int, pd, hv, qz0, qe1, dp2, hx4, wy5, androidx.compose.foundation.c, androidx.compose.foundation.lazy.b, boolean):void");
    }

    public static final void c(final bp2 bp2Var, final long j2, final uw4 uw4Var, final androidx.compose.animation.core.a aVar, final a aVar2, qz0 qz0Var, final int i2) {
        int i3;
        long j3;
        uw4 uw4Var2;
        int i4;
        LayoutDirection layoutDirection;
        int i5;
        boolean z;
        boolean z2;
        Object obj;
        qz0Var.c0(766784632);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(bp2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j2;
            i3 |= qz0Var.e(j3) ? 32 : 16;
        } else {
            j3 = j2;
        }
        if ((i2 & 384) == 0) {
            uw4Var2 = uw4Var;
            i3 |= qz0Var.f(uw4Var2) ? 256 : 128;
        } else {
            uw4Var2 = uw4Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? qz0Var.f(aVar) : qz0Var.h(aVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var.h(aVar2) ? 16384 : 8192;
        }
        if (qz0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            View view = (View) qz0Var.j(e.f);
            qj1 qj1Var = (qj1) qz0Var.j(l.h);
            LayoutDirection layoutDirection2 = (LayoutDirection) qz0Var.j(l.n);
            androidx.compose.runtime.a aVarS = ok4.S(qz0Var);
            wb5 wb5VarK = g.k(aVar2, qz0Var);
            Object[] objArr = new Object[0];
            Object objM = qz0Var.M();
            Object obj2 = jz0.a;
            if (objM == obj2) {
                i4 = i3;
                objM = new ob4(10);
                qz0Var.l0(objM);
            } else {
                i4 = i3;
            }
            UUID uuid = (UUID) o37.A(objArr, (bp2) objM, qz0Var);
            Object objM2 = qz0Var.M();
            if (objM2 == obj2) {
                objM2 = zk8.x(EmptyCoroutineContext.a, qz0Var);
                qz0Var.l0(objM2);
            }
            e71 e71Var = (e71) objM2;
            boolean zF = qz0Var.f(view) | qz0Var.f(qj1Var);
            Object objM3 = qz0Var.M();
            if (zF || objM3 == obj2) {
                layoutDirection = layoutDirection2;
                i5 = i4;
                z = true;
                z2 = false;
                lw4 lw4Var = new lw4(bp2Var, uw4Var2, j3, view, layoutDirection, qj1Var, uuid, aVar, e71Var);
                a aVar3 = new a(-1051373467, new ww4(0, wb5VarK), true);
                kw4 kw4Var = lw4Var.i;
                kw4Var.setParentCompositionContext(aVarS);
                ((s08) kw4Var.i).setValue(aVar3);
                kw4Var.j = true;
                kw4Var.c();
                qz0Var.l0(lw4Var);
                obj = lw4Var;
            } else {
                layoutDirection = layoutDirection2;
                i5 = i4;
                z = true;
                z2 = false;
                obj = objM3;
            }
            lw4 lw4Var2 = (lw4) obj;
            boolean zH = qz0Var.h(lw4Var2);
            Object objM4 = qz0Var.M();
            if (zH || objM4 == obj2) {
                objM4 = new m22(19, lw4Var2);
                qz0Var.l0(objM4);
            }
            zk8.d(lw4Var2, (dp2) objM4, qz0Var);
            int i6 = i5;
            boolean zH2 = qz0Var.h(lw4Var2) | ((i6 & 14) == 4 ? z : z2) | ((i6 & 896) == 256 ? z : z2) | ((i6 & 112) == 32 ? z : z2) | qz0Var.d(layoutDirection.ordinal());
            Object objM5 = qz0Var.M();
            if (zH2 || objM5 == obj2) {
                objM5 = new da(lw4Var2, bp2Var, uw4Var, j2, layoutDirection);
                qz0Var.l0(objM5);
            }
            zk8.k((bp2) objM5, qz0Var);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: vw4
                @Override // defpackage.qp2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    vy2.c(bp2Var, j2, uw4Var, aVar, aVar2, (qz0) obj3, hs9.W(i2 | 1));
                    return tx8.a;
                }
            };
        }
    }

    public static final i d(int i2, int i3, BufferOverflow bufferOverflow) {
        if (i2 < 0) {
            throw new IllegalArgumentException(rm7.n(i2, "replay cannot be negative, but was ").toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(rm7.n(i3, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i2 <= 0 && i3 <= 0 && bufferOverflow != BufferOverflow.a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new i(i2, i4, bufferOverflow);
    }

    public static /* synthetic */ i e(int i2, int i3, BufferOverflow bufferOverflow) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = (i3 & 2) == 0 ? 16 : 0;
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.a;
        }
        return d(i2, i4, bufferOverflow);
    }

    public static final void f(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static StateListDrawable g(Context context, int i2, ThemeData themeData) {
        js3.p(themeData, "theme");
        int i3 = themeData.O.c;
        if (context == null) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        ov1 ov1Var = new ov1();
        ov1Var.b = false;
        ov1Var.j = i3;
        ov1Var.c(context.getResources().getDimensionPixelSize(pq6.movie_player_icon_size_big) / 2);
        GradientDrawable gradientDrawableA = ov1Var.a();
        stateListDrawable.addState(new int[]{R.attr.state_enabled, -16842908, -16842919}, gradientDrawableA);
        stateListDrawable.addState(new int[]{R.attr.state_enabled, -16842908, R.attr.state_pressed}, new LayerDrawable(new Drawable[]{gradientDrawableA, y97.A(ov1Var.c, ov1Var.j)}));
        ov1 ov1Var2 = new ov1();
        Resources resources = context.getResources();
        int i4 = eq6.tv_round_drawable_pressed_background;
        ThreadLocal threadLocal = b77.a;
        ov1Var2.a = resources.getColor(i4, null);
        ov1Var2.b = true;
        ov1Var2.j = i3;
        ov1Var2.c(i2);
        ov1Var2.h = context.getResources().getDimensionPixelSize(pq6.tv_round_drawable_border_width);
        ov1Var2.i = context.getResources().getColor(eq6.tv_round_drawable_border_color, null);
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_focused, R.attr.state_pressed}, ov1Var2.a());
        ov1 ov1Var3 = new ov1();
        ov1Var3.a = context.getResources().getColor(eq6.tv_round_drawable_focused_background, null);
        ov1Var3.b = true;
        ov1Var3.j = i3;
        ov1Var3.c(i2);
        ov1Var3.h = context.getResources().getDimensionPixelSize(pq6.tv_round_drawable_border_width);
        ov1Var3.i = context.getResources().getColor(eq6.tv_round_drawable_border_color, null);
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_focused, -16842919}, ov1Var3.a());
        return stateListDrawable;
    }

    public static StateListDrawable h(Context context, ThemeData themeData) {
        js3.p(themeData, "theme");
        int i2 = themeData.O.c;
        if (context == null) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        ov1 ov1Var = new ov1();
        ov1Var.j = i2;
        Resources resources = context.getResources();
        int i3 = eq6.tv_round_drawable_pressed_background;
        ThreadLocal threadLocal = b77.a;
        ov1Var.a = resources.getColor(i3, null);
        ov1Var.b = true;
        ov1Var.c(context.getResources().getDimensionPixelSize(pq6.tv_round_drawable_border_radius));
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_focused, R.attr.state_pressed}, ov1Var.a());
        ov1 ov1Var2 = new ov1();
        ov1Var2.j = i2;
        ov1Var2.a = context.getResources().getColor(eq6.tv_round_drawable_focused_background, null);
        ov1Var2.b = true;
        ov1Var2.c(context.getResources().getDimensionPixelSize(pq6.tv_round_drawable_border_radius));
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_focused, -16842919}, ov1Var2.a());
        return stateListDrawable;
    }

    public static void i(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void j(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void k(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(o40.x(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void l(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void m(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static void n(aq4 aq4Var) {
        aq4Var.getClass();
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void p(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i2);
    }

    public static void q(boolean z) {
        wn5.s("no calls to next() since the last call to remove()", z);
    }

    public static void r(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void s(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void t(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void u(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static final hx4 v(hx4 hx4Var, kd2 kd2Var) {
        return hx4Var.d(new rx8(kd2Var, o.a));
    }

    public static boolean w(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static long x(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    j31.l(i7);
                    throw new KotlinNothingValueException();
                }
                i6 = 8190;
            }
        }
        return j31.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long y(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    j31.l(i7);
                    throw new KotlinNothingValueException();
                }
                i6 = 8190;
            }
        }
        return j31.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static void z(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 33) {
        }
        bundle.getBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN");
    }

    public final ViewPropertyAnimator H(int i2, View view) {
        switch (this.a) {
            case 0:
                return view.animate().translationY(i2);
            case 1:
                return view.animate().translationX(-i2);
            default:
                return view.animate().translationX(i2);
        }
    }
}
