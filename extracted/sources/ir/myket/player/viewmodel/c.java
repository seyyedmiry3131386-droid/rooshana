package ir.myket.player.viewmodel;

import defpackage.as2;
import defpackage.d9;
import defpackage.f9;
import defpackage.fu0;
import defpackage.g27;
import defpackage.js3;
import defpackage.lw5;
import defpackage.m6;
import defpackage.ml9;
import defpackage.o4;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.xp;
import defpackage.y97;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.k;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends m6 {
    public final rv6 d;
    public final rv6 e;
    public final rv6 f;

    public c(String str, String str2, String str3, as2 as2Var) {
        js3.p(str, "movieId");
        js3.p(str2, "playId");
        js3.p(str3, "selectedSeasonId");
        f9 f9Var = new f9(new xp(this.c, g27.a(lw5.class), 9), as2Var, str, 3);
        fu0 fu0VarG = y97.G(this);
        k kVarA = ru7.a(2);
        EmptyList emptyList = EmptyList.a;
        rv6 rv6VarA = kotlinx.coroutines.flow.d.A(f9Var, fu0VarG, kVarA, ml9.z(emptyList));
        this.d = rv6VarA;
        rv6 rv6VarA2 = kotlinx.coroutines.flow.d.A(new h(rv6VarA, kotlinx.coroutines.flow.d.A(new d9(8, new o4(this.c, 14)), y97.G(this), ru7.a(2), str3), new OtherEpisodesViewModel$currentSeason$1(str2, null)), y97.G(this), ru7.a(2), null);
        this.e = rv6VarA2;
        this.f = kotlinx.coroutines.flow.d.A(new h(rv6VarA, new o4(rv6VarA2, 9), new OtherEpisodesViewModel$episodes$1(3, null)), y97.G(this), ru7.a(2), ml9.z(emptyList));
        e(lw5.a);
    }
}
