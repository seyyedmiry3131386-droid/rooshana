package androidx.compose.ui.viewinterop;

import defpackage.bp2;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.gx4;
import defpackage.qp2;
import defpackage.sy6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class d extends gx4 {
    public dp2 o;
    public final dp2 p = new dp2() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
        @tb1(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {763}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ d b;
            public final /* synthetic */ sy6 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(d dVar, sy6 sy6Var, g51 g51Var) {
                super(2, g51Var);
                this.b = dVar;
                this.c = sy6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass1(this.b, this.c, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    final sy6 sy6Var = this.c;
                    bp2 bp2Var = new bp2() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        {
                            super(0);
                        }

                        @Override // defpackage.bp2
                        public final Object invoke() {
                            return sy6Var;
                        }
                    };
                    this.a = 1;
                    if (androidx.compose.ui.relocation.a.a(this.b, bp2Var, this) == coroutineSingletons) {
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

        {
            super(1);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            sy6 sy6Var = (sy6) obj;
            d dVar = this.g;
            if (dVar.n) {
                bt2.G(dVar.o0(), null, null, new AnonymousClass1(dVar, sy6Var, null), 3);
            }
            return tx8.a;
        }
    };

    public d(dp2 dp2Var) {
        this.o = dp2Var;
    }

    @Override // defpackage.gx4
    public final void s0() {
        this.o.invoke(this.p);
    }

    @Override // defpackage.gx4
    public final void u0() {
        this.o.invoke(null);
    }
}
