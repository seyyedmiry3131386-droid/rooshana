package defpackage;

import com.airbnb.lottie.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pa7 implements o70, r31 {
    public final b a;
    public final s70 b;
    public ds7 c;

    public pa7(b bVar, t70 t70Var, oa7 oa7Var) {
        this.a = bVar;
        s70 s70VarA = oa7Var.a.a();
        this.b = s70VarA;
        t70Var.e(s70VarA);
        s70VarA.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.o70
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
    }
}
