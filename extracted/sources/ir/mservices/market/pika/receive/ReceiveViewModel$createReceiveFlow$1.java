package ir.mservices.market.pika.receive;

import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.dp3;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.kp3;
import defpackage.m86;
import defpackage.np3;
import defpackage.p86;
import defpackage.pp3;
import defpackage.q86;
import defpackage.qp2;
import defpackage.qp3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yq2;
import ir.mservices.market.pika.common.model.FileState;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$1", f = "ReceiveViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 1)
final class ReceiveViewModel$createReceiveFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReceiveViewModel b;
    public final /* synthetic */ long c;
    public final /* synthetic */ l d;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$1$1", f = "ReceiveViewModel.kt", l = {167}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ l c;
        public final /* synthetic */ ReceiveViewModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, ReceiveViewModel receiveViewModel, g51 g51Var) {
            super(2, g51Var);
            this.c = lVar;
            this.d = receiveViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((FileState) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object value;
            FileState fileState = (FileState) this.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            ReceiveViewModel receiveViewModel = this.d;
            if (i == 0) {
                b.b(obj);
                boolean z = fileState instanceof FileState.Received;
                l lVar = this.c;
                if (z) {
                    lVar.p(null, p86.a);
                    return tx8Var;
                }
                if (fileState instanceof FileState.InProgress) {
                    FileState.InProgress inProgress = (FileState.InProgress) fileState;
                    lVar.p(null, new q86(inProgress.getProgress(), inProgress.getTotalReceivedData(), inProgress.getAllData()));
                    return tx8Var;
                }
                if (!(fileState instanceof FileState.Saved)) {
                    if (fileState instanceof FileState.Canceled) {
                        lVar.p(null, new m86(ReceiveState.a));
                        return tx8Var;
                    }
                    if (!(fileState instanceof FileState.Failed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar.p(null, new m86(ReceiveState.b));
                    return tx8Var;
                }
                FileState.Saved saved = (FileState.Saved) fileState;
                long id = saved.getId();
                String packageName = saved.getPackageName();
                boolean zIsSplitApk = saved.isSplitApk();
                Uri uri = saved.getUri();
                this.b = fileState;
                this.a = 1;
                if (uri == null || (objC = receiveViewModel.u.c(id, uri, packageName, zIsSplitApk, this)) != coroutineSingletons) {
                    objC = tx8Var;
                }
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            ir.mservices.market.pika.receive.model.a aVar = receiveViewModel.v;
            FileState.Saved saved2 = (FileState.Saved) fileState;
            long id2 = saved2.getId();
            String packageName2 = saved2.getPackageName();
            int versionCode = saved2.getVersionCode();
            aVar.getClass();
            js3.p(packageName2, "packageName");
            dp3 dp3Var = aVar.b;
            yq2 yq2Var = !dp3Var.G(packageName2) ? np3.g : dp3Var.p(packageName2).intValue() >= versionCode ? pp3.g : qp3.g;
            l lVar2 = aVar.c;
            do {
                value = lVar2.getValue();
            } while (!lVar2.n(value, kotlin.collections.b.P((Map) value, kotlin.collections.b.M(new Pair(Long.valueOf(id2), new kp3(yq2Var, packageName2))))));
            aVar.g.put(packageName2, Integer.valueOf(versionCode));
            return tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveViewModel$createReceiveFlow$1(ReceiveViewModel receiveViewModel, long j, l lVar, g51 g51Var) {
        super(2, g51Var);
        this.b = receiveViewModel;
        this.c = j;
        this.d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReceiveViewModel$createReceiveFlow$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiveViewModel$createReceiveFlow$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r8, r1, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            ir.mservices.market.pika.receive.ReceiveViewModel r4 = r7.b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.b.b(r8)
            goto L49
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.b.b(r8)
            goto L36
        L1e:
            kotlin.b.b(r8)
            ir.mservices.market.pika.common.model.NearbyRepository r8 = r4.t
            long r5 = r7.c
            xe2 r8 = r8.getReceiveFileFlow(r5)
            fu0 r1 = defpackage.y97.G(r4)
            r7.a = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r1, r7)
            if (r8 != r0) goto L36
            goto L48
        L36:
            xe2 r8 = (defpackage.xe2) r8
            ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$1$1 r1 = new ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$1$1
            kotlinx.coroutines.flow.l r3 = r7.d
            r5 = 0
            r1.<init>(r3, r4, r5)
            r7.a = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.d.f(r8, r1, r7)
            if (r8 != r0) goto L49
        L48:
            return r0
        L49:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
