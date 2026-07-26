package kotlin;

import defpackage.js3;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final Result.Failure a(Throwable th) {
        js3.p(th, "exception");
        return new Result.Failure(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).a;
        }
    }
}
