package ir.mservices.market.social.list.items;

import androidx.paging.e;
import defpackage.a06;
import defpackage.br9;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.list.items.recycler.SelectableRecyclerData;
import ir.mservices.market.social.list.items.recycler.SelectedListAddItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.items.SelectedItemsViewModel$items$1", f = "SelectedItemsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SelectedItemsViewModel$items$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ a06 a;
    public /* synthetic */ List b;
    public final /* synthetic */ SelectedItemsViewModel c;

    /* JADX INFO: renamed from: ir.mservices.market.social.list.items.SelectedItemsViewModel$items$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.list.items.SelectedItemsViewModel$items$1$1", f = "SelectedItemsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ List b;
        public final /* synthetic */ SelectedItemsViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, SelectedItemsViewModel selectedItemsViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = list;
            this.c = selectedItemsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((RecyclerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerItem recyclerItem = (RecyclerItem) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            List list = this.b;
            if (list.isEmpty()) {
                return br9.B(recyclerItem);
            }
            ArrayList arrayListA0 = a.A0(new RecyclerItem(new SelectedListAddItemData(this.c.G ? rs6.add_app_action_button : rs6.add_movie_action_button)), br9.B(recyclerItem));
            ArrayList arrayList = new ArrayList(wu0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RecyclerItem((SelectableRecyclerData) it.next()));
            }
            return a.z0(arrayList, arrayListA0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedItemsViewModel$items$1(SelectedItemsViewModel selectedItemsViewModel, g51 g51Var) {
        super(3, g51Var);
        this.c = selectedItemsViewModel;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        SelectedItemsViewModel$items$1 selectedItemsViewModel$items$1 = new SelectedItemsViewModel$items$1(this.c, (g51) obj3);
        selectedItemsViewModel$items$1.a = (a06) obj;
        selectedItemsViewModel$items$1.b = (List) obj2;
        return selectedItemsViewModel$items$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a06 a06Var = this.a;
        List list = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        return e.d(a06Var, new AnonymousClass1(list, this.c, null));
    }
}
