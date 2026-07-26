package ir.myket.player.ui.audio;

import android.content.Context;
import defpackage.b00;
import defpackage.bt2;
import defpackage.c00;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.n4;
import defpackage.pv6;
import defpackage.qc6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.myket.player.viewmodel.e;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1", f = "AudioPlayerScreen.kt", l = {}, m = "invokeSuspend", v = 1)
final class AudioPlayerScreenKt$AudioPlayerScreen$2$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wb5 b;
    public final /* synthetic */ e c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ dp2 e;

    /* JADX INFO: renamed from: ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$1, reason: invalid class name */
    @tb1(c = "ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$1", f = "AudioPlayerScreen.kt", l = {79}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ wb5 b;
        public final /* synthetic */ e c;

        /* JADX INFO: renamed from: ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C00371 extends FunctionReferenceImpl implements dp2 {
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                qc6 qc6Var = (qc6) obj;
                js3.p(qc6Var, "p0");
                ((e) this.receiver).e(qc6Var);
                return tx8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wb5 wb5Var, e eVar, g51 g51Var) {
            super(2, g51Var);
            this.b = wb5Var;
            this.c = eVar;
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
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8.a;
            }
            kotlin.b.b(obj);
            ir.myket.player.ui.client.state.a aVar = (ir.myket.player.ui.client.state.a) this.b.getValue();
            C00371 c00371 = new C00371(1, this.c, e.class, PackageListMetaDataDTO.KEY_ACTION, "action(Lir/myket/common/viewmodels/ViewModelAction;)V", 0);
            this.a = 1;
            aVar.a(c00371, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$2, reason: invalid class name */
    @tb1(c = "ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$2", f = "AudioPlayerScreen.kt", l = {84}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ e b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Context context, g51 g51Var) {
            super(2, g51Var);
            this.b = eVar;
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                pv6 pv6Var = this.b.E;
                b00 b00Var = new b00(this.c, 0);
                this.a = 1;
                if (pv6Var.a.a(b00Var, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$3, reason: invalid class name */
    @tb1(c = "ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$3", f = "AudioPlayerScreen.kt", l = {96}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ e b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(e eVar, Context context, g51 g51Var) {
            super(2, g51Var);
            this.b = eVar;
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass3(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                pv6 pv6Var = this.b.D;
                b00 b00Var = new b00(this.c, 1);
                this.a = 1;
                if (pv6Var.a.a(b00Var, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$4, reason: invalid class name */
    @tb1(c = "ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$4", f = "AudioPlayerScreen.kt", l = {104}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ e b;
        public final /* synthetic */ dp2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(e eVar, dp2 dp2Var, g51 g51Var) {
            super(2, g51Var);
            this.b = eVar;
            this.c = dp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass4(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                pv6 pv6Var = this.b.F;
                c00 c00Var = new c00(0, this.c);
                this.a = 1;
                if (pv6Var.a.a(c00Var, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$5, reason: invalid class name */
    @tb1(c = "ir.myket.player.ui.audio.AudioPlayerScreenKt$AudioPlayerScreen$2$1$5", f = "AudioPlayerScreen.kt", l = {112}, m = "invokeSuspend", v = 1)
    final class AnonymousClass5 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ e b;
        public final /* synthetic */ dp2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(e eVar, dp2 dp2Var, g51 g51Var) {
            super(2, g51Var);
            this.b = eVar;
            this.c = dp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass5(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            rv6 rv6Var = this.b.I;
            c00 c00Var = new c00(1, this.c);
            this.a = 1;
            Object objA = rv6Var.a.a(new n4(c00Var, 11), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerScreenKt$AudioPlayerScreen$2$1(wb5 wb5Var, e eVar, Context context, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = wb5Var;
        this.c = eVar;
        this.d = context;
        this.e = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AudioPlayerScreenKt$AudioPlayerScreen$2$1 audioPlayerScreenKt$AudioPlayerScreen$2$1 = new AudioPlayerScreenKt$AudioPlayerScreen$2$1(this.b, this.c, this.d, this.e, g51Var);
        audioPlayerScreenKt$AudioPlayerScreen$2$1.a = obj;
        return audioPlayerScreenKt$AudioPlayerScreen$2$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AudioPlayerScreenKt$AudioPlayerScreen$2$1 audioPlayerScreenKt$AudioPlayerScreen$2$1 = (AudioPlayerScreenKt$AudioPlayerScreen$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        audioPlayerScreenKt$AudioPlayerScreen$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e71 e71Var = (e71) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        wb5 wb5Var = this.b;
        e eVar = this.c;
        bt2.G(e71Var, null, null, new AnonymousClass1(wb5Var, eVar, null), 3);
        Context context = this.d;
        bt2.G(e71Var, null, null, new AnonymousClass2(eVar, context, null), 3);
        bt2.G(e71Var, null, null, new AnonymousClass3(eVar, context, null), 3);
        dp2 dp2Var = this.e;
        bt2.G(e71Var, null, null, new AnonymousClass4(eVar, dp2Var, null), 3);
        bt2.G(e71Var, null, null, new AnonymousClass5(eVar, dp2Var, null), 3);
        return tx8.a;
    }
}
