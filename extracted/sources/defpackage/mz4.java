package defpackage;

import android.text.SpannableStringBuilder;
import ir.mservices.market.views.MyketTextView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mz4 extends i1 {
    public final /* synthetic */ int a;

    public /* synthetic */ mz4(int i) {
        this.a = i;
    }

    @Override // defpackage.i1
    public void c(MyketTextView myketTextView, SpannableStringBuilder spannableStringBuilder) {
        switch (this.a) {
            case 0:
                if (myketTextView.getMovementMethod() != null) {
                    myketTextView.setMovementMethod(null);
                }
                break;
        }
    }

    @Override // defpackage.i1
    public void d(sk6 sk6Var) {
        i1 i1Var;
        i1 i1Var2;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) sk6Var.b;
                Iterator it = ((ArrayList) sk6Var.c).iterator();
                while (true) {
                    i1Var = null;
                    if (it.hasNext()) {
                        i1Var2 = (i1) it.next();
                        if (r51.class.isAssignableFrom(i1Var2.getClass())) {
                        }
                    } else {
                        i1Var2 = null;
                    }
                }
                if (i1Var2 == null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i1 i1Var3 = (i1) it2.next();
                            if (r51.class.isAssignableFrom(i1Var3.getClass())) {
                                i1Var = i1Var3;
                            }
                        }
                    }
                    if (i1Var == null) {
                        throw new IllegalStateException("Requested plugin is not added: " + r51.class.getName() + ", plugins: " + arrayList);
                    }
                    sk6Var.q(i1Var);
                    i1Var2 = i1Var;
                }
                ((r51) i1Var2).b = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.i1
    public void g(ui4 ui4Var) {
        switch (this.a) {
            case 1:
                ui4Var.d = 16;
                break;
        }
    }
}
