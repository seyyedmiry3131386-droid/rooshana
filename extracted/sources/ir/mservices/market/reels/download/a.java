package ir.mservices.market.reels.download;

import android.content.Context;
import android.os.Build;
import defpackage.b56;
import defpackage.bs1;
import defpackage.bt2;
import defpackage.c24;
import defpackage.c56;
import defpackage.d56;
import defpackage.d87;
import defpackage.dr1;
import defpackage.e87;
import defpackage.es1;
import defpackage.h60;
import defpackage.hh2;
import defpackage.js3;
import defpackage.k68;
import defpackage.o06;
import defpackage.pa1;
import defpackage.rs6;
import defpackage.t32;
import defpackage.ts1;
import defpackage.us1;
import defpackage.ut4;
import defpackage.vs1;
import defpackage.xl5;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionResult;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.File;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ts1, vs1 {
    public final dr1 a;
    public final Context b;
    public final k68 c;
    public final ut4 d;
    public final b56 e;
    public final d56 f;
    public final c24 g;
    public String h;

    public a(dr1 dr1Var, Context context, k68 k68Var, ut4 ut4Var, b56 b56Var, d56 d56Var, t32 t32Var) {
        js3.p(dr1Var, "neneDownloadManager");
        js3.p(k68Var, "storageUtils");
        js3.p(b56Var, "permissionFactory");
        js3.p(d56Var, "permissionHelper");
        js3.p(t32Var, "eventBus");
        this.a = dr1Var;
        this.b = context;
        this.c = k68Var;
        this.d = ut4Var;
        this.e = b56Var;
        this.f = d56Var;
        this.g = kotlin.a.a(new o06(10, this));
        t32Var.l(this, false);
    }

    @Override // defpackage.vs1
    public final us1 a(bs1 bs1Var) throws Throwable {
        js3.p(bs1Var, "info");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.a = new us1(((es1) bs1Var).b);
        bt2.Q(EmptyCoroutineContext.a, new ReelsDownloadManager$preProcessDownload$1(bs1Var, ref$ObjectRef, this, null));
        return (us1) ref$ObjectRef.a;
    }

    public final void c(String str) throws Throwable {
        Object objValueOf;
        js3.p(str, "playId");
        dr1 dr1Var = this.a;
        es1 es1VarB = ((xl5) dr1Var.get()).b(str);
        int i = es1VarB != null ? es1VarB.f : 190;
        if (i == 100 || i == 110) {
            pa1 pa1Var = ((xl5) dr1Var.get()).a;
            pa1Var.e((es1) pa1Var.c.f.get(str));
            return;
        }
        Context context = this.b;
        if (i != 120 && i != 130) {
            if (i == 140) {
                hh2.H(new hh2(context, context.getString(rs6.reels_downloaded_finished)));
                return;
            } else if (i != 150 && i != 190) {
                return;
            }
        }
        Object e87Var = Build.VERSION.SDK_INT >= 29 ? new e87(Boolean.TRUE) : new d87();
        boolean z = e87Var instanceof d87;
        c24 c24Var = this.g;
        if (z) {
            String str2 = ((Permission) c24Var.getValue()).b;
            js3.o(str2, "getManifestId(...)");
            this.f.getClass();
            objValueOf = Boolean.valueOf(d56.c(context, str2));
        } else {
            objValueOf = ((e87) e87Var).a;
        }
        if (!((Boolean) objValueOf).booleanValue()) {
            t32.b().j(new h60(new Permission[]{(Permission) c24Var.getValue()}));
            this.h = str;
            return;
        }
        k68 k68Var = this.c;
        k68Var.getClass();
        if (k68.r(str)) {
            return;
        }
        es1 es1VarB2 = ((xl5) dr1Var.get()).b(str);
        if (es1VarB2 != null) {
            ((xl5) dr1Var.get()).a.h(es1VarB2, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
            return;
        }
        ((xl5) dr1Var.get()).a("", k68Var.e() + File.separator + "reels_" + str + ".mp4", str, new ReelsDownloadTag(), ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
    }

    public final void onEvent(c56 c56Var) throws Throwable {
        String str;
        js3.p(c56Var, "event");
        Permission[] permissionArr = c56Var.a;
        if (permissionArr != null) {
            for (Permission permission : permissionArr) {
                if (2 == permission.a && permission.d == PermissionResult.GRANTED && (str = this.h) != null) {
                    c(str);
                    this.h = null;
                }
            }
        }
    }

    @Override // defpackage.ts1
    public final void b(es1 es1Var) {
    }
}
