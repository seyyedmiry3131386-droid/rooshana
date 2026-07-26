package defpackage;

import android.content.Context;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.HomeReelListDto;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class y05 {
    public final Context a;
    public final qm5 b;
    public final nm5 c;
    public final t15 d;
    public final k45 e;
    public final ut4 f;
    public final l g = ja1.b(new LinkedHashMap());

    public y05(Context context, qm5 qm5Var, nm5 nm5Var, t15 t15Var, k45 k45Var, ut4 ut4Var) {
        this.a = context;
        this.b = qm5Var;
        this.c = nm5Var;
        this.d = t15Var;
        this.e = k45Var;
        this.f = ut4Var;
    }

    public static ArrayList a(ExtensionPointDto extensionPointDto, String str, v48 v48Var, boolean z, String str2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null && !f88.n0(str2) && z2) {
            arrayList.add(new RecyclerItem(new ExtHeaderData(extensionPointDto.getType(), str, str2, null, true, v48Var, z)));
        }
        return arrayList;
    }

    public final List b(HomeReelListDto homeReelListDto) {
        return (!m88.T(homeReelListDto.getDisplayMode(), HomeReelListDto.GRID, true) || yq2.n0(this.a)) ? homeReelListDto.getReels() : homeReelListDto.getReels().subList(0, Math.min(homeReelListDto.getReels().size(), 4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:85:0x040c A[PHI: r17
      0x040c: PHI (r17v14 kotlin.collections.builders.ListBuilder) = 
      (r17v0 kotlin.collections.builders.ListBuilder)
      (r17v1 kotlin.collections.builders.ListBuilder)
      (r17v2 kotlin.collections.builders.ListBuilder)
      (r17v15 kotlin.collections.builders.ListBuilder)
     binds: [B:84:0x040a, B:73:0x039a, B:67:0x0377, B:4:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.collections.builders.ListBuilder c(ir.mservices.market.movie.data.webapi.HomeMovieDto r25, defpackage.fu0 r26, final kotlinx.coroutines.flow.l r27, final boolean r28, java.lang.Integer r29, final ir.mservices.market.viewModel.a r30, boolean r31, defpackage.dp2 r32) {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y05.c(ir.mservices.market.movie.data.webapi.HomeMovieDto, fu0, kotlinx.coroutines.flow.l, boolean, java.lang.Integer, ir.mservices.market.viewModel.a, boolean, dp2):kotlin.collections.builders.ListBuilder");
    }
}
