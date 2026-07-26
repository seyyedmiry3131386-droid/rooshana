package ir.mservices.market.app.search.result.ui.recycler;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f88;
import defpackage.h69;
import defpackage.js3;
import defpackage.o40;
import defpackage.og5;
import defpackage.q69;
import defpackage.qg5;
import defpackage.r82;
import defpackage.rr6;
import defpackage.s82;
import defpackage.sj8;
import defpackage.xf5;
import defpackage.yq6;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends qg5 {
    public static final /* synthetic */ int F = 0;
    public final TextView A;
    public final AppIconView B;
    public final FastDownloadView C;
    public final TextView D;
    public final MyketAdInfoView E;
    public final s82 w;
    public final og5 x;
    public xf5 y;
    public final AppInfoView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, s82 s82Var, og5 og5Var) {
        super(view);
        js3.p(s82Var, "fastDownloadClickListener");
        this.w = s82Var;
        this.x = og5Var;
        View viewFindViewById = view.findViewById(rr6.textTitle);
        js3.o(viewFindViewById, "findViewById(...)");
        this.A = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(rr6.textCategory);
        js3.o(viewFindViewById2, "findViewById(...)");
        this.D = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(rr6.imagecell);
        js3.o(viewFindViewById3, "findViewById(...)");
        this.B = (AppIconView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(rr6.download_state_view);
        js3.o(viewFindViewById4, "findViewById(...)");
        this.C = (FastDownloadView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(rr6.app_info);
        js3.o(viewFindViewById5, "findViewById(...)");
        this.z = (AppInfoView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(rr6.ad_info);
        js3.o(viewFindViewById6, "findViewById(...)");
        this.E = (MyketAdInfoView) viewFindViewById6;
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void s(SearchApplicationData searchApplicationData) {
        js3.p(searchApplicationData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ApplicationSpecialViewHolder$onAttach$1(null, this, searchApplicationData), 3);
        bt2.G(cc7.q(view), null, null, new ApplicationSpecialViewHolder$onAttach$2(null, this, searchApplicationData), 3);
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(SearchApplicationData searchApplicationData) {
        js3.p(searchApplicationData, "app");
        ApplicationDTO applicationDTO = searchApplicationData.c;
        String str = searchApplicationData.f;
        View view = this.a;
        if (str == null || f88.n0(str)) {
            view.setBackgroundColor(sj8.b().l);
        } else {
            view.setBackgroundColor(Color.parseColor(str));
        }
        js3.o(view, "itemView");
        qg5.v(view, this.x, this, searchApplicationData);
        this.A.setText(applicationDTO.getTitle());
        int i = yq6.icon;
        AppIconView appIconView = this.B;
        appIconView.setErrorImageResId(i);
        AppIconView.setImageUrl$default(appIconView, applicationDTO.getIconPath(), null, false, 6, null);
        String strY = o40.y("image_", applicationDTO.getPackageName(), applicationDTO.getAdInfoDto() != null ? "_ad" : "");
        WeakHashMap weakHashMap = q69.a;
        h69.n(appIconView, strY);
        this.z.setData(applicationDTO.getTotalRating(), searchApplicationData.e);
        z(applicationDTO);
        this.E.setData(applicationDTO.getAdInfoDto());
        boolean zIsIncompatible = applicationDTO.isIncompatible();
        String packageName = applicationDTO.getPackageName();
        String title = applicationDTO.getTitle();
        boolean zIsFree = applicationDTO.isFree();
        String buttonText = applicationDTO.getButtonText();
        applicationDTO.getRealPrice();
        applicationDTO.hasIAP();
        applicationDTO.getVersion();
        int versionCode = applicationDTO.getVersionCode();
        long fileSize = applicationDTO.getFileSize();
        boolean zHasMainData = applicationDTO.hasMainData();
        boolean zHasPatchData = applicationDTO.hasPatchData();
        String iconPath = applicationDTO.getIconPath();
        applicationDTO.getCategoryName();
        r82 r82Var = new r82(zIsIncompatible, packageName, title, zIsFree, buttonText, versionCode, fileSize, zHasMainData, zHasPatchData, iconPath, applicationDTO.getForceUpdate());
        String refId = applicationDTO.getRefId();
        Bundle bundle = r82Var.k;
        bundle.putString("refId", refId);
        bundle.putString("BUNDLE_KEY_CALLBACK_URL", applicationDTO.getCallbackUrl());
        bundle.putString("installCallbackUrl", applicationDTO.getInstallCallbackUrl());
        bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
        this.C.setData(r82Var, this.w);
    }

    public final void z(ApplicationDTO applicationDTO) {
        xf5 xf5Var = this.y;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        String packageName = applicationDTO.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        int versionCode = applicationDTO.getVersionCode();
        boolean zIsIncompatible = applicationDTO.isIncompatible();
        ForceUpdateDto forceUpdate = applicationDTO.getForceUpdate();
        String tagline = applicationDTO.getTagline();
        xf5Var.l(packageName, versionCode, zIsIncompatible, forceUpdate, this.D, (tagline == null || f88.n0(tagline)) ? applicationDTO.getCategoryName() : applicationDTO.getTagline());
    }
}
