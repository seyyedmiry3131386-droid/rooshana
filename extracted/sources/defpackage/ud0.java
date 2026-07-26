package defpackage;

import ir.mservices.market.app.bookmark.common.BookmarkType;
import ir.mservices.market.data.NavIntentDirections;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ud0 extends t1 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        NavIntentDirections.Bookmark bookmark;
        js3.p(er3Var, "intentFragmentFactory");
        List listD = q0Var.d();
        if (q0Var.b(rs6.external_intent_path_segments_bookmarked_movie).equals(listD != null ? (String) a.q0(1, listD) : null)) {
            BookmarkType[] bookmarkTypeArr = BookmarkType.c;
            bookmark = new NavIntentDirections.Bookmark(new od0(1));
        } else {
            BookmarkType[] bookmarkTypeArr2 = BookmarkType.c;
            bookmark = new NavIntentDirections.Bookmark(new od0(0));
        }
        return new dr3(bookmark);
    }

    @Override // defpackage.t1, defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        List listD;
        return super.b(q0Var) && (listD = q0Var.d()) != null && listD.contains(q0Var.b(rs6.external_intent_path_segments_bookmarked));
    }
}
