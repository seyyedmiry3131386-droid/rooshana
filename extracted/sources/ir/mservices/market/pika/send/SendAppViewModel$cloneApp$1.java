package ir.mservices.market.pika.send;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.SendAppViewModel$cloneApp$1", f = "SendAppViewModel.kt", l = {101, 115, 122, 130, 138, 142}, m = "invokeSuspend", v = 1)
final class SendAppViewModel$cloneApp$1 extends SuspendLambda implements qp2 {
    public int a;
    public String b;
    public int c;
    public final /* synthetic */ SendAppViewModel d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAppViewModel$cloneApp$1(SendAppViewModel sendAppViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.d = sendAppViewModel;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SendAppViewModel$cloneApp$1(this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SendAppViewModel$cloneApp$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        if (r7.emit(r0, r20) == r8) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0189, code lost:
    
        if (r7.emit(r3, r20) == r8) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b1, code lost:
    
        if (r7.emit(r4, r20) == r8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.send.SendAppViewModel$cloneApp$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
