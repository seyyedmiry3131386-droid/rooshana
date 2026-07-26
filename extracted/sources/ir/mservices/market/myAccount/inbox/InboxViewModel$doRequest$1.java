package ir.mservices.market.myAccount.inbox;

import defpackage.bl4;
import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.h99;
import defpackage.l99;
import defpackage.lw8;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myAccount.inbox.model.a;
import ir.mservices.market.myAccount.inbox.recycler.InboxData;
import ir.mservices.market.myAccount.inbox.recycler.InboxHeaderData;
import ir.mservices.market.version2.model.InboxInfoModel;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.inbox.InboxViewModel$doRequest$1", f = "InboxViewModel.kt", l = {29}, m = "invokeSuspend", v = 1)
final class InboxViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InboxViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.inbox.InboxViewModel$doRequest$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.inbox.InboxViewModel$doRequest$1$1", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ InboxViewModel a;
        public final /* synthetic */ l99 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InboxViewModel inboxViewModel, l99 l99Var, g51 g51Var) {
            super(2, g51Var);
            this.a = inboxViewModel;
            this.b = l99Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            List list = (List) this.b.a;
            ArrayList arrayList = new ArrayList();
            if (!list.isEmpty()) {
                arrayList.add(new InboxHeaderData(lw8.e(this.a.u, String.valueOf(list.size()))));
                ArrayList arrayList2 = new ArrayList(wu0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InboxData((InboxInfoModel) it.next()));
                }
                arrayList.addAll(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(wu0.V(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                bl4.G((MyketRecyclerData) it2.next(), arrayList3);
            }
            return new bz6(arrayList3, (GeneralFilter) null, (qp2) null, 6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$doRequest$1(InboxViewModel inboxViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = inboxViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InboxViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxViewModel$doRequest$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        InboxViewModel inboxViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            a aVar = inboxViewModel.t;
            this.a = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        n99 n99Var = (n99) obj;
        if (n99Var instanceof l99) {
            inboxViewModel.p(new AnonymousClass1(inboxViewModel, (l99) n99Var, null));
        } else if (n99Var instanceof h99) {
            inboxViewModel.f(((h99) n99Var).a.getTranslatedMessage());
        }
        return tx8.a;
    }
}
