package ir.mservices.market.appDetail;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import defpackage.a79;
import defpackage.b77;
import defpackage.br2;
import defpackage.bs1;
import defpackage.cd;
import defpackage.d04;
import defpackage.dp3;
import defpackage.eq;
import defpackage.es1;
import defpackage.fa1;
import defpackage.fp3;
import defpackage.fu;
import defpackage.hh2;
import defpackage.js3;
import defpackage.js6;
import defpackage.js8;
import defpackage.lk1;
import defpackage.lw;
import defpackage.lw8;
import defpackage.ly5;
import defpackage.mk1;
import defpackage.nr1;
import defpackage.ok1;
import defpackage.pq6;
import defpackage.ps1;
import defpackage.q39;
import defpackage.r5;
import defpackage.rs6;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.t32;
import defpackage.u91;
import defpackage.w91;
import defpackage.wq2;
import defpackage.y97;
import defpackage.yq6;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.manager.a;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.SmallFillOvalButton;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class DetailToolbarView extends ConstraintLayout implements nr1, br2 {
    public static final /* synthetic */ int E = 0;
    public String A;
    public String B;
    public boolean C;
    public View.OnClickListener D;
    public fu q;
    public boolean r;
    public a s;
    public lw8 t;
    public ps1 u;
    public dp3 v;
    public d04 w;
    public mk1 x;
    public ToolbarData y;
    public String z;

    public DetailToolbarView(Context context) {
        super(context);
        if (!isInEditMode()) {
            C();
        }
        this.C = true;
        B(context);
    }

    private int getAppDownloadInfoPercent() {
        AppDownloadInfo appDownloadInfoI = this.u.i(getPackageName(), null);
        if (appDownloadInfoI == null || appDownloadInfoI.getVersionCode() != getVersionCode()) {
            return 0;
        }
        return appDownloadInfoI.getPercent();
    }

    private String getButtonText() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.h;
    }

    private DownloadDataModel getDownloadDataModel() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        ToolbarData toolbarData = this.y;
        String str = this.z;
        js3.p(toolbarData, "app");
        String str2 = toolbarData.a;
        if (str2 == null) {
            str2 = "";
        }
        int i = toolbarData.e;
        String str3 = toolbarData.d;
        String str4 = toolbarData.o;
        String str5 = toolbarData.n;
        String str6 = toolbarData.c;
        String str7 = toolbarData.b;
        ForceUpdateDto forceUpdateDto = toolbarData.m;
        Long lValueOf = forceUpdateDto != null ? Long.valueOf(forceUpdateDto.getFileLength()) : null;
        long j = toolbarData.f;
        Boolean bool = toolbarData.k;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = toolbarData.l;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = toolbarData.j;
        return new DownloadDataModel(str2, i, str3, str4, str5, str, str6, str7, lValueOf, j, zBooleanValue, zBooleanValue2, bool3 != null ? bool3.booleanValue() : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ForceUpdateDto getForceUpdate() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.m;
    }

    private String getIconUrl() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.b;
    }

    private long getLength() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPackageName() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.a;
    }

    private String getTitle() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.c;
    }

    private float getTotalRate() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVersionCode() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.e;
    }

    public static void t(DetailToolbarView detailToolbarView) {
        int iOrdinal = detailToolbarView.s.d(detailToolbarView.getPackageName(), detailToolbarView.getVersionCode(), detailToolbarView.D(), detailToolbarView.getForceUpdate()).ordinal();
        if (iOrdinal == 3) {
            String packageName = detailToolbarView.getPackageName();
            AppDownloadFlowStatus appDownloadFlowStatusD = detailToolbarView.s.d(packageName, detailToolbarView.getVersionCode(), detailToolbarView.D(), detailToolbarView.getForceUpdate());
            if (appDownloadFlowStatusD == AppDownloadFlowStatus.d) {
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("detail_button_pause_" + detailToolbarView.A);
                clickEventBuilder.a();
            } else if (appDownloadFlowStatusD == AppDownloadFlowStatus.f) {
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("button_install_in_progress_" + detailToolbarView.A);
                clickEventBuilder2.a();
            }
            detailToolbarView.u.s(packageName);
            return;
        }
        if (iOrdinal != 6) {
            return;
        }
        String packageName2 = detailToolbarView.getPackageName();
        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
        clickEventBuilder3.b("detail_button_run_" + detailToolbarView.A);
        clickEventBuilder3.a();
        String strR = detailToolbarView.v.r(detailToolbarView.getVersionCode(), detailToolbarView.getPackageName());
        if (!TextUtils.isEmpty(strR)) {
            if (!js8.t(8, detailToolbarView.getContext(), strR, packageName2)) {
                dp3.M(packageName2);
            }
            detailToolbarView.v.e(detailToolbarView.getVersionCode(), detailToolbarView.getPackageName());
        } else if (detailToolbarView.v.K(packageName2)) {
            dp3.M(packageName2);
        } else {
            Context context = detailToolbarView.getContext();
            hh2.H(new hh2(context, context != null ? context.getString(rs6.app_not_runnable) : null));
        }
    }

    public static void x(DetailToolbarView detailToolbarView) {
        sb7.p("DetailToolbarView", "App Install Click", "PackageName: " + detailToolbarView.getPackageName());
        detailToolbarView.v.C(detailToolbarView.getDownloadDataModel());
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b("button_install_" + detailToolbarView.A);
        clickEventBuilder.a();
        detailToolbarView.z();
    }

    public static void y(DetailToolbarView detailToolbarView) {
        AppDownloadInfo appDownloadInfoI = detailToolbarView.u.i(detailToolbarView.getPackageName(), null);
        if (wq2.l(detailToolbarView.getLength(), appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
            detailToolbarView.E();
        } else {
            a aVar = detailToolbarView.s;
            ToolbarData toolbarData = detailToolbarView.y;
            String str = toolbarData.c;
            String str2 = toolbarData.b;
            aVar.getClass();
            a.e(str, str2);
        }
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b("detail_button_update_" + detailToolbarView.A);
        clickEventBuilder.a();
    }

    public final void A() {
        if (this.y != null) {
            this.x.z.setLoadingColor(sj8.b().c);
            this.x.z.setProgressSize(getResources().getDimensionPixelOffset(pq6.small_rate_size));
            ImageView imageView = this.x.y;
            int i = sj8.b().n;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(i, mode);
            this.x.y.setBackground(y97.x());
            this.x.B.setOnTouchListener(new lk1(0));
            this.x.z.setOnClickListener(new r5(4, this));
            this.x.D.setOnClickListener(new cd(8, this));
            this.x.y.setOnClickListener(this.D);
            this.x.A.setLayoutDirection(0);
            this.x.x.setText(getTitle());
            this.x.x.setTextColor(sj8.b().m);
            boolean z = ((double) getTotalRate()) >= 0.5d;
            this.x.x.setMaxLines((z || !TextUtils.isEmpty(this.B)) ? 1 : 2);
            this.x.v.setImageUrl(getIconUrl(), "toolbar", true);
            if (z && TextUtils.isEmpty(this.B)) {
                this.x.C.setVisibility(4);
                this.x.w.setVisibility(0);
                this.x.E.setVisibility(0);
                this.x.E.getDrawable().setColorFilter(sj8.b().n, mode);
                this.x.w.setText(this.t.f(String.format(Locale.US, "%.1f", Float.valueOf(getTotalRate()))));
            } else {
                this.x.C.setVisibility(TextUtils.isEmpty(this.B) ? 8 : 0);
                this.x.C.setText(this.B);
                this.x.C.setTextColor(sj8.b().n);
                this.x.w.setVisibility(8);
                this.x.E.setVisibility(8);
            }
            z();
        }
    }

    public final void B(Context context) {
        setSaveEnabled(true);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = mk1.F;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        mk1 mk1Var = (mk1) a79.f0(layoutInflaterFrom, js6.detail_toolbar_view, this, true, null);
        this.x = mk1Var;
        mk1Var.l.setLayoutDirection(this.w.c());
    }

    public final void C() {
        if (this.r) {
            return;
        }
        this.r = true;
        w91 w91Var = ((u91) ((ok1) e())).a;
        this.s = (a) w91Var.D.get();
        this.t = (lw8) w91Var.E.get();
        this.u = (ps1) w91Var.w.get();
        this.v = (dp3) w91Var.v.get();
        this.w = (d04) w91Var.p.get();
    }

    public final boolean D() {
        if (this.y == null) {
            lw.g(null, "application must not be null", null);
        }
        return this.y.g;
    }

    public final void E() {
        lw.f(null, "context must be fragment activity", getContext() instanceof FragmentActivity);
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b("detail_button_download_" + this.A);
        clickEventBuilder.a();
        a aVar = this.s;
        FragmentActivity fragmentActivity = (FragmentActivity) getContext();
        DownloadDataModel downloadDataModel = getDownloadDataModel();
        aVar.getClass();
        js3.p(downloadDataModel, "downloadDataModel");
        aVar.b(fragmentActivity, downloadDataModel, false);
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.q == null) {
            this.q = new fu(this);
        }
        return this.q.e();
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
        String strQ = eq.q(bs1Var);
        if (this.y == null || !strQ.equalsIgnoreCase(getPackageName())) {
            return;
        }
        this.x.A.a(getAppDownloadInfoPercent());
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        if (this.y == null || !eq.q(es1Var).equalsIgnoreCase(getPackageName())) {
            return;
        }
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t32.b().l(this, false);
        this.u.u(this);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t32.b().o(this);
        this.u.x(this);
        super.onDetachedFromWindow();
    }

    public void onEvent(fp3 fp3Var) {
        if (this.y != null && fp3Var.a.equalsIgnoreCase(getPackageName())) {
            z();
        }
    }

    public void setAnalyticsName(String str) {
        this.A = str;
    }

    public void setDownloadRef(String str) {
        this.z = str;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.D = onClickListener;
    }

    public void setPageTitle(String str) {
        this.B = str;
    }

    public void setShowDownload(boolean z) {
        this.C = z;
    }

    public void setToolbarData(ToolbarData toolbarData) {
        this.y = toolbarData;
        A();
    }

    public final void z() {
        Drawable drawable;
        AppDownloadFlowStatus appDownloadFlowStatusD = this.s.d(getPackageName(), getVersionCode(), D(), getForceUpdate());
        SmallFillOvalButton smallFillOvalButton = this.x.z;
        MyketProgressState myketProgressState = MyketProgressState.b;
        smallFillOvalButton.setState(myketProgressState);
        this.x.z.setIcon(null);
        this.x.A.setVisibility(8);
        this.x.z.setVisibility(this.C ? 0 : 8);
        this.x.D.setVisibility(8);
        this.x.z.setDisable(false);
        switch (appDownloadFlowStatusD.ordinal()) {
            case 0:
                this.x.z.setDisable(true);
                this.x.z.setText(getContext().getResources().getString(rs6.compatibility_error));
                return;
            case 1:
            case 4:
                this.x.z.setText(getButtonText());
                return;
            case 2:
                if (getForceUpdate() == null || !Boolean.TRUE.equals(this.v.d(getPackageName(), getVersionCode(), Long.valueOf(getForceUpdate().getFileLength())))) {
                    this.x.z.setText(getResources().getString(rs6.update_app));
                    return;
                }
                SmallFillOvalButton smallFillOvalButton2 = this.x.z;
                Resources resources = getResources();
                int i = yq6.ic_gift;
                js3.p(resources, "res");
                try {
                    drawable = q39.a(resources, i, null);
                    if (drawable == null) {
                        ThreadLocal threadLocal = b77.a;
                        drawable = resources.getDrawable(i, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused) {
                    ThreadLocal threadLocal2 = b77.a;
                    drawable = resources.getDrawable(i, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                smallFillOvalButton2.setIconWithCompoundDrawables(drawable);
                this.x.z.setText(getResources().getString(rs6.force_update_gift));
                return;
            case 3:
                this.x.z.setVisibility(this.C ? 4 : 8);
                this.x.D.setVisibility(this.C ? 0 : 8);
                this.x.D.setText(getResources().getString(rs6.update_paused));
                this.x.A.getProgressDrawable().setColorFilter(sj8.b().e, PorterDuff.Mode.MULTIPLY);
                this.x.A.setVisibility(this.C ? 0 : 8);
                this.x.A.a(getAppDownloadInfoPercent());
                return;
            case 5:
                this.x.z.setVisibility(this.C ? 4 : 8);
                this.x.D.setVisibility(this.C ? 0 : 8);
                this.x.D.setState(MyketProgressState.c);
                this.x.D.setLoadingColor(sj8.b().c);
                this.x.D.setButtonDisableColor(sj8.b().c);
                this.x.D.setColor(sj8.b().c);
                this.x.D.setButtonTextColor(sj8.b().c);
                this.x.A.setVisibility(this.C ? 0 : 8);
                this.x.A.getProgressDrawable().setColorFilter(sj8.b().e, PorterDuff.Mode.MULTIPLY);
                this.x.A.a(100);
                return;
            case 6:
                boolean zK = this.v.K(getPackageName());
                String string = !TextUtils.isEmpty(this.v.r(getVersionCode(), getPackageName())) ? getResources().getString(rs6.proceed) : getResources().getString(rs6.run_app);
                if (zK) {
                    this.x.z.setVisibility(this.C ? 4 : 8);
                    this.x.D.setVisibility(this.C ? 0 : 8);
                } else {
                    this.x.z.setDisable(true);
                    this.x.z.setText(string);
                }
                this.x.D.setState(myketProgressState);
                this.x.D.setText(string);
                this.x.A.a(0);
                return;
            default:
                return;
        }
    }

    public void onEvent(ly5 ly5Var) {
        if (this.y != null) {
            Intent intent = ly5Var.b;
            if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED") || intent.getAction().equals("android.intent.action.PACKAGE_REPLACED") || intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                z();
            }
        }
    }

    public DetailToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            C();
        }
        this.C = true;
        B(context);
    }
}
