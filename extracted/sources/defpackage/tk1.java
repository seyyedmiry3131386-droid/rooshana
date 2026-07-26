package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tk1 extends t0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ vk1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk1(vk1 vk1Var, int i, String str, int i2) {
        super(2);
        this.f = i2;
        this.g = vk1Var;
        this.h = i;
        this.i = str;
    }

    @Override // defpackage.t0
    public final void o(t0 t0Var, Object[] objArr) {
        switch (this.f) {
            case 0:
                this.g.n.L(this.h, this.i, new sk1(t0Var, 0));
                break;
            default:
                this.g.n.i0(this.h, this.i, new sk1(t0Var, 1));
                break;
        }
    }
}
