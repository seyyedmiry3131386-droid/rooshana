package ir.mservices.market.pika.receive.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Build;
import defpackage.bt2;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.g51;
import defpackage.ip3;
import defpackage.ja1;
import defpackage.js3;
import defpackage.kf1;
import defpackage.kp3;
import defpackage.ly5;
import defpackage.np3;
import defpackage.op3;
import defpackage.pp3;
import defpackage.qp3;
import defpackage.t32;
import defpackage.tv8;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.yq2;
import defpackage.zb2;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Context a;
    public final dp3 b;
    public final l c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final kotlinx.coroutines.channels.a h;
    public float i;

    public a(Context context, dp3 dp3Var, t32 t32Var) {
        js3.p(dp3Var, "installManager");
        js3.p(t32Var, "eventBus");
        this.a = context;
        this.b = dp3Var;
        this.c = ja1.b(new LinkedHashMap());
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.h = dt2.b(Integer.MAX_VALUE, 6, null);
        t32Var.l(this, false);
        context.getPackageManager().getPackageInstaller().registerSessionCallback(new ip3(0, this));
    }

    public static final void a(a aVar, File file, PackageInstaller.Session session) {
        FileInputStream fileInputStreamJ;
        byte[] bArr;
        OutputStream outputStreamOpenWrite = session.openWrite(file.getName(), 0L, file.length());
        try {
            fileInputStreamJ = zb2.j(file);
            try {
                bArr = new byte[16384];
            } finally {
            }
        } finally {
        }
        while (true) {
            int i = fileInputStreamJ.read(bArr);
            if (i < 0) {
                session.fsync(outputStreamOpenWrite);
                fileInputStreamJ.close();
                tv8.h(outputStreamOpenWrite, null);
                return;
            }
            outputStreamOpenWrite.write(bArr, 0, i);
        }
    }

    public static final PackageInstaller.Session b(a aVar, String str) {
        PackageInstaller packageInstaller = aVar.a.getPackageManager().getPackageInstaller();
        js3.o(packageInstaller, "getPackageInstaller(...)");
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        if (Build.VERSION.SDK_INT >= 31) {
            sessionParams.setInstallScenario(1);
        }
        sessionParams.setAppPackageName(dp3.y(str));
        sessionParams.setInstallLocation(0);
        int iCreateSession = packageInstaller.createSession(sessionParams);
        aVar.e.put(Integer.valueOf(iCreateSession), str);
        PackageInstaller.Session sessionOpenSession = packageInstaller.openSession(iCreateSession);
        js3.o(sessionOpenSession, "openSession(...)");
        return sessionOpenSession;
    }

    public final void c(long j, String str) {
        l lVar;
        Object value;
        js3.p(str, "packageName");
        do {
            lVar = this.c;
            value = lVar.getValue();
        } while (!lVar.n(value, kotlin.collections.b.P((Map) value, kotlin.collections.b.M(new Pair(Long.valueOf(j), new kp3(op3.g, str))))));
    }

    public final Object d(long j, String str, String str2, g51 g51Var) throws Throwable {
        ug1 ug1Var = up1.a;
        Object objZ = bt2.Z(kf1.c, new InstallRepositoryImpl$installApkWithPackageInstaller$2(this, str, str2, j, null), g51Var);
        return objZ == CoroutineSingletons.a ? objZ : tx8.a;
    }

    public final Object e(long j, String str, String str2, g51 g51Var) throws Throwable {
        ug1 ug1Var = up1.a;
        Object objZ = bt2.Z(kf1.c, new InstallRepositoryImpl$installSplitApk$2(this, str, str2, j, null), g51Var);
        return objZ == CoroutineSingletons.a ? objZ : tx8.a;
    }

    public final void onEvent(ly5 ly5Var) {
        Object value;
        Long l;
        Object value2;
        yq2 yq2Var = pp3.g;
        yq2 yq2Var2 = np3.g;
        js3.p(ly5Var, "event");
        String str = ly5Var.a;
        Intent intent = ly5Var.b;
        boolean zI = js3.i(intent.getAction(), "android.intent.action.PACKAGE_ADDED");
        l lVar = this.c;
        LinkedHashMap linkedHashMap = this.d;
        if (zI || js3.i(intent.getAction(), "android.intent.action.PACKAGE_REPLACED")) {
            Long l2 = (Long) linkedHashMap.get(str);
            if (l2 != null) {
                long jLongValue = l2.longValue();
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, kotlin.collections.b.P((Map) value, kotlin.collections.b.M(new Pair(Long.valueOf(jLongValue), new kp3(yq2Var, str))))));
                return;
            }
            return;
        }
        if (!js3.i(intent.getAction(), "android.intent.action.PACKAGE_REMOVED") || (l = (Long) linkedHashMap.get(str)) == null) {
            return;
        }
        long jLongValue2 = l.longValue();
        Integer num = (Integer) this.g.get(str);
        if (num != null) {
            int iIntValue = num.intValue();
            dp3 dp3Var = this.b;
            if (dp3Var.G(str)) {
                Integer numP = dp3Var.p(str);
                if (numP == null || numP.intValue() != iIntValue) {
                    yq2Var = qp3.g;
                }
            } else {
                yq2Var = yq2Var2;
            }
            yq2Var2 = yq2Var;
        }
        do {
            value2 = lVar.getValue();
        } while (!lVar.n(value2, kotlin.collections.b.P((Map) value2, kotlin.collections.b.M(new Pair(Long.valueOf(jLongValue2), new kp3(yq2Var2, str))))));
    }
}
