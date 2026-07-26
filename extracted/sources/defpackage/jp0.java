package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jp0 {
    public static final ip0 b = new ip0();
    public final Object a;

    public /* synthetic */ jp0(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        hp0 hp0Var = obj instanceof hp0 ? (hp0) obj : null;
        if (hp0Var != null) {
            return hp0Var.a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof ip0) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jp0) {
            return js3.i(this.a, ((jp0) obj).a);
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
        if (obj instanceof hp0) {
            return ((hp0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
