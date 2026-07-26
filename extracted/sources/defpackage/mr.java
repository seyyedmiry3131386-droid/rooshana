package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketTextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class mr extends qg5 {
    public final int w;
    public s82 x;
    public og5 y;
    public nm z;

    public mr(int i, View view) {
        super(view);
        this.w = i;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppNestedData appNestedData = (AppNestedData) myketRecyclerData;
        js3.p(appNestedData, "applicationData");
        ApplicationDTO applicationDTO = appNestedData.a;
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.w;
        layoutParams.width = i;
        int dimensionPixelSize = i - view.getResources().getDimensionPixelSize(pq6.item_space);
        int iE = t61.e(view.getResources(), pq6.horizontal_space_inner, 2, dimensionPixelSize);
        nm nmVar = this.z;
        if (nmVar == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = nmVar.z;
        AppIconView appIconView = nmVar.y;
        FastDownloadView fastDownloadView = nmVar.x;
        fastDownloadView.setMatchParent(true);
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, applicationDTO != null ? applicationDTO.getIconPath() : null, null, false, 6, null);
        ViewGroup.LayoutParams layoutParams2 = appIconView.getLayoutParams();
        layoutParams2.width = iE;
        layoutParams2.height = iE;
        nm nmVar2 = this.z;
        if (nmVar2 == null) {
            js3.V("binding");
            throw null;
        }
        nmVar2.v.getLayoutParams().width = dimensionPixelSize;
        myketTextView.setText(applicationDTO != null ? applicationDTO.getTitle() : null);
        myketTextView.setTextColor(sj8.b().m);
        String strO = dw1.o("image_", applicationDTO != null ? applicationDTO.getPackageName() : null, "_", appNestedData.b);
        WeakHashMap weakHashMap = q69.a;
        h69.n(appIconView, strO);
        FrameLayout frameLayout = nmVar.v;
        js3.o(frameLayout, "clickableLayout");
        qg5.v(frameLayout, this.y, this, appNestedData);
        if (applicationDTO != null) {
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
            bundle.putString("installCallbackUrl", applicationDTO.getInstallCallbackUrl());
            bundle.putString("BUNDLE_KEY_CALLBACK_URL", applicationDTO.getCallbackUrl());
            bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
            fastDownloadView.setData(r82Var, this.x);
        }
        if (appNestedData.h) {
            return;
        }
        appIconView.setAlpha(0.2f);
        appIconView.animate().alpha(1.0f).setDuration(350L).start();
        myketTextView.setAlpha(0.2f);
        myketTextView.animate().alpha(1.0f).setDuration(350L).start();
        fastDownloadView.setAlpha(0.2f);
        fastDownloadView.animate().alpha(1.0f).setDuration(350L).start();
        appNestedData.h = true;
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof nm) {
            this.z = (nm) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final ImageView x() {
        nm nmVar = this.z;
        if (nmVar == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = nmVar.y;
        js3.o(appIconView, "icon");
        return appIconView;
    }
}
