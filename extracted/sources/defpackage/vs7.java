package defpackage;

import com.airbnb.lottie.b;

/* JADX INFO: loaded from: classes.dex */
public final class vs7 implements l41 {
    public final String a;
    public final int b;
    public final bj c;
    public final boolean d;

    public vs7(String str, int i, bj bjVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = bjVar;
        this.d = z;
    }

    @Override // defpackage.l41
    public final r31 a(b bVar, gf4 gf4Var, t70 t70Var) {
        return new cs7(bVar, t70Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return dw1.q(sb, this.b, '}');
    }
}
