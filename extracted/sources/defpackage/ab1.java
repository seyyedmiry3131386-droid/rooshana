package defpackage;

import android.content.Context;
import com.google.common.base.b;

/* JADX INFO: loaded from: classes.dex */
public final class ab1 implements oc0 {
    public static final vb8 d = b.d(new ya1(0));
    public final u94 a;
    public final do3 b;
    public final int c;

    public ab1(Context context) {
        u94 u94Var = (u94) d.get();
        vy2.t(u94Var);
        do3 do3Var = new do3(context, 21);
        this.a = u94Var;
        this.b = do3Var;
        this.c = -1;
    }

    @Override // defpackage.oc0
    public final n94 f(byte[] bArr) {
        return ((wx4) this.a).b(new za1(this, bArr, 0));
    }
}
