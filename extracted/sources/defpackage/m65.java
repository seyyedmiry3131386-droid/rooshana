package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.movie.data.webapi.SummariesDto;
import ir.mservices.market.movie.data.webapi.SummaryIconDto;
import ir.mservices.market.movie.ui.search.result.recycler.BaseMovieSearchMovieData;
import ir.mservices.market.views.MovieTagView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m65 extends d80 {
    public i65 H;

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof i65) {
            this.H = (i65) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.d80, defpackage.qg5
    /* JADX INFO: renamed from: x */
    public final void t(BaseMovieSearchMovieData baseMovieSearchMovieData) {
        String title;
        js3.p(baseMovieSearchMovieData, "data");
        super.t(baseMovieSearchMovieData);
        i65 i65Var = this.H;
        if (i65Var == null) {
            js3.V("binding");
            throw null;
        }
        i65Var.v.setBackgroundColor(sj8.b().f);
        List<SummariesDto> summaries = baseMovieSearchMovieData.a.getSummaries();
        if (summaries != null) {
            i65 i65Var2 = this.H;
            if (i65Var2 == null) {
                js3.V("binding");
                throw null;
            }
            i65Var2.w.removeAllViews();
            uf2 uf2Var = new uf2(-2, -2);
            View view = this.a;
            uf2 uf2Var2 = new uf2(view.getResources().getDimensionPixelSize(pq6.space_8), view.getResources().getDimensionPixelSize(pq6.space_4));
            ArrayList arrayList = new ArrayList();
            for (Object obj : summaries) {
                if (m88.T(((SummariesDto) obj).getType(), "Icon", true)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SummaryIconDto icon = ((SummariesDto) it.next()).getIcon();
                if (icon != null) {
                    String iconUrl = icon.getIconUrl();
                    if (iconUrl == null || f88.n0(iconUrl) || (title = icon.getTitle()) == null || f88.n0(title)) {
                        icon = null;
                    }
                    if (icon != null) {
                        Context context = view.getContext();
                        js3.o(context, "getContext(...)");
                        MovieTagView movieTagView = new MovieTagView(context, null, 6, 0);
                        movieTagView.setLayoutParams(uf2Var);
                        movieTagView.setIconBackgroundColor(icon.getBg());
                        String title2 = icon.getTitle();
                        if (title2 == null) {
                            title2 = "";
                        }
                        movieTagView.setTitleText(title2);
                        String iconUrl2 = icon.getIconUrl();
                        movieTagView.setIcon(iconUrl2 != null ? iconUrl2 : "");
                        movieTagView.setIconTint(icon.getIconTint());
                        i65 i65Var3 = this.H;
                        if (i65Var3 == null) {
                            js3.V("binding");
                            throw null;
                        }
                        i65Var3.w.addView(movieTagView, uf2Var2);
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
