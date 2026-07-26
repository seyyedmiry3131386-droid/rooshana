package defpackage;

import android.content.Context;
import android.os.Bundle;
import ir.myket.player.domain.models.PlayerMovieData;
import kotlinx.coroutines.android.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class sq4 {
    public final Context a;
    public qn4 b;
    public gn4 c;
    public final l d;
    public final rv6 e;
    public final l f;
    public final rv6 g;
    public final e51 h;
    public li1 i;
    public final c24 j;

    public sq4(Context context) {
        this.a = context;
        l lVarB = ja1.b(null);
        this.d = lVarB;
        this.e = new rv6(lVarB);
        l lVarB2 = ja1.b(null);
        this.f = lVarB2;
        this.g = new rv6(lVarB2);
        ug1 ug1Var = up1.a;
        a aVar = sg4.a;
        ub8 ub8VarA = a27.a();
        aVar.getClass();
        this.h = js3.a(bt2.L(aVar, ub8VarA));
        this.j = kotlin.a.a(new hk3(9, this));
    }

    public final void a() {
        jp4 jp4VarE;
        qp4 qp4Var;
        Bundle bundle;
        PlayerMovieData playerMovieDataT;
        l lVar;
        Object value;
        String str;
        String string;
        String strValueOf;
        CharSequence charSequence;
        gn4 gn4Var = this.c;
        if (gn4Var == null || (jp4VarE = gn4Var.E()) == null || (bundle = (qp4Var = jp4VarE.d).I) == null || (playerMovieDataT = gu9.t(bundle)) == null) {
            return;
        }
        do {
            lVar = this.f;
            value = lVar.getValue();
            str = jp4VarE.a;
            js3.o(str, "mediaId");
            CharSequence charSequence2 = qp4Var.a;
            string = charSequence2 != null ? charSequence2.toString() : null;
            strValueOf = String.valueOf(qp4Var.m);
            charSequence = qp4Var.b;
        } while (!lVar.n(value, new kp4(str, string, charSequence != null ? charSequence.toString() : null, strValueOf, playerMovieDataT)));
    }

    public final void b() {
        l lVar;
        Object value;
        String str;
        gn4 gn4Var = this.c;
        if (gn4Var == null) {
            return;
        }
        boolean zH = gn4Var.H();
        long jD0 = gn4Var.d0();
        long duration = gn4Var.getDuration();
        if (duration < 0) {
            duration = 0;
        }
        do {
            lVar = this.d;
            value = lVar.getValue();
            jp4 jp4VarE = gn4Var.E();
            str = jp4VarE != null ? jp4VarE.a : null;
            if (str == null) {
                str = "";
            }
        } while (!lVar.n(value, new dq4((int) jD0, (int) duration, str, zH)));
    }
}
