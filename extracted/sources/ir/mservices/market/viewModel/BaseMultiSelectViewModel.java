package ir.mservices.market.viewModel;

import defpackage.br9;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sb7;
import defpackage.t95;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u95;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.xz5;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public class BaseMultiSelectViewModel extends a {
    public final pv6 A;
    public final i B;
    public final pv6 C;
    public final l D;
    public final rv6 E;
    public final ArrayList F;
    public final l v;
    public final rv6 w;
    public final i x;
    public final pv6 y;
    public final i z;

    /* JADX INFO: renamed from: ir.mservices.market.viewModel.BaseMultiSelectViewModel$changeFilterState$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.viewModel.BaseMultiSelectViewModel$changeFilterState$1", f = "BaseMultiSelectViewModel.kt", l = {108}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, g51 g51Var) {
            super(2, g51Var);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BaseMultiSelectViewModel.this.new AnonymousClass1(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar = BaseMultiSelectViewModel.this.z;
                Boolean boolValueOf = Boolean.valueOf(this.c);
                this.a = 1;
                if (iVar.emit(boolValueOf, this) == coroutineSingletons) {
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

    public BaseMultiSelectViewModel() {
        this(true);
    }

    private final void changeFilterState(boolean z) {
        bt2.G(y97.G(this), null, null, new AnonymousClass1(z, null), 3);
    }

    private final int getMultiSelectMaxItem() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.F) {
            if (((RecyclerItem) obj).c instanceof MultiSelectRecyclerData) {
                arrayList.add(obj);
            }
        }
        ArrayList<MultiSelectRecyclerData> arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MyketRecyclerData myketRecyclerData = ((RecyclerItem) it.next()).c;
            js3.n(myketRecyclerData, "null cannot be cast to non-null type ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData");
            arrayList2.add((MultiSelectRecyclerData) myketRecyclerData);
        }
        int i = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        for (MultiSelectRecyclerData multiSelectRecyclerData : arrayList2) {
            if (!((Boolean) multiSelectRecyclerData.c.a.getValue()).booleanValue() && ((Boolean) multiSelectRecyclerData.e.a.getValue()).booleanValue() && (i = i + 1) < 0) {
                br9.O();
                throw null;
            }
        }
        return i;
    }

    private final int getSelectedItemsCount() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.F) {
            if (((RecyclerItem) obj).c instanceof MultiSelectRecyclerData) {
                arrayList.add(obj);
            }
        }
        ArrayList<MultiSelectRecyclerData> arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MyketRecyclerData myketRecyclerData = ((RecyclerItem) it.next()).c;
            js3.n(myketRecyclerData, "null cannot be cast to non-null type ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData");
            arrayList2.add((MultiSelectRecyclerData) myketRecyclerData);
        }
        int i = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        for (MultiSelectRecyclerData multiSelectRecyclerData : arrayList2) {
            if (!((Boolean) multiSelectRecyclerData.c.a.getValue()).booleanValue() && multiSelectRecyclerData.f && ((Boolean) multiSelectRecyclerData.e.a.getValue()).booleanValue() && (i = i + 1) < 0) {
                br9.O();
                throw null;
            }
        }
        return i;
    }

    private final void showMultiSelect() {
        t95 t95Var = new t95();
        t95Var.a = getSelectedItemsCount();
        t95Var.b = true;
        t95Var.c = getMultiSelectMaxItem();
        l lVar = this.v;
        lVar.getClass();
        lVar.p(null, t95Var);
        Boolean bool = Boolean.TRUE;
        l lVar2 = this.D;
        lVar2.getClass();
        lVar2.p(null, bool);
        sb7.p("MultiSelect", "showMultiSelect ", "data: " + this.w.a.getValue());
        changeFilterState(false);
        x(new u95("on", "start"));
    }

    private final void unCheckMultiSelectItems() {
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((RecyclerItem) it.next()).c);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof MultiSelectRecyclerData) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((MultiSelectRecyclerData) it2.next()).f = false;
        }
    }

    public final void s() {
        l lVar = this.v;
        if (((t95) lVar.getValue()).b) {
            t95 t95Var = new t95();
            t95Var.a = 0;
            t95Var.b = false;
            t95Var.c = getMultiSelectMaxItem();
            sb7.p("MultiSelect", "hideMultiSelect ", "data: " + this.w.a.getValue());
            lVar.getClass();
            lVar.p(null, t95Var);
            changeFilterState(true);
        }
        unCheckMultiSelectItems();
        Boolean bool = Boolean.FALSE;
        l lVar2 = this.D;
        lVar2.getClass();
        lVar2.p(null, bool);
    }

    public final void t() {
        int selectedItemsCount = getSelectedItemsCount();
        if (selectedItemsCount == 0) {
            s();
            return;
        }
        t95 t95Var = new t95();
        t95Var.a = selectedItemsCount;
        t95Var.b = ((t95) this.w.a.getValue()).b;
        t95Var.c = getMultiSelectMaxItem();
        l lVar = this.v;
        lVar.getClass();
        lVar.p(null, t95Var);
    }

    public final void u(MultiSelectRecyclerData multiSelectRecyclerData) {
        js3.p(multiSelectRecyclerData, "multiSelectedData");
        boolean z = multiSelectRecyclerData.f;
        rv6 rv6Var = this.w;
        if (z) {
            if (((t95) rv6Var.a.getValue()).b) {
                t();
                return;
            } else {
                showMultiSelect();
                return;
            }
        }
        if (getSelectedItemsCount() != 0) {
            t();
            return;
        }
        sb7.p("MultiSelect", "empty", "data: " + rv6Var.a.getValue());
        x(new u95("on", "empty"));
        s();
    }

    public final void v() {
        x(new u95("on", "ok"));
        bt2.G(y97.G(this), null, null, new BaseMultiSelectViewModel$onMultiSelectRemove$1(this, null), 3);
        int selectedItemsCount = getSelectedItemsCount();
        if (selectedItemsCount == 1) {
            x(new u95("on", "remove_single"));
        } else if (selectedItemsCount == getMultiSelectMaxItem()) {
            x(new u95("on", "remove_all"));
        } else {
            x(new u95("type", "remove_multiple"));
        }
    }

    public final void w() {
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((RecyclerItem) it.next()).c);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof MultiSelectRecyclerData) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                g(new xz5(ir.mservices.market.version2.ui.recycler.filter.a.a(br9.B("MultiSelectFilter"))));
                s();
                return;
            }
            MultiSelectRecyclerData multiSelectRecyclerData = (MultiSelectRecyclerData) it2.next();
            if (!((Boolean) multiSelectRecyclerData.c.a.getValue()).booleanValue()) {
                if (multiSelectRecyclerData.f && ((Boolean) multiSelectRecyclerData.e.a.getValue()).booleanValue()) {
                    z = true;
                }
                l lVar = multiSelectRecyclerData.b;
                Boolean boolValueOf = Boolean.valueOf(z);
                lVar.getClass();
                lVar.p(null, boolValueOf);
            }
        }
    }

    public final void x(u95 u95Var) {
        bt2.G(y97.G(this), null, null, new BaseMultiSelectViewModel$sendMultiSelectEvent$1(this, u95Var, null), 3);
    }

    public BaseMultiSelectViewModel(boolean z) {
        super(z);
        l lVarB = ja1.b(new t95());
        this.v = lVarB;
        this.w = new rv6(lVarB);
        i iVarE = vy2.e(0, 7, null);
        this.x = iVarE;
        this.y = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.z = iVarE2;
        this.A = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.B = iVarE3;
        this.C = new pv6(iVarE3);
        l lVarB2 = ja1.b(Boolean.FALSE);
        this.D = lVarB2;
        this.E = new rv6(lVarB2);
        this.F = new ArrayList();
    }
}
