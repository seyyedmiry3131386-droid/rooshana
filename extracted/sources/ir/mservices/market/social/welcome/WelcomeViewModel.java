package ir.mservices.market.social.welcome;

import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bt2;
import defpackage.c5;
import defpackage.dd9;
import defpackage.e4;
import defpackage.e71;
import defpackage.f5;
import defpackage.fu0;
import defpackage.g51;
import defpackage.h99;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.ng6;
import defpackage.o;
import defpackage.pt2;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r22;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.s71;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.vr3;
import defpackage.vy2;
import defpackage.wc5;
import defpackage.wv8;
import defpackage.y97;
import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.social.welcome.WelcomeAction;
import ir.mservices.market.social.welcome.data.Step;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class WelcomeViewModel extends ir.mservices.market.viewModel.a {
    public final c5 A;
    public final jd7 B;
    public final rv6 C;
    public final rv6 D;
    public final rv6 E;
    public final rv6 F;
    public final rv6 G;
    public final rv6 H;
    public final i I;
    public final pv6 J;
    public final l K;
    public final rv6 L;
    public final l M;
    public final l N;
    public final rv6 O;
    public final i P;
    public final pv6 Q;
    public final i R;
    public final vr3 v;
    public final wv8 w;
    public final f5 x;
    public final e4 y;
    public final pt2 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.welcome.WelcomeViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.welcome.WelcomeViewModel$1", f = "WelcomeViewModel.kt", l = {336}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return WelcomeViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            WelcomeViewModel welcomeViewModel = WelcomeViewModel.this;
            pv6 pv6Var = welcomeViewModel.u;
            dd9 dd9Var = new dd9(3, welcomeViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(dd9Var, 15), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.welcome.WelcomeViewModel$hideError$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.welcome.WelcomeViewModel$hideError$1", f = "WelcomeViewModel.kt", l = {316}, m = "invokeSuspend", v = 1)
    public static final class C02431 extends SuspendLambda implements qp2 {
        public int a;

        public C02431(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return WelcomeViewModel.this.new C02431(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02431) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            l lVar = WelcomeViewModel.this.N;
            this.a = 1;
            lVar.emit(null, this);
            return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.welcome.WelcomeViewModel$onDeleteAvatarAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.welcome.WelcomeViewModel$onDeleteAvatarAction$1", f = "WelcomeViewModel.kt", l = {262, 273}, m = "invokeSuspend", v = 1)
    public static final class C02441 extends SuspendLambda implements qp2 {
        public Object a;
        public int b;

        public C02441(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return WelcomeViewModel.this.new C02441(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02441) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.b;
            tx8 tx8Var = tx8.a;
            WelcomeViewModel welcomeViewModel = WelcomeViewModel.this;
            if (i == 0) {
                kotlin.b.b(obj);
                wv8 wv8Var = welcomeViewModel.w;
                this.b = 1;
                obj = ((wc5) wv8Var.b).g(MyAccountItemsType.b, welcomeViewModel, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            n99 n99Var = (n99) obj;
            if (n99Var instanceof l99) {
                welcomeViewModel.B.d(null, "avatar");
                welcomeViewModel.A.h.j("");
                welcomeViewModel.onToastAction(new WelcomeAction.ToastAction(((ResultDTO) ((l99) n99Var).a).getTranslatedMessage()));
                welcomeViewModel.updateAvatarProgressState(false);
                return tx8Var;
            }
            if (n99Var instanceof h99) {
                welcomeViewModel.updateAvatarProgressState(false);
                l lVar = welcomeViewModel.N;
                String translatedMessage = ((h99) n99Var).a.getTranslatedMessage();
                this.a = obj;
                this.b = 2;
                lVar.emit(translatedMessage, this);
                if (tx8Var == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.welcome.WelcomeViewModel$onSubmitStepAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.welcome.WelcomeViewModel$onSubmitStepAction$1", f = "WelcomeViewModel.kt", l = {133, 134, 138, 142, 146, ModuleDescriptor.MODULE_VERSION, 162, 163, 168, 173, 176, 184, 185, 199, 202, 207, 208, 219, 222, 227, 228, 235, 236}, m = "invokeSuspend", v = 1)
    public static final class C02451 extends SuspendLambda implements qp2 {
        public WelcomeViewModel a;
        public Object b;
        public Object c;
        public n99 d;
        public int e;
        public int f;
        public int g;
        public /* synthetic */ Object h;

        public C02451(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            C02451 c02451 = WelcomeViewModel.this.new C02451(g51Var);
            c02451.h = obj;
            return c02451;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02451) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:147:0x0445, code lost:
        
            if (r13 != r8) goto L149;
         */
        /* JADX WARN: Code restructure failed: missing block: B:165:0x049c, code lost:
        
            if (r5.emit(r9, r29) == r8) goto L178;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x023c, code lost:
        
            if (r13 != r8) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0242, code lost:
        
            if (((defpackage.n99) r2) != null) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x02ce, code lost:
        
            if (r4.emit(r5, r29) == r8) goto L178;
         */
        /* JADX WARN: Removed duplicated region for block: B:134:0x03bc  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0402  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x044d  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0481  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x049f  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x04d4  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x04ff A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0500 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02d6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 1334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.welcome.WelcomeViewModel.C02451.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.welcome.WelcomeViewModel$updateAvatarProgressState$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.welcome.WelcomeViewModel$updateAvatarProgressState$1", f = "WelcomeViewModel.kt", l = {288}, m = "invokeSuspend", v = 1)
    public static final class C02461 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02461(boolean z, g51 g51Var) {
            super(2, g51Var);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return WelcomeViewModel.this.new C02461(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02461) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar = WelcomeViewModel.this.R;
                Boolean boolValueOf = Boolean.valueOf(this.c);
                this.a = 1;
                if (iVar.emit(boolValueOf, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.social.welcome.WelcomeViewModel$updateStep$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.welcome.WelcomeViewModel$updateStep$1", f = "WelcomeViewModel.kt", l = {299}, m = "invokeSuspend", v = 1)
    public static final class C02471 extends SuspendLambda implements qp2 {
        public int a;

        public C02471(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return WelcomeViewModel.this.new C02471(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02471) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            i iVar = WelcomeViewModel.this.I;
            this.a = 1;
            return iVar.emit(tx8Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeViewModel(vr3 vr3Var, wv8 wv8Var, f5 f5Var, e4 e4Var, pt2 pt2Var, c5 c5Var, jd7 jd7Var) {
        super(true);
        js3.p(c5Var, "accountManager");
        js3.p(jd7Var, "savedStateHandle");
        this.v = vr3Var;
        this.w = wv8Var;
        this.x = f5Var;
        this.y = e4Var;
        this.z = pt2Var;
        this.A = c5Var;
        this.B = jd7Var;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        t32.b().l(this, false);
        this.C = jd7Var.c(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.D = jd7Var.c(null, "birthday");
        this.E = jd7Var.c(null, "avatar");
        this.F = jd7Var.c(null, "upload_avatar");
        ng6 ng6Var = new ng6(2, jd7Var.c(null, "gender"));
        fu0 fu0VarG = y97.G(this);
        j jVar = ru7.b;
        this.G = d.A(ng6Var, fu0VarG, jVar, null);
        Step step = Step.a;
        this.H = d.A(new ng6(3, jd7Var.c(step, "step")), y97.G(this), jVar, new Pair(step, Boolean.FALSE));
        i iVarE = vy2.e(0, 7, null);
        this.I = iVarE;
        this.J = new pv6(iVarE);
        l lVarB = ja1.b(null);
        this.K = lVarB;
        this.L = new rv6(lVarB);
        this.M = ja1.b(null);
        l lVarB2 = ja1.b(null);
        this.N = lVarB2;
        this.O = new rv6(lVarB2);
        i iVarE2 = vy2.e(0, 7, null);
        this.P = iVarE2;
        this.Q = new pv6(iVarE2);
        this.R = vy2.e(0, 7, null);
    }

    private final void hideError() {
        bt2.G(y97.G(this), null, null, new C02431(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChangeDateAction(WelcomeAction.ChangeDateAction changeDateAction) {
        this.B.d(changeDateAction.getDate(), "birthday");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChangeGenderAction(WelcomeAction.ChangeGenderAction changeGenderAction) {
        this.B.d(changeGenderAction.getGender().a, "gender");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChangeNameAction(WelcomeAction.ChangeNameAction changeNameAction) {
        this.B.d(changeNameAction.getName(), AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeleteAvatarAction(WelcomeAction.DeleteAvatarAction deleteAvatarAction) {
        updateAvatarProgressState(true);
        bt2.G(y97.G(this), null, null, new C02441(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSkipAction(WelcomeAction.SkipStepAcion skipStepAcion) {
        updateStep();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubmitStepAction(WelcomeAction.SubmitStepAction submitStepAction) {
        bt2.G(y97.G(this), null, null, new C02451(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onToastAction(WelcomeAction.ToastAction toastAction) {
        l lVar;
        Object value;
        do {
            lVar = this.K;
            value = lVar.getValue();
        } while (!lVar.n(value, toastAction.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAvatarProgressState(boolean z) {
        bt2.G(y97.G(this), null, null, new C02461(z, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void updateStep() {
        hideError();
        r22 r22Var = Step.c;
        int iIndexOf = r22Var.indexOf(((Pair) this.H.a.getValue()).a) + 1;
        if (iIndexOf >= ((o) r22Var).a()) {
            bt2.G(y97.G(this), null, null, new C02471(null), 3);
        } else {
            this.B.d(r22Var.get(iIndexOf), "step");
        }
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new WelcomeViewModel$doRequest$1(this, null));
    }

    public final void onEvent(s71 s71Var) {
        Uri uri;
        String path;
        js3.p(s71Var, "event");
        updateAvatarProgressState(true);
        if (!s71Var.b || (uri = s71Var.a) == null || (path = uri.getPath()) == null) {
            return;
        }
        this.B.d(path, "upload_avatar");
        updateAvatarProgressState(false);
        hideError();
    }
}
