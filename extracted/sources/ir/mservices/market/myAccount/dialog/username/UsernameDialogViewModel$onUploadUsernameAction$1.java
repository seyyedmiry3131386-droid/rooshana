package ir.mservices.market.myAccount.dialog.username;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.myAccount.dialog.username.UsernameAction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.dialog.username.UsernameDialogViewModel$onUploadUsernameAction$1", f = "UsernameDialogViewModel.kt", l = {41, 40}, m = "invokeSuspend", v = 1)
final class UsernameDialogViewModel$onUploadUsernameAction$1 extends SuspendLambda implements qp2 {
    public i a;
    public int b;
    public final /* synthetic */ UsernameDialogViewModel c;
    public final /* synthetic */ UsernameAction.UpdateUsernameAction d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameDialogViewModel$onUploadUsernameAction$1(UsernameDialogViewModel usernameDialogViewModel, UsernameAction.UpdateUsernameAction updateUsernameAction, g51 g51Var) {
        super(2, g51Var);
        this.c = usernameDialogViewModel;
        this.d = updateUsernameAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UsernameDialogViewModel$onUploadUsernameAction$1(this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UsernameDialogViewModel$onUploadUsernameAction$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r2.emit(r4, r21) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            ir.mservices.market.myAccount.dialog.username.UsernameAction$UpdateUsernameAction r3 = r0.d
            r4 = 2
            r5 = 1
            ir.mservices.market.myAccount.dialog.username.UsernameDialogViewModel r6 = r0.c
            if (r2 == 0) goto L27
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            kotlin.b.b(r22)
            goto L83
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            kotlinx.coroutines.flow.i r2 = r0.a
            kotlin.b.b(r22)
            r4 = r22
            goto L60
        L27:
            kotlin.b.b(r22)
            kotlinx.coroutines.flow.i r2 = r6.x
            e4 r7 = r6.v
            java.lang.String r17 = r3.getUsername()
            r0.a = r2
            r0.b = r5
            wc5 r7 = r7.a
            ir.mservices.market.myAccount.MyAccountItemsType r8 = ir.mservices.market.myAccount.MyAccountItemsType.k
            r9 = r8
            ir.mservices.market.myAccount.data.AccountPersonalDto r8 = new ir.mservices.market.myAccount.data.AccountPersonalDto
            r18 = 255(0xff, float:3.57E-43)
            r19 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r20 = r16
            r16 = 0
            r4 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r7.i(r4, r8, r6, r0)
            if (r4 != r1) goto L60
            goto L82
        L60:
            r7 = r4
            n99 r7 = (defpackage.n99) r7
            boolean r7 = r7 instanceof defpackage.l99
            if (r7 == 0) goto L76
            c5 r6 = r6.w
            z4 r6 = r6.h
            java.lang.String r3 = r3.getUsername()
            r6.i = r3
            java.lang.String r7 = defpackage.lu7.r
            r6.i(r3, r7, r5)
        L76:
            r3 = 0
            r0.a = r3
            r3 = 2
            r0.b = r3
            java.lang.Object r2 = r2.emit(r4, r0)
            if (r2 != r1) goto L83
        L82:
            return r1
        L83:
            tx8 r1 = defpackage.tx8.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myAccount.dialog.username.UsernameDialogViewModel$onUploadUsernameAction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
