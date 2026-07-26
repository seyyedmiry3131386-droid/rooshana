package ir.mservices.market.pika.send.model;

import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zb2;
import defpackage.zk8;
import io.sentry.h4;
import io.sentry.instrumentation.file.e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.model.CloneAppRepositoryImpl$cloneApp$2", f = "CloneAppRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class CloneAppRepositoryImpl$cloneApp$2 extends SuspendLambda implements qp2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ String e;
    public final /* synthetic */ a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneAppRepositoryImpl$cloneApp$2(boolean z, String str, String[] strArr, Ref$ObjectRef ref$ObjectRef, String str2, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.a = z;
        this.b = str;
        this.c = strArr;
        this.d = ref$ObjectRef;
        this.e = str2;
        this.f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CloneAppRepositoryImpl$cloneApp$2(this.a, this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CloneAppRepositoryImpl$cloneApp$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        try {
            boolean z = this.a;
            a aVar = this.f;
            Ref$ObjectRef ref$ObjectRef = this.d;
            String str = this.b;
            try {
                if (!z) {
                    String str2 = this.e;
                    if (str2 == null) {
                        return null;
                    }
                    File file = new File(str);
                    FileInputStream fileInputStreamI = io.sentry.config.a.i(new FileInputStream(str2), str2);
                    zb2.d(file, fileInputStreamI);
                    fileInputStreamI.close();
                    Object obj2 = ref$ObjectRef.a;
                    ((List) obj2).addAll(a.a(aVar, str2));
                    ArrayList arrayListQ0 = kotlin.collections.a.Q0(kotlin.collections.a.i0((Iterable) obj2));
                    ref$ObjectRef.a = arrayListQ0;
                    return arrayListQ0;
                }
                File file2 = new File(str);
                if (file2.exists()) {
                    file2.delete();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                if (h4.b().m().isTracingEnabled()) {
                    fileOutputStream = new e(e.b(str != null ? new File(str) : null, fileOutputStream, false));
                }
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
                byte[] bArr = new byte[16384];
                String[] strArr = this.c;
                if (strArr != null) {
                    for (String str3 : strArr) {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(io.sentry.config.a.i(new FileInputStream(str3), str3), 16384);
                        String strSubstring = str3.substring(f88.p0(6, str3, "/") + 1);
                        js3.o(strSubstring, "substring(...)");
                        zipOutputStream.putNextEntry(new ZipEntry(strSubstring));
                        while (true) {
                            int i = bufferedInputStream.read(bArr, 0, 16384);
                            if (i != -1) {
                                zipOutputStream.write(bArr, 0, i);
                            }
                        }
                        bufferedInputStream.close();
                        Object obj3 = ref$ObjectRef.a;
                        ((List) obj3).addAll(a.a(aVar, str3));
                        ref$ObjectRef.a = kotlin.collections.a.Q0(kotlin.collections.a.i0((Iterable) obj3));
                    }
                }
                zipOutputStream.finish();
                zipOutputStream.close();
                return (List) ref$ObjectRef.a;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            obj = null;
        }
        zk8.X(e, true);
        return obj;
    }
}
