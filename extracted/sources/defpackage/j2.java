package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.View;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.EnhancedIntentService;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.download.DownloadContentFragment;
import ir.mservices.market.download.common.RecentDownloadType;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.fragments.dialog.AppPaymentDialogFragment;
import ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment;
import ir.mservices.market.version2.webapi.requestdto.AuthorizeRequestDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.ProfileInfoDto;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import ir.mservices.market.version2.webapi.responsedto.UnbindAllResultDTO;
import j$.util.Objects;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j2 implements cu2, gb8, h32, ly0, r94, q94, y72, fe8, at5, ms5, co4, ro4, gr4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j2(be beVar, Object obj, long j) {
        this.a = 12;
        this.b = beVar;
        this.c = obj;
    }

    @Override // defpackage.ro4
    public void a(go4 go4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 27:
                go4Var.C0((he6) this.b, (fe6) this.c);
                break;
            default:
                xp7 xp7Var = (xp7) this.b;
                cb6 cb6Var = (cb6) this.c;
                gn4 gn4Var = go4Var.a;
                if (go4Var.E()) {
                    boolean zEquals = Objects.equals(go4Var.w, cb6Var);
                    boolean zEquals2 = Objects.equals(go4Var.v, xp7Var);
                    if (!zEquals || !zEquals2) {
                        go4Var.v = xp7Var;
                        if (zEquals) {
                            z = false;
                        } else {
                            go4Var.w = cb6Var;
                            cb6 cb6Var2 = go4Var.y;
                            cb6 cb6VarN0 = go4.n0(cb6Var, go4Var.x);
                            go4Var.y = cb6VarN0;
                            z = !cb6VarN0.equals(cb6Var2);
                        }
                        if (!zEquals2 || z) {
                            ImmutableList immutableList = go4Var.t;
                            ImmutableList immutableList2 = go4Var.u;
                            ImmutableList immutableListF0 = go4.F0(go4Var.y, xp7Var, go4Var.I, go4Var.s, go4Var.r);
                            go4Var.t = immutableListF0;
                            go4Var.u = go4.E0(go4Var.y, xp7Var, go4Var.I, immutableListF0, go4Var.r);
                            z2 = !go4Var.t.equals(immutableList);
                            z3 = !go4Var.u.equals(immutableList2);
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                        if (z) {
                            go4Var.i.f(13, new sn4(go4Var, 11));
                        }
                        if (!zEquals2) {
                            gn4Var.getClass();
                            vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
                            gn4Var.d.k();
                        }
                        if (z3) {
                            gn4Var.getClass();
                            vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
                            gn4Var.d.getClass();
                        }
                        if (z2) {
                            gn4Var.getClass();
                            vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
                            gn4Var.d.u();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gr4
    public void b(hq4 hq4Var) {
        hr4 hr4Var = (hr4) this.b;
        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) this.c;
        hr4Var.getClass();
        String str = mediaDescriptionCompat.a;
        if (TextUtils.isEmpty(str)) {
            wn5.k0("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
            return;
        }
        qg6 qg6Var = hr4Var.g.t;
        if (!qg6Var.f0(17)) {
            wn5.k0("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
            return;
        }
        bm8 bm8VarS = qg6Var.S();
        am8 am8Var = new am8();
        for (int i = 0; i < bm8VarS.o(); i++) {
            if (TextUtils.equals(bm8VarS.m(i, am8Var, 0L).c.a, str)) {
                qg6Var.B0(i);
                return;
            }
        }
    }

    @Override // defpackage.co4
    public void c(xf3 xf3Var, int i) {
        switch (this.a) {
            case 20:
                go4 go4Var = (go4) this.b;
                wp7 wp7Var = (wp7) this.c;
                xf3Var.d0(go4Var.c, i, wp7Var.b(), Bundle.EMPTY);
                break;
            case 21:
                xf3Var.u(((go4) this.b).c, i, ((hp8) this.c).c());
                break;
            case 22:
                go4 go4Var2 = (go4) this.b;
                ua6 ua6Var = (ua6) this.c;
                so4 so4Var = go4Var2.c;
                Bundle bundle = new Bundle();
                bundle.putFloat(ua6.e, ua6Var.a);
                bundle.putFloat(ua6.f, ua6Var.b);
                xf3Var.c0(so4Var, i, bundle);
                break;
            case 23:
            default:
                go4 go4Var3 = (go4) this.b;
                xf3Var.Y(go4Var3.c, i, (Surface) this.c);
                break;
            case 24:
                go4 go4Var4 = (go4) this.b;
                List list = (List) this.c;
                so4 so4Var2 = go4Var4.c;
                lj3 lj3VarM = ImmutableList.m();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    lj3VarM.O(((jp4) list.get(i2)).c(true));
                }
                xf3Var.C(so4Var2, i, new zh0(lj3VarM.S()), true);
                break;
        }
    }

    @Override // defpackage.r94
    public void d(Object obj, vd2 vd2Var) {
        hd1 hd1Var = (hd1) this.b;
        gb6 gb6Var = (gb6) this.c;
        ce ceVar = (ce) obj;
        SparseArray sparseArray = hd1Var.e;
        qq4 qq4Var = new qq4();
        qq4Var.a = vd2Var;
        SparseBooleanArray sparseBooleanArray = vd2Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iB = vd2Var.b(i);
            be beVar = (be) sparseArray.get(iB);
            beVar.getClass();
            sparseArray2.append(iB, beVar);
        }
        qq4Var.b = sparseArray2;
        ceVar.S(gb6Var, qq4Var);
    }

    @Override // defpackage.y72
    public v72[] e(Uri uri, Map map) {
        ig1 ig1Var = (ig1) this.b;
        b bVar = (b) this.c;
        return new v72[]{ig1Var.c.r(bVar) ? new xa8(ig1Var.c.p(bVar)) : new hg1(bVar)};
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // defpackage.ly0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(defpackage.o77 r5) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 4: goto L89;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.c
            vv1 r1 = (defpackage.vv1) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r5 = r5.get(r2)
            android.content.Context r5 = (android.content.Context) r5
            int r1 = r1.a
            switch(r1) {
                case 15: goto L77;
                case 16: goto L72;
                case 17: goto L30;
                default: goto L1a;
            }
        L1a:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r5 = r1.getInstallerPackageName(r5)
            if (r5 == 0) goto L2d
            java.lang.String r5 = com.google.firebase.FirebaseCommonRegistrar.b(r5)
            goto L83
        L2d:
            java.lang.String r5 = ""
            goto L83
        L30:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.television"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L41
            java.lang.String r5 = "tv"
            goto L83
        L41:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.watch"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L50
            java.lang.String r5 = "watch"
            goto L83
        L50:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L5f
            java.lang.String r5 = "auto"
            goto L83
        L5f:
            r2 = 26
            if (r1 < r2) goto L2d
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 == 0) goto L2d
            java.lang.String r5 = "embedded"
            goto L83
        L72:
            java.lang.String r5 = com.google.firebase.FirebaseCommonRegistrar.a(r5)
            goto L83
        L77:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L2d
            int r5 = r5.targetSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L83:
            q20 r1 = new q20
            r1.<init>(r0, r5)
            return r1
        L89:
            java.lang.Object r0 = r4.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.c
            tx0 r1 = (defpackage.tx0) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L9e
            ly0 r0 = r1.f     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r0.h(r5)     // Catch: java.lang.Throwable -> L9e
            android.os.Trace.endSection()
            return r5
        L9e:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2.h(o77):java.lang.Object");
    }

    @Override // defpackage.fe8
    public void i(com.google.android.material.tabs.b bVar, int i) {
        DownloadContentFragment downloadContentFragment = (DownloadContentFragment) this.b;
        RecentDownloadType recentDownloadType = (RecentDownloadType) ((List) this.c).get(i);
        js3.p(recentDownloadType, "position");
        String string = downloadContentFragment.K().getString(recentDownloadType.a);
        js3.o(string, "getString(...)");
        bVar.b(sa7.q(string));
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        switch (this.a) {
            case 6:
                ((ce) obj).h((be) this.b, (jv4) this.c);
                break;
            case 7:
                ((ce) obj).E((be) this.b, (PlaybackException) this.c);
                break;
            case 8:
                ((ce) obj).H((be) this.b, (ec1) this.c);
                break;
            case 9:
                ((ce) obj).f((be) this.b, (ua6) this.c);
                break;
            case 10:
                ((ce) obj).Q((be) this.b, (Exception) this.c);
                break;
            case 11:
                be beVar = (be) this.b;
                w59 w59Var = (w59) this.c;
                ((ce) obj).s(beVar, w59Var);
                int i = w59Var.a;
                break;
            case 12:
                ((ce) obj).j((be) this.b, this.c);
                break;
            case 13:
                ((ce) obj).P((be) this.b, (rp8) this.c);
                break;
            case 14:
                ((ce) obj).p((be) this.b, (ly) this.c);
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                on onVar = (on) this.b;
                Integer num = (Integer) this.c;
                ((eb6) obj).o(num.intValue(), ((he6) onVar.a).p());
                break;
            case 23:
                ((eb6) obj).o(((Integer) this.c).intValue(), (jp4) this.b);
                break;
        }
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        AppPaymentDialogFragment appPaymentDialogFragment = (AppPaymentDialogFragment) this.b;
        DownloadDataModel downloadDataModel = (DownloadDataModel) this.c;
        ErrorDTO errorDTO = (ErrorDTO) serializable;
        int i = AppPaymentDialogFragment.U0;
        Objects.toString(errorDTO);
        if (appPaymentDialogFragment.J0.g() instanceof ProgressDialogFragment) {
            appPaymentDialogFragment.J0.q();
        }
        if (errorDTO.getCode() != 510) {
            errorDTO.assertToastMessage(appPaymentDialogFragment.F());
        } else {
            t32.b().g(new xq(new ResultDTO(errorDTO.getCode(), errorDTO.getMessageCode(), errorDTO.getTranslatedMessage()), true, "Already Purchased", downloadDataModel));
        }
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.b;
        Intent intent = (Intent) this.c;
        int i = EnhancedIntentService.f;
        enhancedIntentService.a(intent);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 1:
                c5 c5Var = (c5) this.b;
                sb7.p("MyketService", "Sign out", null);
                z4 z4Var = c5Var.h;
                z4Var.b();
                z4Var.b();
                c5Var.h("", "", "");
                c5Var.d.b("");
                ((ir.mservices.market.version2.services.b) c5Var.c.get()).performAuthorize(null, null);
                ((jx8) this.c).onSuccess((UnbindAllResultDTO) obj);
                t32.b().g(new b5());
                c5Var.b.i(lu7.r0, "");
                break;
            default:
                c5 c5Var2 = (c5) this.b;
                gb8 gb8Var = (gb8) this.c;
                ProfileInfoDto profileInfoDto = (ProfileInfoDto) obj;
                c5Var2.h.k(profileInfoDto);
                t32.b().g(new a5());
                if (gb8Var != null) {
                    gb8Var.onSuccess(profileInfoDto);
                }
                break;
        }
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        LaunchContentActivity launchContentActivity = (LaunchContentActivity) this.b;
        BaseContentFragment baseContentFragment = (BaseContentFragment) this.c;
        int i = LaunchContentActivity.B1;
        no3 no3VarG = lf9Var.a.g(1);
        view.getLayoutParams().height = baseContentFragment.G0(launchContentActivity) + no3VarG.b;
        view.setPaddingRelative(launchContentActivity.w1.A(), no3VarG.b, 0, 0);
        return lf9Var;
    }

    @Override // defpackage.cu2
    public void s(Context context, String str) {
        AuthorizeRequestDto authorizeRequestDto = (AuthorizeRequestDto) this.b;
        gb8 gb8Var = (gb8) this.c;
        int i = c88.a;
        if (str == null) {
            str = "";
        }
        authorizeRequestDto.setAdId(str);
        gb8Var.onSuccess(authorizeRequestDto);
    }

    public /* synthetic */ j2(go4 go4Var, wp7 wp7Var) {
        this.a = 20;
        Bundle bundle = Bundle.EMPTY;
        this.b = go4Var;
        this.c = wp7Var;
    }

    public /* synthetic */ j2(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
