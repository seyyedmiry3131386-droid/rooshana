package defpackage;

import com.airbnb.lottie.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of4 implements wf4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ int c;

    public /* synthetic */ of4(b bVar, int i, int i2) {
        this.a = i2;
        this.b = bVar;
        this.c = i;
    }

    @Override // defpackage.wf4
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c);
                break;
            case 1:
                this.b.q(this.c);
                break;
            default:
                this.b.w(this.c);
                break;
        }
    }
}
