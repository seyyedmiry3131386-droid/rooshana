package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionManager;
import android.os.Build;
import defpackage.g51;
import defpackage.g56;
import defpackage.lb;
import defpackage.m47;
import defpackage.mb;
import defpackage.n47;
import defpackage.ok4;
import defpackage.om0;
import defpackage.pb;
import defpackage.pr2;
import defpackage.qb;
import defpackage.qr2;
import defpackage.rb;
import defpackage.tx8;
import defpackage.wq2;
import defpackage.xq2;
import defpackage.yh0;
import defpackage.zy8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdSelectionManagerImplCommon extends yh0 {
    public final AdSelectionManager u;

    public AdSelectionManagerImplCommon(AdSelectionManager adSelectionManager) {
        this.u = adSelectionManager;
    }

    public static Object R(AdSelectionManagerImplCommon adSelectionManagerImplCommon, qr2 qr2Var, g51<? super pr2> g51Var) {
        if ((Build.VERSION.SDK_INT >= 33 ? rb.a.a() : 0) < 10) {
            int i = Build.VERSION.SDK_INT;
            if (((i == 31 || i == 32) ? qb.a.a() : 0) < 10) {
                throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
            }
        }
        return wq2.a.a(adSelectionManagerImplCommon.u, qr2Var, g51Var);
    }

    public static Object T(AdSelectionManagerImplCommon adSelectionManagerImplCommon, g56 g56Var, g51<? super pb> g51Var) {
        if ((Build.VERSION.SDK_INT >= 33 ? rb.a.a() : 0) < 10) {
            int i = Build.VERSION.SDK_INT;
            if (((i == 31 || i == 32) ? qb.a.a() : 0) < 10) {
                throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
            }
        }
        return wq2.a.b(adSelectionManagerImplCommon.u, g56Var, g51Var);
    }

    public static Object V(AdSelectionManagerImplCommon adSelectionManagerImplCommon, m47 m47Var, g51<? super tx8> g51Var) {
        if ((Build.VERSION.SDK_INT >= 33 ? rb.a.a() : 0) < 8) {
            int i = Build.VERSION.SDK_INT;
            if (((i == 31 || i == 32) ? qb.a.a() : 0) < 9) {
                throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
            }
        }
        Object objA = xq2.a.a(adSelectionManagerImplCommon.u, m47Var, g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }

    public static Object X(AdSelectionManagerImplCommon adSelectionManagerImplCommon, n47 n47Var, g51<? super tx8> g51Var) {
        new om0(1, ok4.I(g51Var)).v();
        AdSelectionManager adSelectionManager = adSelectionManagerImplCommon.u;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a0(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon r3, defpackage.lb r4, defpackage.g51<? super defpackage.pb> r5) {
        /*
            boolean r4 = r5 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1
            if (r4 == 0) goto L13
            r4 = r5
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 r4 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1) r4
            int r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.c = r0
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 r4 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r3 = r4.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r4 = r4.c
            if (r4 == 0) goto L38
            r5 = 1
            if (r4 != r5) goto L30
            kotlin.b.b(r3)
            android.adservices.adselection.AdSelectionOutcome r3 = defpackage.y32.d(r3)
            pb r4 = new pb
            r4.<init>(r3)
            return r4
        L30:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L38:
            kotlin.b.b(r3)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.a0(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon, lb, g51):java.lang.Object");
    }

    public static Object b0(AdSelectionManagerImplCommon adSelectionManagerImplCommon, mb mbVar, g51<? super pb> g51Var) {
        if ((Build.VERSION.SDK_INT >= 33 ? rb.a.a() : 0) < 10) {
            int i = Build.VERSION.SDK_INT;
            if (((i == 31 || i == 32) ? qb.a.a() : 0) < 10) {
                throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
            }
        }
        return wq2.a.c(adSelectionManagerImplCommon.u, mbVar, g51Var);
    }

    public static Object d0(AdSelectionManagerImplCommon adSelectionManagerImplCommon, zy8 zy8Var, g51<? super tx8> g51Var) {
        if ((Build.VERSION.SDK_INT >= 33 ? rb.a.a() : 0) < 8) {
            int i = Build.VERSION.SDK_INT;
            if (((i == 31 || i == 32) ? qb.a.a() : 0) < 9) {
                throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
            }
        }
        Object objB = xq2.a.b(adSelectionManagerImplCommon.u, zy8Var, g51Var);
        return objB == CoroutineSingletons.a ? objB : tx8.a;
    }

    public Object Q(qr2 qr2Var, g51<? super pr2> g51Var) {
        return R(this, qr2Var, g51Var);
    }

    public Object S(g56 g56Var, g51<? super pb> g51Var) {
        return T(this, g56Var, g51Var);
    }

    public Object U(m47 m47Var, g51<? super tx8> g51Var) {
        return V(this, m47Var, g51Var);
    }

    public Object W(n47 n47Var, g51<? super tx8> g51Var) {
        return X(this, n47Var, g51Var);
    }

    public Object Y(lb lbVar, g51<? super pb> g51Var) {
        return a0(this, lbVar, g51Var);
    }

    public Object Z(mb mbVar, g51<? super pb> g51Var) {
        return b0(this, mbVar, g51Var);
    }

    public Object c0(zy8 zy8Var, g51<? super tx8> g51Var) {
        return d0(this, zy8Var, g51Var);
    }
}
