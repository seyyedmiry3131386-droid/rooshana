package ir.mservices.market.myAccount;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.BaseMyAccountViewModel$deleteAvatar$1", f = "BaseMyAccountViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, 159, 165}, m = "invokeSuspend", v = 1)
final class BaseMyAccountViewModel$deleteAvatar$1 extends SuspendLambda implements qp2 {
    public Object a;
    public BaseMyAccountViewModel b;
    public int c;
    public final /* synthetic */ BaseMyAccountViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMyAccountViewModel$deleteAvatar$1(BaseMyAccountViewModel baseMyAccountViewModel, g51 g51Var) {
        super(2, g51Var);
        this.d = baseMyAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseMyAccountViewModel$deleteAvatar$1(this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseMyAccountViewModel$deleteAvatar$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r1.emit(r3, r9) == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r1.emit(r4, r9) == r2) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            ir.mservices.market.myAccount.BaseMyAccountViewModel r0 = r9.d
            kotlinx.coroutines.flow.i r1 = r0.y
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r9.c
            java.lang.String r4 = ""
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L31
            if (r3 == r7) goto L2d
            if (r3 == r6) goto L27
            if (r3 != r5) goto L1f
            ir.mservices.market.myAccount.BaseMyAccountViewModel r0 = r9.b
            n99 r0 = (defpackage.n99) r0
            kotlin.b.b(r10)
            goto L8f
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            ir.mservices.market.myAccount.BaseMyAccountViewModel r0 = r9.b
            kotlin.b.b(r10)
            goto L6a
        L2d:
            kotlin.b.b(r10)
            goto L45
        L31:
            kotlin.b.b(r10)
            wv8 r10 = r0.u
            r9.c = r7
            java.lang.Object r10 = r10.b
            wc5 r10 = (defpackage.wc5) r10
            ir.mservices.market.myAccount.MyAccountItemsType r3 = ir.mservices.market.myAccount.MyAccountItemsType.b
            java.lang.Object r10 = r10.g(r3, r4, r9)
            if (r10 != r2) goto L45
            goto L8e
        L45:
            r3 = r10
            n99 r3 = (defpackage.n99) r3
            boolean r7 = r3 instanceof defpackage.l99
            if (r7 == 0) goto L6e
            c5 r5 = r0.v
            z4 r5 = r5.h
            r5.j(r4)
            l99 r3 = (defpackage.l99) r3
            java.lang.Object r3 = r3.a
            ir.mservices.market.version2.webapi.responsedto.ResultDTO r3 = (ir.mservices.market.version2.webapi.responsedto.ResultDTO) r3
            java.lang.String r3 = r3.getTranslatedMessage()
            r9.a = r10
            r9.b = r0
            r9.c = r6
            java.lang.Object r10 = r1.emit(r3, r9)
            if (r10 != r2) goto L6a
            goto L8e
        L6a:
            r0.s(r8)
            goto L8f
        L6e:
            boolean r6 = r3 instanceof defpackage.h99
            if (r6 == 0) goto L8f
            r0.s(r8)
            h99 r3 = (defpackage.h99) r3
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r0 = r3.a
            java.lang.String r0 = r0.getTranslatedMessage()
            if (r0 != 0) goto L80
            goto L81
        L80:
            r4 = r0
        L81:
            r9.a = r10
            r10 = 0
            r9.b = r10
            r9.c = r5
            java.lang.Object r10 = r1.emit(r4, r9)
            if (r10 != r2) goto L8f
        L8e:
            return r2
        L8f:
            tx8 r10 = defpackage.tx8.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myAccount.BaseMyAccountViewModel$deleteAvatar$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
