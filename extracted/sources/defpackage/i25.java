package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.animation.h;
import androidx.compose.animation.j;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.SearchMovieDto;
import ir.mservices.market.movie.data.webapi.SearchMovieListDto;
import ir.mservices.market.movie.ui.search.result.recycler.MovieSearchMovieData;
import ir.mservices.market.movie.ui.search.result.recycler.MovieSearchMovieExactMatchData;
import ir.mservices.market.myMarket.MyMarketViewModel;
import ir.mservices.market.version2.model.MovieWatchProgressModel;
import ir.mservices.market.views.MyketRatingBar;
import ir.myket.persistent.migration.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i25 implements dp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ i25(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        String strValueOf;
        String value;
        int i = this.a;
        String str = "";
        tx8 tx8Var = tx8.a;
        Object[] objArr = 0;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                bs1 bs1Var = (bs1) obj;
                js3.p(bs1Var, "downloadInfo");
                return Boolean.valueOf(((es1) bs1Var).f == 100);
            case 1:
                dq4 dq4Var = (dq4) obj;
                return new Pair(dq4Var != null ? dq4Var.a : null, dq4Var != null ? Boolean.valueOf(dq4Var.b) : null);
            case 2:
                dq4 dq4Var2 = (dq4) obj;
                return new Pair(dq4Var2 != null ? dq4Var2.a : null, dq4Var2 != null ? Boolean.valueOf(dq4Var2.b) : null);
            case 3:
                MovieWatchProgressModel movieWatchProgressModel = (MovieWatchProgressModel) obj;
                js3.p(movieWatchProgressModel, "<this>");
                String strC = movieWatchProgressModel.c();
                String str2 = strC == null ? "" : strC;
                String strB = movieWatchProgressModel.b();
                return new l85(movieWatchProgressModel.e(), movieWatchProgressModel.a(), movieWatchProgressModel.f(), str2, strB == null ? "" : strB);
            case 4:
                List<SearchMovieDto> movies = ((SearchMovieListDto) obj).getMovies();
                if (movies != null) {
                    arrayList = new ArrayList(wu0.V(movies, 10));
                    for (SearchMovieDto searchMovieDto : movies) {
                        arrayList.add(js3.i(searchMovieDto.getExactMatch(), Boolean.TRUE) ? new RecyclerItem(new MovieSearchMovieExactMatchData(searchMovieDto)) : new RecyclerItem(new MovieSearchMovieData(searchMovieDto)));
                    }
                }
                return arrayList;
            case 5:
                mb7 mb7Var = (mb7) obj;
                js3.p(mb7Var, "_connection");
                rb7 rb7VarM1 = mb7Var.m1("SELECT * FROM movie_watch_progress");
                try {
                    int iJ = sb7.j(rb7VarM1, "play_id");
                    int iJ2 = sb7.j(rb7VarM1, "movie_id");
                    int iJ3 = sb7.j(rb7VarM1, "watched_time");
                    int iJ4 = sb7.j(rb7VarM1, "movie_total_time");
                    int iJ5 = sb7.j(rb7VarM1, "timestamp");
                    ArrayList arrayList2 = new ArrayList();
                    while (rb7VarM1.f1()) {
                        arrayList2.add(new l85(rb7VarM1.getLong(iJ3), rb7VarM1.getLong(iJ4), rb7VarM1.getLong(iJ5), rb7VarM1.B0(iJ), rb7VarM1.B0(iJ2)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    rb7VarM1.close();
                }
            case 6:
                l16 l16Var = (l16) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(l16Var.b);
                sb.append(", ");
                return dw1.q(sb, l16Var.c, ')');
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                js3.p(entry, "entry");
                Object value2 = entry.getValue();
                if (value2 instanceof byte[]) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) "[");
                    int i2 = 0;
                    for (byte b : (byte[]) value2) {
                        i2++;
                        if (i2 > 1) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append((CharSequence) String.valueOf((int) b));
                    }
                    sb2.append((CharSequence) "]");
                    strValueOf = sb2.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return bl4.z(new StringBuilder("  "), ((bj6) entry.getKey()).a, " = ", strValueOf);
            case 8:
                int i3 = nd5.j;
                return tx8Var;
            case 9:
                return Boolean.valueOf(MyMarketViewModel.editHeader$lambda$0((RecyclerItem) obj));
            case 10:
                ArrayList arrayList3 = ((kd5) obj).a;
                ArrayList arrayList4 = new ArrayList(wu0.V(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    bl4.G((MyketRecyclerData) it.next(), arrayList4);
                }
                return arrayList4;
            case 11:
                Context context = (Context) obj;
                js3.p(context, "context");
                return a.a(context);
            case 12:
                ((Integer) obj).getClass();
                int i4 = MyketRatingBar.e;
                return tx8Var;
            case 13:
                l71 l71Var = (l71) obj;
                js3.p(l71Var, "$this$initializer");
                return new fi5(rq4.t(l71Var));
            case 14:
                Context context2 = (Context) obj;
                js3.p(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 15:
                wi5 wi5Var = (wi5) obj;
                js3.p(wi5Var, "destination");
                fj5 fj5Var = wi5Var.c;
                if (fj5Var == null || fj5Var.g.a != wi5Var.b.a) {
                    return null;
                }
                return fj5Var;
            case 16:
                wi5 wi5Var2 = (wi5) obj;
                js3.p(wi5Var2, "destination");
                fj5 fj5Var2 = wi5Var2.c;
                if (fj5Var2 == null || fj5Var2.g.a != wi5Var2.b.a) {
                    return null;
                }
                return fj5Var2;
            case 17:
                wi5 wi5Var3 = (wi5) obj;
                js3.p(wi5Var3, "it");
                return Integer.valueOf(wi5Var3.b.a);
            case 18:
                js3.p((l71) obj, "$this$initializer");
                return new oi5();
            case 19:
                Context context3 = (Context) obj;
                js3.p(context3, "it");
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 20:
                Context context4 = (Context) obj;
                js3.p(context4, "it");
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 21:
                wi5 wi5Var4 = (wi5) obj;
                js3.p(wi5Var4, "it");
                return wi5Var4.c;
            case 22:
                ee7 ee7Var = (ee7) obj;
                return new Pair(g27.a(ee7Var.getClass()), ee7Var.getKey());
            case 23:
                return new h(j.d(y97.e0(700, 0, null, 6), 2), j.e(y97.e0(700, 0, null, 6), 2));
            case 24:
                return new h(j.d(y97.e0(700, 0, null, 6), 2), j.e(y97.e0(700, 0, null, 6), 2));
            case 25:
                return tx8Var;
            case 26:
                wi5 wi5Var5 = (wi5) obj;
                js3.p(wi5Var5, "it");
                if (!(wi5Var5 instanceof fj5)) {
                    return null;
                }
                fj5 fj5Var3 = (fj5) wi5Var5;
                return fj5Var3.l(fj5Var3.g.a);
            case 27:
                View view = (View) obj;
                js3.p(view, "it");
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 28:
                View view2 = (View) obj;
                js3.p(view2, "it");
                Object tag = view2.getTag(jr6.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (ij5) ((WeakReference) tag).get();
                }
                if (tag instanceof ij5) {
                    return (ij5) tag;
                }
                return null;
            default:
                nf7 nf7Var = (nf7) obj;
                js3.p(nf7Var, "$this$activityRetainedScope");
                pf7 pf7Var = new pf7(new va0(nf7Var.a, g27.a(dl5.class), null, new r05(4, (byte) (objArr == true ? 1 : 0)), Kind.c, EmptyList.a));
                nx4 nx4Var = nf7Var.b;
                nx4Var.a(pf7Var);
                ps0 ps0VarA = g27.a(qf7.class);
                va0 va0Var = pf7Var.a;
                va0Var.f = kotlin.collections.a.A0(ps0VarA, va0Var.f);
                to6 to6Var = va0Var.c;
                to6 to6Var2 = va0Var.a;
                StringBuilder sb3 = new StringBuilder();
                dw1.w(ps0VarA, sb3, ':');
                if (to6Var != null && (value = to6Var.getValue()) != null) {
                    str = value;
                }
                nx4Var.c.put(dw1.r(sb3, str, ':', to6Var2, "mapping"), pf7Var);
                return tx8Var;
        }
    }
}
