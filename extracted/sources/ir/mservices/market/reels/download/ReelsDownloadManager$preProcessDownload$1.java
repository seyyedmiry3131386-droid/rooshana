package ir.mservices.market.reels.download;

import defpackage.bs1;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sg4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.download.ReelsDownloadManager$preProcessDownload$1", f = "ReelsDownloadManager.kt", l = {166}, m = "invokeSuspend", v = 1)
final class ReelsDownloadManager$preProcessDownload$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ bs1 b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ a d;

    /* JADX INFO: renamed from: ir.mservices.market.reels.download.ReelsDownloadManager$preProcessDownload$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.reels.download.ReelsDownloadManager$preProcessDownload$1$1", f = "ReelsDownloadManager.kt", l = {167}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ bs1 b;
        public final /* synthetic */ Ref$ObjectRef c;
        public final /* synthetic */ a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bs1 bs1Var, Ref$ObjectRef ref$ObjectRef, a aVar, g51 g51Var) {
            super(2, g51Var);
            this.b = bs1Var;
            this.c = ref$ObjectRef;
            this.d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r11.a
                bs1 r2 = r11.b
                ir.mservices.market.reels.download.a r3 = r11.d
                r4 = 1
                if (r1 == 0) goto L1a
                if (r1 != r4) goto L12
                kotlin.b.b(r12)
                r9 = r11
                goto L6a
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.b.b(r12)
                r12 = r2
                es1 r12 = (defpackage.es1) r12
                java.lang.String r12 = r12.d
                if (r12 == 0) goto L6d
                ut4 r1 = r3.d
                r11.a = r4
                java.lang.Object r1 = r1.b
                r5 = r1
                v17 r5 = (defpackage.v17) r5
                r5.getClass()
                kotlin.Pair r1 = new kotlin.Pair
                java.lang.String r6 = "reel_id"
                r1.<init>(r6, r12)
                kotlin.Pair[] r12 = new kotlin.Pair[r4]
                r4 = 0
                r12[r4] = r1
                java.util.LinkedHashMap r8 = kotlin.collections.b.O(r12)
                java.util.Map r9 = r5.getCommonQueryParam()
                r10 = 0
                java.lang.String r6 = "reel-api"
                java.lang.String r7 = "v1/reel/{reel_id}/download"
                z57 r7 = r5.createRequestUrl(r6, r7, r8, r9, r10)
                ir.mservices.market.reels.services.ReelsService$download$2 r12 = new ir.mservices.market.reels.services.ReelsService$download$2
                r12.<init>()
                java.lang.reflect.Type r6 = r12.getType()
                java.lang.String r12 = "getType(...)"
                defpackage.js3.o(r6, r12)
                defpackage.js3.m(r7)
                r10 = 504(0x1f8, float:7.06E-43)
                java.lang.String r8 = "MyketReelsDownloadManager"
                r9 = r11
                java.lang.Object r12 = defpackage.dy3.v(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L6a
                return r0
            L6a:
                n99 r12 = (defpackage.n99) r12
                goto L6f
            L6d:
                r9 = r11
                r12 = 0
            L6f:
                boolean r0 = r12 instanceof defpackage.l99
                if (r0 == 0) goto L87
                us1 r0 = new us1
                l99 r12 = (defpackage.l99) r12
                java.lang.Object r12 = r12.a
                ir.mservices.market.reels.data.DownloadDto r12 = (ir.mservices.market.reels.data.DownloadDto) r12
                java.lang.String r12 = r12.getPath()
                r0.<init>(r12)
                kotlin.jvm.internal.Ref$ObjectRef r12 = r9.c
                r12.a = r0
                goto Lbd
            L87:
                boolean r0 = r12 instanceof defpackage.h99
                if (r0 == 0) goto Lbd
                es1 r2 = (defpackage.es1) r2
                java.lang.String r0 = r2.d
                java.lang.String r1 = "getKey(...)"
                defpackage.js3.o(r0, r1)
                dr1 r1 = r3.a
                java.lang.Object r1 = r1.get()
                xl5 r1 = (defpackage.xl5) r1
                pa1 r1 = r1.a
                fs1 r2 = r1.c
                java.util.HashMap r2 = r2.f
                java.lang.Object r0 = r2.get(r0)
                es1 r0 = (defpackage.es1) r0
                r1.e(r0)
                android.content.Context r0 = r3.b
                h99 r12 = (defpackage.h99) r12
                ir.mservices.market.version2.webapi.responsedto.ErrorDTO r12 = r12.a
                java.lang.String r12 = r12.getTranslatedMessage()
                hh2 r1 = new hh2
                r1.<init>(r0, r12)
                defpackage.hh2.H(r1)
            Lbd:
                tx8 r12 = defpackage.tx8.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.reels.download.ReelsDownloadManager$preProcessDownload$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsDownloadManager$preProcessDownload$1(bs1 bs1Var, Ref$ObjectRef ref$ObjectRef, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = bs1Var;
        this.c = ref$ObjectRef;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReelsDownloadManager$preProcessDownload$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReelsDownloadManager$preProcessDownload$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            ug1 ug1Var = up1.a;
            kotlinx.coroutines.android.a aVar = sg4.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, null);
            this.a = 1;
            if (bt2.Z(aVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
