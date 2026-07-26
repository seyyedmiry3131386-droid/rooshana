package ir.mservices.market.core.ext;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.insets.ProtectionLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.b;
import androidx.paging.e;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.a06;
import defpackage.ag4;
import defpackage.am2;
import defpackage.bn6;
import defpackage.br9;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.gx1;
import defpackage.h40;
import defpackage.hl5;
import defpackage.js3;
import defpackage.jv0;
import defpackage.jy3;
import defpackage.m22;
import defpackage.mf9;
import defpackage.nf9;
import defpackage.of9;
import defpackage.pf9;
import defpackage.rr6;
import defpackage.rv6;
import defpackage.sg4;
import defpackage.sj8;
import defpackage.u52;
import defpackage.ug1;
import defpackage.up1;
import defpackage.ws5;
import defpackage.zm6;
import ir.mservices.market.activity.BaseActivity;
import ir.mservices.market.activity.BaseNavigationContentActivity;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.theme.ThemeMode;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static h40 a(FragmentActivity fragmentActivity, dp2 dp2Var) {
        ws5 ws5VarC;
        if (fragmentActivity == null || (ws5VarC = fragmentActivity.c()) == null) {
            return null;
        }
        h40 h40Var = new h40(4, dp2Var, false);
        ws5VarC.a(fragmentActivity, h40Var);
        return h40Var;
    }

    public static final a06 b(a06 a06Var, Map map) {
        js3.p(a06Var, "<this>");
        js3.p(map, "addListAfter");
        return e.d(a06Var, new PagingDataExtKt$flatMapAddListAfter$1(map, null));
    }

    public static final jv0 c(Activity activity2) {
        View decorView = activity2.getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        Object tag = decorView.getTag(-1002);
        jv0 jv0Var = tag instanceof jv0 ? (jv0) tag : null;
        if (jv0Var != null) {
            return jv0Var;
        }
        jv0 jv0Var2 = new jv0(8);
        decorView.setTag(-1002, jv0Var2);
        return jv0Var2;
    }

    public static final jv0 d(Activity activity2) {
        View decorView = activity2.getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        Object tag = decorView.getTag(-1001);
        jv0 jv0Var = tag instanceof jv0 ? (jv0) tag : null;
        if (jv0Var != null) {
            return jv0Var;
        }
        jv0 jv0Var2 = new jv0(2);
        decorView.setTag(-1001, jv0Var2);
        return jv0Var2;
    }

    public static final void e(LottieAnimationView lottieAnimationView, int i) {
        js3.p(lottieAnimationView, "<this>");
        lottieAnimationView.setAnimation(i);
        lottieAnimationView.f();
        ug1 ug1Var = up1.a;
        bt2.G(js3.a(sg4.a), null, null, new LottieAnimationExtKt$playEmptyStateAnimation$1(lottieAnimationView, null), 3);
    }

    public static final void f(LaunchContentActivity launchContentActivity, rv6 rv6Var, m22 m22Var) {
        Lifecycle$State lifecycle$State = Lifecycle$State.a;
        js3.p(rv6Var, "flow");
        bt2.G(b.a(launchContentActivity), null, null, new ActivityExtKt$repeatOnLifecycleState$1(launchContentActivity, rv6Var, m22Var, null), 3);
    }

    public static void g(BaseNavigationContentActivity baseNavigationContentActivity, dp2 dp2Var) {
        bt2.G(b.a(baseNavigationContentActivity), null, null, new ActivityExtKt$repeatOnLifecycleState$2(baseNavigationContentActivity, Lifecycle$State.d, dp2Var, null), 3);
    }

    public static final void h(LaunchContentActivity launchContentActivity) {
        int iM0 = sj8.b().F;
        ThemeMode themeMode = sj8.g;
        js3.p(themeMode, "mode");
        d dVarS = launchContentActivity.s();
        BaseContentFragment baseContentFragment = dVarS instanceof BaseContentFragment ? (BaseContentFragment) dVarS : null;
        if (baseContentFragment != null) {
            iM0 = baseContentFragment.M0();
        }
        k(launchContentActivity, iM0, themeMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Activity activity2) {
        Pair pair;
        int iP0 = sj8.b().F;
        if (activity2 instanceof am2) {
            d dVarS = ((am2) activity2).s();
            BaseContentFragment baseContentFragment = dVarS instanceof BaseContentFragment ? (BaseContentFragment) dVarS : null;
            if (baseContentFragment != null) {
                iP0 = baseContentFragment.P0();
            }
            pair = new Pair(Integer.valueOf(iP0), Boolean.valueOf(baseContentFragment != null ? baseContentFragment.U0() : true));
        } else {
            pair = Build.VERSION.SDK_INT >= 35 ? new Pair(Integer.valueOf(iP0), true) : new Pair(Integer.valueOf(iP0), Boolean.FALSE);
        }
        int iIntValue = ((Number) pair.a).intValue();
        if (((Boolean) pair.b).booleanValue()) {
            iIntValue = Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{128, Integer.valueOf(iIntValue & 16777215)}, 2)));
        }
        n(activity2, iIntValue);
    }

    public static final void j(LottieAnimationView lottieAnimationView, int i) {
        js3.p(lottieAnimationView, "<this>");
        lottieAnimationView.h.a(new jy3("**"), ag4.I, new gx1(1, new u52(i, 3)));
    }

    public static final void k(BaseActivity baseActivity, int i, ThemeMode themeMode) {
        js3.p(themeMode, "mode");
        baseActivity.getWindow().addFlags(Integer.MIN_VALUE);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            baseActivity.getWindow().clearFlags(134217728);
            Window window = baseActivity.getWindow();
            hl5 hl5Var = new hl5(baseActivity.getWindow().getDecorView());
            int i3 = Build.VERSION.SDK_INT;
            (i3 >= 35 ? new pf9(window, hl5Var) : i3 >= 30 ? new of9(window, hl5Var) : i3 >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var)).l(themeMode != ThemeMode.b);
            if (((i2 < 35 || ((ProtectionLayout) baseActivity.findViewById(rr6.list_protection)) == null) ? baseActivity.getWindow().getNavigationBarColor() : c(baseActivity).h) != i) {
                ProtectionLayout protectionLayout = (ProtectionLayout) baseActivity.findViewById(rr6.list_protection);
                if (i2 >= 35 && protectionLayout != null) {
                    jv0 jv0VarD = d(baseActivity);
                    jv0 jv0VarC = c(baseActivity);
                    int color = Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{80, Integer.valueOf(16777215 & i)}, 2)));
                    jv0VarC.g = true;
                    ColorDrawable colorDrawable = jv0VarC.f;
                    if (jv0VarC.h != color) {
                        jv0VarC.h = color;
                        colorDrawable.setColor(color);
                        zm6 zm6Var = jv0VarC.b;
                        zm6Var.d = colorDrawable;
                        bn6 bn6Var = zm6Var.h;
                        if (bn6Var != null) {
                            ((View) bn6Var.c).setBackground(colorDrawable);
                        }
                    }
                    protectionLayout.setProtections(br9.C(jv0VarD, jv0VarC));
                }
            }
            baseActivity.getWindow().setNavigationBarColor(i);
        }
    }

    public static final void l(BaseActivity baseActivity, int i, ThemeMode themeMode) {
        js3.p(themeMode, "mode");
        k(baseActivity, i, themeMode);
    }

    public static final void m(Activity activity2, int i, ThemeMode themeMode) {
        js3.p(themeMode, "mode");
        activity2.getWindow().addFlags(Integer.MIN_VALUE);
        Window window = activity2.getWindow();
        hl5 hl5Var = new hl5(activity2.getWindow().getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 35 ? new pf9(window, hl5Var) : i2 >= 30 ? new of9(window, hl5Var) : i2 >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var)).m(themeMode != ThemeMode.b);
        int i3 = Build.VERSION.SDK_INT;
        if (((i3 < 35 || ((ProtectionLayout) activity2.findViewById(rr6.list_protection)) == null) ? activity2.getWindow().getStatusBarColor() : d(activity2).h) != i) {
            ProtectionLayout protectionLayout = (ProtectionLayout) activity2.findViewById(rr6.list_protection);
            if (i3 >= 35 && protectionLayout != null) {
                jv0 jv0VarD = d(activity2);
                jv0 jv0VarC = c(activity2);
                jv0VarD.g = true;
                ColorDrawable colorDrawable = jv0VarD.f;
                if (jv0VarD.h != i) {
                    jv0VarD.h = i;
                    colorDrawable.setColor(i);
                    zm6 zm6Var = jv0VarD.b;
                    zm6Var.d = colorDrawable;
                    bn6 bn6Var = zm6Var.h;
                    if (bn6Var != null) {
                        ((View) bn6Var.c).setBackground(colorDrawable);
                    }
                }
                protectionLayout.setProtections(br9.C(jv0VarD, jv0VarC));
            }
            activity2.getWindow().setStatusBarColor(i);
        }
    }

    public static void n(Activity activity2, int i) {
        m(activity2, i, sj8.g);
    }
}
