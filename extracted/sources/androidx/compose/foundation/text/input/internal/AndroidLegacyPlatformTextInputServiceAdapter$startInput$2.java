package androidx.compose.foundation.text.input.internal;

import android.view.View;
import defpackage.bt2;
import defpackage.ca6;
import defpackage.do3;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.l98;
import defpackage.ml9;
import defpackage.q44;
import defpackage.qp2;
import defpackage.r4;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ub5;
import defpackage.us3;
import defpackage.ut2;
import defpackage.y44;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend", v = 1)
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ a d;
    public final /* synthetic */ q44 e;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ca6 c;
        public final /* synthetic */ dp2 d;
        public final /* synthetic */ a e;
        public final /* synthetic */ q44 f;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend", v = 1)
        final class C00071 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ a b;
            public final /* synthetic */ do3 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00071(a aVar, do3 do3Var, g51 g51Var) {
                super(2, g51Var);
                this.b = aVar;
                this.c = do3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00071(this.b, this.c, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00071) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    us3 us3Var = new us3(13);
                    this.a = 1;
                    if (ml9.s(getContext()).k0(this, new ut2(1, us3Var)) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw t61.q(obj);
                    }
                    kotlin.b.b(obj);
                }
                ub5 ub5VarI = this.b.i();
                if (ub5VarI == null) {
                    return tx8.a;
                }
                r4 r4Var = new r4(3, this.c);
                this.a = 2;
                i.p((i) ub5VarI, r4Var, this);
                return coroutineSingletons;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ca6 ca6Var, dp2 dp2Var, a aVar, q44 q44Var, g51 g51Var) {
            super(2, g51Var);
            this.c = ca6Var;
            this.d = dp2Var;
            this.e = aVar;
            this.f = q44Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, this.e, this.f, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            a aVar = this.e;
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    throw new KotlinNothingValueException();
                }
                kotlin.b.b(obj);
                e71 e71Var = (e71) this.b;
                dp2 dp2Var = e.a;
                ca6 ca6Var = this.c;
                View viewU = ca6Var.u();
                ((LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1) dp2Var).getClass();
                do3 do3Var = new do3(viewU);
                y44 y44Var = new y44(ca6Var.u(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.f), do3Var);
                if (l98.a) {
                    bt2.G(e71Var, null, null, new C00071(aVar, do3Var, null), 3);
                }
                dp2 dp2Var2 = this.d;
                if (dp2Var2 != null) {
                    dp2Var2.invoke(y44Var);
                }
                aVar.c = y44Var;
                this.a = 1;
                ca6Var.d(y44Var, this);
                return coroutineSingletons;
            } catch (Throwable th) {
                aVar.c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(dp2 dp2Var, a aVar, q44 q44Var, g51 g51Var) {
        super(2, g51Var);
        this.c = dp2Var;
        this.d = aVar;
        this.e = q44Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.c, this.d, this.e, g51Var);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.b = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create((ca6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((ca6) this.b, this.c, this.d, this.e, null);
            this.a = 1;
            if (js3.v(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
