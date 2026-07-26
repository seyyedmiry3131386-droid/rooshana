package defpackage;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.o;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hn6 {
    public static final hn6 c = new hn6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ca7 a = new ca7(2);

    public final hf7 a(Class cls) {
        hf7 hf7VarY;
        Class cls2;
        ur3.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        hf7 hf7Var = (hf7) concurrentHashMap.get(cls);
        if (hf7Var != null) {
            return hf7Var;
        }
        ca7 ca7Var = this.a;
        ca7Var.getClass();
        Class cls3 = l.a;
        if (!f.class.isAssignableFrom(cls) && (cls2 = l.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        iv6 iv6VarA = ((xg4) ca7Var.b).a(cls);
        int i = iv6VarA.d;
        a aVar = iv6VarA.a;
        if ((i & 2) == 2) {
            if (f.class.isAssignableFrom(cls)) {
                hf7VarY = new i(l.c, m72.a, aVar);
            } else {
                m mVar = l.b;
                k72 k72Var = m72.b;
                if (k72Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                hf7VarY = new i(mVar, k72Var, aVar);
            }
        } else if (f.class.isAssignableFrom(cls)) {
            k72 k72Var2 = null;
            hn5 hn5Var = jn5.b;
            u84 u84Var = v84.b;
            o oVar = l.c;
            if (iv6VarA.a().ordinal() != 1) {
                k72Var2 = m72.a;
            }
            k72 k72Var3 = k72Var2;
            lh4 lh4Var = nh4.b;
            if (!(iv6VarA instanceof iv6)) {
                int[] iArr = h.n;
                iv6VarA.getClass();
                throw new ClassCastException();
            }
            hf7VarY = h.y(iv6VarA, hn5Var, u84Var, oVar, k72Var3, lh4Var);
        } else {
            k72 k72Var4 = null;
            hn5 hn5Var2 = jn5.a;
            u84 u84Var2 = v84.a;
            m mVar2 = l.b;
            if (iv6VarA.a().ordinal() != 1 && (k72Var4 = m72.b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            k72 k72Var5 = k72Var4;
            lh4 lh4Var2 = nh4.a;
            if (!(iv6VarA instanceof iv6)) {
                int[] iArr2 = h.n;
                iv6VarA.getClass();
                throw new ClassCastException();
            }
            hf7VarY = h.y(iv6VarA, hn5Var2, u84Var2, mVar2, k72Var5, lh4Var2);
        }
        hf7 hf7Var2 = (hf7) concurrentHashMap.putIfAbsent(cls, hf7VarY);
        return hf7Var2 != null ? hf7Var2 : hf7VarY;
    }
}
