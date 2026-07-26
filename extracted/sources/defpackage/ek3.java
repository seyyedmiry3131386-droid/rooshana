package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ek3 extends t0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ fk3 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek3(fk3 fk3Var, int i, String str, String str2, Object obj, int i2) {
        super(2);
        this.f = i2;
        this.g = fk3Var;
        this.h = i;
        this.i = str;
        this.j = str2;
        this.k = obj;
    }

    @Override // defpackage.t0
    public final void o(t0 t0Var, Object[] objArr) {
        switch (this.f) {
            case 0:
                fk3 fk3Var = this.g;
                vp7 vp7Var = fk3Var.n;
                int i = this.h;
                String str = this.i;
                String str2 = this.j;
                vp7Var.W(i, str, str2, new dk3(t0Var, fk3Var, i, str, str2, (String) this.k, 0));
                break;
            default:
                fk3 fk3Var2 = this.g;
                vp7 vp7Var2 = fk3Var2.n;
                Bundle bundle = (Bundle) this.k;
                int i2 = this.h;
                String str3 = this.i;
                String str4 = this.j;
                vp7Var2.Y(i2, str3, str4, bundle, new dk3(t0Var, fk3Var2, i2, str3, str4, bundle, 1));
                break;
        }
    }
}
