package kotlin;

import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Result<T> implements Serializable {
    public final Object a;

    public static final class Failure implements Serializable {
        public final Throwable a;

        public Failure(Throwable th) {
            js3.p(th, "exception");
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Failure) {
                return js3.i(this.a, ((Failure) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.a + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            return js3.i(this.a, ((Result) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
