package defpackage;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.z0;
import ir.mservices.market.movie.analytics.MovieClickEventBuilder;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.recycler.MovieTrailerData;
import ir.mservices.market.movie.ui.detail.recycler.f;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr4 implements hs4, n31, gs4, yp2, og5, h32 {
    public final /* synthetic */ int a;

    public /* synthetic */ sr4(int i) {
        this.a = i;
    }

    @Override // defpackage.gs4
    public void a(qg6 qg6Var, hq4 hq4Var, List list) {
        switch (this.a) {
            case 11:
                qg6Var.i0(list);
                break;
            default:
                qg6Var.i0(list);
                break;
        }
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        qg6 qg6Var = (qg6) obj;
        switch (this.a) {
            case 1:
                qg6Var.b();
                break;
            case 2:
                qg6Var.E0();
                break;
            case 3:
                qg6Var.w0();
                break;
            case 4:
                qg6Var.a0();
                break;
            case 5:
                qg6Var.z();
                break;
            case 6:
                qg6Var.F0();
                break;
            case 7:
            case 10:
            case 11:
            case 13:
            case 14:
            case 16:
            default:
                qg6Var.L0();
                ((o80) qg6Var.a).i0();
                break;
            case 8:
                qg6Var.Y();
                break;
            case 9:
                qg6Var.X();
                break;
            case 12:
                qg6Var.l0();
                break;
            case 15:
                qg6Var.stop();
                break;
            case 17:
                qg6Var.c();
                break;
            case 18:
                qg6Var.t();
                break;
        }
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        switch (this.a) {
            case 24:
                return Long.valueOf(((o81) obj).b);
            case 25:
                return Long.valueOf(((o81) obj).c);
            default:
                return ImmutableList.n(z0.j(new p58(9), ((zp4) obj).n().b));
        }
    }

    @Override // defpackage.hs4
    public Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        switch (this.a) {
            case 0:
                xq4Var.getClass();
                throw new ClassCastException();
            case 7:
                xq4Var.getClass();
                throw new ClassCastException();
            case 10:
                ol3 ol3Var = xq4Var.e;
                xq4Var.t(hq4Var);
                ol3Var.getClass();
                return ja1.y(new bq7(-6));
            case 14:
                xq4Var.getClass();
                throw new ClassCastException();
            case 16:
                xq4Var.getClass();
                throw new ClassCastException();
            case 19:
                xq4Var.getClass();
                throw new ClassCastException();
            case 21:
                xq4Var.getClass();
                throw new ClassCastException();
            default:
                ol3 ol3Var2 = xq4Var.e;
                xq4Var.t(hq4Var);
                ol3Var2.getClass();
                return ja1.y(new bq7(-6));
        }
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        lw.g((SQLException) serializable, "Cannot get all MovieProgressModels from database.", null);
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        f fVar = (f) qg5Var;
        int i = MovieDetailRecyclerListFragment.H1;
        js3.p(view, "<unused var>");
        js3.p(fVar, "viewHolder");
        js3.p((MovieTrailerData) obj, "<unused var>");
        MovieClickEventBuilder movieClickEventBuilder = new MovieClickEventBuilder();
        movieClickEventBuilder.b("detail_trailer");
        movieClickEventBuilder.a();
        fVar.x().w.callOnClick();
    }

    public /* synthetic */ sr4(fv6 fv6Var) {
        this.a = 23;
    }

    public /* synthetic */ sr4(String str, fv6 fv6Var) {
        this.a = 10;
    }
}
