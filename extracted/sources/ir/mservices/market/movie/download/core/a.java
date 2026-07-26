package ir.mservices.market.movie.download.core;

import android.content.Context;
import android.content.res.Resources;
import defpackage.at2;
import defpackage.b56;
import defpackage.bt2;
import defpackage.c5;
import defpackage.es1;
import defpackage.f88;
import defpackage.h60;
import defpackage.i30;
import defpackage.js3;
import defpackage.k68;
import defpackage.lw;
import defpackage.mz3;
import defpackage.pz3;
import defpackage.t32;
import defpackage.ts1;
import defpackage.zb2;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.Quality;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.version2.services.d;
import java.io.File;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.EmptyCoroutineContext;
import nene.downloadmanager.exceptions.downloadfail.NeneStorageException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ts1, pz3 {
    public final d a;
    public final c5 b;
    public final k68 c;
    public final b56 d;
    public final Context e;
    public final Object f;

    public a(d dVar, c5 c5Var, k68 k68Var, b56 b56Var, Context context) {
        js3.p(dVar, "generalService");
        js3.p(c5Var, "accountManager");
        js3.p(k68Var, "storageUtils");
        js3.p(b56Var, "permissionFactory");
        this.a = dVar;
        this.b = c5Var;
        this.c = k68Var;
        this.d = b56Var;
        this.e = context;
        this.f = kotlin.a.b(LazyThreadSafetyMode.a, new i30(this, 11));
    }

    @Override // defpackage.ts1
    public final void b(es1 es1Var) throws Throwable {
        js3.p(es1Var, "downloadInfo");
        Object obj = es1Var.e;
        MovieDownloadMetaData movieDownloadMetaData = obj instanceof MovieDownloadMetaData ? (MovieDownloadMetaData) obj : null;
        if (movieDownloadMetaData == null) {
            lw.g(null, "Wrong tag passed to downloadInfo, Please verify correct tag!", null);
            return;
        }
        try {
            k68 k68Var = this.c;
            js3.p(k68Var, "storageUtils");
            String str = es1Var.c;
            js3.o(str, "getDestFilePath(...)");
            k68Var.a(str, k68.e);
            zb2.f(new File(es1Var.c));
            String str2 = es1Var.d;
            js3.o(str2, "getKey(...)");
            if (js3.i(f88.y0(str2, new String[]{"/"}, 6).get(2), "media")) {
                bt2.Q(EmptyCoroutineContext.a, new MovieDownloadPostProcess$postProcessDownload$1(movieDownloadMetaData, this, es1Var, null));
            }
        } catch (IllegalStateException unused) {
            Resources resources = this.e.getResources();
            this.d.getClass();
            t32.b().j(new h60(new Permission[]{b56.a(resources, 2, PermissionReasonId.h, Quality.OPTIONAL)}));
            throw new NeneStorageException("Write storage permission failed");
        }
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }
}
