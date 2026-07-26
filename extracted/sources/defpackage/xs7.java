package defpackage;

import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xs7 implements l41 {
    public final String a;
    public final cj b;
    public final ArrayList c;
    public final bj d;
    public final bj e;
    public final cj f;
    public final ShapeStroke$LineCapType g;
    public final ShapeStroke$LineJoinType h;
    public final float i;
    public final boolean j;

    public xs7(String str, cj cjVar, ArrayList arrayList, bj bjVar, bj bjVar2, cj cjVar2, ShapeStroke$LineCapType shapeStroke$LineCapType, ShapeStroke$LineJoinType shapeStroke$LineJoinType, float f, boolean z) {
        this.a = str;
        this.b = cjVar;
        this.c = arrayList;
        this.d = bjVar;
        this.e = bjVar2;
        this.f = cjVar2;
        this.g = shapeStroke$LineCapType;
        this.h = shapeStroke$LineJoinType;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.l41
    public final r31 a(b bVar, gf4 gf4Var, t70 t70Var) {
        return new r88(bVar, t70Var, this);
    }
}
