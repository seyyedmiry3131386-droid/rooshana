package defpackage;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m00(Object obj, int i, long j, long j2, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                b62 b62Var = ((n00) obj).c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                final be beVarA0 = hd1Var.a0();
                final int i2 = this.b;
                final long j = this.c;
                final long j2 = this.d;
                hd1Var.b0(beVarA0, 1011, new q94() { // from class: cd1
                    @Override // defpackage.q94
                    public final void invoke(Object obj2) {
                        ((ce) obj2).G(beVarA0, i2, j, j2);
                    }
                });
                break;
            default:
                hd1 hd1Var2 = ((h50) obj).b;
                on onVar = hd1Var2.d;
                be beVarX = hd1Var2.X(((ImmutableList) onVar.b).isEmpty() ? null : (ks4) tv8.q((ImmutableList) onVar.b));
                hd1Var2.b0(beVarX, 1006, new zc1(beVarX, this.b, this.c, this.d));
                break;
        }
    }
}
