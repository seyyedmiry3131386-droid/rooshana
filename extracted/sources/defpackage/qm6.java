package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qm6 {
    public final int a;
    public final boolean b;

    public qm6(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qm6.class != obj.getClass()) {
            return false;
        }
        qm6 qm6Var = (qm6) obj;
        return this.a == qm6Var.a && this.b == qm6Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
