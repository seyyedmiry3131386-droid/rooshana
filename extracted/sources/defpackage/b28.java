package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b28 implements AutoCloseable {
    public final ph0 a;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b28) {
            return js3.i(this.a, ((b28) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.a + ')';
    }
}
