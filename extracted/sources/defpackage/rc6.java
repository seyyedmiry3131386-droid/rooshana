package defpackage;

import ir.myket.player.provider.PlayerActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class rc6 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerActivity b;

    public /* synthetic */ rc6(PlayerActivity playerActivity, int i) {
        this.a = i;
        this.b = playerActivity;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return at2.c0(this.b).b(g27.a(dl5.class), null, null);
            case 1:
                return at2.c0(this.b).b(g27.a(wc6.class), null, null);
            default:
                return at2.c0(this.b).b(g27.a(de6.class), null, null);
        }
    }
}
