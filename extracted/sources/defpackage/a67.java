package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.foundation.gestures.o;
import androidx.compose.foundation.text.selection.f;
import androidx.fragment.app.d;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.common.recycler.FilteredAppNestedData;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.app.suggest.search.data.PlayApplicationDto;
import ir.mservices.market.app.suggest.search.data.PlayApplicationsDto;
import ir.mservices.market.app.suggest.search.ui.SuggestListViewModel;
import ir.mservices.market.app.suggest.search.ui.recycler.SuggestData;
import ir.mservices.market.app.update.UpdateViewModel;
import ir.mservices.market.app.url.UrlViewModel;
import ir.mservices.market.common.comment.SubmitCommentAction;
import ir.mservices.market.common.comment.SubmitCommentFragment;
import ir.mservices.market.common.comment.SubmitCommentViewModel;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.streamers.StreamerProfileViewModel;
import ir.mservices.market.movie.streamers.data.StreamerFullDto;
import ir.mservices.market.movie.streamers.data.StreamerMoviesDto;
import ir.mservices.market.movie.streamers.movies.StreamerMoviesViewModel;
import ir.mservices.market.social.profile.data.ProfileResponseDto;
import ir.mservices.market.social.profile.user.UserProfileHeaderViewModel;
import ir.mservices.market.social.requests.RequestViewModel;
import ir.mservices.market.social.requests.data.RequestListResponseDto;
import ir.mservices.market.social.users.common.data.UsersDto;
import ir.mservices.market.social.users.list.UsersListViewModel;
import ir.mservices.market.version2.fragments.SingleImageFragment;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateListDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a67 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a67(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        x44 x44Var;
        RecyclerItem recyclerItem;
        RecyclerItem recyclerItem2;
        switch (this.a) {
            case 0:
                return RequestViewModel.allItems$lambda$0((RequestViewModel) this.b, (RequestListResponseDto) obj);
            case 1:
                xj1 xj1Var = (xj1) this.b;
                cc8 cc8Var = (cc8) obj;
                js3.p(cc8Var, "db");
                xj1Var.i = cc8Var;
                return tx8.a;
            case 2:
                fd7 fd7Var = ((cd7) this.b).c;
                return Boolean.valueOf(fd7Var != null ? fd7Var.b(obj) : true);
            case 3:
                ((bd7) this.b).f(obj);
                return tx8.a;
            case 4:
                ((y08) this.b).remove(obj);
                return tx8.a;
            case 5:
                tg7 tg7Var = (tg7) this.b;
                float fFloatValue = ((Float) obj).floatValue();
                float f = tg7Var.f() + fFloatValue + tg7Var.f;
                float fS = ok4.s(f, 0.0f, tg7Var.e.h());
                z = f == fS;
                float f2 = fS - tg7Var.f();
                int iRound = Math.round(f2);
                tg7Var.a.i(tg7Var.f() + iRound);
                tg7Var.f = f2 - iRound;
                if (!z) {
                    fFloatValue = f2;
                }
                return Float.valueOf(fFloatValue);
            case 6:
                o oVar = (o) this.b;
                return new nr5(oVar.c(oVar.k, ((nr5) obj).a, oVar.j));
            case 7:
                nm7 nm7Var = (nm7) this.b;
                o87 o87Var = (o87) obj;
                js3.p(o87Var, "$this$graphicsLayer");
                o87Var.b(nm7Var.a ? 1.0f : 0.0f);
                return tx8.a;
            case 8:
                wx7 wx7Var = (wx7) this.b;
                ah6 ah6Var = (ah6) obj;
                long j = ah6Var.c;
                f fVar = (f) wx7Var.c;
                if (!fVar.n() || fVar.q().a.b.length() == 0 || (x44Var = fVar.d) == null || x44Var.d() == null) {
                    z = false;
                } else {
                    wx7Var.d(fVar.q(), j, false, eq.H);
                }
                if (z) {
                    ah6Var.a();
                }
                return tx8.a;
            case 9:
                uq3 uq3Var = (uq3) this.b;
                mq8 mq8Var = (mq8) obj;
                js3.p(mq8Var, "stash");
                int[] iArr = mq8Var.a;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                    } else if (!uq3Var.a(iArr[i])) {
                        i++;
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                v7 v7Var = (v7) this.b;
                js3.p(obj, "it");
                return v7Var.invoke();
            case 11:
                ArrayList arrayList = (ArrayList) this.b;
                a96 a96Var = (a96) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a96Var.g((b96) arrayList.get(i2), 0, 0, 0.0f);
                }
                return tx8.a;
            case 12:
                SingleImageFragment singleImageFragment = (SingleImageFragment) this.b;
                rs5 rs5Var = (rs5) obj;
                int i3 = SingleImageFragment.P0;
                js3.p(rs5Var, "$this$addOnBackPressedDispatcherCallback");
                bt5 bt5VarF = singleImageFragment.F();
                zt5 zt5Var = bt5VarF instanceof zt5 ? (zt5) bt5VarF : null;
                if (zt5Var != null) {
                    LaunchContentActivity launchContentActivity = (LaunchContentActivity) zt5Var;
                    d dVarF = launchContentActivity.L().F(rr6.avatar_container);
                    if (dVarF != null) {
                        wl2 wl2VarL = launchContentActivity.L();
                        wl2VarL.getClass();
                        p40 p40Var = new p40(wl2VarL);
                        p40Var.j(dVarF);
                        p40Var.e();
                    }
                }
                rs5Var.f(false);
                return tx8.a;
            case 13:
                ((vz7) this.b).b.a.b("account_sms_retriever_success", new String[0]);
                sb7.p("SmsRetriever", "Successfully register for sms retriever", null);
                return tx8.a;
            case 14:
                sb5 sb5Var = (sb5) this.b;
                if (obj instanceof f58) {
                    ((f58) obj).g(4);
                }
                sb5Var.d(obj);
                return tx8.a;
            case 15:
                a18 a18Var = (a18) this.b;
                synchronized (a18Var.g) {
                    z08 z08Var = a18Var.i;
                    js3.m(z08Var);
                    Object obj2 = z08Var.b;
                    js3.m(obj2);
                    int i4 = z08Var.d;
                    ib5 ib5Var = z08Var.c;
                    if (ib5Var == null) {
                        ib5Var = new ib5();
                        z08Var.c = ib5Var;
                        z08Var.f.m(obj2, ib5Var);
                    }
                    z08Var.b(obj, i4, obj2, ib5Var);
                }
                return tx8.a;
            case 16:
                return ((StreamerMoviesViewModel) this.b).fillData((StreamerMoviesDto) obj);
            case 17:
                return ((StreamerProfileViewModel) this.b).fillData((StreamerFullDto) obj);
            case 18:
                SubmitCommentFragment submitCommentFragment = (SubmitCommentFragment) this.b;
                int iIntValue = ((Integer) obj).intValue();
                int i5 = SubmitCommentFragment.e1;
                ((SubmitCommentViewModel) submitCommentFragment.Y0.getValue()).r(new SubmitCommentAction.UpdateRateState(iIntValue));
                return tx8.a;
            case 19:
                SuggestListViewModel suggestListViewModel = (SuggestListViewModel) this.b;
                PlayApplicationsDto playApplicationsDto = (PlayApplicationsDto) obj;
                suggestListViewModel.v.d(playApplicationsDto.getNextPageUrl(), "next_url");
                List<PlayApplicationDto> apps = playApplicationsDto.getApps();
                ArrayList<PlayApplicationDto> arrayList2 = new ArrayList();
                for (Object obj3 : apps) {
                    String packageName = ((PlayApplicationDto) obj3).getPackageName();
                    if (packageName != null && !f88.n0(packageName)) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(wu0.V(arrayList2, 10));
                for (PlayApplicationDto playApplicationDto : arrayList2) {
                    if (playApplicationDto.getAppInfo() == null) {
                        String packageName2 = playApplicationDto.getPackageName();
                        if (packageName2 == null) {
                            packageName2 = "";
                        }
                        String title = playApplicationDto.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        String icon = playApplicationDto.getIcon();
                        if (icon == null) {
                            icon = "";
                        }
                        boolean zIsAvailable = playApplicationDto.isAvailable();
                        String refId = playApplicationDto.getRefId();
                        recyclerItem = new RecyclerItem(new SuggestData(packageName2, title, icon, refId == null ? "" : refId, zIsAvailable));
                    } else {
                        yl5 yl5Var = suggestListViewModel.y;
                        String packageName3 = playApplicationDto.getPackageName();
                        if (packageName3 == null) {
                            packageName3 = "";
                        }
                        recyclerItem = new RecyclerItem(new AppData((vb7) yl5Var.a(packageName3), suggestListViewModel.x.b, playApplicationDto.getAppInfo()));
                    }
                    arrayList3.add(recyclerItem);
                }
                return arrayList3;
            case 20:
                Drawable drawable = (Drawable) this.b;
                hv1 hv1Var = (hv1) obj;
                tm0 tm0VarV = hv1Var.X().v();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (hv1Var.d() >> 32)), (int) Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)));
                drawable.draw(ve.a(tm0VarV));
                return tx8.a;
            case 21:
                ((dp2) obj).invoke((xf8) this.b);
                return tx8.a;
            case 22:
                qh8 qh8Var = (qh8) this.b;
                float fFloatValue2 = ((Float) obj).floatValue();
                float fA = qh8Var.a() + fFloatValue2;
                l08 l08Var = qh8Var.b;
                if (fA > l08Var.h()) {
                    fFloatValue2 = l08Var.h() - qh8Var.a();
                } else if (fA < 0.0f) {
                    fFloatValue2 = -qh8Var.a();
                }
                qh8Var.a.i(qh8Var.a() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            case 23:
                zs8 zs8Var = (zs8) this.b;
                qs0 qs0Var = (qs0) obj;
                js3.p(qs0Var, "$this$buildClassSerialDescriptor");
                qs0.a(qs0Var, "first", zs8Var.a.getDescriptor());
                qs0.a(qs0Var, "second", zs8Var.b.getDescriptor());
                qs0.a(qs0Var, "third", zs8Var.c.getDescriptor());
                return tx8.a;
            case 24:
                return UpdateViewModel.getEmptyListRecyclerData$lambda$0((UpdateViewModel) this.b, (HomeExtensionAppsDto) obj);
            case 25:
                UrlViewModel urlViewModel = (UrlViewModel) this.b;
                List<ApplicationStateDto> items = ((ApplicationStateListDto) obj).getItems();
                js3.o(items, "getItems(...)");
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    DownloadSummeryApplicationDto app = ((ApplicationStateDto) it.next()).getApp();
                    if (app != null) {
                        yl5 yl5Var2 = urlViewModel.t;
                        String packageName4 = app.getPackageName();
                        js3.o(packageName4, "getPackageName(...)");
                        recyclerItem2 = new RecyclerItem(new FilteredAppNestedData(app, "", true, yl5Var2.a(packageName4), urlViewModel.u.b, false, 96, 0));
                    } else {
                        recyclerItem2 = null;
                    }
                    if (recyclerItem2 != null) {
                        arrayList4.add(recyclerItem2);
                    }
                }
                return arrayList4;
            case 26:
                List listFillRecyclerData = ((UserProfileHeaderViewModel) this.b).fillRecyclerData((ProfileResponseDto) obj);
                ArrayList arrayList5 = new ArrayList(wu0.V(listFillRecyclerData, 10));
                Iterator it2 = listFillRecyclerData.iterator();
                while (it2.hasNext()) {
                    bl4.G((MyketRecyclerData) it2.next(), arrayList5);
                }
                return arrayList5;
            case 27:
                return UsersListViewModel.getItems$lambda$0((UsersListViewModel) this.b, (UsersDto) obj);
            default:
                qd9 qd9Var = (qd9) this.b;
                String str = (String) obj;
                if (str != null) {
                    og5 og5Var = qd9Var.w;
                    View view = qd9Var.a;
                    js3.o(view, "itemView");
                    og5Var.m(view, qd9Var, str);
                }
                return tx8.a;
        }
    }
}
