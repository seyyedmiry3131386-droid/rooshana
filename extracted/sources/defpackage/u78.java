package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u78 implements hl {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof u78) {
            return js3.i(this.a, ((u78) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rm7.m(')', "StringAnnotation(value=", this.a);
    }
}
