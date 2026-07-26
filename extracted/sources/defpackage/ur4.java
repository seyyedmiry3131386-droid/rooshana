package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableMap;
import io.sentry.a1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.internal.gestures.f;
import io.sentry.android.core.j1;
import io.sentry.android.core.p1;
import io.sentry.c2;
import io.sentry.e2;
import io.sentry.h6;
import io.sentry.instrumentation.file.a;
import io.sentry.instrumentation.file.d;
import io.sentry.instrumentation.file.e;
import io.sentry.m1;
import io.sentry.w1;
import io.sentry.x3;
import io.sentry.z3;
import ir.mservices.market.app.suggest.detail.recycler.PlayScreenshotData;
import ir.mservices.market.app.suggest.detail.recycler.PlayScreenshots;
import ir.mservices.market.app.suggest.detail.recycler.b;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.movie.ui.detail.list.MovieDetailMoreListRecyclerListFragment;
import ir.mservices.market.movie.ui.list.MovieMoreRecyclerListFragment;
import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.myAccount.MyAccountRecyclerListFragment;
import ir.mservices.market.myAccount.recycler.MyAccountCheckBoxData;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.reels.ui.recycler.ReelAdData;
import ir.mservices.market.version2.webapi.responsedto.VersionDescriptionDTO;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur4 implements n31, hs4, og5, gb8, lv7, h51, ob7, nd8, w1, x3, z3, j1, a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ur4(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.sentry.android.core.j1
    public void a() {
        p1 p1Var = (p1) this.b;
        Activity activity2 = (Activity) ((WeakReference) this.c).get();
        if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
            return;
        }
        activity2.runOnUiThread(new r59(p1Var, activity2, 9));
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                is4 is4Var = (is4) this.b;
                hp8 hp8VarB = (hp8) this.c;
                qg6 qg6Var = (qg6) obj;
                ImmutableMap immutableMap = hp8VarB.D;
                if (!immutableMap.isEmpty()) {
                    gp8 gp8VarC = hp8VarB.a().c();
                    zx8 it = immutableMap.values().iterator();
                    while (it.hasNext()) {
                        ep8 ep8Var = (ep8) it.next();
                        yo8 yo8Var = (yo8) is4Var.q.y().get(ep8Var.a.b);
                        if (yo8Var == null || ep8Var.a.a != yo8Var.a) {
                            gp8VarC.a(ep8Var);
                        } else {
                            gp8VarC.a(new ep8(yo8Var, ep8Var.b));
                        }
                    }
                    hp8VarB = gp8VarC.b();
                }
                qg6Var.w(hp8VarB);
                break;
            case 1:
            default:
                pg pgVar = (pg) this.b;
                ((ps4) obj).f(pgVar.b, (ks4) pgVar.c, (op4) this.c);
                break;
            case 2:
                is4 is4Var2 = (is4) this.b;
                hq4 hq4Var = (hq4) this.c;
                xq4 xq4Var = (xq4) is4Var2.n.get();
                if (xq4Var != null && !xq4Var.j()) {
                    xq4Var.g(hq4Var, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ob7
    public Object apply(Object obj) {
        qb7 qb7Var = (qb7) this.b;
        d30 d30Var = (d30) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        m20 m20Var = qb7Var.d;
        ArrayList arrayListK = qb7Var.k(sQLiteDatabase, d30Var, m20Var.b);
        for (Priority priority : Priority.values()) {
            if (priority != d30Var.c) {
                int size = m20Var.b - arrayListK.size();
                if (size <= 0) {
                    break;
                }
                wv8 wv8VarA = d30.a();
                wv8VarA.L(d30Var.a);
                if (priority == null) {
                    throw new NullPointerException("Null priority");
                }
                wv8VarA.d = priority;
                wv8VarA.b = d30Var.b;
                arrayListK.addAll(qb7Var.k(sQLiteDatabase, wv8VarA.l(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListK.size(); i++) {
            sb.append(((v20) arrayListK.get(i)).a);
            if (i < arrayListK.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new pb7(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListK.listIterator();
        while (listIterator.hasNext()) {
            v20 v20Var = (v20) listIterator.next();
            long j2 = v20Var.a;
            if (map.containsKey(Long.valueOf(j2))) {
                on onVarC = v20Var.c.c();
                for (pb7 pb7Var : (Set) map.get(Long.valueOf(j2))) {
                    onVarC.c(pb7Var.a, pb7Var.b);
                }
                listIterator.set(new v20(j2, v20Var.b, onVarC.f()));
            }
        }
        return arrayListK;
    }

    @Override // defpackage.lv7
    public boolean b() {
        mj6 mj6Var = (mj6) this.b;
        v30 v30Var = (v30) this.c;
        if (!mj6Var.q) {
            mj6Var.j();
            v30Var.a = v30.a(mj6Var.o, v30Var.a);
            mj6Var.q = !mj6Var.i(mj6Var.n, r2 + v30Var.b);
        }
        return mj6Var.q;
    }

    @Override // io.sentry.x3
    public void c(m1 m1Var) {
        switch (this.a) {
            case 20:
                h6 h6Var = (h6) this.b;
                a1 a1Var = (a1) this.c;
                h6Var.getClass();
                if (m1Var == h6Var) {
                    a1Var.r();
                }
                break;
            case 21:
                m1 m1Var2 = (m1) this.b;
                a1 a1Var2 = (a1) this.c;
                if (m1Var == m1Var2) {
                    a1Var2.r();
                }
                break;
            default:
                f fVar = (f) this.b;
                a1 a1Var3 = (a1) this.c;
                if (m1Var == fVar.e) {
                    a1Var3.r();
                }
                break;
        }
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() throws IOException {
        switch (this.a) {
            case 27:
                return Integer.valueOf(((d) this.b).a.read((byte[]) this.c));
            case 28:
                d dVar = (d) this.b;
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                int i = dVar.a.read();
                atomicInteger.set(i);
                return Integer.valueOf(i != -1 ? 1 : 0);
            default:
                e eVar = (e) this.b;
                byte[] bArr = (byte[]) this.c;
                eVar.a.write(bArr);
                return Integer.valueOf(bArr.length);
        }
    }

    @Override // io.sentry.w1
    public Object e() {
        c2 c2Var = (c2) this.b;
        e2 e2Var = (e2) this.c;
        c2Var.getClass();
        try {
            try {
                return Integer.valueOf(e2Var.nextInt());
            } catch (Exception unused) {
                return Long.valueOf(e2Var.nextLong());
            }
        } catch (Exception unused2) {
            return Double.valueOf(e2Var.nextDouble());
        }
    }

    @Override // defpackage.nd8
    public Object execute() {
        switch (this.a) {
            case 17:
                v24 v24Var = (v24) this.b;
                Iterable iterable = (Iterable) this.c;
                qb7 qb7Var = (qb7) ((i42) v24Var.c);
                qb7Var.getClass();
                if (iterable.iterator().hasNext()) {
                    qb7Var.b().compileStatement("DELETE FROM events WHERE _id in " + qb7.D(iterable)).execute();
                    break;
                }
                break;
            default:
                v24 v24Var2 = (v24) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((qb7) ((jt0) v24Var2.i)).u(((Integer) entry.getValue()).intValue(), LogEventDropped$Reason.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.h51
    public Object f(bf8 bf8Var) {
        bn6 bn6Var = (bn6) this.b;
        String str = (String) this.c;
        synchronized (bn6Var) {
            ((wv) bn6Var.c).remove(str);
        }
        return bf8Var;
    }

    @Override // io.sentry.z3
    public void g(a1 a1Var) {
        switch (this.a) {
            case 22:
                a1Var.H(new io.sentry.android.core.f((ActivityLifecycleIntegration) this.b, a1Var, (m1) this.c));
                break;
            default:
                a1Var.H(new tg1((f) this.b, a1Var, (m1) this.c, 16));
                break;
        }
    }

    @Override // defpackage.hs4
    public Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        switch (this.a) {
            case 1:
                return xq4Var.n(hq4Var, (wp7) this.b, (Bundle) this.c);
            case 2:
            default:
                return xq4Var.j() ? ja1.y(new bq7(-100)) : j29.j0((n94) ((hs4) this.b).h(xq4Var, hq4Var, i), new tg1(xq4Var, hq4Var, (gs4) this.c, 8));
            case 3:
                return xq4Var.j() ? ja1.y(new bq7(-100)) : j29.j0((n94) ((hs4) this.b).h(xq4Var, hq4Var, i), new tg1(xq4Var, hq4Var, (sr4) this.c, 7));
        }
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        Uri uri;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        int i = this.a;
        int i2 = 0;
        string = null;
        string = null;
        string = null;
        String string = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 6:
                MovieDetailMoreListRecyclerListFragment movieDetailMoreListRecyclerListFragment = (MovieDetailMoreListRecyclerListFragment) obj3;
                MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                int i3 = MovieDetailMoreListRecyclerListFragment.m1;
                js3.p(view, "<unused var>");
                js3.p((s35) qg5Var, "<unused var>");
                js3.p(movieHomeMovieData, "recyclerData");
                String analyticsName = ((o15) movieDetailMoreListRecyclerListFragment.k1.getValue()).a.getAnalyticsName();
                Iterator it = ((ArrayList) ((l45) obj2).D().d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!js3.i(((RecyclerItem) it.next()).c, movieHomeMovieData)) {
                        i2++;
                    }
                }
                j84 j84Var = movieDetailMoreListRecyclerListFragment.j1;
                if (j84Var == null) {
                    js3.V("listAnalytics");
                    throw null;
                }
                j84Var.a(i2, analyticsName);
                MovieDto movieDto = movieHomeMovieData.a;
                pk5.g(movieDetailMoreListRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                return;
            case 7:
                MovieMoreRecyclerListFragment movieMoreRecyclerListFragment = (MovieMoreRecyclerListFragment) obj3;
                MovieHomeMovieData movieHomeMovieData2 = (MovieHomeMovieData) obj;
                int i4 = MovieMoreRecyclerListFragment.m1;
                js3.p(view, "<unused var>");
                js3.p((s35) qg5Var, "<unused var>");
                js3.p(movieHomeMovieData2, "recyclerData");
                String str = ((o45) movieMoreRecyclerListFragment.l1.getValue()).c;
                Iterator it2 = ((ArrayList) ((l45) obj2).D().d).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                    } else if (!js3.i(((RecyclerItem) it2.next()).c, movieHomeMovieData2)) {
                        i2++;
                    }
                }
                j84 j84Var2 = movieMoreRecyclerListFragment.j1;
                if (j84Var2 == null) {
                    js3.V("listAnalytics");
                    throw null;
                }
                j84Var2.a(i2, str);
                MovieDto movieDto2 = movieHomeMovieData2.a;
                js3.p(movieDto2, "movieDto");
                String action = movieDto2.getAction();
                if (action == null || f88.n0(action)) {
                    pk5.g(movieMoreRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto2.getId(), movieDto2.getRefId(), false, movieDto2.getPosterUrl(), null)), -1);
                    return;
                }
                FragmentActivity fragmentActivityF = movieMoreRecyclerListFragment.F();
                String action2 = movieDto2.getAction();
                if (action2 != null) {
                    t61.w(action2, "parse(...)", fragmentActivityF, null, null);
                    return;
                }
                return;
            case 8:
                int i5 = MyAccountRecyclerListFragment.m1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.myAccount.recycler.a) qg5Var, "<unused var>");
                js3.p((MyAccountCheckBoxData) obj, "recyclerData");
                ((MyAccountRecyclerListFragment) obj3).T1().u(MyAccountItemsType.j, String.valueOf(!Boolean.parseBoolean((String) ((Pair) r14.a.a.getValue()).b)), (gc5) obj2);
                return;
            case 9:
            case 11:
            case 12:
            default:
                ReelsFragment reelsFragment = (ReelsFragment) obj3;
                ReelAdData reelAdData = (ReelAdData) obj;
                int i6 = ReelsFragment.i1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.reels.ui.recycler.a) qg5Var, "<unused var>");
                js3.p(reelAdData, "recyclerData");
                Context context = ((View) obj2).getContext();
                js3.o(context, "getContext(...)");
                ReelsFragment.s1(context);
                String heartCallback = reelAdData.b.getContent().getHeartCallback();
                String strValueOf = String.valueOf(reelAdData.c);
                if (heartCallback != null && (uri = Uri.parse(heartCallback)) != null && (builderBuildUpon = uri.buildUpon()) != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("heart", strValueOf)) != null) {
                    string = builderAppendQueryParameter.toString();
                }
                if (string != null) {
                    reelsFragment.l1().b(new ql0(string, CallbackUrlType.l, 0));
                    return;
                }
                return;
            case 10:
                PlayScreenshots playScreenshots = (PlayScreenshots) obj2;
                pa6 pa6Var = (pa6) qg5Var;
                PlayScreenshotData playScreenshotData = (PlayScreenshotData) obj;
                js3.p(view, "view");
                js3.p(pa6Var, "viewHolder");
                js3.p(playScreenshotData, "selectedScreenShot");
                ((b) obj3).x.m(view, pa6Var, new tf7(playScreenshotData.a, playScreenshots.a, playScreenshots.b));
                return;
            case 13:
                og5 og5Var = (og5) obj2;
                ir.mservices.market.reels.ui.recycler.b bVar = (ir.mservices.market.reels.ui.recycler.b) qg5Var;
                ((Boolean) obj).booleanValue();
                js3.p(view, "view");
                js3.p(bVar, "viewHolder");
                og5Var.m(view, bVar, Boolean.valueOf(!js3.h(((ir.mservices.market.reels.ui.recycler.b) obj3).J() != null ? Float.valueOf(r14.s()) : null, 0.0f)));
                return;
        }
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 9:
                dp2 dp2Var = (dp2) this.b;
                Integer num = (Integer) this.c;
                VersionDescriptionDTO versionDescriptionDTO = (VersionDescriptionDTO) obj;
                Bundle bundle = new Bundle();
                bundle.putInt("RESPONSE_CODE", 0);
                if (num.intValue() < versionDescriptionDTO.getVersionCode()) {
                    bundle.putBoolean("RESPONSE_APP_UPDATE_AVAILABLE", true);
                    bundle.putString("RESPONSE_APP_UPDATE_DESCRIPTION", versionDescriptionDTO.getVersionDescription());
                    bundle.putInt("RESPONSE_APP_VERSION_CODE", versionDescriptionDTO.getVersionCode());
                } else {
                    bundle.putBoolean("RESPONSE_APP_UPDATE_AVAILABLE", false);
                }
                dp2Var.invoke(bundle);
                break;
            default:
                go6 go6Var = (go6) this.b;
                String str = (String) this.c;
                go6Var.getClass();
                if (!TextUtils.isEmpty(str)) {
                    go6Var.c.j(lu7.i0, false);
                    go6Var.c.i(lu7.j0, str);
                }
                break;
        }
    }
}
