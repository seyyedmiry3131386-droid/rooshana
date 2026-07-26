package ir.mservices.market.virtualKeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.e65;
import defpackage.ea7;
import defpackage.fa1;
import defpackage.fu7;
import defpackage.js3;
import defpackage.js6;
import defpackage.la9;
import defpackage.lm;
import defpackage.ma9;
import defpackage.og5;
import defpackage.pq6;
import defpackage.pv6;
import defpackage.qa9;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.vy2;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.virtualKeyboard.recycler.VirtualKeyboardItemData;
import ir.mservices.market.virtualKeyboard.recycler.VirtualKeyboardRemoveData;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class VirtualKeyboardView extends Hilt_VirtualKeyboardView {
    public static final /* synthetic */ int y = 0;
    public d04 s;
    public final ma9 t;
    public final i u;
    public final pv6 v;
    public final i w;
    public final pv6 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = ma9.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        final int i2 = 1;
        ma9 ma9Var = (ma9) fa1.c(layoutInflaterFrom, js6.virtual_keyboard_layout, this, true);
        js3.o(ma9Var, "inflate(...)");
        this.t = ma9Var;
        final int i3 = 0;
        i iVarE = vy2.e(0, 7, null);
        this.u = iVarE;
        this.v = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.w = iVarE2;
        this.x = new pv6(iVarE2);
        int i4 = 3;
        MyketGridLayoutManager myketGridLayoutManager = new MyketGridLayoutManager(3, 1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(pq6.space_2);
        myketGridLayoutManager.Q = new PaddingLayoutManager$Padding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        RecyclerView recyclerView = ma9Var.v;
        recyclerView.setLayoutManager(myketGridLayoutManager);
        Context context2 = getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var = new ea7(context2);
        ea7Var.b = sj8.b().t;
        ea7Var.c(getContext().getResources().getDimensionPixelSize(pq6.space_4));
        ea7Var.h = 0;
        ea7Var.j = true;
        recyclerView.setBackground(ea7Var.a());
        lm lmVar = new lm(i4, 11);
        setLayoutDirection(0);
        lmVar.m = new og5(this) { // from class: ir.mservices.market.virtualKeyboard.a
            public final /* synthetic */ VirtualKeyboardView b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i5 = i3;
                VirtualKeyboardView virtualKeyboardView = this.b;
                switch (i5) {
                    case 0:
                        VirtualKeyboardItemData virtualKeyboardItemData = (VirtualKeyboardItemData) obj;
                        int i6 = VirtualKeyboardView.y;
                        js3.p(view, "<unused var>");
                        js3.p((la9) qg5Var, "<unused var>");
                        js3.p(virtualKeyboardItemData, "recyclerData");
                        bt2.G(cc7.q(virtualKeyboardView), null, null, new VirtualKeyboardView$createKeyboard$adapter$1$1$1(virtualKeyboardView, virtualKeyboardItemData, null), 3);
                        break;
                    default:
                        int i7 = VirtualKeyboardView.y;
                        js3.p(view, "<unused var>");
                        js3.p((qa9) qg5Var, "<unused var>");
                        js3.p((VirtualKeyboardRemoveData) obj, "<unused var>");
                        bt2.G(cc7.q(virtualKeyboardView), null, null, new VirtualKeyboardView$createKeyboard$adapter$1$2$1(virtualKeyboardView, null), 3);
                        break;
                }
            }
        };
        lmVar.n = new og5(this) { // from class: ir.mservices.market.virtualKeyboard.a
            public final /* synthetic */ VirtualKeyboardView b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i5 = i2;
                VirtualKeyboardView virtualKeyboardView = this.b;
                switch (i5) {
                    case 0:
                        VirtualKeyboardItemData virtualKeyboardItemData = (VirtualKeyboardItemData) obj;
                        int i6 = VirtualKeyboardView.y;
                        js3.p(view, "<unused var>");
                        js3.p((la9) qg5Var, "<unused var>");
                        js3.p(virtualKeyboardItemData, "recyclerData");
                        bt2.G(cc7.q(virtualKeyboardView), null, null, new VirtualKeyboardView$createKeyboard$adapter$1$1$1(virtualKeyboardView, virtualKeyboardItemData, null), 3);
                        break;
                    default:
                        int i7 = VirtualKeyboardView.y;
                        js3.p(view, "<unused var>");
                        js3.p((qa9) qg5Var, "<unused var>");
                        js3.p((VirtualKeyboardRemoveData) obj, "<unused var>");
                        bt2.G(cc7.q(virtualKeyboardView), null, null, new VirtualKeyboardView$createKeyboard$adapter$1$2$1(virtualKeyboardView, null), 3);
                        break;
                }
            }
        };
        bt2.G(cc7.q(this), null, null, new VirtualKeyboardView$createKeyboard$adapter$1$3(lmVar, null), 3);
        myketGridLayoutManager.K = new e65(i4, lmVar);
        recyclerView.setAdapter(lmVar);
    }

    public static /* synthetic */ void setTitleText$default(VirtualKeyboardView virtualKeyboardView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        virtualKeyboardView.setTitleText(str);
    }

    public final fu7 getItemClickFlow() {
        return this.v;
    }

    public final fu7 getItemRemoveFlow() {
        return this.x;
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.s;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.s = d04Var;
    }

    public final void setTitleText(String str) {
        MyketTextView myketTextView = this.t.w;
        js3.o(myketTextView, "title");
        MyketTextView.setTextFromHtml$default(myketTextView, str, 0, null, null, false, 28, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VirtualKeyboardView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
