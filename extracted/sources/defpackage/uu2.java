package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.GradientType;

/* JADX INFO: loaded from: classes.dex */
public final class uu2 implements l41 {
    public final GradientType a;
    public final Path.FillType b;
    public final bj c;
    public final bj d;
    public final bj e;
    public final bj f;
    public final String g;
    public final boolean h;

    public uu2(String str, GradientType gradientType, Path.FillType fillType, bj bjVar, bj bjVar2, bj bjVar3, bj bjVar4, boolean z) {
        this.a = gradientType;
        this.b = fillType;
        this.c = bjVar;
        this.d = bjVar2;
        this.e = bjVar3;
        this.f = bjVar4;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.l41
    public final r31 a(b bVar, gf4 gf4Var, t70 t70Var) {
        return new vu2(bVar, gf4Var, t70Var, this);
    }
}
