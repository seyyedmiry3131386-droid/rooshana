package ir.mservices.market.app.survey;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.bp6;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.e71;
import defpackage.ea7;
import defpackage.g51;
import defpackage.js3;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import defpackage.xk6;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class QuestionIndicator extends Hilt_QuestionIndicator {

    /* JADX INFO: renamed from: ir.mservices.market.app.survey.QuestionIndicator$setData$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.survey.QuestionIndicator$setData$2", f = "QuestionIndicator.kt", l = {65}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ v48 b;
        public final /* synthetic */ QuestionIndicator c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(v48 v48Var, QuestionIndicator questionIndicator, g51 g51Var) {
            super(2, g51Var);
            this.b = v48Var;
            this.c = questionIndicator;
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
                b.b(obj);
                xk6 xk6Var = new xk6(5, this.c);
                this.a = 1;
                if (this.b.a(xk6Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuestionIndicator(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final void setData(int i, v48 v48Var) {
        js3.p(v48Var, "answeredQuestionNumberStateFlow");
        removeAllViews();
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            Context context = view.getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            ea7Var.b = sj8.b().w;
            ea7Var.o = true;
            ea7Var.k = sj8.b().p;
            ea7Var.m = 0;
            ea7Var.h = 0;
            view.setBackground(ea7Var.a());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, view.getResources().getDimensionPixelSize(pq6.space_8), 1.0f);
            layoutParams.setMarginStart(i2 == 0 ? 0 : view.getResources().getDimensionPixelSize(pq6.space_4));
            layoutParams.setMarginEnd(i2 == i + (-1) ? 0 : view.getResources().getDimensionPixelSize(pq6.space_4));
            view.setLayoutParams(layoutParams);
            addView(view);
            i2++;
        }
        bt2.G(cc7.q(this), null, null, new AnonymousClass2(v48Var, this, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((bp6) e()).getClass();
        }
        setBackgroundColor(sj8.b().l);
        setLayoutDirection(3);
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        setPaddingRelative(dimensionPixelSize, getResources().getDimensionPixelSize(pq6.space_24), dimensionPixelSize, getResources().getDimensionPixelSize(pq6.space_24));
        setOrientation(0);
    }
}
