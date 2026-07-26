package ir.mservices.market.app.survey;

import android.os.Parcelable;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rn6;
import defpackage.rv6;
import defpackage.sc8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.vy2;
import defpackage.xk6;
import defpackage.y97;
import ir.mservices.market.app.survey.SurveyAction;
import ir.mservices.market.app.survey.data.ApplicationSurveyDto;
import java.io.Serializable;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SurveyViewModel extends ir.mservices.market.viewModel.a {
    public final pv6 A;
    public final i B;
    public final pv6 C;
    public final l D;
    public final rv6 E;
    public final h F;
    public final rn6 v;
    public final sc8 w;
    public final l x;
    public final pv6 y;
    public final i z;

    /* JADX INFO: renamed from: ir.mservices.market.app.survey.SurveyViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.survey.SurveyViewModel$1", f = "SurveyViewModel.kt", l = {139}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SurveyViewModel.this.new AnonymousClass1(g51Var);
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
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            SurveyViewModel surveyViewModel = SurveyViewModel.this;
            pv6 pv6Var = surveyViewModel.u;
            xk6 xk6Var = new xk6(21, surveyViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(xk6Var, 0), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.survey.SurveyViewModel$onCancelAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.survey.SurveyViewModel$onCancelAction$1", f = "SurveyViewModel.kt", l = {78, 85, 89}, m = "invokeSuspend", v = 1)
    public static final class C01701 extends SuspendLambda implements qp2 {
        public int a;

        public C01701(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SurveyViewModel.this.new C01701(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01701) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r9.a
                tx8 r2 = defpackage.tx8.a
                r3 = 3
                r4 = 2
                r5 = 1
                ir.mservices.market.app.survey.SurveyViewModel r6 = ir.mservices.market.app.survey.SurveyViewModel.this
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.b.b(r10)
                return r2
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                kotlin.b.b(r10)
                return r2
            L23:
                kotlin.b.b(r10)
                goto L4a
            L27:
                kotlin.b.b(r10)
                rn6 r10 = r6.v
                sc8 r1 = r6.w
                java.lang.String r1 = r1.b
                ir.mservices.market.app.survey.data.CancelQuestionRequestDto r7 = new ir.mservices.market.app.survey.data.CancelQuestionRequestDto
                kotlinx.coroutines.flow.l r8 = r6.x
                java.lang.Object r8 = r8.getValue()
                java.lang.Integer r8 = (java.lang.Integer) r8
                r7.<init>(r8)
                r9.a = r5
                java.lang.Object r10 = r10.c
                uc8 r10 = (defpackage.uc8) r10
                java.lang.Object r10 = r10.g(r1, r7, r6, r9)
                if (r10 != r0) goto L4a
                goto L71
            L4a:
                n99 r10 = (defpackage.n99) r10
                boolean r1 = r10 instanceof defpackage.l99
                if (r1 == 0) goto L5b
                kotlinx.coroutines.flow.i r10 = r6.B
                r9.a = r4
                java.lang.Object r10 = r10.emit(r2, r9)
                if (r10 != r0) goto L72
                goto L71
            L5b:
                boolean r1 = r10 instanceof defpackage.h99
                if (r1 == 0) goto L72
                kotlinx.coroutines.flow.i r1 = r6.z
                h99 r10 = (defpackage.h99) r10
                ir.mservices.market.version2.webapi.responsedto.ErrorDTO r10 = r10.a
                java.lang.String r10 = r10.getTranslatedMessage()
                r9.a = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L72
            L71:
                return r0
            L72:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.survey.SurveyViewModel.C01701.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.survey.SurveyViewModel$onSubmitAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.survey.SurveyViewModel$onSubmitAction$1", f = "SurveyViewModel.kt", l = {100, 109, 110, 118}, m = "invokeSuspend", v = 1)
    public static final class C01711 extends SuspendLambda implements qp2 {
        public int a;

        public C01711(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SurveyViewModel.this.new C01711(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01711) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0107, code lost:
        
            if (r0.emit(r14, r17) != r13) goto L40;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.survey.SurveyViewModel.C01711.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyViewModel(rn6 rn6Var, jd7 jd7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.v = rn6Var;
        if (!jd7Var.a("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ApplicationSurveyDto.class) && !Serializable.class.isAssignableFrom(ApplicationSurveyDto.class)) {
            throw new UnsupportedOperationException(ApplicationSurveyDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ApplicationSurveyDto applicationSurveyDto = (ApplicationSurveyDto) jd7Var.b("data");
        if (applicationSurveyDto == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageName");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value");
        }
        this.w = new sc8(applicationSurveyDto, str);
        l lVarB = ja1.b(-1);
        this.x = lVarB;
        this.y = new pv6(lVarB);
        i iVarE = vy2.e(0, 7, null);
        this.z = iVarE;
        this.A = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.B = iVarE2;
        this.C = new pv6(iVarE2);
        l lVarB2 = ja1.b(0);
        this.D = lVarB2;
        this.E = new rv6(lVarB2);
        this.F = new h(lVarB2, lVarB, new SurveyViewModel$lastQuestionFlow$1(this, null));
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAnswerAction(SurveyAction.Answer answer) {
        l lVar;
        Object value;
        do {
            lVar = this.x;
            value = lVar.getValue();
            ((Number) value).intValue();
        } while (!lVar.n(value, Integer.valueOf(answer.getId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancelAction(SurveyAction.Cancel cancel) {
        bt2.G(y97.G(this), null, null, new C01701(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubmitAction(SurveyAction.Submit submit) {
        bt2.G(y97.G(this), null, null, new C01711(null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new SurveyViewModel$doRequest$1(this, null));
    }
}
