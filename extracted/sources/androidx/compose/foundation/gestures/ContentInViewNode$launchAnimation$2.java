package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.dh7;
import defpackage.e71;
import defpackage.f8;
import defpackage.g51;
import defpackage.pj9;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vt;
import defpackage.wg0;
import defpackage.wt3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {282}, m = "invokeSuspend", v = 1)
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b c;
    public final /* synthetic */ q d;
    public final /* synthetic */ wg0 e;
    public final /* synthetic */ long f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {289}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ q c;
        public final /* synthetic */ b d;
        public final /* synthetic */ wg0 e;
        public final /* synthetic */ long f;
        public final /* synthetic */ wt3 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, b bVar, wg0 wg0Var, long j, wt3 wt3Var, g51 g51Var) {
            super(2, g51Var);
            this.c = qVar;
            this.d = bVar;
            this.e = wg0Var;
            this.f = j;
            this.g = wt3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, this.e, this.f, this.g, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((dh7) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                dh7 dh7Var = (dh7) this.b;
                long j = this.f;
                b bVar = this.d;
                wg0 wg0Var = this.e;
                float fC0 = b.C0(bVar, wg0Var, j);
                q qVar = this.c;
                qVar.e = fC0;
                vt vtVar = new vt(bVar, qVar, this.g, dh7Var);
                f8 f8Var = new f8(bVar, qVar, wg0Var, 9);
                this.a = 1;
                if (qVar.a(vtVar, f8Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(b bVar, q qVar, wg0 wg0Var, long j, g51 g51Var) {
        super(2, g51Var);
        this.c = bVar;
        this.d = qVar;
        this.e = wg0Var;
        this.f = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.c, this.d, this.e, this.f, g51Var);
        contentInViewNode$launchAnimation$2.b = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentInViewNode$launchAnimation$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar = this.c;
        pj9 pj9Var = bVar.s;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    wt3 wt3VarH = kotlinx.coroutines.a.h(((e71) this.b).getCoroutineContext());
                    bVar.v = true;
                    o oVar = bVar.p;
                    MutatePriority mutatePriority = MutatePriority.a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, bVar, this.e, this.f, wt3VarH, null);
                    this.a = 1;
                    if (oVar.f(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                pj9Var.w();
                bVar.v = false;
                pj9Var.p(null);
                bVar.t = false;
                return tx8.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            bVar.v = false;
            pj9Var.p(null);
            bVar.t = false;
            throw th;
        }
    }
}
