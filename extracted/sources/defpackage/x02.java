package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x02 implements gm3 {
    public final boolean a;

    public x02(boolean z) {
        this.a = z;
    }

    @Override // defpackage.gm3
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.gm3
    public final io5 d() {
        return null;
    }

    public final String toString() {
        return bl4.y(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
