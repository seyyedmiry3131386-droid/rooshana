package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vc0 extends co5 {
    @Override // defpackage.co5
    public final co5 c() {
        return (vc0) this.a;
    }

    @Override // defpackage.co5
    public final void d(co5 co5Var) {
        if (!(co5Var instanceof vc0)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.a = co5Var;
    }
}
