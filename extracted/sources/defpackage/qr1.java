package defpackage;

import android.os.Bundle;
import com.google.android.material.tabs.b;
import ir.mservices.market.download.DownloadContentFragment;
import ir.mservices.market.download.common.RecentDownloadType;
import ir.mservices.market.movie.ui.detail.recycler.MovieTabData;
import ir.mservices.market.movie.ui.detail.recycler.e;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.views.MovieTabView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qr1 implements ce8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qr1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.be8
    public final void a() {
        og5 og5Var;
        switch (this.a) {
            case 0:
                break;
            default:
                e eVar = (e) this.b;
                if (!eVar.y && (og5Var = eVar.w) != null) {
                    MovieTabView movieTabView = eVar.x().z;
                    js3.o(movieTabView, "tabs");
                    og5Var.m(movieTabView, eVar, (MovieTabData) this.c);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.be8
    public final void b(b bVar) {
        og5 og5Var;
        switch (this.a) {
            case 0:
                js3.p(bVar, "tab");
                DownloadContentFragment downloadContentFragment = (DownloadContentFragment) this.b;
                if (downloadContentFragment.a1 != null) {
                    RecentDownloadType recentDownloadType = (RecentDownloadType) ((List) this.c).get(bVar.d);
                    js3.p(recentDownloadType, "position");
                    String string = downloadContentFragment.K().getString(recentDownloadType.b);
                    js3.o(string, "getString(...)");
                    Bundle bundle = new Bundle();
                    ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
                    bundle.putString("screen_name", string);
                    eeVar.getClass();
                    eeVar.a(bundle, "screen_show");
                }
                break;
            default:
                e eVar = (e) this.b;
                if (!eVar.y && (og5Var = eVar.w) != null) {
                    MovieTabView movieTabView = eVar.x().z;
                    js3.o(movieTabView, "tabs");
                    og5Var.m(movieTabView, eVar, (MovieTabData) this.c);
                    break;
                }
                break;
        }
    }

    private final void c() {
    }
}
