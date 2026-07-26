package defpackage;

import android.content.Context;
import ir.myket.movie.common.domain.models.SampleWatch;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uc7 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ SampleWatch c;

    public /* synthetic */ uc7(Context context, SampleWatch sampleWatch, int i) {
        this.a = i;
        this.b = context;
        this.c = sampleWatch;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                vy2.N(this.b, this.c);
                break;
            case 1:
                vy2.N(this.b, this.c);
                break;
            default:
                vy2.N(this.b, this.c);
                break;
        }
        return tx8.a;
    }
}
