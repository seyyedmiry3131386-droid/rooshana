package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.b;

/* JADX INFO: loaded from: classes.dex */
public final class hs7 implements l41 {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final bj d;
    public final bj e;
    public final boolean f;

    public hs7(String str, boolean z, Path.FillType fillType, bj bjVar, bj bjVar2, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = bjVar;
        this.e = bjVar2;
        this.f = z2;
    }

    @Override // defpackage.l41
    public final r31 a(b bVar, gf4 gf4Var, t70 t70Var) {
        return new ec2(bVar, t70Var, this);
    }

    public final String toString() {
        return bl4.A(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
