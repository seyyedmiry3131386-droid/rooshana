package ir.mservices.market.app.common.recycler;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.dw1;
import defpackage.f88;
import defpackage.h69;
import defpackage.js3;
import defpackage.k84;
import defpackage.kh2;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q69;
import defpackage.qg5;
import defpackage.r82;
import defpackage.rm7;
import defpackage.s82;
import defpackage.w91;
import defpackage.xf5;
import defpackage.yq6;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AppInfoView;
import ir.mservices.market.views.MyketTextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final xf5 A;
    public final d04 B;
    public final og5 w;
    public final s82 x;
    public final Integer y;
    public k84 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, og5 og5Var, s82 s82Var, Integer num) {
        super(view);
        js3.p(og5Var, "onAppClickListener");
        js3.p(s82Var, "fastDownloadListener");
        this.w = og5Var;
        this.x = s82Var;
        this.y = num;
        w91 w91Var = (w91) qg5.r();
        this.A = (xf5) w91Var.F.get();
        this.B = (d04) w91Var.p.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppData appData = (AppData) myketRecyclerData;
        js3.p(appData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppViewHolder$onAttach$1(null, appData, this), 3);
        bt2.G(cc7.q(view), null, null, new AppViewHolder$onAttach$2(null, appData, this), 3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        CharSequence title;
        AppData appData = (AppData) myketRecyclerData;
        js3.p(appData, "data");
        ApplicationDTO applicationDTO = appData.c;
        k84 k84Var = this.z;
        if (k84Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = k84Var.x;
        js3.o(frameLayout, "clickView");
        qg5.v(frameLayout, this.w, this, appData);
        k84 k84Var2 = this.z;
        if (k84Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = k84Var2.B;
        String index = applicationDTO.getIndex();
        String title2 = applicationDTO.getTitle();
        if (index == null || f88.n0(index)) {
            title = applicationDTO.getTitle();
        } else {
            d04 d04Var = this.B;
            if (d04Var == null) {
                js3.V("languageHelper");
                throw null;
            }
            SpannableString spannableString = new SpannableString(rm7.q(index, "  ", d04Var.f() ? "\u200f" : "\u200e", title2));
            spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.b.c, 0, index.length(), 33);
            spannableString.setSpan(new AbsoluteSizeSpan(this.a.getResources().getDimensionPixelSize(pq6.font_size_large)), 0, index.length(), 33);
            title = spannableString;
        }
        myketTextView.setText(title);
        Integer num = this.y;
        if (num != null) {
            int iIntValue = num.intValue();
            k84 k84Var3 = this.z;
            if (k84Var3 == null) {
                js3.V("binding");
                throw null;
            }
            k84Var3.z.setSolidBackgroundColor(Integer.valueOf(iIntValue));
        }
        k84 k84Var4 = this.z;
        if (k84Var4 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = k84Var4.A;
        String strN = dw1.n("image_", applicationDTO.getPackageName());
        WeakHashMap weakHashMap = q69.a;
        h69.n(appIconView, strN);
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, applicationDTO.getIconPath(), null, false, 6, null);
        xf5 xf5Var = this.A;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        String packageName = applicationDTO.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        int versionCode = applicationDTO.getVersionCode();
        boolean zIsIncompatible = applicationDTO.isIncompatible();
        ForceUpdateDto forceUpdate = applicationDTO.getForceUpdate();
        k84 k84Var5 = this.z;
        if (k84Var5 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = k84Var5.y;
        js3.o(myketTextView2, PackageListMetaDataDTO.KEY_DESCRIPTION);
        String tagline = applicationDTO.getTagline();
        xf5Var.l(packageName, versionCode, zIsIncompatible, forceUpdate, myketTextView2, (tagline == null || f88.n0(tagline)) ? applicationDTO.getCategoryName() : applicationDTO.getTagline());
        boolean zIsIncompatible2 = applicationDTO.isIncompatible();
        String packageName2 = applicationDTO.getPackageName();
        String title3 = applicationDTO.getTitle();
        boolean zIsFree = applicationDTO.isFree();
        String buttonText = applicationDTO.getButtonText();
        applicationDTO.getRealPrice();
        applicationDTO.hasIAP();
        applicationDTO.getVersion();
        int versionCode2 = applicationDTO.getVersionCode();
        long fileSize = applicationDTO.getFileSize();
        boolean zHasMainData = applicationDTO.hasMainData();
        boolean zHasPatchData = applicationDTO.hasPatchData();
        String iconPath = applicationDTO.getIconPath();
        applicationDTO.getCategoryName();
        r82 r82Var = new r82(zIsIncompatible2, packageName2, title3, zIsFree, buttonText, versionCode2, fileSize, zHasMainData, zHasPatchData, iconPath, applicationDTO.getForceUpdate());
        String refId = applicationDTO.getRefId();
        Bundle bundle = r82Var.k;
        bundle.putString("refId", refId);
        bundle.putString("BUNDLE_KEY_CALLBACK_URL", applicationDTO.getCallbackUrl());
        bundle.putString("installCallbackUrl", applicationDTO.getInstallCallbackUrl());
        bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
        k84 k84Var6 = this.z;
        if (k84Var6 == null) {
            js3.V("binding");
            throw null;
        }
        k84Var6.z.setData(r82Var, this.x);
        k84 k84Var7 = this.z;
        if (k84Var7 == null) {
            js3.V("binding");
            throw null;
        }
        k84Var7.v.setData(applicationDTO.getAdInfoDto());
        k84 k84Var8 = this.z;
        if (k84Var8 == null) {
            js3.V("binding");
            throw null;
        }
        AppInfoView appInfoView = k84Var8.w;
        js3.o(appInfoView, "appInfo");
        AppInfoView.setData$default(appInfoView, applicationDTO.getTotalRating(), null, 2, null);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof k84) {
            this.z = (k84) a79Var;
        } else {
            lw.g(null, "incompatible binding!", null);
        }
    }

    public final AppIconView x() {
        k84 k84Var = this.z;
        if (k84Var == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = k84Var.A;
        js3.o(appIconView, "icon");
        return appIconView;
    }
}
