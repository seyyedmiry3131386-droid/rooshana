package ir.mservices.market.app.common.recycler;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.d95;
import defpackage.dw1;
import defpackage.f88;
import defpackage.h69;
import defpackage.h95;
import defpackage.js3;
import defpackage.kh2;
import defpackage.lw;
import defpackage.pq6;
import defpackage.q69;
import defpackage.qg5;
import defpackage.rm7;
import defpackage.sj8;
import defpackage.w91;
import defpackage.xf5;
import defpackage.yq6;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h95 {
    public final xf5 A;
    public final int x;
    public d95 y;
    public final d04 z;

    public b(int i, View view) {
        super(view);
        this.x = i;
        w91 w91Var = (w91) qg5.r();
        this.z = (d04) w91Var.p.get();
        this.A = (xf5) w91Var.F.get();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof d95) {
            this.y = (d95) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.h95
    public final ImageView x() {
        d95 d95Var = this.y;
        if (d95Var == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = d95Var.x;
        js3.o(appIconView, "applicationIcon");
        return appIconView;
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void s(AppNestedData appNestedData) {
        js3.p(appNestedData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MultiAppDigestedViewHolder$onAttach$1(appNestedData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new MultiAppDigestedViewHolder$onAttach$2(appNestedData, this, null), 3);
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
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void t(AppNestedData appNestedData) {
        CharSequence title;
        js3.p(appNestedData, "applicationData");
        View view = this.a;
        view.getLayoutParams().width = this.x;
        ApplicationDTO applicationDTO = appNestedData.a;
        if (applicationDTO != null) {
            d95 d95Var = this.y;
            if (d95Var == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = d95Var.z;
            String index = applicationDTO.getIndex();
            if (index == null || index.length() == 0) {
                title = applicationDTO.getTitle();
            } else {
                d04 d04Var = this.z;
                if (d04Var == null) {
                    js3.V("languageHelper");
                    throw null;
                }
                SpannableString spannableString = new SpannableString(rm7.q(applicationDTO.getIndex(), "  ", d04Var.f() ? "\u200f" : "\u200e", applicationDTO.getTitle()));
                spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.b.c, 0, applicationDTO.getIndex().length(), 33);
                spannableString.setSpan(new AbsoluteSizeSpan(view.getResources().getDimensionPixelSize(pq6.font_size_large)), 0, applicationDTO.getIndex().length(), 33);
                title = spannableString;
            }
            myketTextView.setText(title);
            myketTextView.setTextColor(sj8.b().m);
            d95 d95Var2 = this.y;
            if (d95Var2 == null) {
                js3.V("binding");
                throw null;
            }
            AppIconView appIconView = d95Var2.x;
            appIconView.setErrorImageResId(yq6.icon);
            AppIconView.setImageUrl$default(appIconView, applicationDTO.getIconPath(), null, false, 6, null);
            d95 d95Var3 = this.y;
            if (d95Var3 == null) {
                js3.V("binding");
                throw null;
            }
            AppIconView appIconView2 = d95Var3.x;
            String strO = dw1.o("image_", applicationDTO.getPackageName(), "_", appNestedData.b);
            WeakHashMap weakHashMap = q69.a;
            h69.n(appIconView2, strO);
            String tagline = applicationDTO.getTagline();
            String categoryName = (tagline == null || f88.n0(tagline)) ? applicationDTO.getCategoryName() : applicationDTO.getTagline();
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
            d95 d95Var4 = this.y;
            if (d95Var4 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView2 = d95Var4.w;
            js3.o(myketTextView2, "applicationDescription");
            xf5Var.l(packageName, versionCode, zIsIncompatible, forceUpdate, myketTextView2, categoryName);
            qg5.v(view, this.w, this, appNestedData);
            applicationDTO.isIncompatible();
            applicationDTO.getPackageName();
            applicationDTO.getTitle();
            applicationDTO.isFree();
            applicationDTO.getButtonText();
            applicationDTO.getRealPrice();
            applicationDTO.hasIAP();
            applicationDTO.getVersion();
            applicationDTO.getVersionCode();
            applicationDTO.getFileSize();
            applicationDTO.hasMainData();
            applicationDTO.hasPatchData();
            applicationDTO.getIconPath();
            applicationDTO.getCategoryName();
            applicationDTO.getForceUpdate();
            Bundle bundle = new Bundle();
            bundle.putString("refId", applicationDTO.getRefId());
            bundle.putString("installCallbackUrl", applicationDTO.getInstallCallbackUrl());
            bundle.putString("BUNDLE_KEY_CALLBACK_URL", applicationDTO.getCallbackUrl());
            bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
            d95 d95Var5 = this.y;
            if (d95Var5 != null) {
                d95Var5.v.setData(applicationDTO.getAdInfoDto());
            } else {
                js3.V("binding");
                throw null;
            }
        }
    }
}
