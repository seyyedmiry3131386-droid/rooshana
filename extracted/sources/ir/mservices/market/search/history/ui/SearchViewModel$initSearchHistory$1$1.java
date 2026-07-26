package ir.mservices.market.search.history.ui;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.dp2;
import defpackage.g51;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.x38;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.search.history.ui.SearchViewModel$initSearchHistory$1$1", f = "SearchViewModel.kt", l = {126, 129, 141, 142, 143, ModuleDescriptor.MODULE_VERSION, 161, 162, 163}, m = "invokeSuspend", v = 1)
final class SearchViewModel$initSearchHistory$1$1 extends SuspendLambda implements dp2 {
    public x38 a;
    public int b;
    public final /* synthetic */ SearchViewModel c;
    public final /* synthetic */ String d;

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$initSearchHistory$1$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            RecyclerItem recyclerItem = (RecyclerItem) obj;
            RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
            ((SearchViewModel) this.receiver).getClass();
            if (recyclerItem == null || recyclerItem2 == null) {
                return null;
            }
            DividerData dividerData = new DividerData();
            dividerData.e = pq6.horizontal_space_outer;
            dividerData.c = pq6.horizontal_space_inner;
            return new RecyclerItem(dividerData);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchViewModel$initSearchHistory$1$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((SearchViewModel) this.receiver).setHomeDivider((RecyclerItem) obj, (RecyclerItem) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$initSearchHistory$1$1(SearchViewModel searchViewModel, String str, g51 g51Var) {
        super(1, g51Var);
        this.c = searchViewModel;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SearchViewModel$initSearchHistory$1$1(this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SearchViewModel$initSearchHistory$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.search.history.ui.SearchViewModel$initSearchHistory$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
