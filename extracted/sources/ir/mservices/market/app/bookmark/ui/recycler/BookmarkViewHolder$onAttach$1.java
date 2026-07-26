package ir.mservices.market.app.bookmark.ui.recycler;

import defpackage.c63;
import defpackage.cs1;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xf5;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.version2.webapi.responsedto.LayoutPageDTO;
import ir.mservices.market.views.MyketTextView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.bookmark.ui.recycler.BookmarkViewHolder$onAttach$1", f = "BookmarkApplication.kt", l = {145, 146}, m = "invokeSuspend", v = 1)
final class BookmarkViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BookmarkApplicationData c;
    public final /* synthetic */ a d;

    /* JADX INFO: renamed from: ir.mservices.market.app.bookmark.ui.recycler.BookmarkViewHolder$onAttach$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.bookmark.ui.recycler.BookmarkViewHolder$onAttach$1$2", f = "BookmarkApplication.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ BookmarkApplicationData a;
        public final /* synthetic */ a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BookmarkApplicationData bookmarkApplicationData, a aVar, g51 g51Var) {
            super(2, g51Var);
            this.a = bookmarkApplicationData;
            this.b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.a, this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((cs1) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            DownloadSummeryApplicationDto downloadSummeryApplicationDto = this.a.j;
            a aVar = this.b;
            xf5 xf5Var = aVar.C;
            if (xf5Var == null) {
                js3.V("myketUIUtils");
                throw null;
            }
            String packageName = downloadSummeryApplicationDto.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            int versionCode = downloadSummeryApplicationDto.getVersionCode();
            boolean zIsIncompatible = downloadSummeryApplicationDto.isIncompatible();
            ForceUpdateDto forceUpdate = downloadSummeryApplicationDto.getForceUpdate();
            c63 c63Var = aVar.B;
            if (c63Var == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = c63Var.v.z;
            js3.o(myketTextView, LayoutPageDTO.Type.CATEGORY);
            String tagline = downloadSummeryApplicationDto.getTagline();
            xf5Var.l(packageName, versionCode, zIsIncompatible, forceUpdate, myketTextView, (tagline == null || f88.n0(tagline)) ? downloadSummeryApplicationDto.getCategoryName() : downloadSummeryApplicationDto.getTagline());
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookmarkViewHolder$onAttach$1(BookmarkApplicationData bookmarkApplicationData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.c = bookmarkApplicationData;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        BookmarkViewHolder$onAttach$1 bookmarkViewHolder$onAttach$1 = new BookmarkViewHolder$onAttach$1(this.c, this.d, g51Var);
        bookmarkViewHolder$onAttach$1.b = obj;
        return bookmarkViewHolder$onAttach$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BookmarkViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r9, r0, r8) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            e71 r0 = (defpackage.e71) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r8.a
            ir.mservices.market.app.bookmark.ui.recycler.BookmarkApplicationData r3 = r8.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            kotlin.b.b(r9)
            goto L4d
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.b.b(r9)
            goto L39
        L23:
            kotlin.b.b(r9)
            vb7 r9 = r3.h
            o4 r2 = new o4
            r7 = 4
            r2.<init>(r9, r7)
            r8.b = r6
            r8.a = r5
            java.lang.Object r9 = kotlinx.coroutines.flow.d.B(r2, r0, r8)
            if (r9 != r1) goto L39
            goto L4c
        L39:
            xe2 r9 = (defpackage.xe2) r9
            ir.mservices.market.app.bookmark.ui.recycler.BookmarkViewHolder$onAttach$1$2 r0 = new ir.mservices.market.app.bookmark.ui.recycler.BookmarkViewHolder$onAttach$1$2
            ir.mservices.market.app.bookmark.ui.recycler.a r2 = r8.d
            r0.<init>(r3, r2, r6)
            r8.b = r6
            r8.a = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.d.f(r9, r0, r8)
            if (r9 != r1) goto L4d
        L4c:
            return r1
        L4d:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.bookmark.ui.recycler.BookmarkViewHolder$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
