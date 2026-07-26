package ir.mservices.market.social.profile.user;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onUnfollowAction$1$1", f = "UserProfileHeaderViewModel.kt", l = {204, 207}, m = "invokeSuspend", v = 1)
public final class UserProfileHeaderViewModel$onUnfollowAction$1$1 extends SuspendLambda implements qp2 {
    public Object a;
    public UserProfileHeaderViewModel b;
    public int c;
    public final /* synthetic */ UserProfileHeaderViewModel d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeaderViewModel$onUnfollowAction$1$1(UserProfileHeaderViewModel userProfileHeaderViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.d = userProfileHeaderViewModel;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UserProfileHeaderViewModel$onUnfollowAction$1$1(this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileHeaderViewModel$onUnfollowAction$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        if (r1.a(true, r13) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r13.c
            r2 = 0
            ir.mservices.market.social.profile.user.UserProfileHeaderViewModel r7 = r13.d
            r11 = 2
            r12 = 1
            if (r1 == 0) goto L24
            if (r1 == r12) goto L1f
            if (r1 != r11) goto L17
            ir.mservices.market.social.profile.user.UserProfileHeaderViewModel r7 = r13.b
            kotlin.b.b(r14)
            r9 = r13
            goto L8b
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            kotlin.b.b(r14)
            r9 = r13
            goto L75
        L24:
            kotlin.b.b(r14)
            hl5 r14 = r7.v
            r13.c = r12
            java.lang.Object r14 = r14.b
            r3 = r14
            s19 r3 = (defpackage.s19) r3
            r3.getClass()
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r1 = "accountKey"
            java.lang.String r4 = r13.e
            r14.<init>(r1, r4)
            kotlin.Pair[] r1 = new kotlin.Pair[r12]
            r1[r2] = r14
            java.util.LinkedHashMap r14 = kotlin.collections.b.O(r1)
            java.util.Map r1 = r3.getCommonQueryParam()
            java.util.Map r1 = r3.getCommonQueryParam(r1)
            java.lang.String r4 = "social"
            java.lang.String r5 = "v1/profiles/own/unfollow/{accountKey}"
            z57 r5 = r3.createRequestUrl(r4, r5, r14, r1)
            ir.mservices.market.social.profile.user.service.UserProfileService$unfollowUser$2 r14 = new ir.mservices.market.social.profile.user.service.UserProfileService$unfollowUser$2
            r14.<init>()
            java.lang.reflect.Type r4 = r14.getType()
            java.lang.String r14 = "getType(...)"
            defpackage.js3.o(r4, r14)
            defpackage.js3.m(r5)
            xs8 r6 = new xs8
            r6.<init>()
            r8 = 0
            r10 = 496(0x1f0, float:6.95E-43)
            r9 = r13
            java.lang.Object r14 = defpackage.dy3.I(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r14 != r0) goto L75
            goto L8a
        L75:
            r1 = r14
            n99 r1 = (defpackage.n99) r1
            boolean r3 = r1 instanceof defpackage.l99
            if (r3 == 0) goto L9d
            cw5 r1 = r7.w
            r9.a = r14
            r9.b = r7
            r9.c = r11
            java.lang.Object r14 = r1.a(r12, r13)
            if (r14 != r0) goto L8b
        L8a:
            return r0
        L8b:
            kotlinx.coroutines.flow.l r14 = r7.I
        L8d:
            java.lang.Object r0 = r14.getValue()
            r1 = r0
            ir.mservices.market.social.profile.data.Relation r1 = (ir.mservices.market.social.profile.data.Relation) r1
            ir.mservices.market.social.profile.data.Relation r1 = ir.mservices.market.social.profile.data.Relation.NONE
            boolean r0 = r14.n(r0, r1)
            if (r0 == 0) goto L8d
            goto Lb5
        L9d:
            boolean r14 = r1 instanceof defpackage.h99
            if (r14 == 0) goto Lb5
            h99 r1 = (defpackage.h99) r1
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r14 = r1.a
            java.lang.String r14 = r14.getTranslatedMessage()
            ir.mservices.market.social.profile.user.UserProfileHeaderViewModel.z(r7, r14)
            r50[] r14 = new defpackage.r50[r12]
            ir.mservices.market.social.profile.user.UserProfileHeaderAction$ResetRelation r0 = ir.mservices.market.social.profile.user.UserProfileHeaderAction.ResetRelation.INSTANCE
            r14[r2] = r0
            r7.r(r14)
        Lb5:
            tx8 r14 = defpackage.tx8.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onUnfollowAction$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
