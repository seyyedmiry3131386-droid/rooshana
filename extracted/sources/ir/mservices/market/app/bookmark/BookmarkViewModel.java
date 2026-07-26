package ir.mservices.market.app.bookmark;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.n4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.app.bookmark.BookmarkContentAction;
import ir.mservices.market.app.bookmark.common.BookmarkType;
import ir.mservices.market.viewModel.a;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class BookmarkViewModel extends a {
    public final l v;
    public final rv6 w;
    public final List x;

    /* JADX INFO: renamed from: ir.mservices.market.app.bookmark.BookmarkViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.bookmark.BookmarkViewModel$1", f = "BookmarkViewModel.kt", l = {43}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BookmarkViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            BookmarkViewModel bookmarkViewModel = BookmarkViewModel.this;
            pv6 pv6Var = bookmarkViewModel.u;
            r4 r4Var = new r4(15, bookmarkViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 20), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookmarkViewModel(jd7 jd7Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        if (!jd7Var.a("selectedPage")) {
            throw new IllegalArgumentException("Required argument \"selectedPage\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) jd7Var.b("selectedPage");
        if (num == null) {
            throw new IllegalArgumentException("Argument \"selectedPage\" of type integer does not support null values");
        }
        l lVarB = ja1.b(num);
        this.v = lVarB;
        this.w = new rv6(lVarB);
        this.x = kotlin.collections.a.P0(BookmarkType.d);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateSelectedPageAction(BookmarkContentAction.UpdateSelectedPageAction updateSelectedPageAction) {
        l lVar;
        Object value;
        do {
            lVar = this.v;
            value = lVar.getValue();
            ((Number) value).intValue();
        } while (!lVar.n(value, Integer.valueOf(updateSelectedPageAction.getPage())));
    }
}
