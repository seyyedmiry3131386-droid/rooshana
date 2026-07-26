package defpackage;

import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class ft9 {
    public static final ft9 c = new ft9();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ca7 a = new ca7(3);

    public final it9 a(Class cls) {
        it9 it9VarT;
        Charset charset = qs9.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        it9 it9Var = (it9) concurrentHashMap.get(cls);
        if (it9Var != null) {
            return it9Var;
        }
        ca7 ca7Var = this.a;
        ca7Var.getClass();
        vs8 vs8Var = u0.a;
        q0.class.isAssignableFrom(cls);
        ht9 ht9VarP = ((xg5) ca7Var.b).p(cls);
        if ((ht9VarP.d & 2) == 2) {
            vs8 vs8Var2 = u0.a;
            bq8 bq8Var = fs9.a;
            it9VarT = new t0(vs8Var2, ht9VarP.a);
        } else {
            int i = dt9.a;
            int i2 = ss9.a;
            vs8 vs8Var3 = u0.a;
            bq8 bq8Var2 = ht9VarP.a() + (-1) != 1 ? fs9.a : null;
            int i3 = at9.a;
            it9VarT = s0.t(ht9VarP, vs8Var3, bq8Var2);
        }
        it9 it9Var2 = (it9) concurrentHashMap.putIfAbsent(cls, it9VarT);
        return it9Var2 != null ? it9Var2 : it9VarT;
    }
}
