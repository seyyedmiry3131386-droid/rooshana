package defpackage;

import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.os.Build;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public abstract class x81 extends y97 {
    public final CustomAudienceManager s;

    public x81(CustomAudienceManager customAudienceManager) {
        this.s = customAudienceManager;
    }

    public static Object h0(x81 x81Var, sa2 sa2Var, g51<? super tx8> g51Var) {
        if ((Build.VERSION.SDK_INT >= 33 ? rb.a.a() : 0) < 10) {
            int i = Build.VERSION.SDK_INT;
            if (((i == 31 || i == 32) ? qb.a.a() : 0) < 10) {
                throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
            }
        }
        Object objA = dt2.i.a(x81Var.s, sa2Var, g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }

    public static Object j0(x81 x81Var, ju3 ju3Var, g51<? super tx8> g51Var) {
        new om0(1, ok4.I(g51Var)).v();
        CustomAudienceManager customAudienceManager = x81Var.s;
        new JoinCustomAudienceRequest.Builder();
        throw null;
    }

    public static Object l0(x81 x81Var, n44 n44Var, g51<? super tx8> g51Var) {
        new om0(1, ok4.I(g51Var)).v();
        CustomAudienceManager customAudienceManager = x81Var.s;
        new LeaveCustomAudienceRequest.Builder();
        throw null;
    }

    public Object g0(sa2 sa2Var, g51<? super tx8> g51Var) {
        return h0(this, sa2Var, g51Var);
    }

    public Object i0(ju3 ju3Var, g51<? super tx8> g51Var) {
        return j0(this, ju3Var, g51Var);
    }

    public Object k0(n44 n44Var, g51<? super tx8> g51Var) {
        return l0(this, n44Var, g51Var);
    }
}
