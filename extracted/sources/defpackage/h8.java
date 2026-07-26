package defpackage;

import androidx.compose.foundation.text.c;
import androidx.compose.foundation.text.selection.f;
import ir.myket.movie.common.domain.models.SampleWatch;
import ir.myket.player.ui.client.ad.components.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h8 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h8(Object obj, boolean z, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(1);
                a.f((m8) this.c, this.b, (qz0) obj, iW);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iW2 = hs9.W(1);
                c.c((f) this.c, this.b, (qz0) obj, iW2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW3 = hs9.W(1);
                sy7.e(this.b, (SampleWatch) this.c, (qz0) obj, iW3);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ h8(boolean z, SampleWatch sampleWatch, int i) {
        this.a = 2;
        this.b = z;
        this.c = sampleWatch;
    }
}
