package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.app.packages.data.PackageDto;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th implements dp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ th(tr5 tr5Var, boolean z, boolean z2) {
        this.d = tr5Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                nn7 nn7Var = (nn7) obj;
                long jA = ((tr5) this.d).a();
                nn7Var.a(an7.c, new zm7(this.b ? Handle.b : Handle.c, jA, this.c ? SelectionHandleAnchor.a : SelectionHandleAnchor.c, (9223372034707292159L & jA) != 9205357640488583168L));
                return tx8.a;
            default:
                return HomeViewModel.getHomeAppNestedList$lambda$0(this.b, (HomeViewModel) this.d, this.c, (PackageDto) obj);
        }
    }

    public /* synthetic */ th(boolean z, HomeViewModel homeViewModel, boolean z2) {
        this.b = z;
        this.d = homeViewModel;
        this.c = z2;
    }
}
