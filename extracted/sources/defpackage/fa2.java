package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.detail.more.ui.recycler.AgeRateData;
import ir.mservices.market.app.detail.more.ui.recycler.DescriptionData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreClickableData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreInformationData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreSimpleData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreSizeData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreVersionData;
import ir.mservices.market.app.detail.more.ui.recycler.WhatsNewData;
import ir.mservices.market.app.detail.ui.recycler.AppTagData;
import ir.mservices.market.app.detail.ui.recycler.g;
import ir.mservices.market.app.suggest.detail.recycler.PlayScreenshotData;
import ir.mservices.market.app.survey.recycler.AnswerData;
import ir.mservices.market.app.survey.recycler.QuestionData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.feedback.recycler.FeedbackTransactionData;
import ir.mservices.market.feedback.recycler.FeedbackTransactionHeaderData;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieData;
import ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData;
import ir.mservices.market.movie.ui.search.result.recycler.MovieSearchMovieData;
import ir.mservices.market.movie.ui.search.result.recycler.MovieSearchMovieExactMatchData;
import ir.mservices.market.myAccount.city.recycler.EmptyCityData;
import ir.mservices.market.myAccount.city.recycler.SelectCityHeaderData;
import ir.mservices.market.myAccount.city.recycler.SelectCityItemData;
import ir.mservices.market.pika.connect.recycler.EndPointData;
import ir.mservices.market.pika.connect.recycler.PikaSelectDeviceTitleData;
import ir.mservices.market.setting.themeStyle.recycler.ThemeStyleItemData;
import ir.mservices.market.version2.manager.d;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class fa2 extends a {
    public final /* synthetic */ int l;
    public og5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa2(int i, int i2) {
        super(i);
        this.l = i2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        d80 m65Var;
        switch (this.l) {
            case 0:
                if (i != FeedbackTransactionData.b) {
                    if (i == FeedbackTransactionHeaderData.a) {
                        return new m12(1, view);
                    }
                    return null;
                }
                v4 v4Var = (v4) this.m;
                if (v4Var != null) {
                    return new la2(view, v4Var);
                }
                js3.V("onItemClickListener");
                throw null;
            case 1:
                if (i == WhatsNewData.d) {
                    l5 l5Var = new l5(29, view);
                    Context context = view.getContext();
                    js3.o(context, "getContext(...)");
                    ea7 ea7Var = new ea7(context);
                    ea7Var.b = sj8.b().q;
                    ea7Var.c(view.getResources().getDimensionPixelSize(pq6.space_12));
                    ea7Var.h = 0;
                    view.setBackground(ea7Var.a());
                    return l5Var;
                }
                if (i == DescriptionData.d) {
                    return new l5(3, view);
                }
                if (i == MoreInformationData.b) {
                    return new m12(3, view);
                }
                if (i == DividerData.k) {
                    return new oq1(view);
                }
                if (i == MoreSizeData.e) {
                    return new ir.mservices.market.app.detail.more.ui.recycler.a(view);
                }
                if (i == MoreVersionData.e) {
                    return new l5(12, view);
                }
                if (i == MoreClickableData.e) {
                    qs3 qs3Var = (qs3) this.m;
                    if (qs3Var != null) {
                        return new sx4(view, qs3Var);
                    }
                    js3.V("onClickListener");
                    throw null;
                }
                if (i == AgeRateData.d) {
                    return new l5(2, view);
                }
                if (i == MoreSimpleData.b) {
                    return new l5(11, view);
                }
                return null;
            case 2:
                if (i != MovieBookmarkData.i) {
                    return null;
                }
                qs3 qs3Var2 = (qs3) this.m;
                if (qs3Var2 != null) {
                    return new f05(view, qs3Var2, this.k);
                }
                js3.V("onMovieClickListener");
                throw null;
            case 3:
                if (i == MovieSearchMovieData.b) {
                    qs3 qs3Var3 = (qs3) this.m;
                    if (qs3Var3 == null) {
                        js3.V("onMovieClickListener");
                        throw null;
                    }
                    m65Var = new n65(view, qs3Var3);
                    m65Var.x = (d) ((w91) qg5.r()).A0.get();
                } else {
                    if (i != MovieSearchMovieExactMatchData.b) {
                        return null;
                    }
                    qs3 qs3Var4 = (qs3) this.m;
                    if (qs3Var4 == null) {
                        js3.V("onMovieClickListener");
                        throw null;
                    }
                    m65Var = new m65(view, qs3Var4);
                    m65Var.x = (d) ((w91) qg5.r()).A0.get();
                }
                return m65Var;
            case 4:
                if (i != EndPointData.c) {
                    if (i == PikaSelectDeviceTitleData.a) {
                        return new m12(4, view);
                    }
                    return null;
                }
                ts5 ts5Var = (ts5) this.m;
                if (ts5Var != null) {
                    return new a22(view, ts5Var);
                }
                js3.V("onEndPointSelected");
                throw null;
            case 5:
                if (i != PlayScreenshotData.b) {
                    return null;
                }
                ur4 ur4Var = (ur4) this.m;
                if (ur4Var != null) {
                    return new pa6(view, ur4Var);
                }
                js3.V("onScreenshotClickListener");
                throw null;
            case 6:
                if (i == SelectCityItemData.c) {
                    ts5 ts5Var2 = (ts5) this.m;
                    if (ts5Var2 != null) {
                        return new gm7(view, ts5Var2);
                    }
                    js3.V("onItemClickListener");
                    throw null;
                }
                if (i == SelectCityHeaderData.b) {
                    return new l5(21, view);
                }
                if (i == EmptyCityData.a) {
                    return new l5(6, view);
                }
                return null;
            case 7:
                if (i != StreamerMovieData.b) {
                    return null;
                }
                ts5 ts5Var3 = (ts5) this.m;
                if (ts5Var3 != null) {
                    return new v68(view, ts5Var3);
                }
                js3.V("onMovieClickListener");
                throw null;
            case 8:
                if (i == QuestionData.b) {
                    return new l5(19, view);
                }
                if (i != AnswerData.c) {
                    return null;
                }
                ts5 ts5Var4 = (ts5) this.m;
                if (ts5Var4 != null) {
                    return new ir.mservices.market.app.survey.recycler.a(view, ts5Var4);
                }
                js3.V("onClickListener");
                throw null;
            case 9:
                if (i != AppTagData.g) {
                    return null;
                }
                og5 og5Var = this.m;
                if (og5Var != null) {
                    return new g(view, og5Var);
                }
                js3.V("onTagClickListener");
                throw null;
            default:
                if (i != ThemeStyleItemData.d) {
                    return null;
                }
                ts5 ts5Var5 = (ts5) this.m;
                if (ts5Var5 != null) {
                    return new ir.mservices.market.setting.themeStyle.recycler.a(view, ts5Var5);
                }
                js3.V("onThemeStyleClickListener");
                throw null;
        }
    }
}
