package defpackage;

import com.bumptech.glide.request.a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e22 {
    public final a a;
    public final Executor b;

    public e22(a aVar, Executor executor) {
        this.a = aVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e22) {
            return this.a.equals(((e22) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
