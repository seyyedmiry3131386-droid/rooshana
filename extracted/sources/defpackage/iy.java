package defpackage;

import android.content.Context;
import android.widget.TextView;
import ir.mservices.market.views.MyketTextView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iy implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ iy(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        Context context = this.b;
        switch (i) {
            case 0:
                fz1.r(context, vs6.player_uncatchable_intent, 12).show();
                return tx8Var;
            case 1:
                fz1.r(context, vs6.player_uncatchable_intent, 12).show();
                return tx8Var;
            case 2:
                fz1.r(context, vs6.player_uncatchable_intent, 12).show();
                return tx8Var;
            default:
                int i2 = MyketTextView.k;
                ArrayList arrayList = new ArrayList(3);
                TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                arrayList.add(new r51());
                arrayList.add(new jd3());
                arrayList.add(new mz4(0));
                arrayList.add(new mz4(1));
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
                }
                sk6 sk6Var = new sk6(4, arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sk6Var.q((i1) it.next());
                }
                ArrayList<i1> arrayList2 = (ArrayList) sk6Var.c;
                int i3 = 25;
                vp7 vp7Var = new vp7(25);
                float f = context.getResources().getDisplayMetrics().density;
                ui4 ui4Var = new ui4();
                ui4Var.e = (int) ((8 * f) + 0.5f);
                ui4Var.a = (int) ((24 * f) + 0.5f);
                int i4 = (int) ((4 * f) + 0.5f);
                ui4Var.b = i4;
                int i5 = (int) ((1 * f) + 0.5f);
                ui4Var.c = i5;
                ui4Var.f = i5;
                ui4Var.g = i4;
                go8 go8Var = new go8();
                pj9 pj9Var = new pj9(27);
                wx3 wx3Var = new wx3(1);
                for (i1 i1Var : arrayList2) {
                    i1Var.getClass();
                    i1Var.g(ui4Var);
                    i1Var.e();
                    i1Var.h(pj9Var);
                    i1Var.f(wx3Var);
                }
                ui4 ui4Var2 = new ui4();
                ui4Var2.a = ui4Var.a;
                ui4Var2.b = ui4Var.b;
                ui4Var2.c = ui4Var.c;
                ui4Var2.d = ui4Var.d;
                ui4Var2.e = ui4Var.e;
                ui4Var2.f = ui4Var.f;
                ui4Var2.g = ui4Var.g;
                r79 r79Var = new r79(i3, DesugarCollections.unmodifiableMap(wx3Var.a));
                go8Var.a = ui4Var2;
                go8Var.g = r79Var;
                if (((av) go8Var.b) == null) {
                    go8Var.b = new av(1);
                }
                if (((ol3) go8Var.c) == null) {
                    go8Var.c = new ol3(28);
                }
                if (((sl3) go8Var.d) == null) {
                    go8Var.d = new sl3(2);
                }
                if (((cv) go8Var.e) == null) {
                    go8Var.e = new cv(28);
                }
                if (((gv) go8Var.f) == null) {
                    go8Var.f = new gv(28);
                }
                return new ti4(new vp7(vp7Var), new hh2(pj9Var, new rb4(go8Var), 13), DesugarCollections.unmodifiableList(arrayList2));
        }
    }
}
