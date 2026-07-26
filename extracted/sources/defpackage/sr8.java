package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sr8 implements Cloneable {
    public lr8 a = ao5.b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sr8 clone() {
        try {
            return (sr8) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof sr8) {
            return i29.b(this.a, ((sr8) obj).a);
        }
        return false;
    }

    public int hashCode() {
        lr8 lr8Var = this.a;
        if (lr8Var != null) {
            return lr8Var.hashCode();
        }
        return 0;
    }
}
