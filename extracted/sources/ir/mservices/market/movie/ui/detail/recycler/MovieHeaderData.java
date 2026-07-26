package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.g32;
import defpackage.h45;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import defpackage.rv6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.DetailStreamerDto;
import ir.mservices.market.movie.data.webapi.SubscriptionInfo;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHeaderData implements MyketRecyclerData, wo2, h45, g32 {
    public static final int r = js6.movie_detail_header_view;
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final SubscriptionInfo j;
    public final Boolean k;
    public final DetailStreamerDto l;
    public final v48 m;
    public final v48 n;
    public final rv6 o;
    public final v48 p;
    public final String q;

    public MovieHeaderData(String str, List list, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, SubscriptionInfo subscriptionInfo, Boolean bool, DetailStreamerDto detailStreamerDto, rv6 rv6Var, l lVar, rv6 rv6Var2, v48 v48Var) {
        js3.p(str, "title");
        js3.p(str2, "posterUrl");
        js3.p(str6, "movieId");
        js3.p(rv6Var, "buttonButtonState");
        js3.p(lVar, "downloadButtonState");
        js3.p(v48Var, "mediaPlaybackStateFlow");
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = str6;
        this.i = str7;
        this.j = subscriptionInfo;
        this.k = bool;
        this.l = detailStreamerDto;
        this.m = rv6Var;
        this.n = lVar;
        this.o = rv6Var2;
        this.p = v48Var;
        long j = is3.p + 1;
        is3.p = j;
        this.q = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return r;
    }

    @Override // defpackage.h45
    public final String a() {
        return "movie_header";
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieHeaderData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.MovieHeaderData");
        MovieHeaderData movieHeaderData = (MovieHeaderData) obj;
        List list = movieHeaderData.b;
        if (!js3.i(this.c, movieHeaderData.c)) {
            return false;
        }
        List list2 = this.b;
        if (js3.i(list2, list) && js3.i(this.a, movieHeaderData.a) && js3.i(this.d, movieHeaderData.d) && js3.i(this.e, movieHeaderData.e) && js3.i(this.f, movieHeaderData.f) && js3.i(this.j, movieHeaderData.j) && js3.i(this.h, movieHeaderData.h) && js3.i(this.i, movieHeaderData.i) && this.k.equals(movieHeaderData.k) && js3.i(this.m.getValue(), movieHeaderData.m.getValue()) && js3.i(this.n.getValue(), movieHeaderData.n.getValue()) && ((Boolean) this.o.a.getValue()).booleanValue() == ((Boolean) movieHeaderData.o.a.getValue()).booleanValue() && this.g == movieHeaderData.g) {
            return js3.i(list2, list);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.q;
    }

    public final int hashCode() {
        List list = this.b;
        int iK = rm7.k(this.a, rm7.k(this.c, rm7.k(this.q, (list != null ? list.hashCode() : 0) * 31, 31), 31), 31);
        String str = this.d;
        int iHashCode = (iK + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SubscriptionInfo subscriptionInfo = this.j;
        int iHashCode4 = (iHashCode3 + (subscriptionInfo != null ? subscriptionInfo.hashCode() : 0)) * 31;
        String str4 = this.i;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Object value = this.m.getValue();
        int iHashCode6 = (iHashCode5 + (value != null ? value.hashCode() : 0)) * 31;
        Object value2 = this.n.getValue();
        return this.k.hashCode() + ((((((iHashCode6 + (value2 != null ? value2.hashCode() : 0)) * 31) + (((Boolean) this.o.a.getValue()).booleanValue() ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31);
    }
}
