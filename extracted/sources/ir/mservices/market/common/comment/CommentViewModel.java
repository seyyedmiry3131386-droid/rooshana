package ir.mservices.market.common.comment;

import defpackage.bt2;
import defpackage.c5;
import defpackage.dp3;
import defpackage.js3;
import defpackage.k79;
import defpackage.pi0;
import defpackage.pv6;
import defpackage.vr2;
import defpackage.vy2;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.version2.services.c;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentViewModel extends k79 {
    public final ir.mservices.market.common.model.a b;
    public final vr2 c;
    public final c5 d;
    public final pi0 e;
    public final dp3 f;
    public final x57 g;
    public final c h;
    public final i i;
    public final pv6 j;
    public final i k;
    public final pv6 l;
    public final i m;
    public final pv6 n;
    public final i o;
    public final pv6 p;

    public CommentViewModel(ir.mservices.market.common.model.a aVar, vr2 vr2Var, c5 c5Var, pi0 pi0Var, dp3 dp3Var, x57 x57Var, c cVar) {
        js3.p(aVar, "submitCommentRepository");
        js3.p(c5Var, "accountManager");
        js3.p(pi0Var, "buzzManager");
        js3.p(dp3Var, "installManager");
        js3.p(x57Var, "requestProxy");
        js3.p(cVar, "appService");
        this.b = aVar;
        this.c = vr2Var;
        this.d = c5Var;
        this.e = pi0Var;
        this.f = dp3Var;
        this.g = x57Var;
        this.h = cVar;
        i iVarE = vy2.e(0, 7, null);
        this.i = iVarE;
        this.j = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.k = iVarE2;
        this.l = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.m = iVarE3;
        this.n = new pv6(iVarE3);
        i iVarE4 = vy2.e(0, 7, null);
        this.o = iVarE4;
        this.p = new pv6(iVarE4);
    }

    @Override // defpackage.k79
    public final void d() {
        this.g.a(this);
    }

    public final void e(String str, int i, String str2, String str3) {
        js3.p(str, "packageName");
        js3.p(str2, "source");
        bt2.G(y97.G(this), null, null, new CommentViewModel$addNewComment$1(this, str, str2, i, str3, null), 3);
    }

    public final void f(String str, String str2, String str3) {
        js3.p(str, "packageName");
        js3.p(str2, "reviewId");
        bt2.G(y97.G(this), null, null, new CommentViewModel$addSubComment$1(this, str, str2, str3, null), 3);
    }

    public final void g(String str) {
        bt2.G(y97.G(this), null, null, new CommentViewModel$cancelCommentFlow$1(this, str, null), 3);
    }
}
