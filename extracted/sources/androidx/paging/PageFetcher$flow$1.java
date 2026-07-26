package androidx.paging;

import defpackage.b16;
import defpackage.bp2;
import defpackage.bz5;
import defpackage.cz5;
import defpackage.g51;
import defpackage.gf2;
import defpackage.h11;
import defpackage.o4;
import defpackage.pw7;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {143}, m = "invokeSuspend", v = 1)
final class PageFetcher$flow$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k c;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$1, reason: invalid class name */
    @tb1(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {59, 59}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ze2 ze2Var;
            RemoteMediator$InitializeAction remoteMediator$InitializeAction;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                ze2Var = (ze2) this.b;
                remoteMediator$InitializeAction = null;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return tx8.a;
                }
                ze2Var = (ze2) this.b;
                kotlin.b.b(obj);
                remoteMediator$InitializeAction = (RemoteMediator$InitializeAction) obj;
            }
            Boolean boolValueOf = Boolean.valueOf(remoteMediator$InitializeAction == RemoteMediator$InitializeAction.a);
            this.b = null;
            this.a = 2;
            if (ze2Var.emit(boolValueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$2, reason: invalid class name */
    @tb1(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {71, 75}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements rp2 {
        public b16 a;
        public int b;
        public /* synthetic */ bz5 c;
        public final /* synthetic */ k d;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements bp2 {
            @Override // defpackage.bp2
            public final Object invoke() {
                ((k) this.receiver).c.C(Boolean.TRUE);
                return tx8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g51 g51Var, k kVar) {
            super(3, g51Var);
            this.d = kVar;
        }

        @Override // defpackage.rp2
        public final Object a(Object obj, Object obj2, Object obj3) {
            ((Boolean) obj2).getClass();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2((g51) obj3, this.d);
            anonymousClass2.c = (bz5) obj;
            return anonymousClass2.invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(g51 g51Var, k kVar) {
        super(2, g51Var);
        this.c = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(g51Var, this.c);
        pageFetcher$flow$1.b = obj;
        return pageFetcher$flow$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcher$flow$1) create((pw7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            pw7 pw7Var = (pw7) this.b;
            k kVar = this.c;
            xe2 xe2VarI = e.i(new o4(new vb7(new FlowExtKt$simpleScan$1(new gf2((h11) kVar.c.b, new AnonymousClass1(2, null)), new AnonymousClass2(null, kVar), null)), 9), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, kVar));
            cz5 cz5Var = new cz5(pw7Var);
            this.a = 1;
            if (xe2VarI.a(cz5Var, this) == coroutineSingletons) {
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
