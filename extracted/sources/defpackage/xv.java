package defpackage;

import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xv {
    public static final int a;

    static {
        Object objA;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objA = property != null ? m88.a0(property) : null;
        } catch (Throwable th) {
            objA = b.a(th);
        }
        Integer num = (Integer) (objA instanceof Result.Failure ? null : objA);
        a = num != null ? num.intValue() : 2097152;
    }
}
