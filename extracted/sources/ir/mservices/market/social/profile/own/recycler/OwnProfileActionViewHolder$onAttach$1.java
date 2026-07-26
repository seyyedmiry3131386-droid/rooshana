package ir.mservices.market.social.profile.own.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import defpackage.b77;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.m63;
import defpackage.q39;
import defpackage.qp2;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import defpackage.yq6;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.recycler.OwnProfileActionViewHolder$onAttach$1", f = "OwnProfileActionData.kt", l = {90}, m = "invokeSuspend", v = 1)
final class OwnProfileActionViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ OwnProfileActionData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.recycler.OwnProfileActionViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.recycler.OwnProfileActionViewHolder$onAttach$1$1", f = "OwnProfileActionData.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, g51 g51Var) {
            super(2, g51Var);
            this.b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            a aVar = this.b;
            if (z) {
                m63 m63Var = aVar.y;
                if (m63Var == null) {
                    js3.V("binding");
                    throw null;
                }
                SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = m63Var.w;
                Resources resources = aVar.a.getResources();
                js3.o(resources, "getResources(...)");
                int i = yq6.own_profile_unread_message_badge;
                try {
                    drawable = q39.a(resources, i, null);
                    if (drawable == null) {
                        ThreadLocal threadLocal = b77.a;
                        drawable = resources.getDrawable(i, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused) {
                    ThreadLocal threadLocal2 = b77.a;
                    drawable = resources.getDrawable(i, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().D, PorterDuff.Mode.MULTIPLY));
                smallEmptyMediumTextOvalButton.setBadge(drawable);
            } else {
                m63 m63Var2 = aVar.y;
                if (m63Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                m63Var2.w.setBadge(null);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileActionViewHolder$onAttach$1(OwnProfileActionData ownProfileActionData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = ownProfileActionData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new OwnProfileActionViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((OwnProfileActionViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            v48 v48Var = this.b.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (d.f(v48Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
