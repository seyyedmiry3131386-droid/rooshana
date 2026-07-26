package defpackage;

import com.google.protobuf.o;
import com.google.protobuf.q;
import com.google.protobuf.r;
import com.google.protobuf.u;
import com.google.protobuf.v;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class gn6 {
    public static final gn6 c = new gn6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final pj9 a = new pj9(1);

    public final gf7 a(Class cls) {
        gf7 gf7VarA;
        Class cls2;
        tr3.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        gf7 gf7Var = (gf7) concurrentHashMap.get(cls);
        if (gf7Var != null) {
            return gf7Var;
        }
        pj9 pj9Var = this.a;
        pj9Var.getClass();
        Class cls3 = u.a;
        if (!o.class.isAssignableFrom(cls) && (cls2 = u.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        hv6 hv6VarA = ((wg4) pj9Var.a).a(cls);
        int i = hv6VarA.d;
        ev4 ev4Var = hv6VarA.a;
        if ((i & 2) == 2) {
            if (o.class.isAssignableFrom(cls)) {
                gf7VarA = new r(u.c, l72.a, ev4Var);
            } else {
                v vVar = u.b;
                j72 j72Var = l72.b;
                if (j72Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                gf7VarA = new r(vVar, j72Var, ev4Var);
            }
        } else if (o.class.isAssignableFrom(cls)) {
            gf7VarA = hv6VarA.a().ordinal() != 1 ? q.A(hv6VarA, in5.b, t84.b, u.c, l72.a, mh4.b) : q.A(hv6VarA, in5.b, t84.b, u.c, null, mh4.b);
        } else if (hv6VarA.a().ordinal() != 1) {
            gn5 gn5Var = in5.a;
            r84 r84Var = t84.a;
            v vVar2 = u.b;
            j72 j72Var2 = l72.b;
            if (j72Var2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            gf7VarA = q.A(hv6VarA, gn5Var, r84Var, vVar2, j72Var2, mh4.a);
        } else {
            gf7VarA = q.A(hv6VarA, in5.a, t84.a, u.b, null, mh4.a);
        }
        gf7 gf7Var2 = (gf7) concurrentHashMap.putIfAbsent(cls, gf7VarA);
        return gf7Var2 != null ? gf7Var2 : gf7VarA;
    }
}
