package ir.mservices.market.social.profile.list.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.h99;
import defpackage.j99;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.x13;
import defpackage.xe2;
import ir.mservices.market.social.profile.list.data.LikeSocialListDto;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.recycler.ProfileListButtonsViewHolder$onAttach$1", f = "ProfileListButtons.kt", l = {123}, m = "invokeSuspend", v = 1)
final class ProfileListButtonsViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ProfileListButtonsData b;
    public final /* synthetic */ b c;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.recycler.ProfileListButtonsViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.list.recycler.ProfileListButtonsViewHolder$onAttach$1$1", f = "ProfileListButtons.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ b b;
        public final /* synthetic */ ProfileListButtonsData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, ProfileListButtonsData profileListButtonsData, b bVar) {
            super(2, g51Var);
            this.b = bVar;
            this.c = profileListButtonsData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c, this.b);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((n99) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n99 n99Var = (n99) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            boolean z = n99Var instanceof h99;
            ProfileListButtonsData profileListButtonsData = this.c;
            b bVar = this.b;
            if (z) {
                LikeSocialListDto likeSocialListDto = profileListButtonsData.g;
                boolean z2 = false;
                if (likeSocialListDto != null && likeSocialListDto.isLiked()) {
                    z2 = true;
                }
                int i = b.C;
                bVar.x(z2);
                LikeSocialListDto likeSocialListDto2 = profileListButtonsData.g;
                bVar.y(likeSocialListDto2 != null ? likeSocialListDto2.getLikeCount() : null);
                x13 x13Var = bVar.A;
                if (x13Var == null) {
                    js3.V("binding");
                    throw null;
                }
                x13Var.x.setEnabled(true);
            } else if (n99Var instanceof l99) {
                if (profileListButtonsData.g == null) {
                    boolean zIsLiked = ((LikeSocialListDto) ((l99) n99Var).a).isLiked();
                    int i2 = b.C;
                    bVar.x(zIsLiked);
                }
                LikeSocialListDto likeSocialListDto3 = (LikeSocialListDto) ((l99) n99Var).a;
                profileListButtonsData.g = likeSocialListDto3;
                String likeCount = likeSocialListDto3 != null ? likeSocialListDto3.getLikeCount() : null;
                int i3 = b.C;
                bVar.y(likeCount);
                x13 x13Var2 = bVar.A;
                if (x13Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                x13Var2.x.setEnabled(true);
            } else if (!(n99Var instanceof j99)) {
                throw new NoWhenBranchMatchedException();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListButtonsViewHolder$onAttach$1(g51 g51Var, ProfileListButtonsData profileListButtonsData, b bVar) {
        super(2, g51Var);
        this.b = profileListButtonsData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ProfileListButtonsViewHolder$onAttach$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileListButtonsViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ProfileListButtonsData profileListButtonsData = this.b;
            xe2 xe2Var = profileListButtonsData.f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, profileListButtonsData, this.c);
            this.a = 1;
            if (d.f(xe2Var, anonymousClass1, this) == coroutineSingletons) {
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
