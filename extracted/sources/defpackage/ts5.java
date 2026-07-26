package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zzd;
import com.google.android.material.tabs.b;
import defpackage.bf8;
import defpackage.bt2;
import defpackage.f87;
import defpackage.ic7;
import defpackage.js3;
import defpackage.li1;
import defpackage.y97;
import defpackage.zj9;
import io.sentry.android.core.t0;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.packages.ui.PackageRecyclerListFragment;
import ir.mservices.market.app.recommended.ui.RecommendedRecyclerListFragment;
import ir.mservices.market.app.survey.SurveyAction;
import ir.mservices.market.app.survey.SurveyFragment;
import ir.mservices.market.app.survey.recycler.AnswerData;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment;
import ir.mservices.market.download.recentDownload.recycler.RecentDownloadData;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.streamers.movies.StreamerMoviesFragment;
import ir.mservices.market.movie.streamers.recycler.OtherStreamerData;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieData;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.myAccount.city.SelectCityFragment;
import ir.mservices.market.myAccount.city.recycler.SelectCityItemData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.connect.ConnectionType;
import ir.mservices.market.pika.connect.PikaSelectDeviceViewModel;
import ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog;
import ir.mservices.market.pika.connect.recycler.EndPointData;
import ir.mservices.market.pika.home.PikaHomeFragment;
import ir.mservices.market.search.common.SearchType;
import ir.mservices.market.search.history.ui.SearchViewModel;
import ir.mservices.market.search.result.SearchResultFragment;
import ir.mservices.market.securityShield.SecurityShieldViewModel;
import ir.mservices.market.setting.themeStyle.ThemeStyleAction;
import ir.mservices.market.setting.themeStyle.ThemeStyleFragment;
import ir.mservices.market.setting.themeStyle.recycler.ThemeStyleItemData;
import ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment;
import ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment;
import ir.mservices.market.togo.TogoFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.PaymentRetryBottomDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.mservices.market.views.BindAutoCompleteView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts5 implements og5, wt5, r7, wa1, vz8, fe8, at5, a47, tt5, dt5, n31, ms5, t58, vt5, nd8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ts5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vz8
    public void a(Map map, String str) {
        af7 af7Var = (af7) this.b;
        if (!"schedule_update_list".equalsIgnoreCase(str) || map.isEmpty()) {
            return;
        }
        af7Var.f();
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        switch (this.a) {
            case 21:
                xa8 xa8Var = (xa8) this.b;
                o81 o81Var = (o81) obj;
                wa8 wa8Var = new wa8(o81Var.b, gv.r(o81Var.a, o81Var.c));
                xa8Var.c.add(wa8Var);
                long j = xa8Var.j;
                if (j == -9223372036854775807L || o81Var.d >= j) {
                    xa8Var.c(wa8Var);
                }
                break;
            default:
                ((lj3) this.b).O((o81) obj);
                break;
        }
    }

    public void b() {
        qp2 qp2Var = (qp2) this.b;
        synchronized (g08.c) {
            g08.h = a.y0(qp2Var, g08.h);
        }
    }

    @Override // defpackage.nd8
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseB;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 28:
                qb7 qb7Var = (qb7) ((jt0) obj);
                qb7Var.getClass();
                int i2 = lt0.e;
                vp7 vp7Var = new vp7(10);
                vp7Var.c = null;
                vp7Var.d = new ArrayList();
                vp7Var.e = null;
                vp7Var.b = "";
                HashMap map = new HashMap();
                sQLiteDatabaseB = qb7Var.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    lt0 lt0Var = (lt0) qb7.I(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new tg1(qb7Var, map, vp7Var, 12));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return lt0Var;
                } finally {
                }
            default:
                qb7 qb7Var2 = (qb7) ((i42) obj);
                long jA = qb7Var2.b.a() - qb7Var2.d.d;
                sQLiteDatabaseB = qb7Var2.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jA)};
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            qb7Var2.u(cursorRawQuery.getInt(0), LogEventDropped$Reason.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
        }
    }

    @Override // defpackage.vt5
    public void f() {
        TogoFragment togoFragment = (TogoFragment) this.b;
        int i = TogoFragment.o1;
        togoFragment.p1();
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        PikaHomeFragment pikaHomeFragment = (PikaHomeFragment) this.b;
        Map map = (Map) obj;
        int i = PikaHomeFragment.a1;
        js3.p(map, "it");
        Collection collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    lu7 lu7Var = pikaHomeFragment.Y0;
                    if (lu7Var != null) {
                        lu7Var.j(lu7.w0, true);
                        return;
                    } else {
                        js3.V("sharedPreferencesProxy");
                        throw null;
                    }
                }
            }
        }
        ConnectionType connectionType = pikaHomeFragment.X0;
        if (connectionType != null) {
            if (connectionType instanceof ConnectionType.Discover) {
                pikaHomeFragment.l1();
            } else {
                if (!(connectionType instanceof ConnectionType.Advertise)) {
                    throw new NoWhenBranchMatchedException();
                }
                pk5.g(pikaHomeFragment.J0, new NavIntentDirections.PikaConnect(new p76(ConnectionType.Advertise.a)), -1);
            }
        }
    }

    @Override // defpackage.a47
    public void h(long j, h26 h26Var) {
        yq2.Q(j, h26Var, ((cm7) this.b).c);
    }

    @Override // defpackage.fe8
    public void i(b bVar, int i) {
        SearchResultFragment searchResultFragment = (SearchResultFragment) this.b;
        int i2 = SearchResultFragment.R0;
        SearchType searchType = (SearchType) ((SearchViewModel) searchResultFragment.P0.getValue()).L.get(i);
        js3.p(searchType, "position");
        String string = searchResultFragment.K().getString(searchType.a);
        js3.o(string, "getString(...)");
        bVar.b(sa7.q(string));
    }

    @Override // defpackage.wa1
    public xa1 k() {
        wc6 wc6Var = (wc6) this.b;
        hs5 hs5Var = wc6Var.b;
        nc2 nc2Var = new nc2(7);
        String strK = j29.K(wc6Var.a, "");
        Map mapM = kotlin.collections.b.M(new Pair("SourceChannel", LinkDTO.LINK_TYPE_MYKET_INTENT));
        synchronized (nc2Var) {
            nc2Var.c = null;
            ((HashMap) nc2Var.b).clear();
            ((HashMap) nc2Var.b).putAll(mapM);
        }
        return new is5(hs5Var, strK, nc2Var);
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        final SecurityShieldViewModel securityShieldViewModel = (SecurityShieldViewModel) this.b;
        js3.p(bf8Var, "it");
        if (!bf8Var.f()) {
            li1 li1Var = securityShieldViewModel.L;
            if (li1Var != null) {
                li1Var.g(null);
            }
            SecurityShieldViewModel.u(securityShieldViewModel);
            return;
        }
        ek9 ek9Var = (ek9) ((f87) ((jc7) bf8Var.d()).b);
        Status status = ek9Var.a;
        if ((status == null || !status.u()) ? false : ek9Var.b) {
            securityShieldViewModel.y.g().g(new at5() { // from class: ir.mservices.market.securityShield.b
                @Override // defpackage.at5
                public final void l(bf8 bf8Var2) {
                    js3.p(bf8Var2, "it");
                    SecurityShieldViewModel securityShieldViewModel2 = securityShieldViewModel;
                    li1 li1Var2 = securityShieldViewModel2.L;
                    if (li1Var2 != null) {
                        li1Var2.g(null);
                    }
                    if (!bf8Var2.f()) {
                        SecurityShieldViewModel.u(securityShieldViewModel2);
                        return;
                    }
                    zzd zzdVar = ((zj9) ((f87) ((ic7) bf8Var2.d()).b)).b;
                    List listAsList = zzdVar == null ? Collections.EMPTY_LIST : Arrays.asList(zzdVar.b);
                    js3.o(listAsList, "getHarmfulAppsList(...)");
                    if (listAsList.isEmpty()) {
                        SecurityShieldViewModel.u(securityShieldViewModel2);
                    } else {
                        bt2.G(y97.G(securityShieldViewModel2), null, null, new SecurityShieldViewModel$sendHarmfulAppsToServer$1(null, securityShieldViewModel2, listAsList), 3);
                    }
                }
            });
            return;
        }
        li1 li1Var2 = securityShieldViewModel.L;
        if (li1Var2 != null) {
            li1Var2.g(null);
        }
        SecurityShieldViewModel.u(securityShieldViewModel);
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                sw5 sw5Var = (sw5) qg5Var;
                OtherStreamerData otherStreamerData = (OtherStreamerData) obj;
                js3.p(view, "view");
                js3.p(sw5Var, "viewHolder");
                js3.p(otherStreamerData, "recyclerData");
                f78 f78Var = (f78) ((fl6) obj2).L;
                if (f78Var != null) {
                    f78Var.m(view, sw5Var, otherStreamerData);
                }
                break;
            case 2:
                PackageRecyclerListFragment packageRecyclerListFragment = (PackageRecyclerListFragment) obj2;
                ir.mservices.market.app.common.recycler.a aVar = (ir.mservices.market.app.common.recycler.a) qg5Var;
                AppData appData = (AppData) obj;
                int i2 = PackageRecyclerListFragment.o1;
                js3.p(view, "<unused var>");
                js3.p(aVar, "viewHolder");
                js3.p(appData, "appData");
                ApplicationDTO applicationDTO = appData.c;
                String packageName = applicationDTO.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                Tracker tracker = new Tracker("package", ((oy5) packageRecyclerListFragment.k1.getValue()).c, "verticalList");
                boolean z = packageRecyclerListFragment.s1().b(aVar.x().getDrawable()) != null;
                String refId = applicationDTO.getRefId();
                js3.o(refId, "getRefId(...)");
                String callbackUrl = applicationDTO.getCallbackUrl();
                String iconPath = applicationDTO.getIconPath();
                js3.o(iconPath, "getIconPath(...)");
                String title = applicationDTO.getTitle();
                js3.o(title, "getTitle(...)");
                String packageName2 = applicationDTO.getPackageName();
                js3.o(packageName2, "getPackageName(...)");
                NavIntentDirections.AppDetail appDetail = new NavIntentDirections.AppDetail(new hp(packageName, false, tracker, z, null, refId, callbackUrl, null, new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback()), null, null, null, null));
                am2 am2Var = packageRecyclerListFragment.J0;
                aVar.x();
                pk5.f(am2Var, appDetail);
                break;
            case 5:
                PikaSelectDeviceBottomDialog pikaSelectDeviceBottomDialog = (PikaSelectDeviceBottomDialog) obj2;
                EndPointData endPointData = (EndPointData) obj;
                js3.p(view, "<unused var>");
                js3.p((a22) qg5Var, "<unused var>");
                js3.p(endPointData, "recyclerData");
                PikaSelectDeviceViewModel pikaSelectDeviceViewModel = (PikaSelectDeviceViewModel) pikaSelectDeviceBottomDialog.l1.getValue();
                String str = endPointData.a;
                js3.p(str, "endPointId");
                pikaSelectDeviceViewModel.t.connectToEndPoint(str);
                pikaSelectDeviceBottomDialog.z0();
                break;
            case 7:
                ProfileAppListMoreFragment profileAppListMoreFragment = (ProfileAppListMoreFragment) obj2;
                bq bqVar = (bq) qg5Var;
                AppNestedData appNestedData = (AppNestedData) obj;
                int i3 = ProfileAppListMoreFragment.l1;
                js3.p(view, "<unused var>");
                js3.p(bqVar, "viewHolder");
                js3.p(appNestedData, "recyclerData");
                ApplicationDTO applicationDTO2 = appNestedData.a;
                if (applicationDTO2 != null) {
                    ImageView imageViewX = bqVar.x();
                    Tracker tracker2 = new Tracker("social", null, "verticalList");
                    String iconPath2 = applicationDTO2.getIconPath();
                    js3.o(iconPath2, "getIconPath(...)");
                    String title2 = applicationDTO2.getTitle();
                    js3.o(title2, "getTitle(...)");
                    String packageName3 = applicationDTO2.getPackageName();
                    js3.o(packageName3, "getPackageName(...)");
                    StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath2, title2, packageName3, null, applicationDTO2.getTagline(), null, null, null, 232, null), applicationDTO2.getInstallCallbackUrl(), applicationDTO2.getClickCallback());
                    String packageName4 = applicationDTO2.getPackageName();
                    js3.o(packageName4, "getPackageName(...)");
                    boolean z2 = profileAppListMoreFragment.s1().b(imageViewX.getDrawable()) != null;
                    String refId2 = applicationDTO2.getRefId();
                    js3.o(refId2, "getRefId(...)");
                    pk5.f(profileAppListMoreFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName4, false, tracker2, z2, null, refId2, applicationDTO2.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                }
                break;
            case 8:
                ProfileMovieListMoreFragment profileMovieListMoreFragment = (ProfileMovieListMoreFragment) obj2;
                MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                int i4 = ProfileMovieListMoreFragment.l1;
                js3.p(view, "<unused var>");
                js3.p((s35) qg5Var, "<unused var>");
                js3.p(movieHomeMovieData, "recyclerData");
                MovieDto movieDto = movieHomeMovieData.a;
                String action = movieDto.getAction();
                if (action == null || f88.n0(action)) {
                    pk5.g(profileMovieListMoreFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                } else {
                    FragmentActivity fragmentActivityF = profileMovieListMoreFragment.F();
                    String action2 = movieDto.getAction();
                    if (action2 != null) {
                        t61.w(action2, "parse(...)", fragmentActivityF, null, null);
                    }
                }
                break;
            case 10:
                RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment = (RecentDownloadBottomDialogFragment) obj2;
                RecentDownloadData recentDownloadData = (RecentDownloadData) obj;
                js3.p(view, "<unused var>");
                js3.p((jx6) qg5Var, "<unused var>");
                js3.p(recentDownloadData, "recyclerData");
                AppDownloadInfo appDownloadInfo = recentDownloadData.a;
                String packageName5 = appDownloadInfo.getPackageName();
                Tracker tracker3 = new Tracker("recentDownload", null, "verticalList");
                String str2 = appDownloadInfo.getTag().d;
                if (str2 == null || f88.n0(str2)) {
                    str2 = "ClientUnknown";
                }
                pk5.g(recentDownloadBottomDialogFragment.J0(), new NavIntentDirections.AppDetail(new hp(packageName5, false, tracker3, false, null, str2, appDownloadInfo.getTag().e, appDownloadInfo.getTag().p, null, null, null, null, null)), -1);
                break;
            case 11:
                RecommendedRecyclerListFragment recommendedRecyclerListFragment = (RecommendedRecyclerListFragment) obj2;
                ir.mservices.market.app.common.recycler.a aVar2 = (ir.mservices.market.app.common.recycler.a) qg5Var;
                AppData appData2 = (AppData) obj;
                int i5 = RecommendedRecyclerListFragment.l1;
                js3.p(view, "<unused var>");
                js3.p(aVar2, "viewHolder");
                js3.p(appData2, "recyclerData");
                ApplicationDTO applicationDTO3 = appData2.c;
                String packageName6 = applicationDTO3.getPackageName();
                js3.o(packageName6, "getPackageName(...)");
                Tracker tracker4 = ((jy6) recommendedRecyclerListFragment.j1.getValue()).e;
                boolean z3 = recommendedRecyclerListFragment.s1().b(aVar2.x().getDrawable()) != null;
                String refId3 = applicationDTO3.getRefId();
                js3.o(refId3, "getRefId(...)");
                String callbackUrl2 = applicationDTO3.getCallbackUrl();
                String iconPath3 = applicationDTO3.getIconPath();
                js3.o(iconPath3, "getIconPath(...)");
                String title3 = applicationDTO3.getTitle();
                js3.o(title3, "getTitle(...)");
                String packageName7 = applicationDTO3.getPackageName();
                js3.o(packageName7, "getPackageName(...)");
                NavIntentDirections.AppDetail appDetail2 = new NavIntentDirections.AppDetail(new hp(packageName6, false, tracker4, z3, null, refId3, callbackUrl2, null, new StartApplicationData(new AppBarSampleData(iconPath3, title3, packageName7, null, applicationDTO3.getTagline(), null, null, null, 232, null), applicationDTO3.getInstallCallbackUrl(), applicationDTO3.getClickCallback()), null, null, null, null));
                am2 am2Var2 = recommendedRecyclerListFragment.J0;
                aVar2.x();
                pk5.f(am2Var2, appDetail2);
                break;
            case 16:
                SelectCityItemData selectCityItemData = (SelectCityItemData) obj;
                int i6 = SelectCityFragment.n1;
                js3.p(view, "<unused var>");
                js3.p((gm7) qg5Var, "<unused var>");
                js3.p(selectCityItemData, "recyclerData");
                hs0 hs0Var = ((SelectCityFragment) obj2).l1;
                js3.m(hs0Var);
                BindAutoCompleteView bindAutoCompleteView = hs0Var.v;
                bindAutoCompleteView.setText(selectCityItemData.a);
                bindAutoCompleteView.setSelection(bindAutoCompleteView.length());
                break;
            case 20:
                StreamerMovieData streamerMovieData = (StreamerMovieData) obj;
                int i7 = StreamerMoviesFragment.j1;
                js3.p(view, "<unused var>");
                js3.p((v68) qg5Var, "<unused var>");
                js3.p(streamerMovieData, "recyclerData");
                MovieDto movieDto2 = streamerMovieData.a;
                pk5.g(((StreamerMoviesFragment) obj2).J0, new NavIntentDirections.MovieDetail(new v15(movieDto2.getId(), movieDto2.getRefId(), false, movieDto2.getPosterUrl(), null)), -1);
                break;
            case 23:
                AnswerData answerData = (AnswerData) obj;
                int i8 = SurveyFragment.l1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.app.survey.recycler.a) qg5Var, "<unused var>");
                js3.p(answerData, "recyclerData");
                ((SurveyFragment) obj2).Q1().r(new SurveyAction.Answer(answerData.a.getId()));
                break;
            default:
                ThemeStyleItemData themeStyleItemData = (ThemeStyleItemData) obj;
                int i9 = ThemeStyleFragment.Z0;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.setting.themeStyle.recycler.a) qg5Var, "<unused var>");
                js3.p(themeStyleItemData, "recyclerData");
                ((ThemeStyleFragment) obj2).k1().r(new ThemeStyleAction.SelectThemeAction(themeStyleItemData.a));
                break;
        }
    }

    @Override // defpackage.wt5
    public void n(String str) {
        PaymentRetryBottomDialogFragment paymentRetryBottomDialogFragment = (PaymentRetryBottomDialogFragment) this.b;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("select", paymentRetryBottomDialogFragment.L(rs6.feedback_spinner_select_payment));
        builderBuildUpon.appendQueryParameter("focus", "true");
        bi5 bi5Var = paymentRetryBottomDialogFragment.f1;
        builderBuildUpon.appendQueryParameter("packageName", ((m46) bi5Var.getValue()).b);
        builderBuildUpon.appendQueryParameter("scenario", ((m46) bi5Var.getValue()).d);
        builderBuildUpon.appendQueryParameter("title", ((m46) bi5Var.getValue()).c);
        FragmentActivity fragmentActivityF = paymentRetryBottomDialogFragment.F();
        Uri uriBuild = builderBuildUpon.build();
        js3.o(uriBuild, "build(...)");
        js8.q(fragmentActivityF, uriBuild, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
        paymentRetryBottomDialogFragment.R0(DialogResult.b, new Bundle());
    }

    @Override // defpackage.dt5
    public void onFailure(Exception exc) {
        vz7 vz7Var = (vz7) this.b;
        int i = 0;
        vz7Var.b.a.b("account_sms_retriever_fail", new String[0]);
        Object obj = gu2.d;
        Context context = vz7Var.a;
        int i2 = lu2.e;
        try {
            i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            t0.m("GooglePlayServicesUtil", "Google Play services is missing.");
        }
        sb7.p("SmsRetriever", "Cannot register for sms retriever", "gs-version: " + i + ", e: " + exc.getMessage());
    }

    @Override // defpackage.tt5
    public void onSuccess(Object obj) {
        ((a67) this.b).invoke(obj);
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        sd8 sd8Var = (sd8) this.b;
        ArrayList arrayList = sd8Var.b;
        if9 if9Var = lf9Var.a;
        no3 no3VarB = no3.b(if9Var.g(519), if9Var.g(64));
        no3 no3VarB2 = no3.b(if9Var.h(519), if9Var.h(64));
        if (!no3VarB.equals(sd8Var.c) || !no3VarB2.equals(sd8Var.d)) {
            sd8Var.c = no3VarB;
            sd8Var.d = no3VarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                an6 an6Var = (an6) arrayList.get(size);
                an6Var.c = no3VarB;
                an6Var.d = no3VarB2;
                an6Var.c();
            }
        }
        return lf9Var;
    }
}
