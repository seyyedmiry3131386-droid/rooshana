package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.detail.developer.ui.recycler.DeveloperTitleRowData;
import ir.mservices.market.app.detail.reivews.recycler.OwnReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewHeaderData;
import ir.mservices.market.app.detail.reivews.recycler.c;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.ui.recycler.AppMyketSocialData;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.app.detail.ui.recycler.AppVideoShotData;
import ir.mservices.market.app.detail.ui.recycler.CommentMoreData;
import ir.mservices.market.app.detail.ui.recycler.MessageBoxData;
import ir.mservices.market.app.detail.ui.recycler.ReviewsMoreTitleRowData;
import ir.mservices.market.app.detail.ui.recycler.b;
import ir.mservices.market.app.detail.ui.recycler.h;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.ReplyReviewData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.reels.home.data.ReelRefId;
import ir.mservices.market.screenshots.ScreenshotData;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.manager.a;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationList;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.ScreenshotView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ap implements og5, r7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppDetailFragment b;

    public /* synthetic */ ap(AppDetailFragment appDetailFragment, int i) {
        this.a = i;
        this.b = appDetailFragment;
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = AppDetailFragment.M1;
        AppDetailFragment appDetailFragment = this.b;
        FragmentActivity fragmentActivityF = appDetailFragment.F();
        if (fragmentActivityF != null) {
            d56 d56Var = appDetailFragment.i1;
            if (d56Var != null) {
                d56Var.a(fragmentActivityF, zBooleanValue);
            } else {
                js3.V("permissionHelper");
                throw null;
            }
        }
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        FragmentActivity fragmentActivityF;
        NavIntentDirections.Recommended recommended;
        yi5 applicationList;
        String str;
        String str2;
        String title;
        String str3;
        ReviewDto reviewDto;
        ReviewDto reviewDto2;
        int i = this.a;
        AppDetailFragment appDetailFragment = this.b;
        switch (i) {
            case 0:
                ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                int i2 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((v62) qg5Var, "<unused var>");
                js3.p(extHeaderData, "recyclerData");
                String str4 = extHeaderData.a;
                if (ExtensionPointDto.TYPE_UPDATE_APP_LIST.equalsIgnoreCase(str4)) {
                    pk5.g(appDetailFragment.J0, new NavIntentDirections.Update(), -1);
                    return;
                } else if (ExtensionPointDto.TYPE_REEL_LIST.equalsIgnoreCase(str4)) {
                    pk5.g(appDetailFragment.J0, new NavIntentDirections.ReelsHome(new j17(ReelRefId.REEL_MORE_BTN)), -1);
                    return;
                } else {
                    String str5 = extHeaderData.c;
                    pk5.g(appDetailFragment.J0, new NavIntentDirections.UrlReceive(new t09(extHeaderData.b, dw1.n("Detail ext - ", str5), str5, m88.T(str4, ExtensionPointDto.TYPE_UPDATE_APP_LIST, false) ? "UpdateApps" : "Apps")), -1);
                    return;
                }
            case 1:
                mr mrVar = (mr) qg5Var;
                AppNestedData appNestedData = (AppNestedData) obj;
                int i3 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p(mrVar, "viewHolder");
                js3.p(appNestedData, "recyclerData");
                String str6 = appNestedData.b;
                ApplicationDTO applicationDTO = appNestedData.a;
                if (applicationDTO != null) {
                    appDetailFragment.a2(applicationDTO, mrVar.x(), new Tracker("detail", str6, "recommendation"));
                    ra3 ra3VarX1 = appDetailFragment.X1();
                    String packageName = applicationDTO.getPackageName();
                    js3.o(packageName, "getPackageName(...)");
                    ra3VarX1.c(str6, packageName);
                    return;
                }
                return;
            case 2:
                h95 h95Var = (h95) qg5Var;
                AppNestedData appNestedData2 = (AppNestedData) obj;
                int i4 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p(h95Var, "viewHolder");
                js3.p(appNestedData2, "recyclerData");
                String str7 = appNestedData2.b;
                ApplicationDTO applicationDTO2 = appNestedData2.a;
                if (applicationDTO2 != null) {
                    appDetailFragment.a2(applicationDTO2, h95Var.x(), new Tracker("detail", str7, "recommendation"));
                    ra3 ra3VarX12 = appDetailFragment.X1();
                    String packageName2 = applicationDTO2.getPackageName();
                    js3.o(packageName2, "getPackageName(...)");
                    ra3VarX12.c(str7, packageName2);
                    return;
                }
                return;
            case 3:
                bq bqVar = (bq) qg5Var;
                AppNestedData appNestedData3 = (AppNestedData) obj;
                int i5 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p(bqVar, "viewHolder");
                js3.p(appNestedData3, "recyclerData");
                String str8 = appNestedData3.b;
                ApplicationDTO applicationDTO3 = appNestedData3.a;
                if (applicationDTO3 != null) {
                    appDetailFragment.a2(applicationDTO3, bqVar.x(), new Tracker("detail", str8, "recommendation"));
                    ra3 ra3VarX13 = appDetailFragment.X1();
                    String packageName3 = applicationDTO3.getPackageName();
                    js3.o(packageName3, "getPackageName(...)");
                    ra3VarX13.c(str8, packageName3);
                    return;
                }
                return;
            case 4:
                AppDeveloperInfoModuleData appDeveloperInfoModuleData = (AppDeveloperInfoModuleData) obj;
                int i6 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((aq) qg5Var, "<unused var>");
                js3.p(appDeveloperInfoModuleData, "recyclerData");
                hl1 hl1Var = appDeveloperInfoModuleData.a;
                if (hl1Var instanceof dl1) {
                    FragmentActivity fragmentActivityF2 = appDetailFragment.F();
                    if (fragmentActivityF2 != null) {
                        Object obj2 = lw8.b;
                        String str9 = hl1Var.c;
                        String strL = appDetailFragment.L(rs6.sending_email);
                        js3.o(strL, "getString(...)");
                        js8.v(fragmentActivityF2, str9, strL);
                        return;
                    }
                    return;
                }
                if (hl1Var instanceof gl1) {
                    xf5 xf5Var = appDetailFragment.o1;
                    if (xf5Var == null) {
                        js3.V("myketUIUtils");
                        throw null;
                    }
                    FragmentActivity fragmentActivityF3 = appDetailFragment.F();
                    am2 am2Var = appDetailFragment.J0;
                    String str10 = hl1Var.c;
                    String strL2 = appDetailFragment.L(rs6.website_developer_link);
                    js3.o(strL2, "getString(...)");
                    xf5Var.k(fragmentActivityF3, am2Var, str10, strL2, false, false, false, false, true, false);
                    return;
                }
                if (!(hl1Var instanceof fl1) || (fragmentActivityF = appDetailFragment.F()) == null) {
                    return;
                }
                Object obj3 = lw8.b;
                String str11 = hl1Var.c;
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:".concat(str11)));
                intent.setData(Uri.fromParts("tel", str11, "#"));
                if (intent.resolveActivity(fragmentActivityF.getPackageManager()) != null) {
                    fragmentActivityF.startActivity(intent);
                    return;
                } else {
                    Context contextH = appDetailFragment.H();
                    hh2.H(new hh2(contextH, contextH != null ? contextH.getString(rs6.uncatchable_intent) : null));
                    return;
                }
            case 5:
                DeveloperTitleRowData developerTitleRowData = (DeveloperTitleRowData) obj;
                int i7 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((sl1) qg5Var, "<unused var>");
                js3.p(developerTitleRowData, "recyclerData");
                String str12 = developerTitleRowData.a;
                pk5.g(appDetailFragment.J0, new NavIntentDirections.Developer(new ml1("", str12, appDetailFragment.K().getString(developerTitleRowData.b), new Tracker("developer", str12, "recommendation"))), -1);
                return;
            case 6:
                MessageBoxData messageBoxData = (MessageBoxData) obj;
                int i8 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((av4) qg5Var, "<unused var>");
                js3.p(messageBoxData, "recyclerData");
                MessageBoxDto messageBoxDto = messageBoxData.a;
                String action = messageBoxDto.getAction();
                if (action == null || f88.n0(action)) {
                    return;
                }
                Context contextH2 = appDetailFragment.H();
                String action2 = messageBoxDto.getAction();
                if (action2 != null) {
                    t61.v(action2, "parse(...)", contextH2, NearbyRepository.SERVICE_ID, null);
                    return;
                }
                return;
            case 7:
                HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                int i9 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((tb3) qg5Var, "<unused var>");
                js3.p(homeMoreTitleRowData, "recyclerData");
                String str13 = homeMoreTitleRowData.a;
                List list = homeMoreTitleRowData.f;
                if (str13 != null) {
                    appDetailFragment.X1().e(str13);
                }
                if (list.isEmpty() || !((str2 = homeMoreTitleRowData.b) == null || f88.n0(str2))) {
                    if (str13 == null || f88.n0(str13) || (str = homeMoreTitleRowData.e) == null || f88.n0(str)) {
                        recommended = null;
                    } else {
                        c5 c5Var = appDetailFragment.n1;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        String strA = c5Var.a();
                        js3.o(strA, "getAccountId(...)");
                        hp hpVar = appDetailFragment.u1;
                        if (hpVar == null) {
                            js3.V("navArgs");
                            throw null;
                        }
                        String str14 = hpVar.a;
                        String str15 = homeMoreTitleRowData.a;
                        recommended = new NavIntentDirections.Recommended(new jy6(strA, str14, str15, homeMoreTitleRowData.e, new Tracker("recommendation", str15, "recommendation")));
                    }
                    applicationList = recommended;
                } else {
                    ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                    List list2 = homeMoreTitleRowData.g;
                    applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str13, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                }
                if (applicationList != null) {
                    pk5.g(appDetailFragment.J0, applicationList, -1);
                    return;
                }
                return;
            case 8:
                bs bsVar = (bs) qg5Var;
                AppScreenshotData appScreenshotData = (AppScreenshotData) obj;
                int i10 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p(bsVar, "viewHolder");
                js3.p(appScreenshotData, "recyclerData");
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("detail_screenshot");
                clickEventBuilder.a();
                List<ScreenshotDto> list3 = appScreenshotData.b;
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList(wu0.V(list3, 10));
                    for (ScreenshotDto screenshotDto : list3) {
                        arrayList.add(new ScreenshotData(screenshotDto.getMainUrl(), screenshotDto.getThumbnailUrl()));
                    }
                    ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                    if (applicationFullDtoR == null || (title = applicationFullDtoR.getTitle()) == null) {
                        return;
                    }
                    am2 am2Var2 = appDetailFragment.J0;
                    int iIndexOf = list3.indexOf(appScreenshotData.a);
                    String strN = dw1.n("screenshot:", appScreenshotData.c);
                    ScreenshotData[] screenshotDataArr = (ScreenshotData[]) arrayList.toArray(new ScreenshotData[0]);
                    h83 h83Var = bsVar.y;
                    if (h83Var == null) {
                        js3.V("binding");
                        throw null;
                    }
                    ScreenshotView screenshotView = h83Var.w;
                    js3.o(screenshotView, "screenshot");
                    js3.p(strN, "contextInfo");
                    js3.p(screenshotDataArr, "images");
                    int[] iArr = {(screenshotView.getWidth() / 2) + i, (screenshotView.getHeight() / 2) + i};
                    screenshotView.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    pk5.g(am2Var2, new NavIntentDirections.DraggableScreenshot(new bv1(iIndexOf, strN, title, screenshotDataArr, iArr)), -1);
                    return;
                }
                return;
            case 9:
                AppVideoShotData appVideoShotData = (AppVideoShotData) obj;
                int i13 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((h) qg5Var, "<unused var>");
                js3.p(appVideoShotData, "recyclerData");
                appDetailFragment.T1().a.b("detail_video", "package_name", appVideoShotData.a);
                return;
            case 10:
                MovieHomeBannersRowData movieHomeBannersRowData = (MovieHomeBannersRowData) obj;
                int i14 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((g35) qg5Var, "<unused var>");
                js3.p(movieHomeBannersRowData, "recyclerData");
                k50 k50VarT1 = appDetailFragment.T1();
                HomeMovieBannerListDto homeMovieBannerListDto = movieHomeBannersRowData.g;
                k50VarT1.a.b("app_banner", AppMeasurementSdk.ConditionalUserProperty.NAME, homeMovieBannerListDto != null ? homeMovieBannerListDto.getAnalyticsName() : null);
                pk5.g(appDetailFragment.J0, new NavIntentDirections.MovieBannersList(new a05(homeMovieBannerListDto, true, homeMovieBannerListDto != null ? homeMovieBannerListDto.getBannerListKey() : null, homeMovieBannerListDto != null ? homeMovieBannerListDto.getRefId() : null)), -1);
                return;
            case 11:
                MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                int i15 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((h35) qg5Var, "<unused var>");
                js3.p(movieHomeBannersItemData, "recyclerData");
                k50 k50VarT12 = appDetailFragment.T1();
                HomeMovieBannerDto homeMovieBannerDto = movieHomeBannersItemData.a;
                k50VarT12.a.b("app_banner_list_item", AppMeasurementSdk.ConditionalUserProperty.NAME, homeMovieBannerDto.getAnalyticsName());
                FragmentActivity fragmentActivityF4 = appDetailFragment.F();
                String action3 = homeMovieBannerDto.getAction();
                if (action3 != null) {
                    t61.w(action3, "parse(...)", fragmentActivityF4, NearbyRepository.SERVICE_ID, null);
                    return;
                }
                return;
            case 12:
                int i16 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((br) qg5Var, "<unused var>");
                js3.p((AppMyketSocialData) obj, "<unused var>");
                if (!appDetailFragment.Y1().H("org.telegram.messenger")) {
                    appDetailFragment.c2("http://telegram.me/myket_ir", "share_telegram");
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("tg:resolve?domain=myket_ir"));
                appDetailFragment.y0(intent2);
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("share_telegram");
                clickEventBuilder2.a();
                return;
            case 13:
                int i17 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((br) qg5Var, "<unused var>");
                js3.p((AppMyketSocialData) obj, "<unused var>");
                appDetailFragment.c2("https://instagram.com/myketappstore", "share_instagram");
                return;
            case 14:
                AppDownloadData appDownloadData = (AppDownloadData) obj;
                int i18 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((b) qg5Var, "<unused var>");
                js3.p(appDownloadData, "recyclerData");
                a aVarS1 = appDetailFragment.S1();
                String str16 = appDownloadData.g;
                int iOrdinal = aVarS1.d(str16, appDownloadData.j, appDownloadData.e, appDownloadData.k).ordinal();
                String str17 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 6 ? null : "run" : AppStatusDto.Type.UPDATE : "download";
                if (str17 != null) {
                    if (str17.equalsIgnoreCase(appDetailFragment.H1)) {
                        str17 = null;
                    }
                    if (str17 != null) {
                        appDetailFragment.H1 = str17;
                        appDetailFragment.T1().a.b("detail_button_state", "package_name", str16, "type", str17);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                CommentMoreData commentMoreData = (CommentMoreData) obj;
                int i19 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((vw0) qg5Var, "<unused var>");
                js3.p(commentMoreData, "recyclerData");
                ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                clickEventBuilder3.b("detail_all_review_more");
                clickEventBuilder3.a();
                List list4 = commentMoreData.a;
                if (list4 != null) {
                    hp hpVar2 = appDetailFragment.u1;
                    if (hpVar2 != null) {
                        appDetailFragment.b2(hpVar2.a, list4);
                        return;
                    } else {
                        js3.V("navArgs");
                        throw null;
                    }
                }
                return;
            case 16:
                AppDownloadData appDownloadData2 = (AppDownloadData) obj;
                int i20 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((b) qg5Var, "<unused var>");
                js3.p(appDownloadData2, "recyclerData");
                String str18 = appDownloadData2.g;
                sb7.p("AppDetail", "App Download Click", "Packagename: " + str18);
                appDetailFragment.j2();
                if (appDownloadData2.f) {
                    dp3 dp3VarY1 = appDetailFragment.Y1();
                    int i21 = appDownloadData2.j;
                    ForceUpdateDto forceUpdateDto = appDownloadData2.k;
                    str3 = js3.i(dp3VarY1.d(str18, i21, forceUpdateDto != null ? Long.valueOf(forceUpdateDto.getFileLength()) : null), Boolean.TRUE) ? "detail_button_gift" : "detail_button_download";
                } else {
                    str3 = "detail_button_purchase";
                }
                dw1.y(str3);
                return;
            case 17:
                ReviewsMoreTitleRowData reviewsMoreTitleRowData = (ReviewsMoreTitleRowData) obj;
                int i22 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((f97) qg5Var, "<unused var>");
                js3.p(reviewsMoreTitleRowData, "recyclerData");
                ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                clickEventBuilder4.b("detail_all_review");
                clickEventBuilder4.a();
                List list5 = reviewsMoreTitleRowData.b;
                if (list5 != null) {
                    appDetailFragment.b2(reviewsMoreTitleRowData.c, list5);
                    return;
                }
                return;
            case 18:
                ReviewHeaderData reviewHeaderData = (ReviewHeaderData) obj;
                int i23 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((v87) qg5Var, "<unused var>");
                js3.p(reviewHeaderData, "recyclerData");
                ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                clickEventBuilder5.b("detail_all_review_header");
                clickEventBuilder5.a();
                List list6 = reviewHeaderData.c;
                if (list6 != null) {
                    appDetailFragment.b2(reviewHeaderData.d, list6);
                    return;
                }
                return;
            case 19:
                OwnReviewData ownReviewData = (OwnReviewData) obj;
                int i24 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.app.detail.reivews.recycler.b) qg5Var, "<unused var>");
                js3.p(ownReviewData, "recyclerData");
                ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                clickEventBuilder6.b("review_edit_detail");
                clickEventBuilder6.a();
                ReviewDto reviewDto3 = (ReviewDto) ownReviewData.b.getValue();
                if (!(reviewDto3 != null ? js3.i(reviewDto3.isShowEditConfirm(), Boolean.TRUE) : false)) {
                    appDetailFragment.g2(ownReviewData);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("BUNDLE_KEY_DATA", ownReviewData);
                pk5.g(appDetailFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_EDIT_RATE", bundle, 8), null, appDetailFragment.L(rs6.show_edit_confirm), appDetailFragment.L(rs6.edit_rate), appDetailFragment.L(rs6.button_cancel), true)), -1);
                return;
            case 20:
                OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                int i25 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.app.detail.reivews.recycler.b) qg5Var, "<unused var>");
                js3.p(ownReviewData2, "recyclerData");
                ClickEventBuilder clickEventBuilder7 = new ClickEventBuilder();
                clickEventBuilder7.b("detail_see_own_sub_review");
                clickEventBuilder7.a();
                ReviewDto reviewDto4 = (ReviewDto) ownReviewData2.b.getValue();
                if (reviewDto4 != null) {
                    hp hpVar3 = appDetailFragment.u1;
                    if (hpVar3 != null) {
                        appDetailFragment.f2(hpVar3.a, reviewDto4);
                        return;
                    } else {
                        js3.V("navArgs");
                        throw null;
                    }
                }
                return;
            case 21:
                OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                int i26 = AppDetailFragment.M1;
                js3.p(view, "view");
                js3.p((ir.mservices.market.app.detail.reivews.recycler.b) qg5Var, "<unused var>");
                js3.p(ownReviewData3, "recyclerData");
                ClickEventBuilder clickEventBuilder8 = new ClickEventBuilder();
                clickEventBuilder8.b("detail_like_review");
                clickEventBuilder8.a();
                BuzzProgressImageView buzzProgressImageView = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                if (buzzProgressImageView != null && buzzProgressImageView.a() && (reviewDto = (ReviewDto) ownReviewData3.b.getValue()) != null) {
                    hp hpVar4 = appDetailFragment.u1;
                    if (hpVar4 == null) {
                        js3.V("navArgs");
                        throw null;
                    }
                    appDetailFragment.i2(hpVar4.a, reviewDto, true);
                }
                fw0 fw0VarU1 = appDetailFragment.U1();
                hp hpVar5 = appDetailFragment.u1;
                if (hpVar5 != null) {
                    fw0VarU1.b("_detail", hpVar5.a, ownReviewData3.d);
                    return;
                } else {
                    js3.V("navArgs");
                    throw null;
                }
            case 22:
                OwnReviewData ownReviewData4 = (OwnReviewData) obj;
                int i27 = AppDetailFragment.M1;
                js3.p(view, "view");
                js3.p((ir.mservices.market.app.detail.reivews.recycler.b) qg5Var, "<unused var>");
                js3.p(ownReviewData4, "recyclerData");
                ClickEventBuilder clickEventBuilder9 = new ClickEventBuilder();
                clickEventBuilder9.b("detail_dislike_review");
                clickEventBuilder9.a();
                BuzzProgressImageView buzzProgressImageView2 = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                if (buzzProgressImageView2 != null && buzzProgressImageView2.a() && (reviewDto2 = (ReviewDto) ownReviewData4.b.getValue()) != null) {
                    hp hpVar6 = appDetailFragment.u1;
                    if (hpVar6 == null) {
                        js3.V("navArgs");
                        throw null;
                    }
                    appDetailFragment.i2(hpVar6.a, reviewDto2, false);
                }
                fw0 fw0VarU12 = appDetailFragment.U1();
                hp hpVar7 = appDetailFragment.u1;
                if (hpVar7 != null) {
                    fw0VarU12.a("_detail", hpVar7.a, ownReviewData4.d);
                    return;
                } else {
                    js3.V("navArgs");
                    throw null;
                }
            case 23:
                ReviewData reviewData = (ReviewData) obj;
                int i28 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((c) qg5Var, "<unused var>");
                js3.p(reviewData, "recyclerData");
                ClickEventBuilder clickEventBuilder10 = new ClickEventBuilder();
                clickEventBuilder10.b("review_box_detail");
                clickEventBuilder10.a();
                hp hpVar8 = appDetailFragment.u1;
                if (hpVar8 != null) {
                    appDetailFragment.f2(hpVar8.a, reviewData.a);
                    return;
                } else {
                    js3.V("navArgs");
                    throw null;
                }
            case 24:
                ReviewData reviewData2 = (ReviewData) obj;
                int i29 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((c) qg5Var, "<unused var>");
                js3.p(reviewData2, "recyclerData");
                ReviewDto reviewDto5 = reviewData2.a;
                ClickEventBuilder clickEventBuilder11 = new ClickEventBuilder();
                clickEventBuilder11.b("review_reply_detail");
                clickEventBuilder11.a();
                AppDetailViewModel appDetailViewModelR1 = appDetailFragment.R1();
                clickEventBuilder11.b(!appDetailViewModelR1.B.G(appDetailViewModelR1.J0.a) ? "review_reply_not_installed" : "review_reply_installed");
                clickEventBuilder11.a();
                CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_reply", reviewData2.b, reviewDto5.getId(), reviewDto5));
                FragmentActivity fragmentActivityF5 = appDetailFragment.F();
                if (fragmentActivityF5 != null) {
                    pk5.c(fragmentActivityF5, replyReview);
                    return;
                }
                return;
            case 25:
                ReviewData reviewData3 = (ReviewData) obj;
                int i30 = AppDetailFragment.M1;
                js3.p(view, "view");
                js3.p((c) qg5Var, "<unused var>");
                js3.p(reviewData3, "recyclerData");
                String str19 = reviewData3.b;
                BuzzProgressImageView buzzProgressImageView3 = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                if (buzzProgressImageView3 != null && buzzProgressImageView3.a()) {
                    appDetailFragment.i2(str19, reviewData3.a, true);
                }
                fw0 fw0VarU13 = appDetailFragment.U1();
                Boolean bool = reviewData3.g;
                fw0VarU13.b("_detail", str19, bool != null ? bool.booleanValue() : false);
                return;
            case 26:
                ReviewData reviewData4 = (ReviewData) obj;
                int i31 = AppDetailFragment.M1;
                js3.p(view, "view");
                js3.p((c) qg5Var, "<unused var>");
                js3.p(reviewData4, "recyclerData");
                String str20 = reviewData4.b;
                dw1.y("detail_dislike_review");
                BuzzProgressImageView buzzProgressImageView4 = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                if (buzzProgressImageView4 != null && buzzProgressImageView4.a()) {
                    appDetailFragment.i2(str20, reviewData4.a, false);
                }
                fw0 fw0VarU14 = appDetailFragment.U1();
                Boolean bool2 = reviewData4.g;
                fw0VarU14.a("_detail", str20, bool2 != null ? bool2.booleanValue() : false);
                return;
            case 27:
                AppDownloadData appDownloadData3 = (AppDownloadData) obj;
                int i32 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((b) qg5Var, "<unused var>");
                js3.p(appDownloadData3, "recyclerData");
                String str21 = appDownloadData3.g;
                sb7.p("AppDetail", "App Pause Click", "Packagename: " + str21);
                AppDetailViewModel appDetailViewModelR12 = appDetailFragment.R1();
                js3.p(str21, "packageName");
                appDetailViewModelR12.D.s(str21);
                int iOrdinal2 = appDetailFragment.S1().d(str21, appDownloadData3.j, appDownloadData3.e, appDownloadData3.k).ordinal();
                String str22 = iOrdinal2 != 3 ? iOrdinal2 != 5 ? null : "button_install_in_progress" : "detail_button_pause";
                if (str22 != null) {
                    dw1.y(str22);
                    return;
                }
                return;
            default:
                ReviewData reviewData5 = (ReviewData) obj;
                int i33 = AppDetailFragment.M1;
                js3.p(view, "<unused var>");
                js3.p((c) qg5Var, "<unused var>");
                js3.p(reviewData5, "recyclerData");
                ClickEventBuilder clickEventBuilder12 = new ClickEventBuilder();
                clickEventBuilder12.b("detail_review_profile");
                clickEventBuilder12.a();
                ReviewDto reviewDto6 = reviewData5.a;
                String accountKey = reviewDto6.getAccountKey();
                String nickname = reviewDto6.getNickname();
                FragmentActivity fragmentActivityF6 = appDetailFragment.F();
                if (fragmentActivityF6 != null) {
                    pk5.e(fragmentActivityF6, accountKey, nickname, UserProfileRefId.b);
                    return;
                }
                return;
        }
    }
}
