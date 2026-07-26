package defpackage;

import ir.myket.player.provider.AudioPlayerActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class jz implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioPlayerActivity b;

    public /* synthetic */ jz(AudioPlayerActivity audioPlayerActivity, int i) {
        this.a = i;
        this.b = audioPlayerActivity;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return at2.c0(this.b).b(g27.a(dl5.class), null, null);
            case 1:
                return at2.c0(this.b).b(g27.a(lz.class), null, null);
            case 2:
                return at2.c0(this.b).b(g27.a(de6.class), null, null);
            default:
                return at2.c0(this.b).b(g27.a(sq4.class), null, null);
        }
    }
}
