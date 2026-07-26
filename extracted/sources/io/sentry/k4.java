package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k4 {
    public io.sentry.protocol.v a;
    public final io.sentry.protocol.e b;
    public io.sentry.protocol.t c;
    public io.sentry.protocol.q d;
    public AbstractMap e;
    public String f;
    public String g;
    public String h;
    public io.sentry.protocol.g0 i;
    public transient Throwable j;
    public String k;
    public String l;
    public List m;
    public io.sentry.protocol.f n;
    public AbstractMap o;

    public k4(io.sentry.protocol.v vVar) {
        this.b = new io.sentry.protocol.e();
        this.a = vVar;
    }

    public final Throwable a() {
        Throwable th = this.j;
        return th instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th).b : th;
    }

    public final void b(String str, String str2) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 != null) {
            this.e.put(str, str2);
            return;
        }
        AbstractMap abstractMap = this.e;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public final void c(HashMap map) {
        this.e = new HashMap(map);
    }

    public k4() {
        this(new io.sentry.protocol.v());
    }
}
