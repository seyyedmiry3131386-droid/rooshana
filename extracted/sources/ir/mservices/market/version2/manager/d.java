package ir.mservices.market.version2.manager;

import defpackage.at2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.d9;
import defpackage.e51;
import defpackage.f9;
import defpackage.gb8;
import defpackage.gf2;
import defpackage.h85;
import defpackage.i25;
import defpackage.i30;
import defpackage.j85;
import defpackage.ja1;
import defpackage.js3;
import defpackage.kf1;
import defpackage.mz3;
import defpackage.n85;
import defpackage.pz3;
import defpackage.sr2;
import defpackage.sr4;
import defpackage.u45;
import defpackage.ug1;
import defpackage.up1;
import defpackage.v45;
import defpackage.w45;
import defpackage.x45;
import defpackage.yg2;
import ir.mservices.market.version2.model.MovieWatchProgressModel;
import ir.myket.movie.common.model.repositories.MovieWatchProgressRepositoryImpl$getAllMovieWatchProgress$$inlined$safeDbFlow$default$2;
import ir.myket.movie.common.model.repositories.MovieWatchProgressRepositoryImpl$getAllMovieWatchProgress$$inlined$safeDbFlow$default$3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements pz3 {
    public final j85 a;
    public final e51 b;
    public final Object c;
    public final Object d;
    public final ArrayList e;
    public final l f;

    public d(j85 j85Var) {
        js3.p(j85Var, "oldMovieWatchProgressDao");
        this.a = j85Var;
        ug1 ug1Var = up1.a;
        kf1 kf1Var = kf1.c;
        e51 e51VarA = js3.a(kf1Var);
        this.b = e51VarA;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.a;
        this.c = kotlin.a.b(lazyThreadSafetyMode, new i30(this, 13));
        c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new i30(this, 14));
        this.d = c24VarB;
        this.e = new ArrayList();
        this.f = ja1.b(EmptyList.a);
        sr2 sr2Var = (sr2) c24VarB.getValue();
        sr2Var.getClass();
        androidx.room.d dVar = ((n85) sr2Var.v).a.a;
        i25 i25Var = new i25(5);
        f9 f9Var = new f9(kotlinx.coroutines.flow.d.d(dVar.d().a((String[]) Arrays.copyOf(new String[]{"movie_watch_progress"}, 1)), -1), dVar, i25Var, 1);
        kotlinx.coroutines.flow.d.v(new gf2(kotlinx.coroutines.flow.d.t(new gf2(new gf2(new d9(6, new d9(7, f9Var)), new MovieWatchProgressRepositoryImpl$getAllMovieWatchProgress$$inlined$safeDbFlow$default$2(3, null), 1), new MovieWatchProgressRepositoryImpl$getAllMovieWatchProgress$$inlined$safeDbFlow$default$3(2, null)), kf1Var), new MovieProgressManager$1(this, null), 4), e51VarA);
        final ArrayList arrayList = new ArrayList();
        j85Var.r(new gb8() { // from class: ir.mservices.market.version2.manager.c
            @Override // defpackage.gb8
            public final void onSuccess(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                List listJ0 = kotlin.collections.a.J0(list, new yg2(28));
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listJ0) {
                    if (hashSet.add(((MovieWatchProgressModel) obj2).c())) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = arrayList;
                arrayList3.addAll(arrayList2);
                d dVar2 = this;
                bt2.G(dVar2.b, null, null, new MovieProgressManager$performWatchProgressMigration$1$1(dVar2, arrayList3, null), 3);
            }
        }, new sr4(29), this);
    }

    public final x45 a(String str) {
        Object next;
        js3.p(str, "movieId");
        Iterator it = kotlin.collections.a.J0(this.e, new yg2(27)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (js3.i(((h85) next).b, str)) {
                break;
            }
        }
        h85 h85Var = (h85) next;
        v45 v45Var = v45.b;
        if (h85Var == null) {
            return v45Var;
        }
        int iA = h85Var.a();
        return (1 > iA || iA >= 95) ? iA > 94 ? u45.b : v45Var : new w45(iA);
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }
}
