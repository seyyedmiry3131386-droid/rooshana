package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.d;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import ir.mservices.market.version2.ui.recycler.holder.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x95 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x95(d dVar, xf5 xf5Var, String str, View view) {
        this.a = 1;
        this.b = dVar;
        this.c = str;
        this.d = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                MultiSelectRecyclerData multiSelectRecyclerData = (MultiSelectRecyclerData) this.b;
                z95 z95Var = (z95) this.c;
                a aVar = (a) this.d;
                if (((Boolean) multiSelectRecyclerData.a.getValue()).booleanValue()) {
                    multiSelectRecyclerData.f = !multiSelectRecyclerData.f;
                } else {
                    multiSelectRecyclerData.f = true;
                }
                js3.m(view);
                z95Var.f(view, aVar, multiSelectRecyclerData);
                return true;
            case 1:
                d dVar = (d) this.b;
                String str = (String) this.c;
                View view2 = (View) this.d;
                Context contextH = dVar.H();
                if (contextH != null) {
                    int[] iArr = new int[2];
                    view2.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    view2.getWindowVisibleDisplayFrame(rect);
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    int i = (height / 2) + iArr[1];
                    int i2 = contextH.getResources().getDisplayMetrics().widthPixels;
                    hh2 hh2Var = new hh2(contextH, str);
                    if (i < rect.height()) {
                        int i3 = (i2 - iArr[0]) - (width / 2);
                        Toast toast = (Toast) hh2Var.b;
                        if (toast != null) {
                            toast.setGravity(53, i3, height);
                        }
                    } else {
                        Toast toast2 = (Toast) hh2Var.b;
                        if (toast2 != null) {
                            toast2.setGravity(81, 0, height);
                        }
                    }
                    hh2.H(hh2Var);
                }
                return false;
            default:
                pg5 pg5Var = (pg5) this.b;
                qg5 qg5Var = (qg5) this.c;
                js3.m(view);
                pg5Var.a(view, qg5Var, this.d);
                return true;
        }
    }

    public /* synthetic */ x95(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
