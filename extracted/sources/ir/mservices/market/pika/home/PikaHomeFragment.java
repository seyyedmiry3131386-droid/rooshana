package ir.mservices.market.pika.home;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.a86;
import defpackage.b77;
import defpackage.c24;
import defpackage.cc7;
import defpackage.d7;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fa1;
import defpackage.hh2;
import defpackage.js3;
import defpackage.js5;
import defpackage.js6;
import defpackage.lk2;
import defpackage.lu7;
import defpackage.mm2;
import defpackage.mt7;
import defpackage.od;
import defpackage.p76;
import defpackage.pk5;
import defpackage.q39;
import defpackage.ql5;
import defpackage.qs6;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sj8;
import defpackage.ts5;
import defpackage.yq6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.connect.ConnectionType;
import ir.mservices.market.pika.home.PikaHomeFragment;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.SmallRegularTextButton;
import java.io.File;
import java.io.IOException;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaHomeFragment extends Hilt_PikaHomeFragment implements mm2 {
    public static final /* synthetic */ int a1 = 0;
    public mt7 V0;
    public lk2 W0;
    public ConnectionType X0;
    public lu7 Y0;
    public final c24 Z0 = a.a(new js5(2));

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(k1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_PERMISSION_ALERT".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d != DialogResult.a) {
                    dw1.y("pika_permission_dialog_cancel");
                    return;
                }
                dw1.y("pika_permission_dialog_allow");
                lk2 lk2Var = this.W0;
                if (lk2Var != null) {
                    lk2Var.a((String[]) this.Z0.getValue());
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_TURN_GPS_ON".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.b) {
                    y0(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_NEED_PERMISSION".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d != DialogResult.a) {
                    dw1.y("pika_permission_dialog_cancel");
                    return;
                }
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("pika_permission_dialog_allow");
                clickEventBuilder.a();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", NearbyRepository.SERVICE_ID, null));
                FragmentActivity fragmentActivityF = F();
                if (fragmentActivityF != null) {
                    if (intent.resolveActivity(fragmentActivityF.getPackageManager()) != null) {
                        y0(intent);
                    } else {
                        hh2.H(new hh2(fragmentActivityF, fragmentActivityF.getString(rs6.app_settings_failed_message)));
                    }
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_share_apps);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_share_apps);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = mt7.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        mt7 mt7Var = (mt7) fa1.c(layoutInflater, js6.share_app_home_layout, viewGroup, false);
        this.V0 = mt7Var;
        mt7Var.l.setLayoutDirection(this.F0.c());
        View view = mt7Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        lk2 lk2Var = this.W0;
        if (lk2Var != null) {
            lk2Var.b();
        }
        this.W0 = null;
        this.J0.x(k1());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        Drawable drawable;
        js3.p(view, "view");
        super.k0(view, bundle);
        final int i = 0;
        this.W0 = (lk2) n0(new ts5(4, this), new s7(0));
        this.J0.d(k1(), this);
        mt7 mt7Var = this.V0;
        js3.m(mt7Var);
        LottieAnimationView lottieAnimationView = mt7Var.w;
        js3.o(lottieAnimationView, "homeShareAppImage");
        ir.mservices.market.core.ext.a.e(lottieAnimationView, qs6.share_app);
        mt7 mt7Var2 = this.V0;
        js3.m(mt7Var2);
        mt7Var2.A.setOnClickListener(new View.OnClickListener(this) { // from class: w76
            public final /* synthetic */ PikaHomeFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                int i2 = i;
                int i3 = 0;
                PikaHomeFragment pikaHomeFragment = this.b;
                switch (i2) {
                    case 0:
                        int i4 = PikaHomeFragment.a1;
                        FragmentActivity fragmentActivityF = pikaHomeFragment.F();
                        if (fragmentActivityF != null) {
                            String[] strArr = (String[]) pikaHomeFragment.Z0.getValue();
                            int length = strArr.length;
                            while (true) {
                                if (i3 < length) {
                                    String str = strArr[i3];
                                    if (p3.c(fragmentActivityF, str) != 0) {
                                        str = str;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            if (str == null) {
                                pikaHomeFragment.l1();
                            } else if (!pikaHomeFragment.m1(fragmentActivityF)) {
                                pikaHomeFragment.o1();
                                pikaHomeFragment.X0 = ConnectionType.Discover.a;
                            } else {
                                pikaHomeFragment.n1();
                            }
                        }
                        break;
                    case 1:
                        int i5 = PikaHomeFragment.a1;
                        FragmentActivity fragmentActivityF2 = pikaHomeFragment.F();
                        if (fragmentActivityF2 != null) {
                            String[] strArr2 = (String[]) pikaHomeFragment.Z0.getValue();
                            int length2 = strArr2.length;
                            while (true) {
                                if (i3 < length2) {
                                    String str2 = strArr2[i3];
                                    if (p3.c(fragmentActivityF2, str2) != 0) {
                                        str = str2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            if (str == null) {
                                pk5.g(pikaHomeFragment.J0, new NavIntentDirections.PikaConnect(new p76(ConnectionType.Advertise.a)), -1);
                            } else if (!pikaHomeFragment.m1(fragmentActivityF2)) {
                                pikaHomeFragment.o1();
                                pikaHomeFragment.X0 = ConnectionType.Advertise.a;
                            } else {
                                pikaHomeFragment.n1();
                            }
                        }
                        break;
                    default:
                        int i6 = PikaHomeFragment.a1;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("pika_share_myket");
                        clickEventBuilder.a();
                        Context contextH = pikaHomeFragment.H();
                        PackageManager packageManager = contextH != null ? contextH.getPackageManager() : null;
                        try {
                            if (packageManager != null) {
                                File file = new File(packageManager.getApplicationInfo(NearbyRepository.SERVICE_ID, 128).publicSourceDir);
                                File externalFilesDir = ApplicationLauncher.o.getApplicationContext().getApplicationContext().getExternalFilesDir("download");
                                if (externalFilesDir == null) {
                                    Context contextH2 = pikaHomeFragment.H();
                                    hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.uncatchable_intent) : null));
                                } else {
                                    File file2 = new File(externalFilesDir, "myket.apk");
                                    zb2.b(file, file2);
                                    if (!file2.exists()) {
                                        Context contextH3 = pikaHomeFragment.H();
                                        hh2.H(new hh2(contextH3, contextH3 != null ? contextH3.getString(rs6.uncatchable_intent) : null));
                                    } else {
                                        Context applicationContext = ApplicationLauncher.o.getApplicationContext();
                                        js3.o(applicationContext, "getContext(...)");
                                        Intent intentB = fg5.b(applicationContext, file2);
                                        intentB.setAction("android.intent.action.SEND");
                                        intentB.setType("application/vnd.android.package-archive");
                                        if (intentB.resolveActivity(packageManager) == null) {
                                            Context contextH4 = pikaHomeFragment.H();
                                            hh2.H(new hh2(contextH4, contextH4 != null ? contextH4.getString(rs6.uncatchable_intent) : null));
                                        } else {
                                            pikaHomeFragment.y0(Intent.createChooser(intentB, pikaHomeFragment.K().getString(rs6.send_myket_to_friends)));
                                        }
                                    }
                                }
                            } else {
                                Context contextH5 = pikaHomeFragment.H();
                                hh2.H(new hh2(contextH5, contextH5 != null ? contextH5.getString(rs6.uncatchable_intent) : null));
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            Context contextH6 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH6, contextH6 != null ? contextH6.getString(rs6.uncatchable_intent) : null));
                        } catch (IOException unused2) {
                            Context contextH7 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH7, contextH7 != null ? contextH7.getString(rs6.uncatchable_intent) : null));
                            return;
                        } catch (Exception e) {
                            lw.g(e, "PikaHomeFragment shareMyketApk failed with an exception!", null);
                            Context contextH8 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH8, contextH8 != null ? contextH8.getString(rs6.uncatchable_intent) : null));
                            return;
                        }
                        break;
                }
            }
        });
        mt7 mt7Var3 = this.V0;
        js3.m(mt7Var3);
        final int i2 = 1;
        mt7Var3.z.setOnClickListener(new View.OnClickListener(this) { // from class: w76
            public final /* synthetic */ PikaHomeFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                int i22 = i2;
                int i3 = 0;
                PikaHomeFragment pikaHomeFragment = this.b;
                switch (i22) {
                    case 0:
                        int i4 = PikaHomeFragment.a1;
                        FragmentActivity fragmentActivityF = pikaHomeFragment.F();
                        if (fragmentActivityF != null) {
                            String[] strArr = (String[]) pikaHomeFragment.Z0.getValue();
                            int length = strArr.length;
                            while (true) {
                                if (i3 < length) {
                                    String str = strArr[i3];
                                    if (p3.c(fragmentActivityF, str) != 0) {
                                        str = str;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            if (str == null) {
                                pikaHomeFragment.l1();
                            } else if (!pikaHomeFragment.m1(fragmentActivityF)) {
                                pikaHomeFragment.o1();
                                pikaHomeFragment.X0 = ConnectionType.Discover.a;
                            } else {
                                pikaHomeFragment.n1();
                            }
                        }
                        break;
                    case 1:
                        int i5 = PikaHomeFragment.a1;
                        FragmentActivity fragmentActivityF2 = pikaHomeFragment.F();
                        if (fragmentActivityF2 != null) {
                            String[] strArr2 = (String[]) pikaHomeFragment.Z0.getValue();
                            int length2 = strArr2.length;
                            while (true) {
                                if (i3 < length2) {
                                    String str2 = strArr2[i3];
                                    if (p3.c(fragmentActivityF2, str2) != 0) {
                                        str = str2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            if (str == null) {
                                pk5.g(pikaHomeFragment.J0, new NavIntentDirections.PikaConnect(new p76(ConnectionType.Advertise.a)), -1);
                            } else if (!pikaHomeFragment.m1(fragmentActivityF2)) {
                                pikaHomeFragment.o1();
                                pikaHomeFragment.X0 = ConnectionType.Advertise.a;
                            } else {
                                pikaHomeFragment.n1();
                            }
                        }
                        break;
                    default:
                        int i6 = PikaHomeFragment.a1;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("pika_share_myket");
                        clickEventBuilder.a();
                        Context contextH = pikaHomeFragment.H();
                        PackageManager packageManager = contextH != null ? contextH.getPackageManager() : null;
                        try {
                            if (packageManager != null) {
                                File file = new File(packageManager.getApplicationInfo(NearbyRepository.SERVICE_ID, 128).publicSourceDir);
                                File externalFilesDir = ApplicationLauncher.o.getApplicationContext().getApplicationContext().getExternalFilesDir("download");
                                if (externalFilesDir == null) {
                                    Context contextH2 = pikaHomeFragment.H();
                                    hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.uncatchable_intent) : null));
                                } else {
                                    File file2 = new File(externalFilesDir, "myket.apk");
                                    zb2.b(file, file2);
                                    if (!file2.exists()) {
                                        Context contextH3 = pikaHomeFragment.H();
                                        hh2.H(new hh2(contextH3, contextH3 != null ? contextH3.getString(rs6.uncatchable_intent) : null));
                                    } else {
                                        Context applicationContext = ApplicationLauncher.o.getApplicationContext();
                                        js3.o(applicationContext, "getContext(...)");
                                        Intent intentB = fg5.b(applicationContext, file2);
                                        intentB.setAction("android.intent.action.SEND");
                                        intentB.setType("application/vnd.android.package-archive");
                                        if (intentB.resolveActivity(packageManager) == null) {
                                            Context contextH4 = pikaHomeFragment.H();
                                            hh2.H(new hh2(contextH4, contextH4 != null ? contextH4.getString(rs6.uncatchable_intent) : null));
                                        } else {
                                            pikaHomeFragment.y0(Intent.createChooser(intentB, pikaHomeFragment.K().getString(rs6.send_myket_to_friends)));
                                        }
                                    }
                                }
                            } else {
                                Context contextH5 = pikaHomeFragment.H();
                                hh2.H(new hh2(contextH5, contextH5 != null ? contextH5.getString(rs6.uncatchable_intent) : null));
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            Context contextH6 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH6, contextH6 != null ? contextH6.getString(rs6.uncatchable_intent) : null));
                        } catch (IOException unused2) {
                            Context contextH7 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH7, contextH7 != null ? contextH7.getString(rs6.uncatchable_intent) : null));
                            return;
                        } catch (Exception e) {
                            lw.g(e, "PikaHomeFragment shareMyketApk failed with an exception!", null);
                            Context contextH8 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH8, contextH8 != null ? contextH8.getString(rs6.uncatchable_intent) : null));
                            return;
                        }
                        break;
                }
            }
        });
        mt7 mt7Var4 = this.V0;
        js3.m(mt7Var4);
        final int i3 = 2;
        mt7Var4.y.setOnClickListener(new View.OnClickListener(this) { // from class: w76
            public final /* synthetic */ PikaHomeFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                int i22 = i3;
                int i32 = 0;
                PikaHomeFragment pikaHomeFragment = this.b;
                switch (i22) {
                    case 0:
                        int i4 = PikaHomeFragment.a1;
                        FragmentActivity fragmentActivityF = pikaHomeFragment.F();
                        if (fragmentActivityF != null) {
                            String[] strArr = (String[]) pikaHomeFragment.Z0.getValue();
                            int length = strArr.length;
                            while (true) {
                                if (i32 < length) {
                                    String str = strArr[i32];
                                    if (p3.c(fragmentActivityF, str) != 0) {
                                        str = str;
                                    } else {
                                        i32++;
                                    }
                                }
                            }
                            if (str == null) {
                                pikaHomeFragment.l1();
                            } else if (!pikaHomeFragment.m1(fragmentActivityF)) {
                                pikaHomeFragment.o1();
                                pikaHomeFragment.X0 = ConnectionType.Discover.a;
                            } else {
                                pikaHomeFragment.n1();
                            }
                        }
                        break;
                    case 1:
                        int i5 = PikaHomeFragment.a1;
                        FragmentActivity fragmentActivityF2 = pikaHomeFragment.F();
                        if (fragmentActivityF2 != null) {
                            String[] strArr2 = (String[]) pikaHomeFragment.Z0.getValue();
                            int length2 = strArr2.length;
                            while (true) {
                                if (i32 < length2) {
                                    String str2 = strArr2[i32];
                                    if (p3.c(fragmentActivityF2, str2) != 0) {
                                        str = str2;
                                    } else {
                                        i32++;
                                    }
                                }
                            }
                            if (str == null) {
                                pk5.g(pikaHomeFragment.J0, new NavIntentDirections.PikaConnect(new p76(ConnectionType.Advertise.a)), -1);
                            } else if (!pikaHomeFragment.m1(fragmentActivityF2)) {
                                pikaHomeFragment.o1();
                                pikaHomeFragment.X0 = ConnectionType.Advertise.a;
                            } else {
                                pikaHomeFragment.n1();
                            }
                        }
                        break;
                    default:
                        int i6 = PikaHomeFragment.a1;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("pika_share_myket");
                        clickEventBuilder.a();
                        Context contextH = pikaHomeFragment.H();
                        PackageManager packageManager = contextH != null ? contextH.getPackageManager() : null;
                        try {
                            if (packageManager != null) {
                                File file = new File(packageManager.getApplicationInfo(NearbyRepository.SERVICE_ID, 128).publicSourceDir);
                                File externalFilesDir = ApplicationLauncher.o.getApplicationContext().getApplicationContext().getExternalFilesDir("download");
                                if (externalFilesDir == null) {
                                    Context contextH2 = pikaHomeFragment.H();
                                    hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.uncatchable_intent) : null));
                                } else {
                                    File file2 = new File(externalFilesDir, "myket.apk");
                                    zb2.b(file, file2);
                                    if (!file2.exists()) {
                                        Context contextH3 = pikaHomeFragment.H();
                                        hh2.H(new hh2(contextH3, contextH3 != null ? contextH3.getString(rs6.uncatchable_intent) : null));
                                    } else {
                                        Context applicationContext = ApplicationLauncher.o.getApplicationContext();
                                        js3.o(applicationContext, "getContext(...)");
                                        Intent intentB = fg5.b(applicationContext, file2);
                                        intentB.setAction("android.intent.action.SEND");
                                        intentB.setType("application/vnd.android.package-archive");
                                        if (intentB.resolveActivity(packageManager) == null) {
                                            Context contextH4 = pikaHomeFragment.H();
                                            hh2.H(new hh2(contextH4, contextH4 != null ? contextH4.getString(rs6.uncatchable_intent) : null));
                                        } else {
                                            pikaHomeFragment.y0(Intent.createChooser(intentB, pikaHomeFragment.K().getString(rs6.send_myket_to_friends)));
                                        }
                                    }
                                }
                            } else {
                                Context contextH5 = pikaHomeFragment.H();
                                hh2.H(new hh2(contextH5, contextH5 != null ? contextH5.getString(rs6.uncatchable_intent) : null));
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            Context contextH6 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH6, contextH6 != null ? contextH6.getString(rs6.uncatchable_intent) : null));
                        } catch (IOException unused2) {
                            Context contextH7 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH7, contextH7 != null ? contextH7.getString(rs6.uncatchable_intent) : null));
                            return;
                        } catch (Exception e) {
                            lw.g(e, "PikaHomeFragment shareMyketApk failed with an exception!", null);
                            Context contextH8 = pikaHomeFragment.H();
                            hh2.H(new hh2(contextH8, contextH8 != null ? contextH8.getString(rs6.uncatchable_intent) : null));
                            return;
                        }
                        break;
                }
            }
        });
        mt7 mt7Var5 = this.V0;
        js3.m(mt7Var5);
        SmallRegularTextButton smallRegularTextButton = mt7Var5.y;
        Resources resources = smallRegularTextButton.getResources();
        js3.o(resources, "getResources(...)");
        int i4 = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i4, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i4, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i4, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        smallRegularTextButton.setSmallIcon(drawable, sj8.b().n);
        smallRegularTextButton.setTextColor(sj8.b().n);
        cc7.d(this.J, 0, 0, 0, 7);
    }

    public final String k1() {
        return dw1.n("PikaHomeFragment_", this.H0);
    }

    public final void l1() {
        Context contextH = H();
        if (contextH != null) {
            try {
                if (Settings.Secure.getInt(contextH.getContentResolver(), "location_mode") != 0) {
                    pk5.g(this.J0, new NavIntentDirections.PikaConnect(new p76(ConnectionType.Discover.a)), -1);
                    return;
                }
            } catch (Settings.SettingNotFoundException e) {
                e.printStackTrace();
            }
            String string = K().getString(rs6.turn_gps_on);
            js3.o(string, "getString(...)");
            DialogDataModel dialogDataModel = new DialogDataModel(k1(), "DIALOG_KEY_TURN_GPS_ON", null, 12);
            String strL = L(rs6.button_ok);
            js3.o(strL, "getString(...)");
            pk5.g(this.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel, "", string, strL, 0)), -1);
        }
    }

    public final boolean m1(FragmentActivity fragmentActivity) {
        String str;
        String[] strArr = (String[]) this.Z0.getValue();
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = null;
                break;
            }
            str = strArr[i];
            if (d7.b(fragmentActivity, str)) {
                break;
            }
            i++;
        }
        boolean z = str != null;
        lu7 lu7Var = this.Y0;
        if (lu7Var != null) {
            return lu7Var.b(lu7.w0, false) && z;
        }
        js3.V("sharedPreferencesProxy");
        throw null;
    }

    public final void n1() {
        pk5.g(this.J0, new NavIntentDirections.NeedPermission(new ql5(new DialogDataModel(k1(), "DIALOG_KEY_NEED_PERMISSION", null, 12))), -1);
    }

    public final void o1() {
        pk5.g(this.J0, new NavIntentDirections.NearbyPermissionAlert(new a86(new DialogDataModel(k1(), "DIALOG_KEY_PERMISSION_ALERT", null, 12))), -1);
    }
}
