package ir.mservices.market.feedback;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.feedback.data.TransactionData;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackViewModel$sendFeedback$4$1", f = "FeedbackViewModel.kt", l = {182, 193}, m = "invokeSuspend", v = 1)
final class FeedbackViewModel$sendFeedback$4$1 extends SuspendLambda implements qp2 {
    public Object a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TransactionData d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ FeedbackViewModel i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel$sendFeedback$4$1(String str, TransactionData transactionData, String str2, String str3, String str4, String str5, FeedbackViewModel feedbackViewModel, String str6, String str7, String str8, g51 g51Var) {
        super(2, g51Var);
        this.c = str;
        this.d = transactionData;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = feedbackViewModel;
        this.j = str6;
        this.k = str7;
        this.l = str8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FeedbackViewModel$sendFeedback$4$1(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackViewModel$sendFeedback$4$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        if (r2.emit((defpackage.n99) r0, r18) == r9) goto L50;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.feedback.FeedbackViewModel$sendFeedback$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
