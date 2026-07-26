package ir.mservices.market.viewModel;

import defpackage.a77;
import defpackage.br9;
import defpackage.bt2;
import defpackage.ja1;
import defpackage.js3;
import defpackage.k79;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.sg4;
import defpackage.vy2;
import defpackage.x57;
import defpackage.xe2;
import defpackage.xp;
import defpackage.y97;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public class c extends k79 {
    public final boolean b;
    public x57 c;
    public final l d;
    public final rv6 e;
    public final l f;
    public final rv6 g;
    public final i h;
    public final pv6 i;
    public final pv6 j;
    public boolean k;
    public final i l;
    public final pv6 m;
    public final l n;
    public final rv6 o;
    public final l p;
    public final l q;
    public final i r;
    public final xe2 s;

    public c() {
        this(true);
    }

    @Override // defpackage.k79
    public void d() {
        h().a(this);
    }

    public void e() {
        throw new NotImplementedError("An operation is not implemented: this method should implement with child");
    }

    public final void f(String str) {
        bt2.G(y97.G(this), null, null, new BaseViewModel$errorExecuted$1(this, str, null), 3);
    }

    public final void g(br9... br9VarArr) {
        p(new BaseViewModel$execute$1(br9VarArr, null));
    }

    public final x57 h() {
        x57 x57Var = this.c;
        if (x57Var != null) {
            return x57Var;
        }
        js3.V("requestProxy");
        throw null;
    }

    public final void i() {
        bt2.G(y97.G(this), null, null, new BaseViewModel$refreshAdapter$1(this, null), 3);
    }

    public final void k(String str) {
        l lVar;
        Object value;
        js3.p(str, "id");
        do {
            lVar = this.p;
            value = lVar.getValue();
        } while (!lVar.n(value, a77.n((Set) value, str)));
    }

    public final void l(boolean z) {
        if (z && this.d.getValue() == null) {
            e();
            l(false);
        }
    }

    public final void m(boolean z) {
        bt2.G(y97.G(this), null, null, new BaseViewModel$setDataRefreshing$1(this, z, null), 3);
    }

    public final void o(String str) {
        this.f.o(str);
    }

    public final void p(qp2 qp2Var) {
        bt2.G(y97.G(this), null, null, new BaseViewModel$setRecyclerItems$1(qp2Var, this, null), 3);
    }

    public final void q(boolean z) {
        l lVar;
        Object value;
        do {
            lVar = this.n;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(z)));
    }

    public c(boolean z) {
        this.b = z;
        l lVarB = ja1.b(null);
        this.d = lVarB;
        this.e = d.A(new xp(lVarB, this, 4), y97.G(this), ru7.a(2), null);
        l lVarB2 = ja1.b(null);
        this.f = lVarB2;
        this.g = new rv6(lVarB2);
        i iVarE = vy2.e(0, 7, null);
        this.h = iVarE;
        this.i = new pv6(iVarE);
        this.j = new pv6(vy2.e(0, 7, null));
        i iVarE2 = vy2.e(0, 7, null);
        this.l = iVarE2;
        this.m = new pv6(iVarE2);
        l lVarB3 = ja1.b(Boolean.FALSE);
        this.n = lVarB3;
        this.o = new rv6(lVarB3);
        this.p = ja1.b(EmptySet.a);
        this.q = ja1.b(kotlin.collections.b.I());
        i iVarE3 = vy2.e(0, 7, null);
        this.r = iVarE3;
        this.s = d.i(new pv6(iVarE3));
        bt2.G(y97.G(this), sg4.a, null, new BaseViewModel$1(this, null), 2);
    }
}
