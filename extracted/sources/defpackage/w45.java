package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w45 extends x45 {
    public final int b;

    public w45(int i) {
        super(i);
        this.b = i;
    }

    @Override // defpackage.x45
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w45) && this.b == ((w45) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return bl4.q(this.b, "Watching(progress=", ")");
    }
}
