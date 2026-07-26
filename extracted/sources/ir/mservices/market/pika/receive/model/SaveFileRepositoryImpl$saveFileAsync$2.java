package ir.mservices.market.pika.receive.model;

import android.content.Context;
import android.net.Uri;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.k68;
import defpackage.kf1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.zb2;
import defpackage.zk8;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.model.SaveFileRepositoryImpl$saveFileAsync$2", f = "SaveFileRepositoryImpl.kt", l = {48}, m = "invokeSuspend", v = 1)
final class SaveFileRepositoryImpl$saveFileAsync$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ b c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Uri e;
    public final /* synthetic */ long f;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.model.SaveFileRepositoryImpl$saveFileAsync$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.model.SaveFileRepositoryImpl$saveFileAsync$2$1", f = "SaveFileRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ b b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Uri d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, b bVar, String str, Uri uri, long j, g51 g51Var) {
            super(2, g51Var);
            this.a = z;
            this.b = bVar;
            this.c = str;
            this.d = uri;
            this.e = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, this.b, this.c, this.d, this.e, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String absolutePath;
            long j = this.e;
            b bVar = this.b;
            l lVar = bVar.d;
            LinkedHashMap linkedHashMap = bVar.c;
            k68 k68Var = bVar.b;
            Context context = bVar.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            boolean z = this.a;
            String str = this.c;
            Uri uri = this.d;
            try {
                try {
                    File file = z ? new File(k68Var.m(str)) : new File(k68Var.k(str));
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    zb2.d(file, inputStreamOpenInputStream);
                    inputStreamOpenInputStream.close();
                    Long l = new Long(j);
                    if (z) {
                        absolutePath = k68Var.l(str);
                        b.a(bVar, file, new File(absolutePath));
                    } else {
                        absolutePath = file.getAbsolutePath();
                    }
                    linkedHashMap.put(l, absolutePath);
                    String str2 = (String) linkedHashMap.get(new Long(j));
                    if (str2 != null && !((Map) lVar.getValue()).containsKey(str)) {
                        lVar.p(null, kotlin.collections.b.P((Map) lVar.getValue(), kotlin.collections.b.O(new Pair(str, str2))));
                    }
                } catch (IOException e) {
                    zk8.X(e, true);
                } catch (Exception e2) {
                    zk8.X(e2, true);
                }
                context.getContentResolver().delete(uri, null, null);
                return tx8.a;
            } catch (Throwable th) {
                context.getContentResolver().delete(uri, null, null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveFileRepositoryImpl$saveFileAsync$2(boolean z, b bVar, String str, Uri uri, long j, g51 g51Var) {
        super(2, g51Var);
        this.b = z;
        this.c = bVar;
        this.d = str;
        this.e = uri;
        this.f = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SaveFileRepositoryImpl$saveFileAsync$2(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SaveFileRepositoryImpl$saveFileAsync$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ug1 ug1Var = up1.a;
            kf1 kf1Var = kf1.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, this.e, this.f, null);
            this.a = 1;
            if (bt2.Z(kf1Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
