package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t17 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static final int b(Bundle bundle, String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        z17.f(str);
        throw null;
    }

    public static final Bundle c(Bundle bundle, String str) {
        js3.p(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        z17.f(str);
        throw null;
    }

    public static final ArrayList d(Bundle bundle, String str) {
        js3.p(str, "key");
        ArrayList arrayListG = Build.VERSION.SDK_INT >= 34 ? q3.g(bundle, str, yh0.u(g27.a(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (arrayListG != null) {
            return arrayListG;
        }
        z17.f(str);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.xj8 e(ir.myket.persistent.datasource.a r6) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t17.e(ir.myket.persistent.datasource.a):xj8");
    }

    public static final void f(in7 in7Var) {
        y40.H(in7Var).S();
    }

    public static final boolean g(Bundle bundle, String str) {
        js3.p(str, "key");
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final w79 h(qz0 qz0Var) {
        x79 x79VarA = uc4.a(qz0Var);
        if (x79VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        Object obj = (Activity) qz0Var.j(mb4.a);
        boolean zH = qz0Var.h(obj);
        Object objM = qz0Var.M();
        Object obj2 = jz0.a;
        if (zH || objM == obj2) {
            objM = new yu7(12, obj);
            qz0Var.l0(objM);
        }
        bp2 bp2Var = (bp2) objM;
        Object objK = g.k(bp2Var, qz0Var);
        boolean zF = qz0Var.f(objK) | qz0Var.f(x79VarA);
        Object objM2 = qz0Var.M();
        if (zF || objM2 == obj2) {
            u79 u79VarM = x79VarA.m();
            objM2 = new w79(new nr8(bp2Var, u79VarM, 7), new a(-1481256515, new va(15, u79VarM), true));
            qz0Var.l0(objM2);
        }
        return (w79) objM2;
    }

    public static kt8 i(kt8 kt8Var, String[] strArr, Map map) {
        int i = 0;
        if (kt8Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (kt8) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                kt8 kt8Var2 = new kt8();
                int length = strArr.length;
                while (i < length) {
                    kt8Var2.a((kt8) map.get(strArr[i]));
                    i++;
                }
                return kt8Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                kt8Var.a((kt8) map.get(strArr[0]));
                return kt8Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    kt8Var.a((kt8) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return kt8Var;
    }

    public static sk6 j(AbstractSafeParcelable abstractSafeParcelable) {
        return new sk6(abstractSafeParcelable.getClass().getSimpleName());
    }

    public abstract void a();
}
