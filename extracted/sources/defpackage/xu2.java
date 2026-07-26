package defpackage;

import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xu2 implements l41 {
    public final String a;
    public final GradientType b;
    public final bj c;
    public final bj d;
    public final bj e;
    public final bj f;
    public final cj g;
    public final ShapeStroke$LineCapType h;
    public final ShapeStroke$LineJoinType i;
    public final float j;
    public final ArrayList k;
    public final cj l;
    public final boolean m;

    public xu2(String str, GradientType gradientType, bj bjVar, bj bjVar2, bj bjVar3, bj bjVar4, cj cjVar, ShapeStroke$LineCapType shapeStroke$LineCapType, ShapeStroke$LineJoinType shapeStroke$LineJoinType, float f, ArrayList arrayList, cj cjVar2, boolean z) {
        this.a = str;
        this.b = gradientType;
        this.c = bjVar;
        this.d = bjVar2;
        this.e = bjVar3;
        this.f = bjVar4;
        this.g = cjVar;
        this.h = shapeStroke$LineCapType;
        this.i = shapeStroke$LineJoinType;
        this.j = f;
        this.k = arrayList;
        this.l = cjVar2;
        this.m = z;
    }

    @Override // defpackage.l41
    public final r31 a(b bVar, gf4 gf4Var, t70 t70Var) {
        return new yu2(bVar, t70Var, this);
    }
}
