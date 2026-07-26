package ir.mservices.market.social.profile.user;

import defpackage.e71;
import defpackage.g51;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onFollowAction$1$1", f = "UserProfileHeaderViewModel.kt", l = {180, 184}, m = "invokeSuspend", v = 1)
public final class UserProfileHeaderViewModel$onFollowAction$1$1 extends SuspendLambda implements qp2 {
    public Object a;
    public UserProfileHeaderViewModel b;
    public n99 c;
    public l d;
    public Object e;
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ UserProfileHeaderViewModel i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeaderViewModel$onFollowAction$1$1(UserProfileHeaderViewModel userProfileHeaderViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.i = userProfileHeaderViewModel;
        this.j = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UserProfileHeaderViewModel$onFollowAction$1$1(this.i, this.j, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileHeaderViewModel$onFollowAction$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        if (r14 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
    
        if (r1.a(true, r13) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (r4.n(r3, ir.mservices.market.social.profile.data.Relation.Companion.getByValue(((ir.mservices.market.social.profile.user.data.FollowDto) ((defpackage.l99) r5).a).getRelation())) != false) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ad -> B:19:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onFollowAction$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
