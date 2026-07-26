package androidx.compose.runtime;

import defpackage.g51;
import defpackage.io7;
import defpackage.js3;
import defpackage.o40;
import defpackage.qp2;
import defpackage.rm7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu8;
import defpackage.xa5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
final class ComposePausableCompositionException$operationsSequence$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ComposePausableCompositionException g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePausableCompositionException$operationsSequence$1(ComposePausableCompositionException composePausableCompositionException, g51 g51Var) {
        super(2, g51Var);
        this.g = composePausableCompositionException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new ComposePausableCompositionException$operationsSequence$1(this.g, g51Var);
        composePausableCompositionException$operationsSequence$1.f = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposePausableCompositionException$operationsSequence$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        io7 io7Var;
        int i;
        int i2;
        int i3;
        String strN;
        int i4;
        int i5;
        String str;
        ComposePausableCompositionException composePausableCompositionException = this.g;
        androidx.collection.c cVar = composePausableCompositionException.a;
        xa5 xa5Var = composePausableCompositionException.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i6 = this.e;
        if (i6 == 0) {
            kotlin.b.b(obj);
            io7Var = (io7) this.f;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.d;
            i2 = this.c;
            i3 = this.b;
            io7Var = (io7) this.f;
            kotlin.b.b(obj);
        }
        if (i3 >= Math.min(composePausableCompositionException.d + 10, xa5Var.b)) {
            return tx8.a;
        }
        int i7 = i3 + 1;
        int iC = xa5Var.c(i3);
        switch (iC) {
            case 0:
                strN = "up";
                break;
            case 1:
                String strX = o40.x(cVar.b(i2), "down ");
                i2++;
                strN = strX;
                break;
            case 2:
                strN = "remove " + xa5Var.c(i7) + ' ' + xa5Var.c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strN = "move " + xa5Var.c(i7) + ' ' + xa5Var.c(i3 + 2) + ' ' + xa5Var.c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strN = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC2 = xa5Var.c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC2 + ' ' + cVar.b(i2);
                int i8 = i4;
                strN = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC3 = xa5Var.c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iC3 + ' ' + cVar.b(i2);
                int i82 = i4;
                strN = str;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                Object objB = cVar.b(i2);
                js3.n(objB, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                wu8.i(2, objB);
                i2 += 2;
                strN = "apply " + ((qp2) objB);
                break;
            case 8:
                strN = "reuse " + composePausableCompositionException.b.b(i);
                i++;
                break;
            case 9:
                strN = "recompose pending";
                break;
            default:
                strN = rm7.n(iC, "unknown op: ");
                break;
        }
        this.f = io7Var;
        this.b = i7;
        this.c = i2;
        this.d = i;
        this.e = 1;
        io7Var.b(this, i3 + ": " + strN);
        return coroutineSingletons;
    }
}
