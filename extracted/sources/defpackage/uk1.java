package defpackage;

import android.os.Binder;

/* JADX INFO: loaded from: classes3.dex */
public final class uk1 extends t0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Binder j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk1(Binder binder, int i, String str, String str2, int i2) {
        super(2);
        this.f = i2;
        this.j = binder;
        this.g = i;
        this.h = str;
        this.i = str2;
    }

    @Override // defpackage.t0
    public final void o(final t0 t0Var, Object[] objArr) {
        switch (this.f) {
            case 0:
                ((vk1) this.j).n.x0(this.g, new sk1(t0Var, 2), this.h, this.i);
                break;
            default:
                final fk3 fk3Var = (fk3) this.j;
                vp7 vp7Var = fk3Var.n;
                final int i = this.g;
                final String str = this.h;
                final String str2 = this.i;
                vp7Var.w(i, str, str2, new sp2() { // from class: ck3
                    @Override // defpackage.sp2
                    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                        Integer num = (Integer) obj;
                        int iIntValue = num.intValue();
                        String str3 = (String) obj2;
                        String str4 = (String) obj3;
                        String str5 = (String) obj4;
                        js3.p(str3, "suffix");
                        js3.p(str4, "message");
                        js3.p(str5, "host");
                        t0Var.D(num);
                        fk3Var.o.k0(i, iIntValue, str3, str, str2, str4, str5);
                        return tx8.a;
                    }
                });
                break;
        }
    }
}
