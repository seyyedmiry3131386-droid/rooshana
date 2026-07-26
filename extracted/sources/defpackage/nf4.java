package defpackage;

import com.airbnb.lottie.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nf4 implements wf4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ String c;

    public /* synthetic */ nf4(b bVar, String str, int i) {
        this.a = i;
        this.b = bVar;
        this.c = str;
    }

    @Override // defpackage.wf4
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t(this.c);
                break;
            case 1:
                this.b.r(this.c);
                break;
            default:
                this.b.x(this.c);
                break;
        }
    }
}
