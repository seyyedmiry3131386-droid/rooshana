package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.http.SslCertificate;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.manager.a;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class xf5 {
    public final Context a;
    public final dr1 b;
    public final dr1 c;
    public final lw8 d;

    public xf5(Context context, dr1 dr1Var, i10 i10Var, dv2 dv2Var, lu7 lu7Var, dr1 dr1Var2, lw8 lw8Var) {
        js3.p(dr1Var, "installManager");
        js3.p(i10Var, "authorizationManager");
        js3.p(dv2Var, "graphicUtils");
        js3.p(lu7Var, "sharedPreferencesProxy");
        js3.p(dr1Var2, "appManager");
        js3.p(lw8Var, "uiUtils");
        this.a = context;
        this.b = dr1Var;
        this.c = dr1Var2;
        this.d = lw8Var;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Date date, String str) {
        if (date != null) {
            spannableStringBuilder.append((CharSequence) h(str)).append("\n").append((CharSequence) new SimpleDateFormat("DD MMM yyyy", Locale.US).format(date)).append("\n\n");
        }
    }

    public static final ColorStateList c() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[0]}, new int[]{sj8.b().c, sj8.b().u, sj8.b().w});
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static int d(int r1) {
        /*
            r0 = 1311(0x51f, float:1.837E-42)
            if (r1 == r0) goto L3f
            r0 = 1341(0x53d, float:1.879E-42)
            if (r1 == r0) goto L3c
            r0 = 1351(0x547, float:1.893E-42)
            if (r1 == r0) goto L39
            switch(r1) {
                case 131: goto L36;
                case 132: goto L33;
                case 133: goto L30;
                case 134: goto L2d;
                case 135: goto L2a;
                case 136: goto L27;
                case 137: goto L24;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 1331: goto L21;
                case 1332: goto L1e;
                case 1333: goto L1b;
                case 1334: goto L18;
                case 1335: goto L15;
                default: goto L12;
            }
        L12:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L15:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L18:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L1b:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L1e:
            int r1 = defpackage.rs6.download_status_failed_un_authorized
            return r1
        L21:
            int r1 = defpackage.rs6.download_status_failed_network_not_connected
            return r1
        L24:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L27:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L2a:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L2d:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L30:
            int r1 = defpackage.rs6.download_status_failed_network
            return r1
        L33:
            int r1 = defpackage.rs6.download_status_failed_storage
            return r1
        L36:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L39:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L3c:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        L3f:
            int r1 = defpackage.rs6.download_status_failed
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf5.d(int):int");
    }

    public static int e(AppDownloadInfo appDownloadInfo) {
        lw.d(null, null, appDownloadInfo);
        Integer numValueOf = appDownloadInfo != null ? Integer.valueOf(appDownloadInfo.getDetailedStatus()) : null;
        if (numValueOf != null && numValueOf.intValue() == 101) {
            return -1;
        }
        if (numValueOf != null && numValueOf.intValue() == 102) {
            return -1;
        }
        if ((numValueOf != null && numValueOf.intValue() == 104) || appDownloadInfo == null) {
            return -1;
        }
        return appDownloadInfo.getPercent();
    }

    public static SpannableStringBuilder g(String str, String str2) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(str2, "textToBold");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f88.n0(str2) || js3.i(f88.J0(str2).toString(), "")) {
            spannableStringBuilder.append((CharSequence) str);
            return spannableStringBuilder;
        }
        Locale locale = Locale.US;
        js3.o(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        js3.o(lowerCase, "toLowerCase(...)");
        String lowerCase2 = str2.toLowerCase(locale);
        js3.o(lowerCase2, "toLowerCase(...)");
        int iL0 = f88.l0(lowerCase, lowerCase2, 0, false, 6);
        int length = lowerCase2.length() + iL0;
        if (iL0 < 0 || length < 0 || length >= lowerCase.length()) {
            spannableStringBuilder.append((CharSequence) str);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(sj8.b().n), iL0, length, 33);
        return spannableStringBuilder;
    }

    public static SpannableString h(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.b.c, 0, str.length(), 33);
        return spannableString;
    }

    public static void j(xf5 xf5Var, d dVar, MenuItem menuItem) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(dVar.H());
        int i = ew7.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        View view = ((ew7) fa1.c(layoutInflaterFrom, js6.simple_action_bar, null, false)).l;
        js3.o(view, "getRoot(...)");
        xf5Var.i(dVar, menuItem, view);
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, SslCertificate.DName dName, String str) {
        if (dName != null) {
            SpannableString spannableStringH = h(str);
            spannableStringH.setSpan(new AbsoluteSizeSpan(this.a.getResources().getDimensionPixelSize(pq6.font_size_large)), 0, spannableStringH.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringH).append("\n");
            String cName = dName.getCName();
            js3.o(cName, "getCName(...)");
            if (!f88.n0(cName)) {
                spannableStringBuilder.append(h("Common Name (CN)")).append("\n").append(dName.getCName()).append("\n\n");
            }
            String oName = dName.getOName();
            js3.o(oName, "getOName(...)");
            if (!f88.n0(oName)) {
                spannableStringBuilder.append(h("Organization (O)")).append("\n").append(dName.getOName()).append("\n\n");
            }
            String uName = dName.getUName();
            js3.o(uName, "getUName(...)");
            if (f88.n0(uName)) {
                return;
            }
            spannableStringBuilder.append(h("Organization Unit (OU)")).append("\n").append(dName.getUName()).append("\n\n");
        }
    }

    public final String f(AppDownloadInfo appDownloadInfo, int i) {
        if (i <= 0) {
            return "";
        }
        if (appDownloadInfo != null && appDownloadInfo.getStatus() == 130) {
            return "";
        }
        return lw8.e(this.d, i + "%");
    }

    public final View i(d dVar, MenuItem menuItem, View view) {
        js3.p(dVar, "fragment");
        js3.p(view, "view");
        if (menuItem == null || dVar.F() == null) {
            return null;
        }
        Drawable icon = menuItem.getIcon();
        String strValueOf = String.valueOf(menuItem.getTitle());
        view.setElevation(view.getContext().getResources().getDimensionPixelSize(pq6.ripple_elevation));
        menuItem.setActionView(view);
        View actionView = menuItem.getActionView();
        ImageView imageView = (ImageView) actionView.findViewById(rr6.icon);
        imageView.setImageDrawable(icon);
        if (menuItem.isEnabled()) {
            imageView.setOnClickListener(new w50(dVar, menuItem, 8));
            imageView.setOnLongClickListener(new x95(dVar, this, strValueOf, actionView));
        }
        return actionView;
    }

    public final void k(FragmentActivity fragmentActivity, am2 am2Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        js3.p(str, "url");
        if (!z2) {
            if (fragmentActivity == null || !wn5.d(fragmentActivity)) {
                t61.w(str, "parse(...)", fragmentActivity, null, null);
                return;
            }
            if (!new Regex("^\\p{Alpha}+://.*$").f(str)) {
                str = "http://".concat(str);
            }
            if (str == null) {
                str = "";
            }
            wn5.a0(sj8.b().l, fragmentActivity, str);
            return;
        }
        try {
            LayoutInflater.from(fragmentActivity).inflate(js6.webview_test, (ViewGroup) null, false);
            pk5.g(am2Var, z3 ? new NavIntentDirections.Togo(new xm8(str, str2, false, z4, z5, z6, false)) : new NavIntentDirections.WebView(new zc9(str, str2, z, false, false, true, false)), -1);
        } catch (Exception e) {
            dr1 dr1Var = this.b;
            lw.g(e, "Cannot instantiate togo webview", "installed: nativeWebview:" + ((dp3) dr1Var.get()).H("com.android.webview") + ", googleWebview:" + ((dp3) dr1Var.get()).H("com.google.android.webview") + ", canDeviceRunChromium:" + wn5.d(fragmentActivity));
            k(fragmentActivity, am2Var, str, str2, z, false, false, false, z5, z6);
        }
    }

    public final void l(String str, int i, boolean z, ForceUpdateDto forceUpdateDto, TextView textView, String str2) {
        js3.p(str, "packageName");
        js3.p(textView, "descTextView");
        AppDownloadFlowStatus appDownloadFlowStatusD = ((a) this.c.get()).d(str, i, z, forceUpdateDto);
        if (appDownloadFlowStatusD == AppDownloadFlowStatus.e || appDownloadFlowStatusD == AppDownloadFlowStatus.f) {
            textView.setTextColor(sj8.b().x);
            textView.setText(textView.getContext().getResources().getString(rs6.ready_for_install));
            textView.setVisibility(0);
        } else {
            if (str2 == null || f88.n0(str2)) {
                textView.setVisibility(8);
                return;
            }
            textView.setTextColor(sj8.b().n);
            textView.setText(str2);
            textView.setVisibility(0);
        }
    }
}
