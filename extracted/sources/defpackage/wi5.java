package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class wi5 {
    public static final /* synthetic */ int f = 0;
    public final String a;
    public final yb b;
    public fj5 c;
    public CharSequence d;
    public final m28 e;

    static {
        new LinkedHashMap();
    }

    public wi5(kl5 kl5Var) {
        LinkedHashMap linkedHashMap = ll5.b;
        this.a = ct2.m(kl5Var.getClass());
        yb ybVar = new yb();
        ybVar.b = this;
        ybVar.c = new ArrayList();
        ybVar.e = new LinkedHashMap();
        this.b = ybVar;
        this.e = new m28(0);
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b.e;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        b.I();
        Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            di5 di5Var = (di5) entry.getValue();
            di5Var.getClass();
            js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (di5Var.c && (obj = di5Var.d) != null) {
                di5Var.a.e(bundleG, str, obj);
            }
        }
        if (bundle != null) {
            bundleG.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                di5 di5Var2 = (di5) entry2.getValue();
                di5Var2.getClass();
                sj5 sj5Var = di5Var2.a;
                js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (di5Var2.b || !bundleG.containsKey(str2) || !t17.g(bundleG, str2)) {
                    try {
                        sj5Var.a(bundleG, str2);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbN = t61.n("Wrong argument type for '", str2, "' in argument savedState. ");
                sbN.append(sj5Var.b());
                sbN.append(" expected.");
                throw new IllegalArgumentException(sbN.toString().toString());
            }
        }
        return bundleG;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] c(defpackage.wi5 r7) {
        /*
            r6 = this;
            ov r0 = new ov
            r0.<init>()
            r1 = r6
        L6:
            yb r2 = r1.b
            fj5 r3 = r1.c
            if (r7 == 0) goto Lf
            fj5 r4 = r7.c
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L23
            fj5 r4 = r7.c
            defpackage.js3.m(r4)
            int r5 = r2.a
            wi5 r4 = r4.l(r5)
            if (r4 != r1) goto L23
            r0.addFirst(r1)
            goto L39
        L23:
            if (r3 == 0) goto L2d
            jx9 r4 = r3.g
            int r4 = r4.a
            int r2 = r2.a
            if (r4 == r2) goto L30
        L2d:
            r0.addFirst(r1)
        L30:
            boolean r1 = defpackage.js3.i(r3, r7)
            if (r1 == 0) goto L37
            goto L39
        L37:
            if (r3 != 0) goto L69
        L39:
            java.util.List r7 = kotlin.collections.a.P0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.wu0.V(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L4c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r7.next()
            wi5 r1 = (defpackage.wi5) r1
            yb r1 = r1.b
            int r1 = r1.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4c
        L64:
            int[] r7 = kotlin.collections.a.O0(r0)
            return r7
        L69:
            r1 = r3
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi5.c(wi5):int[]");
    }

    public final zh5 d(int i) {
        m28 m28Var = this.e;
        zh5 zh5Var = m28Var.f() == 0 ? null : (zh5) m28Var.c(i);
        if (zh5Var != null) {
            return zh5Var;
        }
        fj5 fj5Var = this.c;
        if (fj5Var != null) {
            return fj5Var.d(i);
        }
        return null;
    }

    public final Map e() {
        return b.T((LinkedHashMap) this.b.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi5.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Type inference failed for: r15v9, types: [c24, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.vi5 f(defpackage.pa2 r28) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi5.f(pa2):vi5");
    }

    public void h(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, pt6.Navigator);
        js3.o(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(pt6.Navigator_route);
        yb ybVar = this.b;
        if (string == null) {
            ybVar.a = 0;
            ybVar.d = null;
        } else {
            ybVar.getClass();
            if (f88.n0(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            js3.p(strConcat, "uriPattern");
            ArrayList arrayListD = rf0.D((LinkedHashMap) ybVar.e, new xi5(new ti5(strConcat, null, null), 1));
            if (!arrayListD.isEmpty()) {
                StringBuilder sbN = t61.n("Cannot set route \"", string, "\" for destination ");
                sbN.append((wi5) ybVar.b);
                sbN.append(". Following required arguments are missing: ");
                sbN.append(arrayListD);
                throw new IllegalArgumentException(sbN.toString().toString());
            }
            a.a(new pf5(strConcat, 1));
            ybVar.a = strConcat.hashCode();
            ybVar.d = null;
        }
        ybVar.f = string;
        if (typedArrayObtainAttributes.hasValue(pt6.Navigator_android_id)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(pt6.Navigator_android_id, 0);
            ybVar.a = resourceId;
            ybVar.d = null;
            ybVar.d = m91.s(new jc0(context), resourceId);
        }
        this.d = typedArrayObtainAttributes.getText(pt6.Navigator_android_label);
        typedArrayObtainAttributes.recycle();
    }

    public int hashCode() {
        yb ybVar = this.b;
        int i = ybVar.a * 31;
        String str = (String) ybVar.f;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (ti5 ti5Var : (ArrayList) ybVar.c) {
            int i2 = iHashCode * 31;
            String str2 = ti5Var.a;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = ti5Var.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = ti5Var.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        m28 m28Var = this.e;
        js3.p(m28Var, "<this>");
        int i3 = 0;
        while (true) {
            if (!(i3 < m28Var.f())) {
                break;
            }
            int i4 = i3 + 1;
            zh5 zh5Var = (zh5) m28Var.g(i3);
            int i5 = ((iHashCode * 31) + zh5Var.a) * 31;
            lj5 lj5Var = zh5Var.b;
            iHashCode = i5 + (lj5Var != null ? lj5Var.hashCode() : 0);
            Bundle bundle = zh5Var.c;
            if (bundle != null) {
                iHashCode = a27.c(bundle) + (iHashCode * 31);
            }
            i3 = i4;
        }
        for (String str5 : e().keySet()) {
            int iK = rm7.k(str5, iHashCode * 31, 31);
            Object obj = e().get(str5);
            iHashCode = iK + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, zh5 zh5Var) {
        if (!(this instanceof l7)) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.e.e(i, zh5Var);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        yb ybVar = this.b;
        String str = (String) ybVar.d;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(ybVar.a));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = (String) ybVar.f;
        if (str2 != null && !f88.n0(str2)) {
            sb.append(" route=");
            sb.append((String) ybVar.f);
        }
        if (this.d != null) {
            sb.append(" label=");
            sb.append(this.d);
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
