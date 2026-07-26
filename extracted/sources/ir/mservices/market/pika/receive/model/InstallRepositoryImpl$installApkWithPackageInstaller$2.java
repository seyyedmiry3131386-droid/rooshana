package ir.mservices.market.pika.receive.model;

import android.content.pm.PackageInstaller;
import defpackage.e71;
import defpackage.g51;
import defpackage.kp3;
import defpackage.op3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zk8;
import java.io.File;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.model.InstallRepositoryImpl$installApkWithPackageInstaller$2", f = "InstallRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstallRepositoryImpl$installApkWithPackageInstaller$2 extends SuspendLambda implements qp2 {
    public final /* synthetic */ a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallRepositoryImpl$installApkWithPackageInstaller$2(a aVar, String str, String str2, long j, g51 g51Var) {
        super(2, g51Var);
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InstallRepositoryImpl$installApkWithPackageInstaller$2(this.a, this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        InstallRepositoryImpl$installApkWithPackageInstaller$2 installRepositoryImpl$installApkWithPackageInstaller$2 = (InstallRepositoryImpl$installApkWithPackageInstaller$2) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        installRepositoryImpl$installApkWithPackageInstaller$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        long j = this.d;
        String str = this.b;
        a aVar = this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        try {
            PackageInstaller.Session sessionB = a.b(aVar, str);
            a.a(aVar, new File(this.c), sessionB);
            aVar.h.o(sessionB);
            l lVar = aVar.c;
            do {
                value = lVar.getValue();
            } while (!lVar.n(value, kotlin.collections.b.P((Map) value, kotlin.collections.b.M(new Pair(new Long(j), new kp3(op3.g, str))))));
            aVar.d.put(str, new Long(j));
        } catch (Exception e) {
            zk8.X(e, true);
        }
        return tx8.a;
    }
}
