package defpackage;

import android.view.MenuItem;
import androidx.paging.o;
import ir.mservices.market.app.bookmark.ui.recycler.BookmarkApplicationData;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.search.result.ui.recycler.SearchApplicationData;
import ir.mservices.market.download.app.recycler.AppDownloadData;
import ir.mservices.market.movie.download.core.source.a;
import ir.mservices.market.viewModel.b;
import ir.mservices.market.viewModel.c;
import ir.myket.common.utils.extensions.FlowExtenstionsKt$combine$$inlined$combine$1$3;
import ir.myket.common.utils.extensions.FlowExtenstionsKt$combine$$inlined$combine$2$3;
import ir.myket.player.viewmodel.PlayerViewModel$autoHideController$$inlined$combineLatest$1;
import ir.myket.player.viewmodel.e;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class xp implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xp(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) throws Throwable {
        switch (this.a) {
            case 0:
                Object objA = ((xe2) this.b).a(new nl(ze2Var, (AppDetailViewModel) this.c, 1), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 1:
                Object objA2 = ((xe2) this.b).a(new nl(ze2Var, (AppDownloadData) this.c, 2), g51Var);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 2:
                Object objA3 = ((xe2) this.b).a(new nl(ze2Var, (AppData) this.c, 8), g51Var);
                if (objA3 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 3:
                Object objA4 = ((xe2) this.b).a(new nl(ze2Var, (SearchApplicationData) this.c, 9), g51Var);
                if (objA4 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 4:
                ((l) this.b).a(new b(ze2Var, (c) this.c), g51Var);
                break;
            case 5:
                Object objA5 = ((xe2) this.b).a(new nl(ze2Var, (BookmarkApplicationData) this.c, 11), g51Var);
                if (objA5 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 6:
                Object objA6 = ((xe2) this.b).a(new nl(ze2Var, (r82) this.c, 13), g51Var);
                if (objA6 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 7:
                xe2[] xe2VarArr = (xe2[]) this.b;
                Object objA7 = j.a(g51Var, ze2Var, new df2(xe2VarArr, 0), new FlowExtenstionsKt$combine$$inlined$combine$1$3(null, (fp2) this.c), xe2VarArr);
                if (objA7 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 8:
                xe2[] xe2VarArr2 = (xe2[]) this.b;
                Object objA8 = j.a(g51Var, ze2Var, new df2(xe2VarArr2, 1), new FlowExtenstionsKt$combine$$inlined$combine$2$3(null, (PlayerViewModel$autoHideController$$inlined$combineLatest$1) this.c), xe2VarArr2);
                if (objA8 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 9:
                Object objA9 = ((xe2) this.b).a(new nl(ze2Var, (ps0) this.c, 14), g51Var);
                if (objA9 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 10:
                Object objA10 = ((xe2) this.b).a(new nl(ze2Var, (dh2) this.c, 15), g51Var);
                if (objA10 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 11:
                Object objA11 = ((xe2) this.b).a(new nl(ze2Var, (a) this.c, 22), g51Var);
                if (objA11 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 12:
                Object objA12 = ((xe2) this.b).a(new ir.mservices.market.version2.core.utils.c(ze2Var, (List) this.c, 2), g51Var);
                if (objA12 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 13:
                rv6 rv6Var = (rv6) this.b;
                Object objA13 = rv6Var.a.a(new mg6(ze2Var, (e) this.c, 1), g51Var);
                if (objA13 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 14:
                ((l) this.b).a(new mg6(ze2Var, (e) this.c, 3), g51Var);
                break;
            case 15:
                Object objA14 = ((xp) this.b).a(new mg6(ze2Var, (e) this.c, 2), g51Var);
                if (objA14 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 16:
                Object objA15 = ((xe2) this.b).a(new nl(ze2Var, (MenuItem) this.c, 28), g51Var);
                if (objA15 != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA16 = ((xe2) this.b).a(new b97(ze2Var, (o) this.c, 1), g51Var);
                if (objA16 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
