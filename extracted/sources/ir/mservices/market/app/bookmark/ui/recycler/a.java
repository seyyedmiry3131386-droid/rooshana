package ir.mservices.market.app.bookmark.ui.recycler;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import defpackage.a79;
import defpackage.bn6;
import defpackage.bt2;
import defpackage.c63;
import defpackage.cc7;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.m13;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.r82;
import defpackage.s82;
import defpackage.v4;
import defpackage.w91;
import defpackage.xf5;
import defpackage.yq6;
import defpackage.z95;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.LayoutPageDTO;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ir.mservices.market.version2.ui.recycler.holder.a {
    public final og5 A;
    public c63 B;
    public final xf5 C;
    public final s82 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, z95 z95Var, bn6 bn6Var, v4 v4Var) {
        super(view, z95Var);
        js3.p(bn6Var, "fastDownloadClickListener");
        js3.p(v4Var, "onAppClickListener");
        this.z = bn6Var;
        this.A = v4Var;
        this.C = (xf5) ((w91) qg5.r()).F.get();
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a, defpackage.qg5
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void s(BookmarkApplicationData bookmarkApplicationData) {
        js3.p(bookmarkApplicationData, "data");
        super.s(bookmarkApplicationData);
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new BookmarkViewHolder$onAttach$1(bookmarkApplicationData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new BookmarkViewHolder$onAttach$2(bookmarkApplicationData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        BookmarkApplicationData bookmarkApplicationData = (BookmarkApplicationData) myketRecyclerData;
        js3.p(bookmarkApplicationData, "app");
        c63 c63Var = this.B;
        if (c63Var == null) {
            js3.V("binding");
            throw null;
        }
        m13 m13Var = c63Var.v;
        DownloadSummeryApplicationDto downloadSummeryApplicationDto = bookmarkApplicationData.j;
        m13Var.y.setText(downloadSummeryApplicationDto.getTitle());
        AppIconView appIconView = m13Var.w;
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, downloadSummeryApplicationDto.getIconPath(), null, false, 6, null);
        appIconView.setTransitionName("image_" + downloadSummeryApplicationDto.getPackageName());
        m13Var.x.setData(downloadSummeryApplicationDto.getTotalRating(), downloadSummeryApplicationDto.getDownloadSummary());
        xf5 xf5Var = this.C;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        String packageName = downloadSummeryApplicationDto.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        int versionCode = downloadSummeryApplicationDto.getVersionCode();
        boolean zIsIncompatible = downloadSummeryApplicationDto.isIncompatible();
        ForceUpdateDto forceUpdate = downloadSummeryApplicationDto.getForceUpdate();
        MyketTextView myketTextView = m13Var.z;
        js3.o(myketTextView, LayoutPageDTO.Type.CATEGORY);
        String tagline = downloadSummeryApplicationDto.getTagline();
        xf5Var.l(packageName, versionCode, zIsIncompatible, forceUpdate, myketTextView, (tagline == null || f88.n0(tagline)) ? downloadSummeryApplicationDto.getCategoryName() : downloadSummeryApplicationDto.getTagline());
        boolean zIsIncompatible2 = downloadSummeryApplicationDto.isIncompatible();
        String packageName2 = downloadSummeryApplicationDto.getPackageName();
        String title = downloadSummeryApplicationDto.getTitle();
        boolean zIsFree = downloadSummeryApplicationDto.isFree();
        String buttonText = downloadSummeryApplicationDto.getButtonText();
        downloadSummeryApplicationDto.getRealPrice();
        downloadSummeryApplicationDto.hasIAP();
        downloadSummeryApplicationDto.getVersion();
        int versionCode2 = downloadSummeryApplicationDto.getVersionCode();
        long fileSize = downloadSummeryApplicationDto.getFileSize();
        boolean zHasMainData = downloadSummeryApplicationDto.hasMainData();
        boolean zHasPatchData = downloadSummeryApplicationDto.hasPatchData();
        String iconPath = downloadSummeryApplicationDto.getIconPath();
        downloadSummeryApplicationDto.getCategoryName();
        r82 r82Var = new r82(zIsIncompatible2, packageName2, title, zIsFree, buttonText, versionCode2, fileSize, zHasMainData, zHasPatchData, iconPath, downloadSummeryApplicationDto.getForceUpdate());
        String refId = downloadSummeryApplicationDto.getRefId();
        Bundle bundle = r82Var.k;
        bundle.putString("refId", refId);
        bundle.putString("BUNDLE_KEY_CALLBACK_URL", downloadSummeryApplicationDto.getCallbackUrl());
        bundle.putString("installCallbackUrl", downloadSummeryApplicationDto.getInstallCallbackUrl());
        bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
        m13Var.A.setData(r82Var, this.z);
        m13Var.v.setData(downloadSummeryApplicationDto.getAdInfoDto());
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof c63) {
            this.B = (c63) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a
    public final og5 x() {
        return this.A;
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a
    public final Point z() {
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.app_icon_size);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_4);
        Point point = new Point();
        point.x = dimensionPixelSize - dimensionPixelSize2;
        point.y = dimensionPixelSize - (dimensionPixelSize2 * 3);
        return point;
    }
}
