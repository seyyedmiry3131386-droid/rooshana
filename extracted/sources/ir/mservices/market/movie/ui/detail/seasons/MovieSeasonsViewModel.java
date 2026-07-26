package ir.mservices.market.movie.ui.detail.seasons;

import android.os.Parcelable;
import defpackage.a75;
import defpackage.at2;
import defpackage.i30;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.mz3;
import defpackage.n25;
import defpackage.pv6;
import defpackage.pz3;
import defpackage.rv6;
import defpackage.u65;
import ir.mservices.market.appDetail.MovieToolbarData;
import ir.mservices.market.movie.data.webapi.SubscriptionInfo;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieSeasonsViewModel extends c implements pz3 {
    public final l A;
    public final l B;
    public final rv6 C;
    public final l D;
    public final rv6 E;
    public final u65 t;
    public final n25 u;
    public final Object v;
    public final a75 w;
    public final l x;
    public final pv6 y;
    public final l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSeasonsViewModel(jd7 jd7Var, u65 u65Var, n25 n25Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(u65Var, "movieSeasonRepository");
        js3.p(n25Var, "movieDownloadRepository");
        this.t = u65Var;
        this.u = n25Var;
        this.v = kotlin.a.b(LazyThreadSafetyMode.a, new i30(this, 15));
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("refId");
        if (!jd7Var.a("selectedSeason")) {
            throw new IllegalArgumentException("Required argument \"selectedSeason\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) jd7Var.b("selectedSeason");
        if (num == null) {
            throw new IllegalArgumentException("Argument \"selectedSeason\" of type integer does not support null values");
        }
        if (!jd7Var.a("seasonsSize")) {
            throw new IllegalArgumentException("Required argument \"seasonsSize\" is missing and does not have an android:defaultValue");
        }
        Integer num2 = (Integer) jd7Var.b("seasonsSize");
        if (num2 == null) {
            throw new IllegalArgumentException("Argument \"seasonsSize\" of type integer does not support null values");
        }
        if (!jd7Var.a("toolbarData")) {
            throw new IllegalArgumentException("Required argument \"toolbarData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MovieToolbarData.class) && !Serializable.class.isAssignableFrom(MovieToolbarData.class)) {
            throw new UnsupportedOperationException(MovieToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MovieToolbarData movieToolbarData = (MovieToolbarData) jd7Var.b("toolbarData");
        if (movieToolbarData == null) {
            throw new IllegalArgumentException("Argument \"toolbarData\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("subscriptionInfo")) {
            throw new IllegalArgumentException("Required argument \"subscriptionInfo\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SubscriptionInfo.class) && !Serializable.class.isAssignableFrom(SubscriptionInfo.class)) {
            throw new UnsupportedOperationException(SubscriptionInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) jd7Var.b("subscriptionInfo");
        if (!jd7Var.a("movieId")) {
            throw new IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("movieId");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"movieId\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("showDownload")) {
            throw new IllegalArgumentException("Required argument \"showDownload\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) jd7Var.b("showDownload");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"showDownload\" of type boolean does not support null values");
        }
        if (!jd7Var.a("isAudioMode")) {
            throw new IllegalArgumentException("Required argument \"isAudioMode\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) jd7Var.b("isAudioMode");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"isAudioMode\" of type boolean does not support null values");
        }
        this.w = new a75(str, num.intValue(), num2.intValue(), movieToolbarData, subscriptionInfo, str2, bool.booleanValue(), bool2.booleanValue());
        l lVarB = ja1.b(null);
        this.x = lVarB;
        this.y = new pv6(lVarB);
        this.z = ja1.b(null);
        this.A = ja1.b(null);
        l lVarB2 = ja1.b(null);
        this.B = lVarB2;
        this.C = new rv6(lVarB2);
        l lVarB3 = ja1.b(null);
        this.D = lVarB3;
        this.E = new rv6(lVarB3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieSeasonsViewModel$doRequest$1(this, null));
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }
}
