package defpackage;

import androidx.media3.session.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jo4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ jo4(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a aVar = this.b;
                if (!aVar.k && ((androidx.media3.session.legacy.a) aVar.i.b).e.a() == null) {
                    aVar.u0();
                    break;
                }
                break;
            default:
                a aVar2 = this.b;
                ql4 ql4Var = new ql4(aVar2.a, aVar2.c.a.c(), new mo4(aVar2), aVar2.b.c.j0());
                aVar2.j = ql4Var;
                ((ml4) ql4Var.b).b.connect();
                break;
        }
    }
}
