package defpackage;

import com.j256.ormlite.dao.Dao;
import ir.mservices.market.views.BindAutoCompleteView;

/* JADX INFO: loaded from: classes3.dex */
public final class pb0 extends x {
    public final /* synthetic */ int n;
    public final /* synthetic */ qb0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb0(qb0 qb0Var, pj9 pj9Var, ca7 ca7Var, BindAutoCompleteView bindAutoCompleteView, int i) {
        super(qb0Var, pj9Var, ca7Var, true, bindAutoCompleteView);
        this.o = qb0Var;
        this.n = i;
    }

    @Override // defpackage.x
    public final Object f(Object[] objArr) {
        return ((Dao) this.o.a).queryBuilder().where().eq("type", Integer.valueOf(this.n)).query();
    }
}
