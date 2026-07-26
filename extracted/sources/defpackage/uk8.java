package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uk8 implements v61 {
    public final ThreadLocal a;

    public uk8(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uk8) && js3.i(this.a, ((uk8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}
